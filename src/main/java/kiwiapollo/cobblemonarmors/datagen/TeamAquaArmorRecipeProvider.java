package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.ModArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class TeamAquaArmorRecipeProvider extends FabricRecipeProvider {
    public TeamAquaArmorRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_AQUA_HELMET.getItem())
                .input(Items.LEATHER_HELMET)
                .input(Items.PRISMARINE_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.PRISMARINE_SHARD), FabricRecipeProvider.conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_AQUA_CHESTPLATE.getItem())
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.PRISMARINE_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.PRISMARINE_SHARD), FabricRecipeProvider.conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_AQUA_LEGGINGS.getItem())
                .input(Items.LEATHER_LEGGINGS)
                .input(Items.PRISMARINE_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.PRISMARINE_SHARD), FabricRecipeProvider.conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.TEAM_AQUA_BOOTS.getItem())
                .input(Items.LEATHER_BOOTS)
                .input(Items.PRISMARINE_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.PRISMARINE_SHARD), FabricRecipeProvider.conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter);
    }
}
