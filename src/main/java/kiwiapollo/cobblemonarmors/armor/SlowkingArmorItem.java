package kiwiapollo.cobblemonarmors.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;

public class SlowkingArmorItem {
    public static class Helmet extends CustomModelArmorItem {
        public Helmet() {
            super(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings(), "slowking_armor");
        }
    }
}
