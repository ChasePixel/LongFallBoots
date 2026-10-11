package com.chasepixel.longfallboots.client;

import com.chasepixel.longfallboots.LongFallBoots;
import com.chasepixel.longfallboots.client.model.LongFallBootsModel;
import com.chasepixel.longfallboots.client.renderer.LongFallBootsRenderer;
import com.chasepixel.longfallboots.registry.ItemRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

@Mod.EventBusSubscriber(modid = LongFallBoots.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(LongFallBootsModel.LAYER_LOCATION, LongFallBootsModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> CuriosRendererRegistry.register(ItemRegistry.LONG_FALL_BOOTS.get(), LongFallBootsRenderer::new));
    }
}
