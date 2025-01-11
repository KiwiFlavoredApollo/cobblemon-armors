package kiwiapollo.cobblemonarmors.feature;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public abstract class ArmorSetFeatureEnabler implements ServerTickEvents.EndTick {private final Map<EquipmentSlot, ArmorItem> armorSet;
    private final List<Predicate<ServerPlayerEntity>> predicates;
    private final List<StatusEffectInstance> effects;

    protected ArmorSetFeatureEnabler(Map<EquipmentSlot, ArmorItem> armorSet, List<Predicate<ServerPlayerEntity>> predicates, List<StatusEffectInstance> effects) {
        this.armorSet = armorSet;
        this.predicates = predicates;
        this.effects = effects;
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

            new StatusEffectInstanceCloneFactory(effects).create().forEach(player::addStatusEffect);
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

    static class StatusEffectInstanceCloneFactory implements SimpleFactory<List<StatusEffectInstance>> {
        private final List<StatusEffectInstance> effects;

        StatusEffectInstanceCloneFactory(List<StatusEffectInstance> effects) {
            this.effects = effects;
        }

        @Override
        public List<StatusEffectInstance> create() {
            List<StatusEffectInstance> clone = new ArrayList<>();

            for (StatusEffectInstance e : effects) {
                clone.add(new StatusEffectInstance(
                        e.getEffectType(),
                        e.getDuration(),
                        e.getAmplifier(),
                        e.isAmbient(),
                        e.shouldShowParticles(),
                        e.shouldShowIcon()
                ));
            }

            return clone;
        }
    }
}
