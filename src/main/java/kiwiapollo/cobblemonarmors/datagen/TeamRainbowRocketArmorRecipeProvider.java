package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.TeamRainbowRocketArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class TeamRainbowRocketArmorRecipeProvider extends FabricRecipeProvider {
    public TeamRainbowRocketArmorRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamRainbowRocketArmorItem.TEAM_RAINBOW_ROCKET_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.GUNPOWDER)
                .input(Items.BLAZE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Items.GUNPOWDER), FabricRecipeProvider.conditionsFromItem(Items.GUNPOWDER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamRainbowRocketArmorItem.TEAM_RAINBOW_ROCKET_CHESTPLATE)
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.GUNPOWDER)
                .input(Items.BLAZE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Items.GUNPOWDER), FabricRecipeProvider.conditionsFromItem(Items.GUNPOWDER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamRainbowRocketArmorItem.TEAM_RAINBOW_ROCKET_LEGGINGS)
                .input(Items.LEATHER_LEGGINGS)
                .input(Items.GUNPOWDER)
                .input(Items.BLAZE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Items.GUNPOWDER), FabricRecipeProvider.conditionsFromItem(Items.GUNPOWDER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamRainbowRocketArmorItem.TEAM_RAINBOW_ROCKET_BOOTS)
                .input(Items.LEATHER_BOOTS)
                .input(Items.GUNPOWDER)
                .input(Items.BLAZE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(Items.GUNPOWDER), FabricRecipeProvider.conditionsFromItem(Items.GUNPOWDER))
                .offerTo(exporter);
    }
}
