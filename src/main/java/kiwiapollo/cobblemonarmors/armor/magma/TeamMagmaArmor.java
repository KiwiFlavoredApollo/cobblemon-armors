package kiwiapollo.cobblemonarmors.armor.magma;

import kiwiapollo.cobblemonarmors.armor.ModArmorMaterial;
import net.minecraft.item.ArmorItem;

public class TeamMagmaArmor {
    public static class Helmet extends ArmorItem {
        public Helmet() {
            super(ModArmorMaterial.TEAM_MAGMA, Type.HELMET, new Settings());
        }
    }

    public static class Chestplate extends ArmorItem {
        public Chestplate() {
            super(ModArmorMaterial.TEAM_MAGMA, Type.CHESTPLATE, new Settings());
        }
    }

    public static class Leggings extends ArmorItem {
        public Leggings() {
            super(ModArmorMaterial.TEAM_MAGMA, Type.LEGGINGS, new Settings());
        }
    }

    public static class Boots extends ArmorItem {
        public Boots() {
            super(ModArmorMaterial.TEAM_MAGMA, Type.BOOTS, new Settings());
        }
    }
}
