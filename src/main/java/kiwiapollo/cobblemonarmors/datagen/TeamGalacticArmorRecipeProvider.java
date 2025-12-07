package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.ModArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class TeamGalacticArmorRecipeProvider extends FabricRecipeProvider {
    public TeamGalacticArmorRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_GALACTIC_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.ENDER_PEARL)
                .criterion(FabricRecipeProvider.hasItem(Items.ENDER_PEARL), FabricRecipeProvider.conditionsFromItem(Items.ENDER_PEARL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_GALACTIC_CHESTPLATE)
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.ENDER_PEARL)
                .criterion(FabricRecipeProvider.hasItem(Items.ENDER_PEARL), FabricRecipeProvider.conditionsFromItem(Items.ENDER_PEARL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_GALACTIC_LEGGINGS)
                .input(Items.LEATHER_LEGGINGS)
                .input(Items.ENDER_PEARL)
                .criterion(FabricRecipeProvider.hasItem(Items.ENDER_PEARL), FabricRecipeProvider.conditionsFromItem(Items.ENDER_PEARL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_GALACTIC_BOOTS)
                .input(Items.LEATHER_BOOTS)
                .input(Items.ENDER_PEARL)
                .criterion(FabricRecipeProvider.hasItem(Items.ENDER_PEARL), FabricRecipeProvider.conditionsFromItem(Items.ENDER_PEARL))
                .offerTo(exporter);
    }
}
