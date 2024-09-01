package kiwiapollo.cobblemonarmors.armors;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.features.TeamAquaArmorSetFeature;
import kiwiapollo.cobblemonarmors.materials.ArmorMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class TeamAquaArmorSet extends ArmorSet {
    public TeamAquaArmorSet() {
        super(
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.HELMET, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_aqua_helmet")
                ),
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_aqua_chestplate")
                ),
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_aqua_leggings")
                ),
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.BOOTS, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_aqua_boots")
                ),
                new TeamAquaArmorSetFeature()
        );
    }
}
