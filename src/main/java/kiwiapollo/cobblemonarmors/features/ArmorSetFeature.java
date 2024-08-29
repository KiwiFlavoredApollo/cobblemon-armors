package kiwiapollo.cobblemonarmors.features;

import net.minecraft.server.network.ServerPlayerEntity;

public interface ArmorSetFeature {
    void unlock(ServerPlayerEntity player);
}
