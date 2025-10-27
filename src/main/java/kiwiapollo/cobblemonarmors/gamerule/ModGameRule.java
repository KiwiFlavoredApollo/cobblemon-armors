package kiwiapollo.cobblemonarmors.gamerule;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class ModGameRule {
    public static GameRules.Key<GameRules.BooleanRule> ENABLE_COBBLEMON_ARMOR_SET_FEATURE;

    public static void register() {
        ENABLE_COBBLEMON_ARMOR_SET_FEATURE = GameRuleRegistry.register("enableCobblemonArmorSetFeature", GameRules.Category.MISC, GameRuleFactory.createBooleanRule(false));
    }
}
