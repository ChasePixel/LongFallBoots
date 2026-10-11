package com.chasepixel.longfallboots.client.renderer;

import com.chasepixel.longfallboots.LongFallBoots;
import com.chasepixel.longfallboots.client.model.LongFallBootsModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.client.ICurioRenderer;

public class LongFallBootsRenderer implements ICurioRenderer {

    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(LongFallBoots.MODID, "textures/entity/long_fall_boots.png");


    private final LongFallBootsModel<?> model;

    public LongFallBootsRenderer() {
        EntityModelSet models =
                Minecraft.getInstance().getEntityModels();

        this.model = new LongFallBootsModel<>(
                models.bakeLayer(
                        LongFallBootsModel.LAYER_LOCATION
                )
        );
    }

    @Override
    public <T extends LivingEntity, M extends EntityModel<T>> void render(ItemStack stack,
                                                                          SlotContext slotContext,
                                                                          PoseStack matrixStack,
                                                                          RenderLayerParent<T, M> renderLayerParent,
                                                                          MultiBufferSource renderTypeBuffer,
                                                                          int light, float limbSwing, float limbSwingAmount,
                                                                          float partialTicks, float ageInTicks,
                                                                          float netHeadYaw, float headPitch) {

        if (!(renderLayerParent.getModel() instanceof HumanoidModel<?> humanoid)) {
            return;
        }

        model.copyLegRotations(humanoid);
        VertexConsumer consumer = renderTypeBuffer.getBuffer(RenderType.entityCutoutNoCull(TEXTURE));

        model.renderToBuffer(matrixStack, consumer, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
