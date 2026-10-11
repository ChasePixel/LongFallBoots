package com.chasepixel.longfallboots.events;

import com.chasepixel.longfallboots.Config;
import com.chasepixel.longfallboots.LongFallBoots;
import com.chasepixel.longfallboots.registry.ItemRegistry;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import top.theillusivec4.curios.api.CuriosApi;

@Mod.EventBusSubscriber(modid = LongFallBoots.MODID)
public class FallDamageEventHandler {



    @SubscribeEvent
    public static void onLivingFall(LivingFallEvent event) {

        if (!(event.getEntity() instanceof Player player)) {
            return;
        }

        if (player.level().isClientSide()) {
            return;
        }

        CuriosApi.getCuriosInventory(player).ifPresent(handler -> {

            boolean equipped = handler.isEquipped(
                    ItemRegistry.LONG_FALL_BOOTS.get()
            );

            if (equipped) {
                float adjustedDistance = Math.max(0.0F, event.getDistance() - Config.LONG_FALL_BOOTS_SAFE_FALL_DISTANCE.get());

                event.setDistance(adjustedDistance);
            }
        });
    }
}
