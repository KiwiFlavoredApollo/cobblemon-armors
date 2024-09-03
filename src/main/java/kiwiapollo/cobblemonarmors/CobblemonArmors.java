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
import software.bernie.geckolib.model.DefaultedItemGeoModel;

import java.util.ArrayList;
import java.util.List;

public class CobblemonArmors implements ModInitializer {
	public static final String NAMESPACE = "cobblemonarmors";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAMESPACE);
	public static final List<ArmorSet> ARMOR_SETS = new ArrayList<>();
	public static final List<Armor> ARMORS = new ArrayList<>();
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
		ARMOR_SETS.add(new TeamRocketArmorSet());

		ARMORS.add(new Armor(
				new CustomArmorItem(
						ArmorMaterials.TEAM_AQUA, ArmorItem.Type.HELMET, new FabricItemSettings(),
						new DefaultedItemGeoModel<>(Identifier.of(NAMESPACE, "pikachu_armor"))
				),
				Identifier.of(NAMESPACE, "pikachu_helmet")
		));
		ARMORS.add(new Armor(
				new CustomArmorItem(
						ArmorMaterials.TEAM_AQUA, ArmorItem.Type.HELMET, new FabricItemSettings(),
						new DefaultedItemGeoModel<>(Identifier.of(NAMESPACE, "magikarp_armor"))
				),
				Identifier.of(NAMESPACE, "magikarp_helmet")
		));
		ARMORS.add(new Armor(
				new CustomArmorItem(
						ArmorMaterials.TEAM_AQUA, ArmorItem.Type.HELMET, new FabricItemSettings(),
						new DefaultedItemGeoModel<>(Identifier.of(NAMESPACE, "fennekin_armor"))
				),
				Identifier.of(NAMESPACE, "fennekin_helmet")
		));
		ARMORS.add(new Armor(
				new CustomArmorItem(
						ArmorMaterials.TEAM_AQUA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(),
						new DefaultedItemGeoModel<>(Identifier.of(NAMESPACE, "fennekin_armor"))
				),
				Identifier.of(NAMESPACE, "fennekin_chestplate")
		));
		ARMORS.add(new Armor(
				new CustomArmorItem(
						ArmorMaterials.TEAM_AQUA, ArmorItem.Type.HELMET, new FabricItemSettings(),
						new DefaultedItemGeoModel<>(Identifier.of(NAMESPACE, "serena_armor"))
				),
				Identifier.of(NAMESPACE, "serena_helmet")
		));
		ARMORS.add(new Armor(
				new CustomArmorItem(
						ArmorMaterials.TEAM_AQUA, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(),
						new DefaultedItemGeoModel<>(Identifier.of(NAMESPACE, "serena_armor"))
				),
				Identifier.of(NAMESPACE, "serena_chestplate")
		));

		ARMOR_INGREDIENTS.add(new ArmorIngredient("aqua_thread"));
		ARMOR_INGREDIENTS.add(new ArmorIngredient("magma_thread"));
		ARMOR_INGREDIENTS.add(new ArmorIngredient("rocket_thread"));

		for (ArmorSet armorSet : ARMOR_SETS) {
			Registry.register(Registries.ITEM, armorSet.helmet.identifier, armorSet.helmet.armotItem);
			Registry.register(Registries.ITEM, armorSet.chestplate.identifier, armorSet.chestplate.armotItem);
			Registry.register(Registries.ITEM, armorSet.leggings.identifier, armorSet.leggings.armotItem);
			Registry.register(Registries.ITEM, armorSet.boots.identifier, armorSet.boots.armotItem);
		}

		for (Armor armor : ARMORS) {
			Registry.register(Registries.ITEM, armor.identifier, armor.armotItem);
		}

		for (ArmorIngredient armorIngredient : ARMOR_INGREDIENTS) {
			Registry.register(Registries.ITEM, armorIngredient.identifier, armorIngredient.item);
		}

		Registry.register(Registries.ITEM_GROUP, COBBLEMON_ARMOR_ITEM_GROUP_KEY, COBBLEMON_ARMOR_ITEM_GROUP);

		for (ArmorSet armorSet : ARMOR_SETS) {
			ItemGroupEvents.modifyEntriesEvent(COBBLEMON_ARMOR_ITEM_GROUP_KEY).register(itemGroup -> {
				itemGroup.add(armorSet.helmet.armotItem);
				itemGroup.add(armorSet.chestplate.armotItem);
				itemGroup.add(armorSet.leggings.armotItem);
				itemGroup.add(armorSet.boots.armotItem);
			});
		}

		for (Armor armor : ARMORS) {
			ItemGroupEvents.modifyEntriesEvent(COBBLEMON_ARMOR_ITEM_GROUP_KEY).register(itemGroup -> {
				itemGroup.add(armor.armotItem);
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