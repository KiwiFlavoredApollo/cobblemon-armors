package kiwiapollo.cobblemonarmors.predicate;

import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class RequiredPokemonTypePredicate implements Predicate<ServerPlayerEntity> {
    private final List<ElementalType> required;

    public RequiredPokemonTypePredicate(List<ElementalType> required) {
        this.required = required;
    }

    @Override
    public boolean test(ServerPlayerEntity player) {
        for (Pokemon pokemon : Cobblemon.INSTANCE.getStorage().getParty(player)) {
            Stream<ElementalType> types = StreamSupport.stream(pokemon.getTypes().spliterator(), false);
            if (types.anyMatch(required::contains)) {
                return true;
            }
        }

        return false;
    }
}
