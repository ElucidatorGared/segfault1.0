package org.elucidatorgared.segfault.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class rods {
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.ITEMS,
                helper -> {
                    helper.register(new ResourceLocation(MODID, "emerald_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "diamond_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "andromed_rod"), new Item(new Item.Properties()));
                    // ...
                }
        );
    }
}
