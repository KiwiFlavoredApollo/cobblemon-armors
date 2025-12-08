package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.flare.TeamFlareArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class TeamFlareArmorRecipeProvider extends FabricRecipeProvider {
    public TeamFlareArmorRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamFlareArmorItem.TEAM_FLARE_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.FLINT_AND_STEEL)
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT_AND_STEEL), FabricRecipeProvider.conditionsFromItem(Items.FLINT_AND_STEEL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamFlareArmorItem.TEAM_FLARE_CHESTPLATE)
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.FLINT_AND_STEEL)
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT_AND_STEEL), FabricRecipeProvider.conditionsFromItem(Items.FLINT_AND_STEEL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamFlareArmorItem.TEAM_FLARE_LEGGINGS)
                .input(Items.LEATHER_LEGGINGS)
                .input(Items.FLINT_AND_STEEL)
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT_AND_STEEL), FabricRecipeProvider.conditionsFromItem(Items.FLINT_AND_STEEL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamFlareArmorItem.TEAM_FLARE_BOOTS)
                .input(Items.LEATHER_BOOTS)
                .input(Items.FLINT_AND_STEEL)
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT_AND_STEEL), FabricRecipeProvider.conditionsFromItem(Items.FLINT_AND_STEEL))
                .offerTo(exporter);
    }
}
