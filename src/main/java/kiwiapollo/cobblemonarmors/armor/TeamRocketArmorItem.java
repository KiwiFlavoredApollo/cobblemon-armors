package kiwiapollo.cobblemonarmors.armor;

import kiwiapollo.cobblemonarmors.material.ModArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class TeamRocketArmorItem {
    public static class Helmet extends ArmorItem {
        public Helmet() {
            super(ModArmorMaterial.TEAM_ROCKET, Type.HELMET, new Item.Settings());
        }
    }

    public static class Chestplate extends ArmorItem {
        public Chestplate() {
            super(ModArmorMaterial.TEAM_ROCKET, Type.CHESTPLATE, new Item.Settings());
        }
    }

    public static class Leggings extends ArmorItem {
        public Leggings() {
            super(ModArmorMaterial.TEAM_ROCKET, Type.LEGGINGS, new Item.Settings());
        }
    }

    public static class Boots extends ArmorItem {
        public Boots() {
            super(ModArmorMaterial.TEAM_ROCKET, Type.BOOTS, new Item.Settings());
        }
    }
}
