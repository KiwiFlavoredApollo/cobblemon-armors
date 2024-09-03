package kiwiapollo.cobblemonarmors.render;

import kiwiapollo.cobblemonarmors.armors.CustomArmorItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.model.GeoModel;

public class RenderProviderFactoryProxy implements RenderProviderFactory {
    private static RenderProviderFactory renderProviderFactory;

    public static void setRenderProviderFactory(RenderProviderFactory renderProviderFactory) {
        RenderProviderFactoryProxy.renderProviderFactory = renderProviderFactory;
    }

    @Override
    public RenderProvider create(GeoModel<CustomArmorItem> model) {
        return renderProviderFactory.create(model);
    }
}
