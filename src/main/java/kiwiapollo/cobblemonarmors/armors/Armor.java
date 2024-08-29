package kiwiapollo.cobblemonarmors.armors;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class Armor {
    public final Item item;
    public final Identifier identifier;

    public Armor(ArmorMaterial armorMaterial, ArmorItem.Type armorItemType, String path) {
        item = new ArmorItem(armorMaterial, armorItemType, new FabricItemSettings());
        identifier = new Identifier(CobblemonArmors.NAMESPACE, path);
    }
}
