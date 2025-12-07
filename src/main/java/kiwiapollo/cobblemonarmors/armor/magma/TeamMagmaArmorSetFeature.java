package kiwiapollo.cobblemonarmors.armor.magma;

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

public class TeamMagmaArmorSetFeature extends ArmorSetFeature {
    private static final Map<EquipmentSlot, Item> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, TeamMagmaArmorItem.TEAM_MAGMA_HELMET),
            Map.entry(EquipmentSlot.CHEST, TeamMagmaArmorItem.TEAM_MAGMA_CHESTPLATE),
            Map.entry(EquipmentSlot.LEGS, TeamMagmaArmorItem.TEAM_MAGMA_LEGGINGS),
            Map.entry(EquipmentSlot.FEET, TeamMagmaArmorItem.TEAM_MAGMA_BOOTS)
    );

    private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
            new RequiredPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getFIRE())),
            new ForbiddenPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getWATER()))
    );

    private static final List<StatusEffect> EFFECTS = List.of(
            StatusEffects.FIRE_RESISTANCE
    );

    public TeamMagmaArmorSetFeature() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}
