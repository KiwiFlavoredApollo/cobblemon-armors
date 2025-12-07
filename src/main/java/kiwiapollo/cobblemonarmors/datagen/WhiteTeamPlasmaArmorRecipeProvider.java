package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.ModArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class WhiteTeamPlasmaArmorRecipeProvider extends FabricRecipeProvider {
    public WhiteTeamPlasmaArmorRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.WHITE_TEAM_PLASMA_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.PHANTOM_MEMBRANE)
                .input(Items.SNOWBALL)
                .criterion(FabricRecipeProvider.hasItem(Items.PHANTOM_MEMBRANE), FabricRecipeProvider.conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.WHITE_TEAM_PLASMA_CHESTPLATE)
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.PHANTOM_MEMBRANE)
                .input(Items.SNOWBALL)
                .criterion(FabricRecipeProvider.hasItem(Items.PHANTOM_MEMBRANE), FabricRecipeProvider.conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.WHITE_TEAM_PLASMA_LEGGINGS)
                .input(Items.LEATHER_LEGGINGS)
                .input(Items.PHANTOM_MEMBRANE)
                .input(Items.SNOWBALL)
                .criterion(FabricRecipeProvider.hasItem(Items.PHANTOM_MEMBRANE), FabricRecipeProvider.conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.WHITE_TEAM_PLASMA_BOOTS)
                .input(Items.LEATHER_BOOTS)
                .input(Items.PHANTOM_MEMBRANE)
                .input(Items.SNOWBALL)
                .criterion(FabricRecipeProvider.hasItem(Items.PHANTOM_MEMBRANE), FabricRecipeProvider.conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter);
    }
}
