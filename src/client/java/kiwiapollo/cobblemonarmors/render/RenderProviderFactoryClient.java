package kiwiapollo.cobblemonarmors.render;

import kiwiapollo.cobblemonarmors.armors.CustomArmorItem;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RenderProviderFactoryClient implements RenderProviderFactory {
    @Override
    public RenderProvider create(GeoModel<CustomArmorItem> model) {
        return new RenderProvider() {
            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(
                    LivingEntity livingEntity, ItemStack itemStack,
                    EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original
            ) {
                GeoArmorRenderer<CustomArmorItem> renderer = new GeoArmorRenderer<>(model);
                renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return renderer;
            }
        };
    }
}
