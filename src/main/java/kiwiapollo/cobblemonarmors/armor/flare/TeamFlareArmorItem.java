package kiwiapollo.cobblemonarmors.armor.flare;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class TeamFlareArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item TEAM_FLARE_HELMET = register("team_flare_helmet", new TeamFlareArmor.Helmet());
    public static final Item TEAM_FLARE_CHESTPLATE = register("team_flare_chestplate", new TeamFlareArmor.Chestplate());
    public static final Item TEAM_FLARE_LEGGINGS = register("team_flare_leggings", new TeamFlareArmor.Leggings());
    public static final Item TEAM_FLARE_BOOTS = register("team_flare_boots", new TeamFlareArmor.Boots());

    public static void initialize() {
        ServerTickEvents.END_SERVER_TICK.register(new TeamFlareArmorSetFeature());
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
