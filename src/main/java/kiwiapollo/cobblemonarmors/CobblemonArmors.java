package kiwiapollo.cobblemonarmors;

import kiwiapollo.cobblemonarmors.armors.ArmorSet;
import kiwiapollo.cobblemonarmors.armors.TeamAquaArmorSet;
import kiwiapollo.cobblemonarmors.armors.TeamMagmaArmorSet;
import kiwiapollo.cobblemonarmors.armors.TeamRocketArmorSet;
import kiwiapollo.cobblemonarmors.features.ArmorSetEventHandler;
import kiwiapollo.cobblemonarmors.materials.ArmorIngredient;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CobblemonArmors implements ModInitializer {
	public static final String NAMESPACE = "cobblemonarmors";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAMESPACE);
	public static final List<ArmorSet> ARMOR_SETS = new ArrayList<>();
	public static final List<ArmorIngredient> ARMOR_INGREDIENTS = new ArrayList<>();
	public static final RegistryKey<ItemGroup> COBBLEMON_ARMOR_ITEM_GROUP_KEY =
			RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(NAMESPACE, "item_group"));
	public static final ItemGroup COBBLEMON_ARMOR_ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(Registries.ITEM.get(Identifier.of(NAMESPACE, "team_magma_helmet"))))
			.displayName(Text.translatable("Cobblemon Armors"))
			.build();

	@Override
	public void onInitialize() {
		ARMOR_SETS.add(new TeamAquaArmorSet());
		ARMOR_SETS.add(new TeamMagmaArmorSet());
		ARMOR_SETS.add(new TeamRocketArmorSet());

		ARMOR_INGREDIENTS.add(new ArmorIngredient("aqua_thread"));
		ARMOR_INGREDIENTS.add(new ArmorIngredient("magma_thread"));

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

		for (ArmorSet armorSet : ARMOR_SETS) {
			ServerTickEvents.END_SERVER_TICK.register(
					server -> ArmorSetEventHandler.onServerTick(server, armorSet)
			);
		}
	}
}