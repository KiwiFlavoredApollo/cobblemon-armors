package kiwiapollo.cobblemonarmors.armor.galactic;

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

public class TeamGalacticArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item TEAM_GALACTIC_HELMET = register("team_galactic_helmet", new TeamGalacticArmor.Helmet());
    public static final Item TEAM_GALACTIC_CHESTPLATE = register("team_galactic_chestplate", new TeamGalacticArmor.Chestplate());
    public static final Item TEAM_GALACTIC_LEGGINGS = register("team_galactic_leggings", new TeamGalacticArmor.Leggings());
    public static final Item TEAM_GALACTIC_BOOTS = register("team_galactic_boots", new TeamGalacticArmor.Boots());

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
                Map.entry(EquipmentSlot.HEAD, TeamGalacticArmorItem.TEAM_GALACTIC_HELMET),
                Map.entry(EquipmentSlot.CHEST, TeamGalacticArmorItem.TEAM_GALACTIC_CHESTPLATE),
                Map.entry(EquipmentSlot.LEGS, TeamGalacticArmorItem.TEAM_GALACTIC_LEGGINGS),
                Map.entry(EquipmentSlot.FEET, TeamGalacticArmorItem.TEAM_GALACTIC_BOOTS)
        );

        private static final List<Predicate<ServerPlayerEntity>> PREDICATES = List.of(
                new RequiredPokemonTypePredicate(List.of(
                        ElementalTypes.INSTANCE.getWATER(),
                        ElementalTypes.INSTANCE.getSTEEL()
                )),
                new ForbiddenPokemonTypePredicate(List.of())
        );

        private static final List<StatusEffect> EFFECTS = List.of(
                StatusEffects.JUMP_BOOST
        );

        public ArmorSetFeature create() {
            return new ArmorSetFeature(ARMOR_SET, PREDICATES, EFFECTS);
        }
    }
}
