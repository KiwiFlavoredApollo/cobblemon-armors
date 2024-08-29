package kiwiapollo.cobblemonarmors.armors;

import kiwiapollo.cobblemonarmors.features.TeamAquaArmorSetFeature;
import kiwiapollo.cobblemonarmors.materials.ArmorMaterials;
import net.minecraft.item.ArmorItem;

public class TeamAquaArmorSet extends ArmorSet {
    public TeamAquaArmorSet() {
        super(
                new Armor(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.HELMET, "team_aqua_helmet"),
                new Armor(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.CHESTPLATE, "team_aqua_chestplate"),
                new Armor(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.LEGGINGS, "team_aqua_leggings"),
                new Armor(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.BOOTS, "team_aqua_boots"),
                new TeamAquaArmorSetFeature()
        );
    }
}
