package kiwiapollo.cobblemonarmors.render;

import software.bernie.geckolib.animatable.client.RenderProvider;

public class TestArmorRenderProviderFactoryProxy implements RenderProviderFactory {
    private static RenderProviderFactory renderProviderFactory;

    @Override
    public RenderProvider create() {
        return renderProviderFactory.create();
    }

    public static void setRenderProviderFactory(RenderProviderFactory renderProviderFactory) {
        TestArmorRenderProviderFactoryProxy.renderProviderFactory = renderProviderFactory;
    }
}
