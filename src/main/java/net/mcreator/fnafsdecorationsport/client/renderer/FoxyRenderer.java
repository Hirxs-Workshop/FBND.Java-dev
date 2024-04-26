
package net.mcreator.fnafsdecorationsport.client.renderer;

public class FoxyRenderer extends GeoEntityRenderer<FoxyEntity> {
	public FoxyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FoxyModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new FoxyLayer(this));
	}

	@Override
	public RenderType getRenderType(FoxyEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, FoxyEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}