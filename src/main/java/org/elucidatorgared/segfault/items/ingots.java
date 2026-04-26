package org.elucidatorgared.segfault.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import org.elucidatorgared.segfault.CreativeModTab;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class ingots {
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.ITEMS,
                helper -> {
                    //  registerIngots(helper,"name"); Шаблон
                        registerIngots(helper,"dark_steel_ingot");
                        registerIngots(helper,"blood_steel_ingot");
                        registerIngots(helper,"vingetum_ingot");
                        registerIngots(helper,"infernal_ingot");
                }
        );
    }
    private void registerIngots(RegisterEvent.RegisterHelper<Item> helper, String name) {
        Item item = new Item(new Item.Properties());
        helper.register(new ResourceLocation(MODID, name), item);
        CreativeModTab.ALL_ITEMS.add(item); 
    }
}