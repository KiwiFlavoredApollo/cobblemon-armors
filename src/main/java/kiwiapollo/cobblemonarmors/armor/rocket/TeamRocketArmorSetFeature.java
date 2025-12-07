package kiwiapollo.cobblemonarmors.armor.rocket;

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

public class TeamRocketArmorSetFeature extends ArmorSetFeature {
    private static final Map<EquipmentSlot, Item> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, TeamRocketArmorItem.TEAM_ROCKET_HELMET),
            Map.entry(EquipmentSlot.CHEST, TeamRocketArmorItem.TEAM_ROCKET_CHESTPLATE),
            Map.entry(EquipmentSlot.LEGS, TeamRocketArmorItem.TEAM_ROCKET_LEGGINGS),
            Map.entry(EquipmentSlot.FEET, TeamRocketArmorItem.TEAM_ROCKET_BOOTS)
    );

    private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
            new RequiredPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getPOISON())),
            new ForbiddenPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getPSYCHIC()))
    );

    private static final List<StatusEffect> EFFECTS = List.of(
            StatusEffects.RESISTANCE
    );

    public TeamRocketArmorSetFeature() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}
