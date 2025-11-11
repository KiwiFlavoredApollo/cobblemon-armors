package kiwiapollo.cobblemonarmors.feature;

import kiwiapollo.cobblemonarmors.gamerule.ModGameRule;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static net.minecraft.SharedConstants.TICKS_PER_SECOND;

public abstract class ArmorSetFeatureEnabler implements ServerTickEvents.EndTick {
    private static final int DURATION_IN_SECONDS = 11;

    private final Map<EquipmentSlot, ArmorItem> armorSet;
    private final List<Predicate<ServerPlayerEntity>> predicates;
    private final List<StatusEffect> effects;

    protected ArmorSetFeatureEnabler(Map<EquipmentSlot, ArmorItem> armorSet, List<Predicate<ServerPlayerEntity>> predicates, List<StatusEffect> effects) {
        this.armorSet = armorSet;
        this.predicates = predicates;
        this.effects = effects;
    }

    @Override
    public void onEndTick(MinecraftServer server) {
        if (!server.getGameRules().getBoolean(ModGameRule.ENABLE_ARMOR_SET_FEATURE)) {
            return;
        }

        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            if (!isPlayerWearingArmorSet(player, armorSet)) {
                continue;
            }

            if (!predicates.stream().allMatch(predicate -> predicate.test(player))) {
                continue;
            }

            for (StatusEffect effect : effects) {
                player.addStatusEffect(new StatusEffectInstance(effect, getDurationInTicks(), 0, false, false, true));
            }
        }
    }

    private int getDurationInTicks() {
        return TICKS_PER_SECOND * DURATION_IN_SECONDS;
    }

    private boolean isPlayerWearingArmorSet(ServerPlayerEntity player, Map<EquipmentSlot, ArmorItem> armorSet) {
        return armorSet.entrySet().stream().allMatch(entry -> {
            EquipmentSlot slot = entry.getKey();
            ArmorItem armor = entry.getValue();

            Item equipped = player.getEquippedStack(slot).getItem();
            return equipped.equals(armor);
        });
    }
}
