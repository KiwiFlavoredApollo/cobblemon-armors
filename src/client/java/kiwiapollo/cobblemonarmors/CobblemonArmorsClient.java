package kiwiapollo.cobblemonarmors;

import kiwiapollo.cobblemonarmors.render.*;
import net.fabricmc.api.ClientModInitializer;

public class CobblemonArmorsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		PikachuArmorRenderProviderFactoryProxy.setRenderProviderFactory(new PikachuArmorRenderProviderFactoryClient());
		MagikarpArmorRenderProviderFactoryProxy.setRenderProviderFactory(new MagikarpArmorRenderProviderFactoryClient());
		FennekinArmorRenderProviderFactoryProxy.setRenderProviderFactory(new FennekinArmorRenderProviderFactoryClient());
		SerenaArmorRenderProviderFactoryProxy.setRenderProviderFactory(new SerenaArmorRenderProviderFactoryClient());
	}
}