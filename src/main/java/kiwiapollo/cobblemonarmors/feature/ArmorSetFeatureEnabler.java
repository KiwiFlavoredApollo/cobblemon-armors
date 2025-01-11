package kiwiapollo.cobblemonarmors.feature;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public abstract class ArmorSetFeatureEnabler implements ServerTickEvents.EndTick {
    protected final int DURATION = 100;

    private final Map<EquipmentSlot, ArmorItem> armorSet;
    private final List<Predicate<ServerPlayerEntity>> predicates;

    protected ArmorSetFeatureEnabler(Map<EquipmentSlot, ArmorItem> armorSet, List<Predicate<ServerPlayerEntity>> predicates) {
        this.armorSet = armorSet;
        this.predicates = predicates;
    }

    @Override
    public void onEndTick(MinecraftServer server) {
        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            if (!isPlayerWearingArmorSet(player)) {
                return;
            }

            if (!predicates.stream().allMatch(predicate -> predicate.test(player))) {
                return;
            }

            enable(player);
        }
    }

    private boolean isPlayerWearingArmorSet(ServerPlayerEntity player) {
        return armorSet.entrySet().stream().allMatch(entry -> {
            EquipmentSlot slot = entry.getKey();
            ArmorItem armor = entry.getValue();

            Item equipped = player.getEquippedStack(slot).getItem();
            return equipped.equals(armor);
        });
    }

    protected abstract void enable(ServerPlayerEntity player);
}
