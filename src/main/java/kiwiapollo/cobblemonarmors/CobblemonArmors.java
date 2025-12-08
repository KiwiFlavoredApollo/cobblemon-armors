package kiwiapollo.cobblemonarmors;

import kiwiapollo.cobblemonarmors.armor.*;
import kiwiapollo.cobblemonarmors.armor.aqua.TeamAquaArmorItem;
import kiwiapollo.cobblemonarmors.armor.blackplasma.BlackTeamPlasmaArmorItem;
import kiwiapollo.cobblemonarmors.armor.flare.TeamFlareArmorItem;
import kiwiapollo.cobblemonarmors.armor.galactic.TeamGalacticArmorItem;
import kiwiapollo.cobblemonarmors.armor.magma.TeamMagmaArmorItem;
import kiwiapollo.cobblemonarmors.armor.misc.MiscArmorItem;
import kiwiapollo.cobblemonarmors.armor.rainbowrocket.TeamRainbowRocketArmorItem;
import kiwiapollo.cobblemonarmors.armor.rocket.TeamRocketArmorItem;
import kiwiapollo.cobblemonarmors.armor.skull.TeamSkullArmorItem;
import kiwiapollo.cobblemonarmors.armor.star.TeamStarArmorItem;
import kiwiapollo.cobblemonarmors.armor.whiteplasma.WhiteTeamPlasmaArmorItem;
import kiwiapollo.cobblemonarmors.armor.yell.TeamYellArmorItem;
import kiwiapollo.cobblemonarmors.gamerule.ModGameRule;
import net.fabricmc.api.ModInitializer;

public class CobblemonArmors implements ModInitializer {
	public static final String MOD_ID = "cobblemonarmors";

	@Override
	public void onInitialize() {
		ModGameRule.initialize();

		TeamRocketArmorItem.initialize();
		TeamAquaArmorItem.initialize();
		TeamMagmaArmorItem.initialize();
		TeamGalacticArmorItem.initialize();
		WhiteTeamPlasmaArmorItem.initialize();
		BlackTeamPlasmaArmorItem.initialize();
		TeamFlareArmorItem.initialize();
		TeamSkullArmorItem.initialize();
		TeamRainbowRocketArmorItem.initialize();
		TeamYellArmorItem.initialize();
		TeamStarArmorItem.initialize();
		MiscArmorItem.initialize();

		ModItemGroup.initialize();
	}
}