package kiwiapollo.cobblemonarmors.armors;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.features.TeamAquaArmorSetFeature;
import kiwiapollo.cobblemonarmors.materials.ArmorMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class TestArmorSet extends ArmorSet {
    public TestArmorSet() {
        super(
                new Armor(
                        new TestArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.HELMET, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "test_helmet")
                ),
                new Armor(
                        new TestArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "test_chestplate")
                ),
                new Armor(
                        new TestArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "test_leggings")
                ),
                new Armor(
                        new TestArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.BOOTS, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "test_boots")
                ),
                new TeamAquaArmorSetFeature()
        );
    }
}
