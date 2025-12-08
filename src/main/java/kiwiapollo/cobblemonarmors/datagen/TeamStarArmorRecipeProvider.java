package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.star.TeamStarArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class TeamStarArmorRecipeProvider extends FabricRecipeProvider {
    public TeamStarArmorRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamStarArmorItem.TEAM_STAR_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.GLOWSTONE_DUST)
                .criterion(FabricRecipeProvider.hasItem(Items.GLOWSTONE_DUST), FabricRecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamStarArmorItem.TEAM_STAR_CHESTPLATE)
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.GLOWSTONE_DUST)
                .criterion(FabricRecipeProvider.hasItem(Items.GLOWSTONE_DUST), FabricRecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamStarArmorItem.TEAM_STAR_LEGGINGS)
                .input(Items.LEATHER_LEGGINGS)
                .input(Items.GLOWSTONE_DUST)
                .criterion(FabricRecipeProvider.hasItem(Items.GLOWSTONE_DUST), FabricRecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamStarArmorItem.TEAM_STAR_BOOTS)
                .input(Items.LEATHER_BOOTS)
                .input(Items.GLOWSTONE_DUST)
                .criterion(FabricRecipeProvider.hasItem(Items.GLOWSTONE_DUST), FabricRecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter);
    }
}
