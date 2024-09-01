package kiwiapollo.cobblemonarmors.armors;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.features.TeamMagmaArmorSetFeature;
import kiwiapollo.cobblemonarmors.materials.ArmorMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class TeamMagmaArmorSet extends ArmorSet {
    public TeamMagmaArmorSet() {
        super(
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_MAGMA, ArmorItem.Type.HELMET, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_magma_helmet")
                ),
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_MAGMA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_magma_chestplate")
                ),
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_MAGMA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_magma_leggings")
                ),
                new Armor(
                        new ArmorItem(ArmorMaterials.TEAM_MAGMA, ArmorItem.Type.BOOTS, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "team_magma_boots")
                ),
                new TeamMagmaArmorSetFeature()
        );
    }
}
