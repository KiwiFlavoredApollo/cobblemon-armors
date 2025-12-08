package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.skull.TeamSkullArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class TeamSkullArmorRecipeProvider extends FabricRecipeProvider {
    public TeamSkullArmorRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamSkullArmorItem.TEAM_SKULL_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.BONE)
                .criterion(FabricRecipeProvider.hasItem(Items.BONE), FabricRecipeProvider.conditionsFromItem(Items.BONE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamSkullArmorItem.TEAM_SKULL_CHESTPLATE)
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.BONE)
                .criterion(FabricRecipeProvider.hasItem(Items.BONE), FabricRecipeProvider.conditionsFromItem(Items.BONE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamSkullArmorItem.TEAM_SKULL_LEGGINGS)
                .input(Items.LEATHER_LEGGINGS)
                .input(Items.BONE)
                .criterion(FabricRecipeProvider.hasItem(Items.BONE), FabricRecipeProvider.conditionsFromItem(Items.BONE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamSkullArmorItem.TEAM_SKULL_BOOTS)
                .input(Items.LEATHER_BOOTS)
                .input(Items.BONE)
                .criterion(FabricRecipeProvider.hasItem(Items.BONE), FabricRecipeProvider.conditionsFromItem(Items.BONE))
                .offerTo(exporter);
    }
}
