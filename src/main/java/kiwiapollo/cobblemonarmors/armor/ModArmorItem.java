package kiwiapollo.cobblemonarmors.armor;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.material.ModArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public enum ModArmorItem {
    TEAM_AQUA_HELMET("team_aqua_helmet", new ArmorItem(ModArmorMaterial.AQUA_THREAD, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_AQUA_CHESTPLATE("team_aqua_chestplate", new ArmorItem(ModArmorMaterial.AQUA_THREAD, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_AQUA_LEGGINGS("team_aqua_leggings", new ArmorItem(ModArmorMaterial.AQUA_THREAD, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_AQUA_BOOTS("team_aqua_boots", new ArmorItem(ModArmorMaterial.AQUA_THREAD, ArmorItem.Type.BOOTS, new Item.Settings())),

    TEAM_MAGMA_HELMET("team_magma_helmet", new ArmorItem(ModArmorMaterial.MAGMA_THREAD, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_MAGMA_CHESTPLATE("team_magma_chestplate", new ArmorItem(ModArmorMaterial.MAGMA_THREAD, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_MAGMA_LEGGINGS("team_magma_leggings", new ArmorItem(ModArmorMaterial.MAGMA_THREAD, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_MAGMA_BOOTS("team_magma_boots", new ArmorItem(ModArmorMaterial.MAGMA_THREAD, ArmorItem.Type.BOOTS, new Item.Settings())),

    TEAM_ROCKET_HELMET("team_rocket_helmet", new ArmorItem(ModArmorMaterial.ROCKET_THREAD, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_ROCKET_CHESTPLATE("team_rocket_chestplate", new ArmorItem(ModArmorMaterial.ROCKET_THREAD, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_ROCKET_LEGGINGS("team_rocket_leggings", new ArmorItem(ModArmorMaterial.ROCKET_THREAD, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_ROCKET_BOOTS("team_rocket_boots", new ArmorItem(ModArmorMaterial.ROCKET_THREAD, ArmorItem.Type.BOOTS, new Item.Settings())),

    TEAM_PLASMA_HELMET("team_plasma_helmet", new ArmorItem(ModArmorMaterial.PLASMA_THREAD, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_PLASMA_CHESTPLATE("team_plasma_chestplate", new ArmorItem(ModArmorMaterial.PLASMA_THREAD, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_PLASMA_LEGGINGS("team_plasma_leggings", new ArmorItem(ModArmorMaterial.PLASMA_THREAD, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_PLASMA_BOOTS("team_plasma_boots", new ArmorItem(ModArmorMaterial.PLASMA_THREAD, ArmorItem.Type.BOOTS, new Item.Settings())),

    PIKACHU_HELMET("pikachu_helmet", new PikachuArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings())),
    MAGIKARP_HELMET("magikarp_helmet", new MagikarpArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings())),
    FENNEKIN_HELMET("fennekin_helmet", new FennekinArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings())),
    FENNEKIN_CHESTPLATE("fennekin_chestplate", new FennekinArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

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
