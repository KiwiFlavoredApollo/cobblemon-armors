package kiwiapollo.cobblemonarmors.armor.rocket;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class TeamRocketArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item TEAM_ROCKET_HELMET = register("team_rocket_helmet", new TeamRocketArmor.Helmet());
    public static final Item TEAM_ROCKET_CHESTPLATE = register("team_rocket_chestplate", new TeamRocketArmor.Chestplate());
    public static final Item TEAM_ROCKET_LEGGINGS = register("team_rocket_leggings", new TeamRocketArmor.Leggings());
    public static final Item TEAM_ROCKET_BOOTS = register("team_rocket_boots", new TeamRocketArmor.Boots());

    public static void initialize() {
        ServerTickEvents.END_SERVER_TICK.register(new TeamRocketArmorSetFeature());
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
