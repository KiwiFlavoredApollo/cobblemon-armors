package kiwiapollo.cobblemonarmors.armor.aqua;

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

public class TeamAquaArmorSetFeature extends ArmorSetFeature {
    private static final Map<EquipmentSlot, Item> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, TeamAquaArmorItem.TEAM_AQUA_HELMET),
            Map.entry(EquipmentSlot.CHEST, TeamAquaArmorItem.TEAM_AQUA_CHESTPLATE),
            Map.entry(EquipmentSlot.LEGS, TeamAquaArmorItem.TEAM_AQUA_LEGGINGS),
            Map.entry(EquipmentSlot.FEET, TeamAquaArmorItem.TEAM_AQUA_BOOTS)
    );

    private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
            new RequiredPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getWATER())),
            new ForbiddenPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getFIRE()))
    );

    private static final List<StatusEffect> EFFECTS = List.of(
            StatusEffects.DOLPHINS_GRACE
    );

    public TeamAquaArmorSetFeature() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}
