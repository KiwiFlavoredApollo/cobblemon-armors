package kiwiapollo.cobblemonarmors.material;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public enum ModArmorMaterialItem {
    AQUA_THREAD("aqua_thread"),
    MAGMA_THREAD("magma_thread"),
    ROCKET_THREAD("rocket_thread"),
    PLASMA_THREAD("plasma_thread"),
    RAINBOW_ROCKET_THREAD("rainbow_rocket_thread"),
    NEO_PLASMA_THREAD("neo_plasma_thread");

    private final Identifier identifier;
    private final Item item;

    ModArmorMaterialItem(String path) {
        this.identifier = Identifier.of(CobblemonArmors.NAMESPACE, path);
        this.item = new Item(new Item.Settings());
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public Item getItem() {
        return item;
    }
}
