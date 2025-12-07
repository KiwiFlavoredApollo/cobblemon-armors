package kiwiapollo.cobblemonarmors.armor;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ModArmorItem {
    private static final List<Item> all = new ArrayList<>();

    public static final Item TEAM_ROCKET_HELMET = register("team_rocket_helmet", new TeamRocketArmorItem.Helmet());
    public static final Item TEAM_ROCKET_CHESTPLATE = register("team_rocket_chestplate", new TeamRocketArmorItem.Chestplate());
    public static final Item TEAM_ROCKET_LEGGINGS = register("team_rocket_leggings", new TeamRocketArmorItem.Leggings());
    public static final Item TEAM_ROCKET_BOOTS = register("team_rocket_boots", new TeamRocketArmorItem.Boots());

    public static final Item TEAM_AQUA_HELMET = register("team_aqua_helmet", new TeamAquaArmorItem.Helmet());
    public static final Item TEAM_AQUA_CHESTPLATE = register("team_aqua_chestplate", new TeamAquaArmorItem.Chestplate());
    public static final Item TEAM_AQUA_LEGGINGS = register("team_aqua_leggings", new TeamAquaArmorItem.Leggings());
    public static final Item TEAM_AQUA_BOOTS = register("team_aqua_boots", new TeamAquaArmorItem.Boots());

    public static final Item TEAM_MAGMA_HELMET = register("team_magma_helmet", new TeamMagmaArmorItem.Helmet());
    public static final Item TEAM_MAGMA_CHESTPLATE = register("team_magma_chestplate", new TeamMagmaArmorItem.Chestplate());
    public static final Item TEAM_MAGMA_LEGGINGS = register("team_magma_leggings", new TeamMagmaArmorItem.Leggings());
    public static final Item TEAM_MAGMA_BOOTS = register("team_magma_boots", new TeamMagmaArmorItem.Boots());

    public static final Item TEAM_GALACTIC_HELMET = register("team_galactic_helmet", new TeamGalacticArmorItem.Helmet());
    public static final Item TEAM_GALACTIC_CHESTPLATE = register("team_galactic_chestplate", new TeamGalacticArmorItem.Chestplate());
    public static final Item TEAM_GALACTIC_LEGGINGS = register("team_galactic_leggings", new TeamGalacticArmorItem.Leggings());
    public static final Item TEAM_GALACTIC_BOOTS = register("team_galactic_boots", new TeamGalacticArmorItem.Boots());

    public static final Item WHITE_TEAM_PLASMA_HELMET = register("white_team_plasma_helmet", new WhiteTeamPlasmaArmorItem.Helmet());
    public static final Item WHITE_TEAM_PLASMA_CHESTPLATE = register("white_team_plasma_chestplate", new WhiteTeamPlasmaArmorItem.Chestplate());
    public static final Item WHITE_TEAM_PLASMA_LEGGINGS = register("white_team_plasma_leggings", new WhiteTeamPlasmaArmorItem.Leggings());
    public static final Item WHITE_TEAM_PLASMA_BOOTS = register("white_team_plasma_boots", new WhiteTeamPlasmaArmorItem.Boots());

    public static final Item BLACK_TEAM_PLASMA_HELMET = register("black_team_plasma_helmet", new BlackTeamPlasmaArmorItem.Helmet());
    public static final Item BLACK_TEAM_PLASMA_CHESTPLATE = register("black_team_plasma_chestplate", new BlackTeamPlasmaArmorItem.Chestplate());
    public static final Item BLACK_TEAM_PLASMA_LEGGINGS = register("black_team_plasma_leggings", new BlackTeamPlasmaArmorItem.Leggings());
    public static final Item BLACK_TEAM_PLASMA_BOOTS = register("black_team_plasma_boots", new BlackTeamPlasmaArmorItem.Boots());

    public static final Item TEAM_RAINBOW_ROCKET_HELMET = register("team_rainbow_rocket_helmet", new TeamRainbowRocketArmorItem.Helmet());
    public static final Item TEAM_RAINBOW_ROCKET_CHESTPLATE = register("team_rainbow_rocket_chestplate", new TeamRainbowRocketArmorItem.Chestplate());
    public static final Item TEAM_RAINBOW_ROCKET_LEGGINGS = register("team_rainbow_rocket_leggings", new TeamRainbowRocketArmorItem.Leggings());
    public static final Item TEAM_RAINBOW_ROCKET_BOOTS = register("team_rainbow_rocket_boots", new TeamRainbowRocketArmorItem.Boots());

    public static final Item PIKACHU_HELMET = register("pikachu_helmet", new PikachuArmorItem.Helmet());
    public static final Item MAGIKARP_HELMET = register("magikarp_helmet", new MagikarpArmorItem.Helmet());
    public static final Item SLOWKING_HELMET = register("slowking_helmet", new SlowkingArmorItem.Helmet());
    public static final Item DAWN_HELMET = register("dawn_helmet", new DawnArmorItem.Helmet());
    public static final Item LYRA_HELMET = register("lyra_helmet", new LyraArmorItem.Helmet());

    public static final Item FENNEKIN_HELMET = register("fennekin_helmet", new FennekinArmorItem.Helmet());
    public static final Item FENNEKIN_CHESTPLATE = register("fennekin_chestplate", new FennekinArmorItem.Chestplate());

    public static final Item BUTTERFREE_HELMET = register("butterfree_helmet", new ButterfreeArmorItem.Helmet());
    public static final Item BUTTERFREE_CHESTPLATE = register("butterfree_chestplate", new ButterfreeArmorItem.Chestplate());

    public static void initialize() {

    }

    private static Item register(String name, Item item) {
        Identifier identifier = Identifier.of(CobblemonArmors.MOD_ID, name);
        Item i = Registry.register(Registries.ITEM, identifier, item);
        all.add(i);

        return i;
    }

    public static List<Item> getAll() {
        return new ArrayList<>(all);
    }
}
