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

public class TeamRocketRecipeProvider extends FabricRecipeProvider {
    public TeamRocketRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorMaterialItem.ROCKET_THREAD.getItem())
                .input(Items.GUNPOWDER)
                .input(Items.STRING)
                .criterion(FabricRecipeProvider.hasItem(Items.STRING), FabricRecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter);
    }
}
