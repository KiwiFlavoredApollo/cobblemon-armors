package kiwiapollo.cobblemonarmors.armor.skull;

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

public class TeamSkullArmorSetFeature extends ArmorSetFeature {
    private static final Map<EquipmentSlot, Item> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, TeamSkullArmorItem.TEAM_SKULL_HELMET),
            Map.entry(EquipmentSlot.CHEST, TeamSkullArmorItem.TEAM_SKULL_CHESTPLATE),
            Map.entry(EquipmentSlot.LEGS, TeamSkullArmorItem.TEAM_SKULL_LEGGINGS),
            Map.entry(EquipmentSlot.FEET, TeamSkullArmorItem.TEAM_SKULL_BOOTS)
    );

    private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
            new RequiredPokemonTypePredicate(List.of(
                    ElementalTypes.INSTANCE.getBUG(),
                    ElementalTypes.INSTANCE.getWATER()
            )),
            new ForbiddenPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getELECTRIC()))
    );

    private static final List<StatusEffect> EFFECTS = List.of(
            StatusEffects.SPEED
    );

    public TeamSkullArmorSetFeature() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}
