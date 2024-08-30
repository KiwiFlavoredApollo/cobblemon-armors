package kiwiapollo.cobblemonarmors.armors;

import kiwiapollo.cobblemonarmors.features.TeamRocketArmorSetFeature;
import kiwiapollo.cobblemonarmors.materials.ArmorMaterials;
import net.minecraft.item.ArmorItem;

public class TeamRocketArmorSet extends ArmorSet {
    public TeamRocketArmorSet() {
        super(
                new Armor(ArmorMaterials.TEAM_ROCKET, ArmorItem.Type.HELMET, "team_rocket_helmet"),
                new Armor(ArmorMaterials.TEAM_ROCKET, ArmorItem.Type.CHESTPLATE, "team_rocket_chestplate"),
                new Armor(ArmorMaterials.TEAM_ROCKET, ArmorItem.Type.LEGGINGS, "team_rocket_leggings"),
                new Armor(ArmorMaterials.TEAM_ROCKET, ArmorItem.Type.BOOTS, "team_rocket_boots"),
                new TeamRocketArmorSetFeature()
        );
    }
}
