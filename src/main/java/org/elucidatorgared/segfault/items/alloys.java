package org.elucidatorgared.segfault.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class alloys {
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.ITEMS,
                helper -> {
                    //  helper.register(new ResourceLocation(MODID, "_alloy"), new Item(new Item.Properties())); Шаблон
                    helper.register(new ResourceLocation(MODID, "nightmare_alloy"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "andromed_alloy"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "infinity_alloy"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "void_alloy"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "star_alloy"), new Item(new Item.Properties()));

                }
        );
    }
}

