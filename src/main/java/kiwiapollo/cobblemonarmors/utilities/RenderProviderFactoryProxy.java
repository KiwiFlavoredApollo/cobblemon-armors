package kiwiapollo.cobblemonarmors.utilities;

import software.bernie.geckolib.animatable.client.RenderProvider;

public class RenderProviderFactoryProxy implements RenderProviderFactory {
    public static RenderProviderFactory renderProviderFactory;

    @Override
    public RenderProvider create() {
        return renderProviderFactory.create();
    }
}
