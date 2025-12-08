package kiwiapollo.cobblemonarmors.armor.yell;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class TeamYellArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item TEAM_YELL_HELMET = register("team_yell_helmet", new TeamYellArmor.Helmet());
    public static final Item TEAM_YELL_CHESTPLATE = register("team_yell_chestplate", new TeamYellArmor.Chestplate());
    public static final Item TEAM_YELL_LEGGINGS = register("team_yell_leggings", new TeamYellArmor.Leggings());
    public static final Item TEAM_YELL_BOOTS = register("team_yell_boots", new TeamYellArmor.Boots());

    public static void initialize() {
        ServerTickEvents.END_SERVER_TICK.register(new TeamYellArmorSetFeature());
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
