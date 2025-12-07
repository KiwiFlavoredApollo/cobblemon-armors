package kiwiapollo.cobblemonarmors.armor.rainbowrocket;

import com.cobblemon.mod.common.api.types.ElementalTypes;
import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.armor.ArmorSetFeature;
import kiwiapollo.cobblemonarmors.armor.ModArmorMaterial;
import kiwiapollo.cobblemonarmors.predicate.ForbiddenPokemonTypePredicate;
import kiwiapollo.cobblemonarmors.predicate.RequiredPokemonTypePredicate;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class TeamRainbowRocketArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item TEAM_RAINBOW_ROCKET_HELMET = register("team_rainbow_rocket_helmet", new TeamRainbowRocketArmor.Helmet());
    public static final Item TEAM_RAINBOW_ROCKET_CHESTPLATE = register("team_rainbow_rocket_chestplate", new TeamRainbowRocketArmor.Chestplate());
    public static final Item TEAM_RAINBOW_ROCKET_LEGGINGS = register("team_rainbow_rocket_leggings", new TeamRainbowRocketArmor.Leggings());
    public static final Item TEAM_RAINBOW_ROCKET_BOOTS = register("team_rainbow_rocket_boots", new TeamRainbowRocketArmor.Boots());

    private static final ArmorSetFeature ARMOR_SET_FEATURE = new ArmorSetFeatureFactory().create();

    public static void initialize() {
        ServerTickEvents.END_SERVER_TICK.register(ARMOR_SET_FEATURE);
    }

    private static Item register(String name, Item item) {
        Identifier identifier = Identifier.of(CobblemonArmors.MOD_ID, name);
        Item registered = Registry.register(Registries.ITEM, identifier, item);
        all.add(registered);

        return registered;
    }

    public static List<Item> getAll() {
        return new ArrayList<>(all);
    }

    private static class ArmorSetFeatureFactory {
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

        public ArmorSetFeature create() {
            return new ArmorSetFeature(ARMOR_SET, PREDICATES, EFFECTS);
        }
    }
}
