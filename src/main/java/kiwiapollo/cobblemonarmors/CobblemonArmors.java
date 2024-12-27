package kiwiapollo.cobblemonarmors;

import kiwiapollo.cobblemonarmors.armor.*;
import kiwiapollo.cobblemonarmors.feature.TeamAquaArmorSetFeatureEnabler;
import kiwiapollo.cobblemonarmors.feature.TeamMagmaArmorSetFeatureEnabler;
import kiwiapollo.cobblemonarmors.feature.TeamRocketArmorSetFeatureEnabler;
import kiwiapollo.cobblemonarmors.material.ModArmorMaterialItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class CobblemonArmors implements ModInitializer {
	public static final String NAMESPACE = "cobblemonarmors";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAMESPACE);

	public static final RegistryKey<ItemGroup> COBBLEMON_ARMOR_ITEM_GROUP_KEY =
			RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(NAMESPACE, "item_group"));
	public static final ItemGroup COBBLEMON_ARMOR_ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(Registries.ITEM.get(Identifier.of(NAMESPACE, "fennekin_chestplate"))))
			.displayName(Text.translatable("Cobblemon Armors"))
			.build();

	@Override
	public void onInitialize() {
		Arrays.stream(ModArmorMaterialItem.values()).forEach(material -> {
			Registry.register(Registries.ITEM, material.getIdentifier(), material.getItem());
		});

		Arrays.stream(ModArmorItem.values()).forEach(armor -> {
			Registry.register(Registries.ITEM, armor.getIdentifier(), armor.getItem());
		});

		Registry.register(Registries.ITEM_GROUP, COBBLEMON_ARMOR_ITEM_GROUP_KEY, COBBLEMON_ARMOR_ITEM_GROUP);

		Arrays.stream(ModArmorMaterialItem.values()).forEach(material -> {
			ItemGroupEvents.modifyEntriesEvent(COBBLEMON_ARMOR_ITEM_GROUP_KEY).register(itemGroup -> {
				itemGroup.add(material.getItem());
			});
		});

		Arrays.stream(ModArmorItem.values()).forEach(armor -> {
			ItemGroupEvents.modifyEntriesEvent(COBBLEMON_ARMOR_ITEM_GROUP_KEY).register(itemGroup -> {
				itemGroup.add(armor.getItem());
			});
		});

		ServerTickEvents.END_SERVER_TICK.register(new TeamAquaArmorSetFeatureEnabler());
		ServerTickEvents.END_SERVER_TICK.register(new TeamMagmaArmorSetFeatureEnabler());
		ServerTickEvents.END_SERVER_TICK.register(new TeamRocketArmorSetFeatureEnabler());
	}
}