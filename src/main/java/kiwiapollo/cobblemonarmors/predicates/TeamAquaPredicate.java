package kiwiapollo.cobblemonarmors.predicates;

import net.minecraft.server.network.ServerPlayerEntity;

import java.util.function.Predicate;

public class TeamAquaPredicate implements Predicate<ServerPlayerEntity> {

    @Override
    public boolean test(ServerPlayerEntity player) {
        return false;
    }
}
