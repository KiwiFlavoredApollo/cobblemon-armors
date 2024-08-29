package kiwiapollo.cobblemonarmors.predicates;

import com.cobblemon.mod.common.api.storage.party.PlayerPartyStore;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.api.types.ElementalTypes;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class TeamAquaPredicate implements Predicate<ServerPlayerEntity> {
    private static final List<ElementalType> BLACKLISTED_TYPES = List.of(
            ElementalTypes.INSTANCE.getFIRE()
    );

    @Override
    public boolean test(ServerPlayerEntity player) {
        for (Pokemon pokemon : new PlayerPartyStore(player.getUuid())) {
            Stream<ElementalType> types = StreamSupport.stream(pokemon.getTypes().spliterator(), false);
            if (types.anyMatch(BLACKLISTED_TYPES::contains)) {
                return false;
            }
        }

        return true;
    }
}
