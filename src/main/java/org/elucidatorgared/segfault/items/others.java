package org.elucidatorgared.segfault.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import org.elucidatorgared.segfault.CreativeModTab;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class others {
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.ITEMS,
                helper -> {
                //registerOthers(helper, "name"); Шаблон
                  registerOthers(helper, "dark_matter");
                  registerOthers(helper, "eye_dead");
                  registerOthers(helper, "singularity_nightmares");
                  registerOthers(helper, "singularity_dreams");
        }
        );
    }
    private void registerOthers(RegisterEvent.RegisterHelper<Item> helper, String name) {
        Item item = new Item(new Item.Properties());
        helper.register(new ResourceLocation(MODID, name), item);
        CreativeModTab.ALL_ITEMS.add(item);
    }
    }


