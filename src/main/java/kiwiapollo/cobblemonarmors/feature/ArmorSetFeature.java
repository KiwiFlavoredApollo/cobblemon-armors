package kiwiapollo.cobblemonarmors.feature;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class ArmorSetFeature {

    public static void initialize() {
        register();
    }

    private static void register() {
        ServerTickEvents.END_SERVER_TICK.register(new TeamRocketArmorSetFeatureEnabler());
        ServerTickEvents.END_SERVER_TICK.register(new TeamAquaArmorSetFeatureEnabler());
        ServerTickEvents.END_SERVER_TICK.register(new TeamMagmaArmorSetFeatureEnabler());
        ServerTickEvents.END_SERVER_TICK.register(new TeamGalacticArmorSetFeatureEnabler());
        ServerTickEvents.END_SERVER_TICK.register(new WhiteTeamPlasmaArmorSetFeatureEnabler());
        ServerTickEvents.END_SERVER_TICK.register(new BlackTeamPlasmaArmorSetFeatureEnabler());
        ServerTickEvents.END_SERVER_TICK.register(new TeamRainbowRocketArmorSetFeatureEnabler());
    }
}
