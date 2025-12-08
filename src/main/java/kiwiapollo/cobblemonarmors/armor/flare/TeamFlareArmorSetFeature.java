package kiwiapollo.cobblemonarmors.armor.flare;

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

public class TeamFlareArmorSetFeature extends ArmorSetFeature {
    private static final Map<EquipmentSlot, Item> ARMOR_SET = Map.ofEntries(
            Map.entry(EquipmentSlot.HEAD, TeamFlareArmorItem.TEAM_FLARE_HELMET),
            Map.entry(EquipmentSlot.CHEST, TeamFlareArmorItem.TEAM_FLARE_CHESTPLATE),
            Map.entry(EquipmentSlot.LEGS, TeamFlareArmorItem.TEAM_FLARE_LEGGINGS),
            Map.entry(EquipmentSlot.FEET, TeamFlareArmorItem.TEAM_FLARE_BOOTS)
    );

    private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
            new RequiredPokemonTypePredicate(List.of(ElementalTypes.INSTANCE.getFIRE())),
            new ForbiddenPokemonTypePredicate(List.of(
                    ElementalTypes.INSTANCE.getFAIRY(),
                    ElementalTypes.INSTANCE.getDARK()
            ))
    );

    private static final List<StatusEffect> EFFECTS = List.of(
            StatusEffects.ABSORPTION
    );

    public TeamFlareArmorSetFeature() {
        super(ARMOR_SET, PREDICATES, EFFECTS);
    }
}
