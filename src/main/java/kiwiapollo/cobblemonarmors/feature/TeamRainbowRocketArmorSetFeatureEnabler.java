package kiwiapollo.cobblemonarmors.feature;

import com.cobblemon.mod.common.api.types.ElementalTypes;
import kiwiapollo.cobblemonarmors.armor.ModArmorItem;
import kiwiapollo.cobblemonarmors.predicate.ForbiddenPokemonTypePredicate;
import kiwiapollo.cobblemonarmors.predicate.RequiredPokemonTypePredicate;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class TeamRainbowRocketArmorSetFeatureEnabler extends ArmorSetFeatureEnabler {
    private static final Map<EquipmentSlot, Item> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, ModArmorItem.TEAM_RAINBOW_ROCKET_HELMET),
            Map.entry(EquipmentSlot.CHEST, ModArmorItem.TEAM_RAINBOW_ROCKET_CHESTPLATE),
            Map.entry(EquipmentSlot.LEGS, ModArmorItem.TEAM_RAINBOW_ROCKET_LEGGINGS),
            Map.entry(EquipmentSlot.FEET, ModArmorItem.TEAM_RAINBOW_ROCKET_BOOTS)
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

    public TeamRainbowRocketArmorSetFeatureEnabler() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}

