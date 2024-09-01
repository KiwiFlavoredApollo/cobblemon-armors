package kiwiapollo.cobblemonarmors.utilities;

import software.bernie.geckolib.animatable.client.RenderProvider;

public class RenderProviderFactoryMain implements RenderProviderFactory {
    @Override
    public RenderProvider create() {
        return new RenderProvider() {};
    }
}
