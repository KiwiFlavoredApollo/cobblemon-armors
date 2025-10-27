package kiwiapollo.cobblemonarmors.feature;

import com.cobblemon.mod.common.api.types.ElementalTypes;
import kiwiapollo.cobblemonarmors.armor.ModArmorItem;
import kiwiapollo.cobblemonarmors.predicate.ForbiddenPokemonTypePredicate;
import kiwiapollo.cobblemonarmors.predicate.RequiredPokemonTypePredicate;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class BlackTeamPlasmaArmorSetFeatureEnabler extends ArmorSetFeatureEnabler {
    private static final Map<EquipmentSlot, ArmorItem> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, ModArmorItem.BLACK_TEAM_PLASMA_HELMET.getItem()),
            Map.entry(EquipmentSlot.CHEST, ModArmorItem.BLACK_TEAM_PLASMA_CHESTPLATE.getItem()),
            Map.entry(EquipmentSlot.LEGS, ModArmorItem.BLACK_TEAM_PLASMA_LEGGINGS.getItem()),
            Map.entry(EquipmentSlot.FEET, ModArmorItem.BLACK_TEAM_PLASMA_BOOTS.getItem())
    );

    private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
            new RequiredPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getELECTRIC())),
            new ForbiddenPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getFIRE()))
    );

    private static final List<StatusEffect> EFFECTS = List.of(
            StatusEffects.HASTE
    );

    public BlackTeamPlasmaArmorSetFeatureEnabler() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}

