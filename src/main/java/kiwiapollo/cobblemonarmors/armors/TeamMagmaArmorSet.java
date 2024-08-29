package kiwiapollo.cobblemonarmors.armors;

import kiwiapollo.cobblemonarmors.features.TeamMagmaArmorSetFeature;
import kiwiapollo.cobblemonarmors.materials.ArmorMaterials;
import net.minecraft.item.ArmorItem;

public class TeamMagmaArmorSet extends ArmorSet {
    public TeamMagmaArmorSet() {
        super(
                new Armor(ArmorMaterials.TEAM_MAGMA, ArmorItem.Type.HELMET, "team_magma_helmet"),
                new Armor(ArmorMaterials.TEAM_MAGMA, ArmorItem.Type.CHESTPLATE, "team_magma_chestplate"),
                new Armor(ArmorMaterials.TEAM_MAGMA, ArmorItem.Type.LEGGINGS, "team_magma_leggings"),
                new Armor(ArmorMaterials.TEAM_MAGMA, ArmorItem.Type.BOOTS, "team_magma_boots"),
                new TeamMagmaArmorSetFeature()
        );
    }
}
