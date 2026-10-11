package com.chasepixel.longfallboots.item;

import com.chasepixel.longfallboots.client.renderer.LongFallBootsItemRenderer;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.type.inventory.IDynamicStackHandler;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.function.Consumer;

public class LongFallBootsItem extends Item implements ICurioItem {

    public LongFallBootsItem(Properties properties) {
        super(properties);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = HashMultimap.create();

        modifiers.put(Attributes.ARMOR,
                new AttributeModifier(uuid,
                        "Long Fall Boots Armor", 3, AttributeModifier.Operation.ADDITION));

        modifiers.put(Attributes.ARMOR_TOUGHNESS,
                new AttributeModifier(UUID.nameUUIDFromBytes((uuid + ":toughness").getBytes(StandardCharsets.UTF_8)),
                        "Long Fall Boots Toughness", 1, AttributeModifier.Operation.ADDITION));

        modifiers.put(Attributes.KNOCKBACK_RESISTANCE,
                new AttributeModifier(UUID.nameUUIDFromBytes((uuid + ":knockback_resistance").getBytes(StandardCharsets.UTF_8)),
                        "Long Fall Boots Knockback Resistance", 0.05, AttributeModifier.Operation.ADDITION));

        return modifiers;
    }

    @Override
    public boolean canEquipFromUse(SlotContext slotContext, ItemStack stack) {
        return slotContext.identifier().equals("long_fall_boots");
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private BlockEntityWithoutLevelRenderer renderer;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (renderer == null) {
                    Minecraft minecraft = Minecraft.getInstance();

                    renderer = new LongFallBootsItemRenderer(minecraft.getBlockEntityRenderDispatcher(), minecraft.getEntityModels());
                }

                return renderer;
            }
        });
    }
}
