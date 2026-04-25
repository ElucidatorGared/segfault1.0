package org.elucidatorgared.segfault.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class others {
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.ITEMS,
                helper -> {
                    //  helper.register(new ResourceLocation(MODID, "name"), new Item(new Item.Properties())); Шаблон
                    helper.register(new ResourceLocation(MODID, "dark_matter"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "eye_dead"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "singularity_nightmares"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "singularity_dreams"), new Item(new Item.Properties()));
        }
        );
    }
}

