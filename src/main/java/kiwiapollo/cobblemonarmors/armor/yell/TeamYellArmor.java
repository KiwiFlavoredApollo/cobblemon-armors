package kiwiapollo.cobblemonarmors.armor.yell;

import kiwiapollo.cobblemonarmors.armor.ModArmorMaterial;
import net.minecraft.item.ArmorItem;

public class TeamYellArmor {
    public static class Helmet extends ArmorItem {
        public Helmet() {
            super(ModArmorMaterial.TEAM_YELL, Type.HELMET, new Settings());
        }
    }

    public static class Chestplate extends ArmorItem {
        public Chestplate() {
            super(ModArmorMaterial.TEAM_YELL, Type.CHESTPLATE, new Settings());
        }
    }

    public static class Leggings extends ArmorItem {
        public Leggings() {
            super(ModArmorMaterial.TEAM_YELL, Type.LEGGINGS, new Settings());
        }
    }

    public static class Boots extends ArmorItem {
        public Boots() {
            super(ModArmorMaterial.TEAM_YELL, Type.BOOTS, new Settings());
        }
    }
}
