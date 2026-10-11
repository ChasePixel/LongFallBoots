package com.chasepixel.longfallboots.client.model;// Made with Blockbench 5.2.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.chasepixel.longfallboots.LongFallBoots;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;


public class LongFallBootsModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(LongFallBoots.MODID, "long_fall_boots"), "main");
	private final ModelPart left_shoe;
	private final ModelPart left_brace;
	private final ModelPart right_shoe;
	private final ModelPart right_brace;

	public LongFallBootsModel(ModelPart root) {
		this.left_shoe = root.getChild("left_shoe");
		this.left_brace = this.left_shoe.getChild("left_brace");
		this.right_shoe = root.getChild("right_shoe");
		this.right_brace = this.right_shoe.getChild("right_brace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition left_shoe = partdefinition.addOrReplaceChild("left_shoe", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition left_brace = left_shoe.addOrReplaceChild("left_brace", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_brace_8_r1 = left_brace.addOrReplaceChild("left_brace_8_r1", CubeListBuilder.create().texOffs(18, 30).addBox(1.15F, -11.4253F, 4.1414F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_brace_7_r1 = left_brace.addOrReplaceChild("left_brace_7_r1", CubeListBuilder.create().texOffs(18, 30).addBox(1.15F, -2.5193F, 9.9986F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition left_brace_6_r1 = left_brace.addOrReplaceChild("left_brace_6_r1", CubeListBuilder.create().texOffs(18, 30).addBox(1.15F, -4.7094F, 8.8311F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition left_brace_5_r1 = left_brace.addOrReplaceChild("left_brace_5_r1", CubeListBuilder.create().texOffs(18, 30).addBox(1.15F, -3.5074F, 8.5698F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition left_brace_4_r1 = left_brace.addOrReplaceChild("left_brace_4_r1", CubeListBuilder.create().texOffs(18, 30).addBox(1.15F, -4.0216F, 7.7132F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition left_brace_3_r1 = left_brace.addOrReplaceChild("left_brace_3_r1", CubeListBuilder.create().texOffs(18, 30).addBox(1.15F, -4.8465F, 6.355F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition left_brace_2_r1 = left_brace.addOrReplaceChild("left_brace_2_r1", CubeListBuilder.create().texOffs(18, 30).addBox(1.15F, -6.2861F, 3.0132F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition left_brace_1_r1 = left_brace.addOrReplaceChild("left_brace_1_r1", CubeListBuilder.create().texOffs(18, 30).addBox(1.15F, -5.2717F, 0.003F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, -1.4835F, 0.0F, 0.0F));

		PartDefinition right_shoe = partdefinition.addOrReplaceChild("right_shoe", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition right_brace = right_shoe.addOrReplaceChild("right_brace", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_brace_9_r1 = right_brace.addOrReplaceChild("right_brace_9_r1", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-3.15F, -11.4253F, 4.1414F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_brace_8_r1 = right_brace.addOrReplaceChild("right_brace_8_r1", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-3.15F, -2.5193F, 9.9986F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition right_brace_7_r1 = right_brace.addOrReplaceChild("right_brace_7_r1", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-3.15F, -4.7094F, 8.8311F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition right_brace_6_r1 = right_brace.addOrReplaceChild("right_brace_6_r1", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-3.15F, -3.5074F, 8.5698F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition right_brace_5_r1 = right_brace.addOrReplaceChild("right_brace_5_r1", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-3.15F, -4.0216F, 7.7132F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition right_brace_4_r1 = right_brace.addOrReplaceChild("right_brace_4_r1", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-3.15F, -4.8465F, 6.355F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition right_brace_3_r1 = right_brace.addOrReplaceChild("right_brace_3_r1", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-3.15F, -6.2861F, 3.0132F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition right_brace__r1 = right_brace.addOrReplaceChild("right_brace__r1", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-3.15F, -5.2717F, 0.003F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, -1.4835F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		left_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void copyLegRotations(HumanoidModel<?> playerModel) {
		this.left_shoe.copyFrom(playerModel.leftLeg);
		this.right_shoe.copyFrom(playerModel.rightLeg);
	}
}