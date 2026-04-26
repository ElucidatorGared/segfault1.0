package org.elucidatorgared.segfault.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import org.elucidatorgared.segfault.CreativeModTab;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class alloys {
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.ITEMS,
                helper -> {
                //  registerAlloys(helper, "_alloy"); Шаблон
                    registerAlloys(helper, "nightmare_alloy");
                    registerAlloys(helper, "andromed_alloy");
                    registerAlloys(helper, "infinity_alloy");
                    registerAlloys(helper, "void_alloy");
                    registerAlloys(helper, "star_alloy");

                }
        );
    }
    private void registerAlloys(RegisterEvent.RegisterHelper<Item> helper, String name) {
        Item item = new Item(new Item.Properties());
        helper.register(new ResourceLocation(MODID, name), item);
        CreativeModTab.ALL_ITEMS.add(item);
    }
    }

