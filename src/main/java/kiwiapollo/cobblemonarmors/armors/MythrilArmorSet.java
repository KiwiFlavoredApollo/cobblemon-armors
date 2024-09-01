package kiwiapollo.cobblemonarmors.armors;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.features.TeamAquaArmorSetFeature;
import kiwiapollo.cobblemonarmors.materials.ArmorMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class MythrilArmorSet extends ArmorSet {
    public MythrilArmorSet() {
        super(
                new Armor(
                        new MythrilArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.HELMET, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "mythril_helmet")
                ),
                new Armor(
                        new MythrilArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "mythril_chestplate")
                ),
                new Armor(
                        new MythrilArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.LEGGINGS, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "mythril_leggings")
                ),
                new Armor(
                        new MythrilArmorItem(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.BOOTS, new FabricItemSettings()),
                        Identifier.of(CobblemonArmors.NAMESPACE, "mythril_boots")
                ),
                new TeamAquaArmorSetFeature()
        );
    }
}
