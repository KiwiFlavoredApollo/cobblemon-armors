package kiwiapollo.cobblemonarmors.armor.star;

import kiwiapollo.cobblemonarmors.armor.ModArmorMaterial;
import net.minecraft.item.ArmorItem;

public class TeamStarArmor {
    public static class Helmet extends ArmorItem {
        public Helmet() {
            super(ModArmorMaterial.TEAM_STAR, Type.HELMET, new Settings());
        }
    }

    public static class Chestplate extends ArmorItem {
        public Chestplate() {
            super(ModArmorMaterial.TEAM_STAR, Type.CHESTPLATE, new Settings());
        }
    }

    public static class Leggings extends ArmorItem {
        public Leggings() {
            super(ModArmorMaterial.TEAM_STAR, Type.LEGGINGS, new Settings());
        }
    }

    public static class Boots extends ArmorItem {
        public Boots() {
            super(ModArmorMaterial.TEAM_STAR, Type.BOOTS, new Settings());
        }
    }
}
