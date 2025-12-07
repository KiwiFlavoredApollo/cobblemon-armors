package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.ModArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class TeamMagmaArmorRecipeProvider extends FabricRecipeProvider {
    public TeamMagmaArmorRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_MAGMA_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.MAGMA_CREAM)
                .criterion(FabricRecipeProvider.hasItem(Items.MAGMA_CREAM), FabricRecipeProvider.conditionsFromItem(Items.MAGMA_CREAM))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_MAGMA_CHESTPLATE)
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.MAGMA_CREAM)
                .criterion(FabricRecipeProvider.hasItem(Items.MAGMA_CREAM), FabricRecipeProvider.conditionsFromItem(Items.MAGMA_CREAM))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_MAGMA_LEGGINGS)
                .input(Items.LEATHER_LEGGINGS)
                .input(Items.MAGMA_CREAM)
                .criterion(FabricRecipeProvider.hasItem(Items.MAGMA_CREAM), FabricRecipeProvider.conditionsFromItem(Items.MAGMA_CREAM))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_MAGMA_BOOTS)
                .input(Items.LEATHER_BOOTS)
                .input(Items.MAGMA_CREAM)
                .criterion(FabricRecipeProvider.hasItem(Items.MAGMA_CREAM), FabricRecipeProvider.conditionsFromItem(Items.MAGMA_CREAM))
                .offerTo(exporter);
    }
}
