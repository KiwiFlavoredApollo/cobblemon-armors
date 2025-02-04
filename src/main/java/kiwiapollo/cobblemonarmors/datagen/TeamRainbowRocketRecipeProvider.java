package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.ModArmorItem;
import kiwiapollo.cobblemonarmors.material.ModArmorMaterialItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class TeamRainbowRocketRecipeProvider extends FabricRecipeProvider {
    public TeamRainbowRocketRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_RAINBOW_ROCKET_HELMET.getItem())
                .pattern("MMM")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_RAINBOW_ROCKET_CHESTPLATE.getItem())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_RAINBOW_ROCKET_LEGGINGS.getItem())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_RAINBOW_ROCKET_BOOTS.getItem())
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem())
                .input(Items.RED_DYE)
                .input(Items.GREEN_DYE)
                .input(Items.BLUE_DYE)
                .input(ModArmorMaterialItem.ROCKET_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.ROCKET_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.ROCKET_THREAD.getItem()))
                .offerTo(exporter);
    }
}
