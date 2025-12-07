package kiwiapollo.cobblemonarmors.armor.blackplasma;

import kiwiapollo.cobblemonarmors.armor.ModArmorMaterial;
import net.minecraft.item.ArmorItem;

public class BlackTeamPlasmaArmor {
    public static class Helmet extends ArmorItem {
        public Helmet() {
            super(ModArmorMaterial.BLACK_TEAM_PLASMA, Type.HELMET, new Settings());
        }
    }

    public static class Chestplate extends ArmorItem {
        public Chestplate() {
            super(ModArmorMaterial.BLACK_TEAM_PLASMA, Type.CHESTPLATE, new Settings());
        }
    }

    public static class Leggings extends ArmorItem {
        public Leggings() {
            super(ModArmorMaterial.BLACK_TEAM_PLASMA, Type.LEGGINGS, new Settings());
        }
    }

    public static class Boots extends ArmorItem {
        public Boots() {
            super(ModArmorMaterial.BLACK_TEAM_PLASMA, Type.BOOTS, new Settings());
        }
    }
}
