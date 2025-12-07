package kiwiapollo.cobblemonarmors.render;

import kiwiapollo.cobblemonarmors.armor.misc.CustomModelArmorItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.model.GeoModel;

public class NullRenderProviderFactory implements RenderProviderFactory {
    @Override
    public RenderProvider create(GeoModel<CustomModelArmorItem> model) {
        throw new IllegalStateException();
    }
}
