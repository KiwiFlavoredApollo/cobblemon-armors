package kiwiapollo.cobblemonarmors.render;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.armors.GeckoArmorItem;
import kiwiapollo.cobblemonarmors.utilities.RenderProviderProxy;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ClientRenderProvider extends RenderProviderProxy {
    public ClientRenderProvider() {
        RenderProviderProxy.renderProvider = this;
    }

    @Override
    public BipedEntityModel<LivingEntity> getHumanoidArmorModel(
            LivingEntity livingEntity, ItemStack itemStack,
            EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original
    ) {
        GeoArmorRenderer<GeckoArmorItem> renderer = new GeoArmorRenderer<>(
                new DefaultedItemGeoModel<>(Identifier.of(CobblemonArmors.NAMESPACE, "mythril_armor"))
        );
        renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

        return renderer;
    }
}
