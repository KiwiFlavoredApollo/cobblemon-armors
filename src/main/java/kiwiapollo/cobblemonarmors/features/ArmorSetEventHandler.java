package kiwiapollo.cobblemonarmors.features;

import kiwiapollo.cobblemonarmors.armors.ArmorSet;
import kiwiapollo.cobblemonarmors.exceptions.PlayerNotWearingArmorSetException;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;

public class ArmorSetEventHandler {
    public static void onServerTick(MinecraftServer server, ArmorSet armorSet) {
        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            try {
                assertPlayerWearingArmorSet(player, armorSet);

                armorSet.feature.unlock(player);

            } catch (PlayerNotWearingArmorSetException e) {
                return;
            }
        }
    }

    private static void assertPlayerWearingArmorSet(ServerPlayerEntity player, ArmorSet armorSet)
            throws PlayerNotWearingArmorSetException {
        boolean helmet = isWearingArmor(player, EquipmentSlot.HEAD, armorSet.helmet.armotItem);
        boolean chestplate = isWearingArmor(player, EquipmentSlot.CHEST, armorSet.chestplate.armotItem);
        boolean leggings = isWearingArmor(player, EquipmentSlot.LEGS, armorSet.leggings.armotItem);
        boolean boots = isWearingArmor(player, EquipmentSlot.FEET, armorSet.boots.armotItem);

        if (helmet && chestplate && leggings && boots) {
            return;
        }

        throw new PlayerNotWearingArmorSetException();
    }

    private static boolean isWearingArmor(PlayerEntity player, EquipmentSlot slot, Item armorItem) {
        ItemStack itemStack = player.getEquippedStack(slot);
        return itemStack.getItem() == armorItem;
    }
}
