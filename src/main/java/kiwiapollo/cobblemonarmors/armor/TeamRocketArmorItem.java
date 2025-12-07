package kiwiapollo.cobblemonarmors.armor;

import com.cobblemon.mod.common.api.types.ElementalTypes;
import kiwiapollo.cobblemonarmors.CobblemonArmors;
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

public class TeamRocketArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item TEAM_ROCKET_HELMET = register("team_rocket_helmet", new Helmet());
    public static final Item TEAM_ROCKET_CHESTPLATE = register("team_rocket_chestplate", new Chestplate());
    public static final Item TEAM_ROCKET_LEGGINGS = register("team_rocket_leggings", new Leggings());
    public static final Item TEAM_ROCKET_BOOTS = register("team_rocket_boots", new Boots());

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

    private static class Helmet extends ArmorItem {
        public Helmet() {
            super(ModArmorMaterial.TEAM_ROCKET, Type.HELMET, new Item.Settings());
        }
    }

    private static class Chestplate extends ArmorItem {
        public Chestplate() {
            super(ModArmorMaterial.TEAM_ROCKET, Type.CHESTPLATE, new Item.Settings());
        }
    }

    private static class Leggings extends ArmorItem {
        public Leggings() {
            super(ModArmorMaterial.TEAM_ROCKET, Type.LEGGINGS, new Item.Settings());
        }
    }

    private static class Boots extends ArmorItem {
        public Boots() {
            super(ModArmorMaterial.TEAM_ROCKET, Type.BOOTS, new Item.Settings());
        }
    }

    private static class ArmorSetFeatureFactory {
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

        public ArmorSetFeature create() {
            return new ArmorSetFeature(ARMOR_SET, PREDICATES, EFFECTS);
        }
    }
}
