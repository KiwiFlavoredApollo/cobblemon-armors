package kiwiapollo.cobblemonarmors.predicate;

import com.cobblemon.mod.common.api.types.ElementalType;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;
import java.util.function.Predicate;

public class ForbiddenPokemonTypePredicate extends PokemonTypePredicate implements Predicate<ServerPlayerEntity> {
    private final List<ElementalType> forbidden;

    public ForbiddenPokemonTypePredicate(List<ElementalType> forbidden) {
        this.forbidden = forbidden;
    }

    @Override
    public boolean test(ServerPlayerEntity player) {
        return getPartyPokemonTypes(player).stream().noneMatch(forbidden::contains);
    }
}

