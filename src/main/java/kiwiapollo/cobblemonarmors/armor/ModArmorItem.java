package kiwiapollo.cobblemonarmors.armor;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public enum ModArmorItem {
    TEAM_ROCKET_HELMET("team_rocket_helmet", new TeamRocketArmorItem.Helmet()),
    TEAM_ROCKET_CHESTPLATE("team_rocket_chestplate", new TeamRocketArmorItem.Chestplate()),
    TEAM_ROCKET_LEGGINGS("team_rocket_leggings", new TeamRocketArmorItem.Leggings()),
    TEAM_ROCKET_BOOTS("team_rocket_boots", new TeamRocketArmorItem.Boots()),

    TEAM_AQUA_HELMET("team_aqua_helmet", new TeamAquaArmorItem.Helmet()),
    TEAM_AQUA_CHESTPLATE("team_aqua_chestplate", new TeamAquaArmorItem.Chestplate()),
    TEAM_AQUA_LEGGINGS("team_aqua_leggings", new TeamAquaArmorItem.Leggings()),
    TEAM_AQUA_BOOTS("team_aqua_boots", new TeamAquaArmorItem.Boots()),

    TEAM_MAGMA_HELMET("team_magma_helmet", new TeamMagmaArmorItem.Helmet()),
    TEAM_MAGMA_CHESTPLATE("team_magma_chestplate", new TeamMagmaArmorItem.Chestplate()),
    TEAM_MAGMA_LEGGINGS("team_magma_leggings", new TeamMagmaArmorItem.Leggings()),
    TEAM_MAGMA_BOOTS("team_magma_boots", new TeamMagmaArmorItem.Boots()),

    TEAM_GALACTIC_HELMET("team_galactic_helmet", new TeamGalacticArmorItem.Helmet()),
    TEAM_GALACTIC_CHESTPLATE("team_galactic_chestplate", new TeamGalacticArmorItem.Chestplate()),
    TEAM_GALACTIC_LEGGINGS("team_galactic_leggings", new TeamGalacticArmorItem.Leggings()),
    TEAM_GALACTIC_BOOTS("team_galactic_boots", new TeamGalacticArmorItem.Boots()),

    WHITE_TEAM_PLASMA_HELMET("white_team_plasma_helmet", new WhiteTeamPlasmaArmorItem.Helmet()),
    WHITE_TEAM_PLASMA_CHESTPLATE("white_team_plasma_chestplate", new WhiteTeamPlasmaArmorItem.Chestplate()),
    WHITE_TEAM_PLASMA_LEGGINGS("white_team_plasma_leggings", new WhiteTeamPlasmaArmorItem.Leggings()),
    WHITE_TEAM_PLASMA_BOOTS("white_team_plasma_boots", new WhiteTeamPlasmaArmorItem.Boots()),

    BLACK_TEAM_PLASMA_HELMET("black_team_plasma_helmet", new BlackTeamPlasmaArmorItem.Helmet()),
    BLACK_TEAM_PLASMA_CHESTPLATE("black_team_plasma_chestplate", new BlackTeamPlasmaArmorItem.Chestplate()),
    BLACK_TEAM_PLASMA_LEGGINGS("black_team_plasma_leggings", new BlackTeamPlasmaArmorItem.Leggings()),
    BLACK_TEAM_PLASMA_BOOTS("black_team_plasma_boots", new BlackTeamPlasmaArmorItem.Boots()),

    TEAM_RAINBOW_ROCKET_HELMET("team_rainbow_rocket_helmet", new TeamRainbowRocketArmorItem.Helmet()),
    TEAM_RAINBOW_ROCKET_CHESTPLATE("team_rainbow_rocket_chestplate", new TeamRainbowRocketArmorItem.Chestplate()),
    TEAM_RAINBOW_ROCKET_LEGGINGS("team_rainbow_rocket_leggings", new TeamRainbowRocketArmorItem.Leggings()),
    TEAM_RAINBOW_ROCKET_BOOTS("team_rainbow_rocket_boots", new TeamRainbowRocketArmorItem.Boots()),

    PIKACHU_HELMET("pikachu_helmet", new PikachuArmorItem.Helmet()),
    MAGIKARP_HELMET("magikarp_helmet", new MagikarpArmorItem.Helmet()),
    SLOWKING_HELMET("slowking_helmet", new SlowkingArmorItem.Helmet()),
    DAWN_HELMET("dawn_helmet", new DawnArmorItem.Helmet()),
    LYRA_HELMET("lyra_helmet", new LyraArmorItem.Helmet()),

    FENNEKIN_HELMET("fennekin_helmet", new FennekinArmorItem.Helmet()),
    FENNEKIN_CHESTPLATE("fennekin_chestplate", new FennekinArmorItem.Chestplate()),

    BUTTERFREE_HELMET("butterfree_helmet", new ButterfreeArmorItem.Helmet()),
    BUTTERFREE_CHESTPLATE("butterfree_chestplate", new ButterfreeArmorItem.Chestplate());

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
