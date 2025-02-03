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

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_AQUA_HELMET.getItem())
                .pattern("MMM")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.AQUA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.AQUA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.AQUA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_AQUA_CHESTPLATE.getItem())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModArmorMaterialItem.AQUA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.AQUA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.AQUA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_AQUA_LEGGINGS.getItem())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.AQUA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.AQUA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.AQUA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_AQUA_BOOTS.getItem())
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.AQUA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.AQUA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.AQUA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_MAGMA_HELMET.getItem())
                .pattern("MMM")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.MAGMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.MAGMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.MAGMA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_MAGMA_CHESTPLATE.getItem())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModArmorMaterialItem.MAGMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.MAGMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.MAGMA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_MAGMA_LEGGINGS.getItem())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.MAGMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.MAGMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.MAGMA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_MAGMA_BOOTS.getItem())
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.MAGMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.MAGMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.MAGMA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_ROCKET_HELMET.getItem())
                .pattern("MMM")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.ROCKET_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.ROCKET_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.ROCKET_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_ROCKET_CHESTPLATE.getItem())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModArmorMaterialItem.ROCKET_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.ROCKET_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.ROCKET_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_ROCKET_LEGGINGS.getItem())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.ROCKET_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.ROCKET_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.ROCKET_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_ROCKET_BOOTS.getItem())
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.ROCKET_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.ROCKET_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.ROCKET_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_PLASMA_HELMET.getItem())
                .pattern("MMM")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.PLASMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_PLASMA_CHESTPLATE.getItem())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModArmorMaterialItem.PLASMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_PLASMA_LEGGINGS.getItem())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.PLASMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_PLASMA_BOOTS.getItem())
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.PLASMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()))
                .offerTo(exporter);

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

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_NEO_PLASMA_HELMET.getItem())
                .pattern("MMM")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_NEO_PLASMA_CHESTPLATE.getItem())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .input('M', ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_NEO_PLASMA_LEGGINGS.getItem())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem()))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_NEO_PLASMA_BOOTS.getItem())
                .pattern("M M")
                .pattern("M M")
                .input('M', ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorMaterialItem.AQUA_THREAD.getItem())
                .input(Items.SEA_PICKLE)
                .input(Items.STRING)
                .criterion(FabricRecipeProvider.hasItem(Items.STRING), FabricRecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorMaterialItem.MAGMA_THREAD.getItem())
                .input(Items.MAGMA_CREAM)
                .input(Items.STRING)
                .criterion(FabricRecipeProvider.hasItem(Items.STRING), FabricRecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorMaterialItem.ROCKET_THREAD.getItem())
                .input(Items.GUNPOWDER)
                .input(Items.STRING)
                .criterion(FabricRecipeProvider.hasItem(Items.STRING), FabricRecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorMaterialItem.PLASMA_THREAD.getItem())
                .input(Items.GLOWSTONE_DUST)
                .input(Items.STRING)
                .criterion(FabricRecipeProvider.hasItem(Items.STRING), FabricRecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem())
                .input(Items.RED_DYE)
                .input(Items.GREEN_DYE)
                .input(Items.BLUE_DYE)
                .input(ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.RAINBOW_ROCKET_THREAD.getItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem())
                .input(Items.GLOWSTONE_DUST)
                .input(ModArmorMaterialItem.PLASMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()))
                .offerTo(exporter);
    }
}
