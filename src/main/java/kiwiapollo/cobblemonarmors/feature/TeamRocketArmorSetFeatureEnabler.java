package kiwiapollo.cobblemonarmors.feature;

import com.cobblemon.mod.common.api.types.ElementalTypes;
import kiwiapollo.cobblemonarmors.armor.ModArmorItem;
import kiwiapollo.cobblemonarmors.predicate.ForbiddenPokemonTypePredicate;
import kiwiapollo.cobblemonarmors.predicate.RequiredPokemonTypePredicate;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class TeamRocketArmorSetFeatureEnabler extends ArmorSetFeatureEnabler {
    private static final Map<EquipmentSlot, ArmorItem> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, ModArmorItem.TEAM_ROCKET_HELMET.getItem()),
            Map.entry(EquipmentSlot.CHEST, ModArmorItem.TEAM_ROCKET_CHESTPLATE.getItem()),
            Map.entry(EquipmentSlot.LEGS, ModArmorItem.TEAM_ROCKET_LEGGINGS.getItem()),
            Map.entry(EquipmentSlot.FEET, ModArmorItem.TEAM_ROCKET_BOOTS.getItem())
    );

    private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
            new RequiredPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getPOISON())),
            new ForbiddenPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getPSYCHIC()))
    );

    private static final List<StatusEffectInstance> EFFECTS = List.of(
            new StatusEffectInstance(StatusEffects.RESISTANCE, 220, 0, false, false, true)
    );

    public TeamRocketArmorSetFeatureEnabler() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}
