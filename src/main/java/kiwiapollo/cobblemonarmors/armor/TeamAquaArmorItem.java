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

public class TeamAquaArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item TEAM_AQUA_HELMET = register("team_aqua_helmet", new Helmet());
    public static final Item TEAM_AQUA_CHESTPLATE = register("team_aqua_chestplate", new Chestplate());
    public static final Item TEAM_AQUA_LEGGINGS = register("team_aqua_leggings", new Leggings());
    public static final Item TEAM_AQUA_BOOTS = register("team_aqua_boots", new Boots());

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
            super(ModArmorMaterial.TEAM_AQUA, Type.HELMET, new Settings());
        }
    }

    private static class Chestplate extends ArmorItem {
        public Chestplate() {
            super(ModArmorMaterial.TEAM_AQUA, Type.CHESTPLATE, new Settings());
        }
    }

    private static class Leggings extends ArmorItem {
        public Leggings() {
            super(ModArmorMaterial.TEAM_AQUA, Type.LEGGINGS, new Settings());
        }
    }

    private static class Boots extends ArmorItem {
        public Boots() {
            super(ModArmorMaterial.TEAM_AQUA, Type.BOOTS, new Settings());
        }
    }

    private static class ArmorSetFeatureFactory {
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

        public ArmorSetFeature create() {
            return new ArmorSetFeature(ARMOR_SET, PREDICATES, EFFECTS);
        }
    }
}
