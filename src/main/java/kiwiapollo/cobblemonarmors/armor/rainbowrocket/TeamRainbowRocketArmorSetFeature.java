package kiwiapollo.cobblemonarmors.armor.rainbowrocket;

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

public class TeamRainbowRocketArmorSetFeature extends ArmorSetFeature {
    private static final Map<EquipmentSlot, Item> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, TeamRainbowRocketArmorItem.TEAM_RAINBOW_ROCKET_HELMET),
            Map.entry(EquipmentSlot.CHEST, TeamRainbowRocketArmorItem.TEAM_RAINBOW_ROCKET_CHESTPLATE),
            Map.entry(EquipmentSlot.LEGS, TeamRainbowRocketArmorItem.TEAM_RAINBOW_ROCKET_LEGGINGS),
            Map.entry(EquipmentSlot.FEET, TeamRainbowRocketArmorItem.TEAM_RAINBOW_ROCKET_BOOTS)
    );

    private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
            new RequiredPokemonTypePredicate(List.of(
                    ElementalTypes.INSTANCE.getFIRE(),
                    ElementalTypes.INSTANCE.getWATER(),
                    ElementalTypes.INSTANCE.getGRASS()
            )),
            new ForbiddenPokemonTypePredicate(List.of())
    );

    private static final List<StatusEffect> EFFECTS = List.of(
            StatusEffects.NIGHT_VISION
    );

    public TeamRainbowRocketArmorSetFeature() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}
