package kiwiapollo.cobblemonarmors.render;

import software.bernie.geckolib.animatable.client.RenderProvider;

public class MagikarpArmorRenderProviderFactoryProxy implements RenderProviderFactory {
    private static RenderProviderFactory renderProviderFactory;

    @Override
    public RenderProvider create() {
        return renderProviderFactory.create();
    }

    public static void setRenderProviderFactory(RenderProviderFactory renderProviderFactory) {
        MagikarpArmorRenderProviderFactoryProxy.renderProviderFactory = renderProviderFactory;
    }
}
