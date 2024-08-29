package kiwiapollo.cobblemonarmors.armors;

import kiwiapollo.cobblemonarmors.features.ArmorSetFeature;

public class ArmorSet {
    public final Armor helmet;
    public final Armor chestplate;
    public final Armor leggings;
    public final Armor boots;
    public final ArmorSetFeature feature;

    public ArmorSet(
            Armor helmet, Armor chestplate, Armor leggings, Armor boots,
            ArmorSetFeature feature
    ) {
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
        this.feature = feature;
    }
}
