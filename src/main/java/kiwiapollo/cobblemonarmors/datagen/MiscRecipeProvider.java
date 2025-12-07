package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.misc.MiscArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
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
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, MiscArmorItem.PIKACHU_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.GLOW_BERRIES)
                .criterion(FabricRecipeProvider.hasItem(Items.GLOW_BERRIES), FabricRecipeProvider.conditionsFromItem(Items.GLOW_BERRIES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, MiscArmorItem.MAGIKARP_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.TROPICAL_FISH)
                .criterion(FabricRecipeProvider.hasItem(Items.TROPICAL_FISH), FabricRecipeProvider.conditionsFromItem(Items.TROPICAL_FISH))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, MiscArmorItem.SLOWKING_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.NAUTILUS_SHELL)
                .criterion(FabricRecipeProvider.hasItem(Items.NAUTILUS_SHELL), FabricRecipeProvider.conditionsFromItem(Items.NAUTILUS_SHELL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, MiscArmorItem.DAWN_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.AMETHYST_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, MiscArmorItem.LYRA_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.NOTE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.NOTE_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.NOTE_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, MiscArmorItem.FENNEKIN_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.BLAZE_POWDER)
                .input(ItemTags.WOOL)
                .criterion(FabricRecipeProvider.hasItem(Items.BLAZE_POWDER), FabricRecipeProvider.conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, MiscArmorItem.FENNEKIN_CHESTPLATE)
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.BLAZE_POWDER)
                .input(ItemTags.WOOL)
                .criterion(FabricRecipeProvider.hasItem(Items.BLAZE_POWDER), FabricRecipeProvider.conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, MiscArmorItem.BUTTERFREE_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(ItemTags.SMALL_FLOWERS)
                .input(Items.SPIDER_EYE)
                .criterion("has_small_flower", FabricRecipeProvider.conditionsFromTag(ItemTags.SMALL_FLOWERS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, MiscArmorItem.BUTTERFREE_CHESTPLATE)
                .input(Items.LEATHER_CHESTPLATE)
                .input(ItemTags.SMALL_FLOWERS)
                .input(Items.PHANTOM_MEMBRANE)
                .criterion("has_small_flower", FabricRecipeProvider.conditionsFromTag(ItemTags.SMALL_FLOWERS))
                .offerTo(exporter);
    }
}
