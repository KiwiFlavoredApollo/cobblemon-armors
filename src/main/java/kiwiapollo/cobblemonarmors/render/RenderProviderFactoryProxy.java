package kiwiapollo.cobblemonarmors.render;

import kiwiapollo.cobblemonarmors.armor.CustomModelArmorItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.model.GeoModel;

public class RenderProviderFactoryProxy implements RenderProviderFactory {
    private static RenderProviderFactoryProxy instance;


    private RenderProviderFactory factory;

    private RenderProviderFactoryProxy() {
        this.factory = new NullRenderProviderFactory();
    }

    public static RenderProviderFactoryProxy getInstance() {
        if (instance == null) {
            instance = new RenderProviderFactoryProxy();
        }

        return instance;
    }

    public void setRenderProviderFactory(RenderProviderFactory factory) {
        this.factory = factory;
    }

    @Override
    public RenderProvider create(GeoModel<CustomModelArmorItem> model) {
        return factory.create(model);
    }
}
