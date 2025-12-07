package kiwiapollo.cobblemonarmors.render;

import kiwiapollo.cobblemonarmors.armor.misc.CustomModelArmorItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.model.GeoModel;

public interface RenderProviderFactory {
    RenderProvider create(GeoModel<CustomModelArmorItem> model);
}
