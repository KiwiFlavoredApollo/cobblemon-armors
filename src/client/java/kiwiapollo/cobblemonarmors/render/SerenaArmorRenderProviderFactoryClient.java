package kiwiapollo.cobblemonarmors.render;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.armors.FennekinArmorItem;
import kiwiapollo.cobblemonarmors.armors.SerenaArmorItem;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SerenaArmorRenderProviderFactoryClient implements RenderProviderFactory {
    @Override
    public RenderProvider create() {
        return new RenderProvider() {
            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(
                    LivingEntity livingEntity, ItemStack itemStack,
                    EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original
            ) {
                GeoArmorRenderer<SerenaArmorItem> renderer = new GeoArmorRenderer<>(
                        new DefaultedItemGeoModel<>(Identifier.of(CobblemonArmors.NAMESPACE, "serena_armor"))
                );
                renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return renderer;
            }
        };
    }
}
