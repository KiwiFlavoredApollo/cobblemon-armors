package kiwiapollo.cobblemonarmors;

import kiwiapollo.cobblemonarmors.armors.ArmorSet;
import kiwiapollo.cobblemonarmors.armors.TeamAquaArmorSet;
import kiwiapollo.cobblemonarmors.armors.TeamMagmaArmorSet;
import kiwiapollo.cobblemonarmors.materials.ArmorIngredient;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class CobblemonArmors implements ModInitializer {
	public static final String NAMESPACE = "cobblemonarmors";
	public static final List<ArmorSet> ARMOR_SETS = new ArrayList<>();
	public static final List<ArmorIngredient> ARMOR_INGREDIENTS = new ArrayList<>();
	public static final RegistryKey<ItemGroup> COBBLEMON_ARMOR_ITEM_GROUP_KEY =
			RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(NAMESPACE, "item_group"));
	public static final ItemGroup COBBLEMON_ARMOR_ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(Items.DIAMOND))
			.displayName(Text.translatable("Cobblemon Armors"))
			.build();

	@Override
	public void onInitialize() {
		ARMOR_SETS.add(new TeamAquaArmorSet());
		ARMOR_SETS.add(new TeamMagmaArmorSet());

		ARMOR_INGREDIENTS.add(new ArmorIngredient("aqua_scrap"));
		ARMOR_INGREDIENTS.add(new ArmorIngredient("magma_scrap"));

		for (ArmorSet armorSet : ARMOR_SETS) {
			Registry.register(Registries.ITEM, armorSet.helmet.identifier, armorSet.helmet.item);
			Registry.register(Registries.ITEM, armorSet.chestplate.identifier, armorSet.chestplate.item);
			Registry.register(Registries.ITEM, armorSet.leggings.identifier, armorSet.leggings.item);
			Registry.register(Registries.ITEM, armorSet.boots.identifier, armorSet.boots.item);
		}

		for (ArmorIngredient armorIngredient : ARMOR_INGREDIENTS) {
			Registry.register(Registries.ITEM, armorIngredient.identifier, armorIngredient.item);
		}

		Registry.register(Registries.ITEM_GROUP, COBBLEMON_ARMOR_ITEM_GROUP_KEY, COBBLEMON_ARMOR_ITEM_GROUP);

		for (ArmorSet armorSet : ARMOR_SETS) {
			ItemGroupEvents.modifyEntriesEvent(COBBLEMON_ARMOR_ITEM_GROUP_KEY).register(itemGroup -> {
				itemGroup.add(armorSet.helmet.item);
				itemGroup.add(armorSet.chestplate.item);
				itemGroup.add(armorSet.leggings.item);
				itemGroup.add(armorSet.boots.item);
			});
		}

		for (ArmorIngredient armorIngredient : ARMOR_INGREDIENTS) {
			ItemGroupEvents.modifyEntriesEvent(COBBLEMON_ARMOR_ITEM_GROUP_KEY).register(itemGroup -> {
				itemGroup.add(armorIngredient.item);
			});
		}
	}
}