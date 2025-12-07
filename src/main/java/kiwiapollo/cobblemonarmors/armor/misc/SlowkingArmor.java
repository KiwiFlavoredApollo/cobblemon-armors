package kiwiapollo.cobblemonarmors.armor.misc;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;

public class SlowkingArmor {
    public static class Helmet extends CustomModelArmorItem {
        public Helmet() {
            super(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings(), "slowking_armor");
        }
    }
}
