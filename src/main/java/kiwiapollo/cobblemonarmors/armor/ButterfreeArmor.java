package kiwiapollo.cobblemonarmors.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;

public class ButterfreeArmor {
    public static class Helmet extends CustomModelArmorItem {
        public Helmet() {
            super(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings(), "butterfree_armor");
        }
    }

    public static class Chestplate extends CustomModelArmorItem {
        public Chestplate() {
            super(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Settings(), "butterfree_armor");
        }
    }
}
