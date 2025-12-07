package kiwiapollo.cobblemonarmors.datagen;

import kiwiapollo.cobblemonarmors.armor.TeamRocketArmorItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class TeamRocketArmorRecipeProvider extends FabricRecipeProvider {
    public TeamRocketArmorRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamRocketArmorItem.TEAM_ROCKET_HELMET)
                .input(Items.LEATHER_HELMET)
                .input(Items.GUNPOWDER)
                .criterion(FabricRecipeProvider.hasItem(Items.GUNPOWDER), FabricRecipeProvider.conditionsFromItem(Items.GUNPOWDER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamRocketArmorItem.TEAM_ROCKET_CHESTPLATE)
                .input(Items.LEATHER_CHESTPLATE)
                .input(Items.GUNPOWDER)
                .criterion(FabricRecipeProvider.hasItem(Items.GUNPOWDER), FabricRecipeProvider.conditionsFromItem(Items.GUNPOWDER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamRocketArmorItem.TEAM_ROCKET_LEGGINGS)
                .input(Items.LEATHER_LEGGINGS)
                .input(Items.GUNPOWDER)
                .criterion(FabricRecipeProvider.hasItem(Items.GUNPOWDER), FabricRecipeProvider.conditionsFromItem(Items.GUNPOWDER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, TeamRocketArmorItem.TEAM_ROCKET_BOOTS)
                .input(Items.LEATHER_BOOTS)
                .input(Items.GUNPOWDER)
                .criterion(FabricRecipeProvider.hasItem(Items.GUNPOWDER), FabricRecipeProvider.conditionsFromItem(Items.GUNPOWDER))
                .offerTo(exporter);
    }
}
