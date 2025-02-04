package kiwiapollo.cobblemonarmors.predicate;

import com.cobblemon.mod.common.api.types.ElementalType;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.*;
import java.util.function.Predicate;

public class RequiredPokemonTypePredicate extends PokemonTypePredicate implements Predicate<ServerPlayerEntity> {
    private final List<ElementalType> required;

    public RequiredPokemonTypePredicate(List<ElementalType> required) {
        this.required = required;
    }

    @Override
    public boolean test(ServerPlayerEntity player) {
        return getPartyPokemonTypes(player).containsAll(required);
    }
}
