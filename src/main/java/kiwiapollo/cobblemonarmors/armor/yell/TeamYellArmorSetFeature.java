package kiwiapollo.cobblemonarmors.armor.yell;

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

public class TeamYellArmorSetFeature extends ArmorSetFeature {
    private static final Map<EquipmentSlot, Item> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, TeamYellArmorItem.TEAM_YELL_HELMET),
            Map.entry(EquipmentSlot.CHEST, TeamYellArmorItem.TEAM_YELL_CHESTPLATE),
            Map.entry(EquipmentSlot.LEGS, TeamYellArmorItem.TEAM_YELL_LEGGINGS),
            Map.entry(EquipmentSlot.FEET, TeamYellArmorItem.TEAM_YELL_BOOTS)
    );

    private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
            new RequiredPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getDARK())),
            new ForbiddenPokemonTypePredicate(List.of())
    );

    private static final List<StatusEffect> EFFECTS = List.of(
            StatusEffects.SATURATION
    );

    public TeamYellArmorSetFeature() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}
