package kiwiapollo.cobblemonarmors.armor;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> ITEM_GROUP_KEY =
            RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(CobblemonArmors.MOD_ID, "item_group"));

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(MiscArmorItem.FENNEKIN_CHESTPLATE::getDefaultStack)
            .displayName(Text.translatable("item_group.cobblemonarmors.item_group"))
            .build();

    public static void initialize() {
        register();
    }

    private static void register() {
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP_KEY, ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP_KEY).register(itemGroup -> {
            TeamRocketArmorItem.getAll().forEach(itemGroup::add);
            TeamAquaArmorItem.getAll().forEach(itemGroup::add);
            TeamMagmaArmorItem.getAll().forEach(itemGroup::add);
            TeamGalacticArmorItem.getAll().forEach(itemGroup::add);
            WhiteTeamPlasmaArmorItem.getAll().forEach(itemGroup::add);
            BlackTeamPlasmaArmorItem.getAll().forEach(itemGroup::add);
            TeamRainbowRocketArmorItem.getAll().forEach(itemGroup::add);
            MiscArmorItem.getAll().forEach(itemGroup::add);
        });
    }
}
