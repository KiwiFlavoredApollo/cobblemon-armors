package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.yell.TeamYellArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class TeamYellArmorRecipeProvider extends FabricRecipeProvider {
    public TeamYellArmorRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamYellArmorItem.TEAM_YELL_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.GOAT_HORN)
                .criterion(FabricRecipeProvider.hasItem(Items.GOAT_HORN), FabricRecipeProvider.conditionsFromItem(Items.GOAT_HORN))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamYellArmorItem.TEAM_YELL_CHESTPLATE)
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.GOAT_HORN)
                .criterion(FabricRecipeProvider.hasItem(Items.GOAT_HORN), FabricRecipeProvider.conditionsFromItem(Items.GOAT_HORN))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamYellArmorItem.TEAM_YELL_LEGGINGS)
                .input(Items.LEATHER_LEGGINGS)
                .input(Items.GOAT_HORN)
                .criterion(FabricRecipeProvider.hasItem(Items.GOAT_HORN), FabricRecipeProvider.conditionsFromItem(Items.GOAT_HORN))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamYellArmorItem.TEAM_YELL_BOOTS)
                .input(Items.LEATHER_BOOTS)
                .input(Items.GOAT_HORN)
                .criterion(FabricRecipeProvider.hasItem(Items.GOAT_HORN), FabricRecipeProvider.conditionsFromItem(Items.GOAT_HORN))
                .offerTo(exporter);
    }
}
