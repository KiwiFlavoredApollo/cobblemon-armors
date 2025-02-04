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

public class TeamNeoPlasmaRecipeProvider extends FabricRecipeProvider {
    public TeamNeoPlasmaRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorMaterialItem.NEO_PLASMA_THREAD.getItem())
                .input(Items.GLOWSTONE_DUST)
                .input(ModArmorMaterialItem.PLASMA_THREAD.getItem())
                .criterion(FabricRecipeProvider.hasItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()), FabricRecipeProvider.conditionsFromItem(ModArmorMaterialItem.PLASMA_THREAD.getItem()))
                .offerTo(exporter);
    }
}
