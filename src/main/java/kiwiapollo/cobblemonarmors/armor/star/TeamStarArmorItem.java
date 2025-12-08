package kiwiapollo.cobblemonarmors.armor.star;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class TeamStarArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item TEAM_STAR_HELMET = register("team_star_helmet", new TeamStarArmor.Helmet());
    public static final Item TEAM_STAR_CHESTPLATE = register("team_star_chestplate", new TeamStarArmor.Chestplate());
    public static final Item TEAM_STAR_LEGGINGS = register("team_star_leggings", new TeamStarArmor.Leggings());
    public static final Item TEAM_STAR_BOOTS = register("team_star_boots", new TeamStarArmor.Boots());

    public static void initialize() {
        ServerTickEvents.END_SERVER_TICK.register(new TeamStarArmorSetFeature());
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
