package kiwiapollo.cobblemonarmors.armor;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.armor.aqua.TeamAquaArmorItem;
import kiwiapollo.cobblemonarmors.armor.blackplasma.BlackTeamPlasmaArmorItem;
import kiwiapollo.cobblemonarmors.armor.flare.TeamFlareArmorItem;
import kiwiapollo.cobblemonarmors.armor.galactic.TeamGalacticArmorItem;
import kiwiapollo.cobblemonarmors.armor.magma.TeamMagmaArmorItem;
import kiwiapollo.cobblemonarmors.armor.misc.MiscArmorItem;
import kiwiapollo.cobblemonarmors.armor.rainbowrocket.TeamRainbowRocketArmorItem;
import kiwiapollo.cobblemonarmors.armor.rocket.TeamRocketArmorItem;
import kiwiapollo.cobblemonarmors.armor.skull.TeamSkullArmorItem;
import kiwiapollo.cobblemonarmors.armor.star.TeamStarArmorItem;
import kiwiapollo.cobblemonarmors.armor.whiteplasma.WhiteTeamPlasmaArmorItem;
import kiwiapollo.cobblemonarmors.armor.yell.TeamYellArmorItem;
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
            TeamFlareArmorItem.getAll().forEach(itemGroup::add);
            TeamSkullArmorItem.getAll().forEach(itemGroup::add);
            TeamRainbowRocketArmorItem.getAll().forEach(itemGroup::add);
            TeamYellArmorItem.getAll().forEach(itemGroup::add);
            TeamStarArmorItem.getAll().forEach(itemGroup::add);
            MiscArmorItem.getAll().forEach(itemGroup::add);
        });
    }
}
