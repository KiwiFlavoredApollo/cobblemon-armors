package kiwiapollo.cobblemonarmors.armors;

import kiwiapollo.cobblemonarmors.materials.ArmorMaterials;
import kiwiapollo.cobblemonarmors.predicates.TeamAquaPredicate;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.function.Predicate;

public class TeamAquaArmorSet extends ArmorSet {
    public TeamAquaArmorSet() {
        super(
                new Armor(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.HELMET, "team_aqua_helmet"),
                new Armor(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.CHESTPLATE, "team_aqua_chestplate"),
                new Armor(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.LEGGINGS, "team_aqua_leggings"),
                new Armor(ArmorMaterials.TEAM_AQUA, ArmorItem.Type.BOOTS, "team_aqua_boots"),
                new TeamAquaPredicate(),
                StatusEffects.STRENGTH
        );
    }
}
