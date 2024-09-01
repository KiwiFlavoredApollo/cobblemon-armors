package kiwiapollo.cobblemonarmors;

import kiwiapollo.cobblemonarmors.render.MythrilArmorRenderProviderFactoryClient;
import kiwiapollo.cobblemonarmors.render.MythrilArmorRenderProviderFactoryProxy;
import net.fabricmc.api.ClientModInitializer;

public class CobblemonArmorsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		MythrilArmorRenderProviderFactoryProxy.setRenderProviderFactory(new MythrilArmorRenderProviderFactoryClient());
	}
}