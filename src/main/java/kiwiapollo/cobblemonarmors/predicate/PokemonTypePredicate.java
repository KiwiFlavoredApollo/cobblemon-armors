package kiwiapollo.cobblemonarmors.predicate;

import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;

public abstract class PokemonTypePredicate {
    protected Collection<ElementalType> getPartyPokemonTypes(ServerPlayerEntity player) {
        List<ElementalType> types = new ArrayList<>();

        for (Pokemon pokemon : Cobblemon.INSTANCE.getStorage().getParty(player)) {
            types.addAll(StreamSupport.stream(pokemon.getTypes().spliterator(), false).toList());
        }

        return new HashSet<>(types);
    }
}
