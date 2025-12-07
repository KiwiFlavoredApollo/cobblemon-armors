package kiwiapollo.cobblemonarmors.armor.blackplasma;

import com.cobblemon.mod.common.api.types.ElementalTypes;
import kiwiapollo.cobblemonarmors.armor.ArmorSetFeature;
import kiwiapollo.cobblemonarmors.predicate.ForbiddenPokemonTypePredicate;
import kiwiapollo.cobblemonarmors.predicate.RequiredPokemonTypePredicate;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class BlackTeamPlasmaArmorSetFeature extends ArmorSetFeature {
    private static final Map<EquipmentSlot, Item> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, BlackTeamPlasmaArmorItem.BLACK_TEAM_PLASMA_HELMET),
            Map.entry(EquipmentSlot.CHEST, BlackTeamPlasmaArmorItem.BLACK_TEAM_PLASMA_CHESTPLATE),
            Map.entry(EquipmentSlot.LEGS, BlackTeamPlasmaArmorItem.BLACK_TEAM_PLASMA_LEGGINGS),
            Map.entry(EquipmentSlot.FEET, BlackTeamPlasmaArmorItem.BLACK_TEAM_PLASMA_BOOTS)
    );

    private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
            new RequiredPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getELECTRIC())),
            new ForbiddenPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getFIRE()))
    );

    private static final List<StatusEffect> EFFECTS = List.of(
            StatusEffects.HASTE
    );

    public BlackTeamPlasmaArmorSetFeature() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}
