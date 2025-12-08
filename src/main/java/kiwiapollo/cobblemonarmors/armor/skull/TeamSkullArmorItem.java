package kiwiapollo.cobblemonarmors.armor.skull;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class TeamSkullArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item TEAM_SKULL_HELMET = register("team_skull_helmet", new TeamSkullArmor.Helmet());
    public static final Item TEAM_SKULL_CHESTPLATE = register("team_skull_chestplate", new TeamSkullArmor.Chestplate());
    public static final Item TEAM_SKULL_LEGGINGS = register("team_skull_leggings", new TeamSkullArmor.Leggings());
    public static final Item TEAM_SKULL_BOOTS = register("team_skull_boots", new TeamSkullArmor.Boots());

    public static void initialize() {
        ServerTickEvents.END_SERVER_TICK.register(new TeamSkullArmorSetFeature());
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
