package org.elucidatorgared.segfault;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.elucidatorgared.segfault.blocks.casings;
import org.elucidatorgared.segfault.items.*;

@Mod(Segfault.MODID)
public class Segfault {
    public static final String MODID = "segfault";

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public Segfault() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        modEventBus.addListener(new rods()::register);
        modEventBus.addListener(new plates()::register);
        modEventBus.addListener(new casings()::register);
        modEventBus.addListener(new alloys()::register);
        modEventBus.addListener(new ingots()::register);
        modEventBus.addListener(new others()::register);
        CreativeModTab.CREATIVE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}