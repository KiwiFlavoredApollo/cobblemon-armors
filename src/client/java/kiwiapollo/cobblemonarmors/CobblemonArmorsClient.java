package kiwiapollo.cobblemonarmors;

import kiwiapollo.cobblemonarmors.render.ClientRenderProvider;
import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib.animatable.client.RenderProvider;

public class CobblemonArmorsClient implements ClientModInitializer {
	public static final RenderProvider RENDER_PROVIDER = new ClientRenderProvider();

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}