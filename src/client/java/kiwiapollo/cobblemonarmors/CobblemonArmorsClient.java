package kiwiapollo.cobblemonarmors;

import kiwiapollo.cobblemonarmors.render.RenderProviderFactoryClient;
import kiwiapollo.cobblemonarmors.render.RenderProviderFactoryProxy;
import net.fabricmc.api.ClientModInitializer;

public class CobblemonArmorsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		RenderProviderFactoryProxy.setRenderProviderFactory(new RenderProviderFactoryClient());
	}
}