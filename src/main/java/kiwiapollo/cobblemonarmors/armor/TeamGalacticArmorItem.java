package kiwiapollo.cobblemonarmors.armor;

import kiwiapollo.cobblemonarmors.material.ModArmorMaterial;
import net.minecraft.item.ArmorItem;

public class TeamGalacticArmorItem {
    public static class Helmet extends ArmorItem {
        public Helmet() {
            super(ModArmorMaterial.TEAM_GALACTIC, Type.HELMET, new Settings());
        }
    }

    public static class Chestplate extends ArmorItem {
        public Chestplate() {
            super(ModArmorMaterial.TEAM_GALACTIC, Type.CHESTPLATE, new Settings());
        }
    }

    public static class Leggings extends ArmorItem {
        public Leggings() {
            super(ModArmorMaterial.TEAM_GALACTIC, Type.LEGGINGS, new Settings());
        }
    }

    public static class Boots extends ArmorItem {
        public Boots() {
            super(ModArmorMaterial.TEAM_GALACTIC, Type.BOOTS, new Settings());
        }
    }
}
