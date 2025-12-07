package kiwiapollo.cobblemonarmors.armor.blackplasma;

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

public class BlackTeamPlasmaArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item BLACK_TEAM_PLASMA_HELMET = register("black_team_plasma_helmet", new BlackTeamPlasmaArmor.Helmet());
    public static final Item BLACK_TEAM_PLASMA_CHESTPLATE = register("black_team_plasma_chestplate", new BlackTeamPlasmaArmor.Chestplate());
    public static final Item BLACK_TEAM_PLASMA_LEGGINGS = register("black_team_plasma_leggings", new BlackTeamPlasmaArmor.Leggings());
    public static final Item BLACK_TEAM_PLASMA_BOOTS = register("black_team_plasma_boots", new BlackTeamPlasmaArmor.Boots());

    public static void initialize() {
        ServerTickEvents.END_SERVER_TICK.register(new BlackTeamPlasmaArmorSetFeature());
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
}
