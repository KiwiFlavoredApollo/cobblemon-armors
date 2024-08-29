package kiwiapollo.cobblemonarmors.effects;

import kiwiapollo.cobblemonarmors.armors.ArmorSet;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;

public class ArmorSetEffectHandler {
    public static int DURATION = 60;

    public static void onServerTick(MinecraftServer server, ArmorSet armorSet) {
        List<ServerPlayerEntity> players = server.getPlayerManager().getPlayerList();

        players = players.stream().filter(player -> isPlayerWearingArmorSet(player, armorSet)).toList();
        players = players.stream().filter(armorSet.predicate).toList();

        for (ServerPlayerEntity player : players) {
            player.addStatusEffect(new StatusEffectInstance(
                    armorSet.effect, DURATION, 0,
                    false, false, true
            ));
        }
    }

    private static boolean isPlayerWearingArmorSet(PlayerEntity player, ArmorSet armorSet) {
        boolean helmet = isWearingArmor(player, EquipmentSlot.HEAD, armorSet.helmet.item);
        boolean chestplate = isWearingArmor(player, EquipmentSlot.CHEST, armorSet.chestplate.item);
        boolean leggings = isWearingArmor(player, EquipmentSlot.LEGS, armorSet.leggings.item);
        boolean boots = isWearingArmor(player, EquipmentSlot.FEET, armorSet.boots.item);

        return helmet && chestplate && leggings && boots;
    }

    private static boolean isWearingArmor(PlayerEntity player, EquipmentSlot slot, ArmorItem armorItem) {
        ItemStack itemStack = player.getEquippedStack(slot);
        return itemStack.getItem() == armorItem;
    }
}
