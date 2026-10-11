package com.chasepixel.longfallboots.client.renderer;

import com.chasepixel.longfallboots.LongFallBoots;
import com.chasepixel.longfallboots.client.model.LongFallBootsModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public class LongFallBootsItemRenderer extends BlockEntityWithoutLevelRenderer {

    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(LongFallBoots.MODID, "textures/entity/long_fall_boots.png");

    private final LongFallBootsModel<?> model;

    public LongFallBootsItemRenderer(BlockEntityRenderDispatcher dispatcher, EntityModelSet modelSet) {
        super(dispatcher, modelSet);

        var root = modelSet.bakeLayer(
                LongFallBootsModel.LAYER_LOCATION
        );

        float separation = 1F;

        root.getChild("left_shoe").x += separation;
        root.getChild("right_shoe").x -= separation;

        this.model = new LongFallBootsModel<>(root);
    }

    @Override
    public void renderByItem(ItemStack item, ItemDisplayContext displayContext, PoseStack stack, MultiBufferSource buffer, int light, int overlay) {
        stack.pushPose();

        float height = (displayContext == ItemDisplayContext.GROUND) ? 1.5F : 1.25F;
        float xScale = 1.0F, yScale = -1.0F, zScale = -1.0F;

        if (displayContext.firstPerson()) {
            height = 1.75f;
        } else if (displayContext == ItemDisplayContext.THIRD_PERSON_LEFT_HAND || displayContext == ItemDisplayContext.THIRD_PERSON_RIGHT_HAND) {
            height = 1.5F;
        } else if (displayContext == ItemDisplayContext.FIXED) {
            height = 1.6F;

        } else if (displayContext == ItemDisplayContext.GUI) {
            height = 1.5F;
        }

        stack.translate(0.5F, height, 0.5F);
        stack.scale(1.0F, -1.0F, -1.0F);

        VertexConsumer consumer = buffer.getBuffer(RenderType.entityCutoutNoCull(TEXTURE));

        model.renderToBuffer(stack, consumer, light, overlay, 1.0F, 1.0F, 1.0F, 1.0F);

        stack.popPose();
    }
}
