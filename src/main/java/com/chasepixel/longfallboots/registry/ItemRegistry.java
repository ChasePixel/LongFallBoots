package com.chasepixel.longfallboots.registry;

import com.chasepixel.longfallboots.LongFallBoots;
import com.chasepixel.longfallboots.item.LongFallBootsItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LongFallBoots.MODID);


    public static final RegistryObject<Item> LONG_FALL_BOOTS = ITEMS.register("long_fall_boots", () -> new LongFallBootsItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GYROSCOPE = ITEMS.register("gyroscope", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOOT_FRAME = ITEMS.register("boot_frame", () -> new Item(new Item.Properties().stacksTo(1)));
}
