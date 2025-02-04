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
        new TeamAquaRecipeProvider(output).generate(exporter);
        new TeamMagmaRecipeProvider(output).generate(exporter);
        new TeamRocketRecipeProvider(output).generate(exporter);
        new TeamPlasmaRecipeProvider(output).generate(exporter);
        new TeamRainbowRocketRecipeProvider(output).generate(exporter);
        new TeamNeoPlasmaRecipeProvider(output).generate(exporter);
    }
}
