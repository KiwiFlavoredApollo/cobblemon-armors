package kiwiapollo.cobblemonarmors.armor;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.material.ModArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public enum ModArmorItem {
    TEAM_AQUA_HELMET("team_aqua_helmet", new ArmorItem(ModArmorMaterial.TEAM_AQUA, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_AQUA_CHESTPLATE("team_aqua_chestplate", new ArmorItem(ModArmorMaterial.TEAM_AQUA, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_AQUA_LEGGINGS("team_aqua_leggings", new ArmorItem(ModArmorMaterial.TEAM_AQUA, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_AQUA_BOOTS("team_aqua_boots", new ArmorItem(ModArmorMaterial.TEAM_AQUA, ArmorItem.Type.BOOTS, new Item.Settings())),

    TEAM_MAGMA_HELMET("team_magma_helmet", new ArmorItem(ModArmorMaterial.TEAM_MAGMA, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_MAGMA_CHESTPLATE("team_magma_chestplate", new ArmorItem(ModArmorMaterial.TEAM_MAGMA, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_MAGMA_LEGGINGS("team_magma_leggings", new ArmorItem(ModArmorMaterial.TEAM_MAGMA, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_MAGMA_BOOTS("team_magma_boots", new ArmorItem(ModArmorMaterial.TEAM_MAGMA, ArmorItem.Type.BOOTS, new Item.Settings())),

    TEAM_ROCKET_HELMET("team_rocket_helmet", new ArmorItem(ModArmorMaterial.TEAM_ROCKET, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_ROCKET_CHESTPLATE("team_rocket_chestplate", new ArmorItem(ModArmorMaterial.TEAM_ROCKET, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_ROCKET_LEGGINGS("team_rocket_leggings", new ArmorItem(ModArmorMaterial.TEAM_ROCKET, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_ROCKET_BOOTS("team_rocket_boots", new ArmorItem(ModArmorMaterial.TEAM_ROCKET, ArmorItem.Type.BOOTS, new Item.Settings())),

    PIKACHU_HELMET("pikachu_helmet", new PikachuArmorItem(ModArmorMaterial.PIKACHU, ArmorItem.Type.HELMET, new Item.Settings())),
    MAGIKARP_HELMET("magikarp_helmet", new MagikarpArmorItem(ModArmorMaterial.MAGIKARP, ArmorItem.Type.HELMET, new Item.Settings())),
    FENNEKIN_HELMET("fennekin_helmet", new FennekinArmorItem(ModArmorMaterial.FENNEKIN, ArmorItem.Type.HELMET, new Item.Settings())),
    FENNEKIN_CHESTPLATE("fennekin_chestplate", new FennekinArmorItem(ModArmorMaterial.FENNEKIN, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    private final Identifier identifier;
    private final ArmorItem item;

    ModArmorItem(String path, ArmorItem item) {
        this.identifier = Identifier.of(CobblemonArmors.NAMESPACE, path);
        this.item = item;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public ArmorItem getItem() {
        return item;
    }
}
