package kiwiapollo.cobblemonarmors;

import kiwiapollo.cobblemonarmors.armor.*;
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
		TeamRainbowRocketArmorItem.initialize();
		MiscArmorItem.initialize();

		ModItemGroup.initialize();
	}
}