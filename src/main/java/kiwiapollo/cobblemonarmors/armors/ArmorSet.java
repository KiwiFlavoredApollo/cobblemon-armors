package kiwiapollo.cobblemonarmors.armors;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.function.Predicate;

public class ArmorSet {
    public final Armor helmet;
    public final Armor chestplate;
    public final Armor leggings;
    public final Armor boots;
    public final StatusEffect effect;
    public final Predicate<ServerPlayerEntity> predicate;

    public ArmorSet(
            Armor helmet, Armor chestplate, Armor leggings, Armor boots,
            Predicate<ServerPlayerEntity> predicate, StatusEffect effect
    ) {
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
        this.effect = effect;
        this.predicate = predicate;
    }
}
