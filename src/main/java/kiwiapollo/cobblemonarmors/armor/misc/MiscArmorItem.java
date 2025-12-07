package kiwiapollo.cobblemonarmors.armor.misc;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class MiscArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item PIKACHU_HELMET = register("pikachu_helmet", new PikachuArmor.Helmet());
    public static final Item MAGIKARP_HELMET = register("magikarp_helmet", new MagikarpArmor.Helmet());
    public static final Item SLOWKING_HELMET = register("slowking_helmet", new SlowkingArmor.Helmet());
    public static final Item DAWN_HELMET = register("dawn_helmet", new DawnArmor.Helmet());
    public static final Item LYRA_HELMET = register("lyra_helmet", new LyraArmor.Helmet());

    public static final Item FENNEKIN_HELMET = register("fennekin_helmet", new FennekinArmor.Helmet());
    public static final Item FENNEKIN_CHESTPLATE = register("fennekin_chestplate", new FennekinArmor.Chestplate());

    public static final Item BUTTERFREE_HELMET = register("butterfree_helmet", new ButterfreeArmor.Helmet());
    public static final Item BUTTERFREE_CHESTPLATE = register("butterfree_chestplate", new ButterfreeArmor.Chestplate());

    public static void initialize() {

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
