package kiwiapollo.cobblemonarmors.armors;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.features.TeamRocketArmorSetFeature;
import kiwiapollo.cobblemonarmors.materials.ArmorMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class TeamRocketArmorSet extends ArmorSet {
    public TeamRocketArmorSet() {
        super(
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_ROCKET, ArmorItem.Type.HELMET, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_rocket_helmet")
                ),
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_ROCKET, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_rocket_chestplate")
                ),
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_ROCKET, ArmorItem.Type.LEGGINGS, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_rocket_leggings")
                ),
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_ROCKET, ArmorItem.Type.BOOTS, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_rocket_boots")
                ),
                new TeamRocketArmorSetFeature()
        );
    }
}
