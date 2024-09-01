package kiwiapollo.cobblemonarmors.armors;

import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class Armor {
    public final ArmorItem armotItem;
    public final Identifier identifier;

    public Armor(ArmorItem armotItem, Identifier identifier) {
        this.armotItem = armotItem;
        this.identifier = identifier;
    }
}
