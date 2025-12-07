package kiwiapollo.cobblemonarmors.armor;

import kiwiapollo.cobblemonarmors.material.ModArmorMaterial;
import net.minecraft.item.ArmorItem;

public class WhiteTeamPlasmaArmorItem {
    public static class Helmet extends ArmorItem {
        public Helmet() {
            super(ModArmorMaterial.WHITE_TEAM_PLASMA, Type.HELMET, new Settings());
        }
    }

    public static class Chestplate extends ArmorItem {
        public Chestplate() {
            super(ModArmorMaterial.WHITE_TEAM_PLASMA, Type.CHESTPLATE, new Settings());
        }
    }

    public static class Leggings extends ArmorItem {
        public Leggings() {
            super(ModArmorMaterial.WHITE_TEAM_PLASMA, Type.LEGGINGS, new Settings());
        }
    }

    public static class Boots extends ArmorItem {
        public Boots() {
            super(ModArmorMaterial.WHITE_TEAM_PLASMA, Type.BOOTS, new Settings());
        }
    }
}
