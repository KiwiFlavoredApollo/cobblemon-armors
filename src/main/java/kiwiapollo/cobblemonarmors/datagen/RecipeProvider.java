package kiwiapollo.cobblemonarmors.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;

import java.util.function.Consumer;

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        new TeamRocketArmorRecipeProvider(output).generate(exporter);
        new TeamAquaArmorRecipeProvider(output).generate(exporter);
        new TeamMagmaArmorRecipeProvider(output).generate(exporter);
        new TeamGalacticArmorRecipeProvider(output).generate(exporter);
        new WhiteTeamPlasmaArmorRecipeProvider(output).generate(exporter);
        new BlackTeamPlasmaArmorRecipeProvider(output).generate(exporter);
        new TeamFlareArmorRecipeProvider(output).generate(exporter);
        new TeamSkullArmorRecipeProvider(output).generate(exporter);
        new TeamRainbowRocketArmorRecipeProvider(output).generate(exporter);
        new TeamYellArmorRecipeProvider(output).generate(exporter);
        new TeamStarArmorRecipeProvider(output).generate(exporter);
        new MiscRecipeProvider(output).generate(exporter);
    }
}
