package kiwiapollo.cobblemonarmors;

import kiwiapollo.cobblemonarmors.render.*;
import net.fabricmc.api.ClientModInitializer;

public class CobblemonArmorsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		MythrilArmorRenderProviderFactoryProxy.setRenderProviderFactory(new MythrilArmorRenderProviderFactoryClient());
		TestArmorRenderProviderFactoryProxy.setRenderProviderFactory(new TestArmorRenderProviderFactoryClient());
		MagikarpArmorRenderProviderFactoryProxy.setRenderProviderFactory(new MagikarpArmorRenderProviderFactoryClient());
	}
}