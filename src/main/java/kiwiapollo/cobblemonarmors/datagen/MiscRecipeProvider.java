package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.ModArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

public class MiscRecipeProvider extends FabricRecipeProvider {
    public MiscRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.PIKACHU_HELMET.getItem())
                .input(Items.LEATHER_HELMET)
                .input(Items.GLOW_BERRIES)
                .criterion(FabricRecipeProvider.hasItem(Items.GLOW_BERRIES), FabricRecipeProvider.conditionsFromItem(Items.GLOW_BERRIES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.MAGIKARP_HELMET.getItem())
                .input(Items.LEATHER_HELMET)
                .input(Items.TROPICAL_FISH)
                .criterion(FabricRecipeProvider.hasItem(Items.TROPICAL_FISH), FabricRecipeProvider.conditionsFromItem(Items.TROPICAL_FISH))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.SLOWKING_HELMET.getItem())
                .input(Items.LEATHER_HELMET)
                .input(Items.NAUTILUS_SHELL)
                .criterion(FabricRecipeProvider.hasItem(Items.NAUTILUS_SHELL), FabricRecipeProvider.conditionsFromItem(Items.NAUTILUS_SHELL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.DAWN_HELMET.getItem())
                .input(Items.LEATHER_HELMET)
                .input(Items.AMETHYST_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.LYRA_HELMET.getItem())
                .input(Items.LEATHER_HELMET)
                .input(Items.NOTE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.NOTE_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.NOTE_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.FENNEKIN_HELMET.getItem())
                .input(Items.LEATHER_HELMET)
                .input(Items.BLAZE_POWDER)
                .input(ItemTags.WOOL)
                .criterion(FabricRecipeProvider.hasItem(Items.BLAZE_POWDER), FabricRecipeProvider.conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.FENNEKIN_CHESTPLATE.getItem())
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.BLAZE_POWDER)
                .input(ItemTags.WOOL)
                .criterion(FabricRecipeProvider.hasItem(Items.BLAZE_POWDER), FabricRecipeProvider.conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.BUTTERFREE_HELMET.getItem())
                .input(Items.LEATHER_HELMET)
                .input(ItemTags.SMALL_FLOWERS)
                .input(Items.SPIDER_EYE)
                .criterion("has_small_flower", FabricRecipeProvider.conditionsFromTag(ItemTags.SMALL_FLOWERS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModArmorItem.BUTTERFREE_CHESTPLATE.getItem())
                .input(Items.LEATHER_CHESTPLATE)
                .input(ItemTags.SMALL_FLOWERS)
                .input(Items.PHANTOM_MEMBRANE)
                .criterion("has_small_flower", FabricRecipeProvider.conditionsFromTag(ItemTags.SMALL_FLOWERS))
                .offerTo(exporter);
    }
}
