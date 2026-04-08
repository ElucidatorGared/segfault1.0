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
                    //  helper.register(new ResourceLocation(MODID, "_rod"), new Item(new Item.Properties())); Шаблон
                    helper.register(new ResourceLocation(MODID, "steel_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "dark_steel_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "nightmare_alloy_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "andromed_alloy_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "infinity_alloy_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "infinity_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "neutronium_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "crystal_matrix_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "awakened_draconium_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "draconium_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "sky_steel_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "blood_steel_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "vingetum_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "infernal_rod"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "void_alloy_rod"), new Item(new Item.Properties()));

                }
        );
    }
}
