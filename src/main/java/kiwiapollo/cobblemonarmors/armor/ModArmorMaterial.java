package kiwiapollo.cobblemonarmors.armor;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Lazy;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.function.Supplier;

/**
 * @see ArmorMaterials
 */
public enum ModArmorMaterial implements StringIdentifiable, ArmorMaterial {
    TEAM_ROCKET("team_rocket", 5,
            Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
            }),
            15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LEATHER)
    ),
    TEAM_AQUA("team_aqua", 5,
            Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
            }),
            15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LEATHER)
    ),
    TEAM_MAGMA("team_magma", 5,
            Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
            }),
            15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LEATHER)
    ),
    TEAM_GALACTIC("team_galactic", 5,
            Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
            }),
            15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LEATHER)
    ),
    WHITE_TEAM_PLASMA("white_team_plasma", 5,
            Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
            }),
            15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LEATHER)
    ),
    BLACK_TEAM_PLASMA("black_team_plasma", 5,
            Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
            }),
            15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LEATHER)
    ),
    TEAM_FLARE("team_flare", 5,
            Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
            }),
            15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LEATHER)
    ),
    TEAM_SKULL("team_skull", 5,
            Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
            }),
            15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LEATHER)
    ),
    TEAM_RAINBOW_ROCKET("team_rainbow_rocket", 5,
            Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
            }),
            15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LEATHER)
    ),
    TEAM_YELL("team_yell", 5,
            Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
            }),
            15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LEATHER)
    ),
    TEAM_STAR("team_star", 5,
            Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.HELMET, 1);
            }),
            15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
            () -> Ingredient.ofItems(Items.LEATHER)
    );

    public static final StringIdentifiable.Codec<net.minecraft.item.ArmorMaterials> CODEC =
            StringIdentifiable.createCodec(net.minecraft.item.ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> BASE_DURABILITY =
            (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.BOOTS, 13);
                map.put(ArmorItem.Type.LEGGINGS, 15);
                map.put(ArmorItem.Type.CHESTPLATE, 16);
                map.put(ArmorItem.Type.HELMET, 11);
            });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterial(
            String name, int durabilityMultiplier, EnumMap protectionAmounts,
            int enchantability, SoundEvent equipSound, float toughness,
            float knockbackResistance, Supplier repairIngredientSupplier
    ) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(ArmorItem.Type type) {
        return (Integer)BASE_DURABILITY.get(type) * this.durabilityMultiplier;
    }

    public int getProtection(ArmorItem.Type type) {
        return (Integer)this.protectionAmounts.get(type);
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    public String getName() {
        return Identifier.of(CobblemonArmors.MOD_ID, this.name).toString();
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String asString() {
        return this.name;
    }
}