package org.elucidatorgared.segfault.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class ingots {
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.ITEMS,
                helper -> {
                    //  helper.register(new ResourceLocation(MODID, "_ingot"), new Item(new Item.Properties())); Шаблон
                    helper.register(new ResourceLocation(MODID, "steel_ingot"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "dark_steel_ingot"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "infinity_ingot"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "neutronium_ingot"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "crystal_matrix_ingot"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "awakened_draconium_ingot"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "draconium_ingot"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "sky_steel_ingot"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "blood_steel_ingot"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "vingetum_ingot"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "infernal_ingot"), new Item(new Item.Properties()));

                }
        );
    }
}