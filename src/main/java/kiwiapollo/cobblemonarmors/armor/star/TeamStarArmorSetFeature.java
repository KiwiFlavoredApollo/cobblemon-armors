package kiwiapollo.cobblemonarmors.armor.star;

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

public class TeamStarArmorSetFeature extends ArmorSetFeature {
    private static final Map<EquipmentSlot, Item> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, TeamStarArmorItem.TEAM_STAR_HELMET),
            Map.entry(EquipmentSlot.CHEST, TeamStarArmorItem.TEAM_STAR_CHESTPLATE),
            Map.entry(EquipmentSlot.LEGS, TeamStarArmorItem.TEAM_STAR_LEGGINGS),
            Map.entry(EquipmentSlot.FEET, TeamStarArmorItem.TEAM_STAR_BOOTS)
    );

    private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
            new RequiredPokemonTypePredicate(List.of(
                    ElementalTypes.INSTANCE.getFIGHTING(),
                    ElementalTypes.INSTANCE.getELECTRIC()
            )),
            new ForbiddenPokemonTypePredicate(List.of())
    );

    private static final List<StatusEffect> EFFECTS = List.of(
            StatusEffects.LUCK
    );

    public TeamStarArmorSetFeature() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}
