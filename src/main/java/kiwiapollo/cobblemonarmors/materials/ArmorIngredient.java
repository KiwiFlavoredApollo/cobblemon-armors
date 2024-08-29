package kiwiapollo.cobblemonarmors.materials;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ArmorIngredient {
    public final Item item;
    public final Identifier identifier;

    public ArmorIngredient(String path) {
        item = new Item(new FabricItemSettings());
        identifier = new Identifier(CobblemonArmors.NAMESPACE, path);
    }
}
