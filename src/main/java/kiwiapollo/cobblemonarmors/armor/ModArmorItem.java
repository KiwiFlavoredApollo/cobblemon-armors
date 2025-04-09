package kiwiapollo.cobblemonarmors.armor;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.material.ModArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public enum ModArmorItem {
    TEAM_ROCKET_HELMET("team_rocket_helmet", new ArmorItem(ModArmorMaterial.TEAM_ROCKET, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_ROCKET_CHESTPLATE("team_rocket_chestplate", new ArmorItem(ModArmorMaterial.TEAM_ROCKET, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_ROCKET_LEGGINGS("team_rocket_leggings", new ArmorItem(ModArmorMaterial.TEAM_ROCKET, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_ROCKET_BOOTS("team_rocket_boots", new ArmorItem(ModArmorMaterial.TEAM_ROCKET, ArmorItem.Type.BOOTS, new Item.Settings())),

    TEAM_AQUA_HELMET("team_aqua_helmet", new ArmorItem(ModArmorMaterial.TEAM_AQUA, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_AQUA_CHESTPLATE("team_aqua_chestplate", new ArmorItem(ModArmorMaterial.TEAM_AQUA, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_AQUA_LEGGINGS("team_aqua_leggings", new ArmorItem(ModArmorMaterial.TEAM_AQUA, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_AQUA_BOOTS("team_aqua_boots", new ArmorItem(ModArmorMaterial.TEAM_AQUA, ArmorItem.Type.BOOTS, new Item.Settings())),

    TEAM_MAGMA_HELMET("team_magma_helmet", new ArmorItem(ModArmorMaterial.TEAM_MAGMA, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_MAGMA_CHESTPLATE("team_magma_chestplate", new ArmorItem(ModArmorMaterial.TEAM_MAGMA, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_MAGMA_LEGGINGS("team_magma_leggings", new ArmorItem(ModArmorMaterial.TEAM_MAGMA, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_MAGMA_BOOTS("team_magma_boots", new ArmorItem(ModArmorMaterial.TEAM_MAGMA, ArmorItem.Type.BOOTS, new Item.Settings())),

    TEAM_GALACTIC_HELMET("team_galactic_helmet", new ArmorItem(ModArmorMaterial.TEAM_GALACTIC, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_GALACTIC_CHESTPLATE("team_galactic_chestplate", new ArmorItem(ModArmorMaterial.TEAM_GALACTIC, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_GALACTIC_LEGGINGS("team_galactic_leggings", new ArmorItem(ModArmorMaterial.TEAM_GALACTIC, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_GALACTIC_BOOTS("team_galactic_boots", new ArmorItem(ModArmorMaterial.TEAM_GALACTIC, ArmorItem.Type.BOOTS, new Item.Settings())),

    WHITE_TEAM_PLASMA_HELMET("white_team_plasma_helmet", new ArmorItem(ModArmorMaterial.WHITE_TEAM_PLASMA, ArmorItem.Type.HELMET, new Item.Settings())),
    WHITE_TEAM_PLASMA_CHESTPLATE("white_team_plasma_chestplate", new ArmorItem(ModArmorMaterial.WHITE_TEAM_PLASMA, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    WHITE_TEAM_PLASMA_LEGGINGS("white_team_plasma_leggings", new ArmorItem(ModArmorMaterial.WHITE_TEAM_PLASMA, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    WHITE_TEAM_PLASMA_BOOTS("white_team_plasma_boots", new ArmorItem(ModArmorMaterial.WHITE_TEAM_PLASMA, ArmorItem.Type.BOOTS, new Item.Settings())),

    BLACK_TEAM_PLASMA_HELMET("black_team_plasma_helmet", new ArmorItem(ModArmorMaterial.BLACK_TEAM_PLASMA, ArmorItem.Type.HELMET, new Item.Settings())),
    BLACK_TEAM_PLASMA_CHESTPLATE("black_team_plasma_chestplate", new ArmorItem(ModArmorMaterial.BLACK_TEAM_PLASMA, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    BLACK_TEAM_PLASMA_LEGGINGS("black_team_plasma_leggings", new ArmorItem(ModArmorMaterial.BLACK_TEAM_PLASMA, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    BLACK_TEAM_PLASMA_BOOTS("black_team_plasma_boots", new ArmorItem(ModArmorMaterial.BLACK_TEAM_PLASMA, ArmorItem.Type.BOOTS, new Item.Settings())),

    TEAM_RAINBOW_ROCKET_HELMET("team_rainbow_rocket_helmet", new ArmorItem(ModArmorMaterial.TEAM_RAINBOW_ROCKET, ArmorItem.Type.HELMET, new Item.Settings())),
    TEAM_RAINBOW_ROCKET_CHESTPLATE("team_rainbow_rocket_chestplate", new ArmorItem(ModArmorMaterial.TEAM_RAINBOW_ROCKET, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    TEAM_RAINBOW_ROCKET_LEGGINGS("team_rainbow_rocket_leggings", new ArmorItem(ModArmorMaterial.TEAM_RAINBOW_ROCKET, ArmorItem.Type.LEGGINGS, new Item.Settings())),
    TEAM_RAINBOW_ROCKET_BOOTS("team_rainbow_rocket_boots", new ArmorItem(ModArmorMaterial.TEAM_RAINBOW_ROCKET, ArmorItem.Type.BOOTS, new Item.Settings())),

    PIKACHU_HELMET("pikachu_helmet", new PikachuArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings())),
    MAGIKARP_HELMET("magikarp_helmet", new MagikarpArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings())),
    SLOWKING_HELMET("slowking_helmet", new SlowkingArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings())),
    DAWN_HELMET("dawn_helmet", new DawnArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings())),
    LYRA_HELMET("lyra_helmet", new LyraArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings())),
    FENNEKIN_HELMET("fennekin_helmet", new FennekinArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings())),
    FENNEKIN_CHESTPLATE("fennekin_chestplate", new FennekinArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Settings())),
    BUTTERFREE_HELMET("butterfree_helmet", new ButterfreeArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Settings())),
    BUTTERFREE_CHESTPLATE("butterfree_chestplate", new ButterfreeArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

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
