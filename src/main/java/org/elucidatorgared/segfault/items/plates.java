package org.elucidatorgared.segfault.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class plates {
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.ITEMS,
                helper -> {
                //  helper.register(new ResourceLocation(MODID, "_plate"), new Item(new Item.Properties())); Шаблон
                    helper.register(new ResourceLocation(MODID, "steel_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "dark_steel_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "nightmare_alloy_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "andromed_alloy_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "dark_matter_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "infinity_alloy_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "infinity_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "neutronium_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "crystal_matrix_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "awakened_draconium_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "draconium_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "sky_steel_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "blood_steel_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "vingetum_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "infernal_plate"), new Item(new Item.Properties()));
                    helper.register(new ResourceLocation(MODID, "void_alloy_plate"), new Item(new Item.Properties()));

                }
        );
    }
}
