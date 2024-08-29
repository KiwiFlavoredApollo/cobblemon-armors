package kiwiapollo.cobblemonarmors.features;

import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.api.types.ElementalTypes;
import com.cobblemon.mod.common.pokemon.Pokemon;
import kiwiapollo.cobblemonarmors.exceptions.ForbiddenPokemonExistException;
import kiwiapollo.cobblemonarmors.exceptions.RequiredPokemonNotExistException;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class TeamMagmaArmorSetFeature implements ArmorSetFeature {
    private static final List<ElementalType> FORBIDDEN_TYPES = List.of(
            ElementalTypes.INSTANCE.getWATER()
    );
    private static final List<ElementalType> REQUIRED_TYPES = List.of(
            ElementalTypes.INSTANCE.getFIRE()
    );

    @Override
    public void unlock(ServerPlayerEntity player) {
        try {
            assertNotExistForbiddenPokemon(player);
            assertExistRequiredPokemon(player);

            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.FIRE_RESISTANCE, 60, 0,
                    false, false, true
            ));

        } catch (ForbiddenPokemonExistException | RequiredPokemonNotExistException ignored) {

        }
    }

    private void assertExistRequiredPokemon(ServerPlayerEntity player)
            throws RequiredPokemonNotExistException {
        for (Pokemon pokemon : Cobblemon.INSTANCE.getStorage().getParty(player)) {
            Stream<ElementalType> types = StreamSupport.stream(pokemon.getTypes().spliterator(), false);
            if (types.anyMatch(REQUIRED_TYPES::contains)) {
                return;
            }
        }

        throw new RequiredPokemonNotExistException();
    }

    private void assertNotExistForbiddenPokemon(ServerPlayerEntity player)
            throws ForbiddenPokemonExistException {
        for (Pokemon pokemon : Cobblemon.INSTANCE.getStorage().getParty(player)) {
            Stream<ElementalType> types = StreamSupport.stream(pokemon.getTypes().spliterator(), false);
            if (types.anyMatch(FORBIDDEN_TYPES::contains)) {
                throw new ForbiddenPokemonExistException();
            }
        }
    }
}
