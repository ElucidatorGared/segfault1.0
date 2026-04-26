package org.elucidatorgared.segfault.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import org.elucidatorgared.segfault.CreativeModTab;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class plates {
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.ITEMS,
                helper -> {
                //  registerPlate(helper, "_plate"); Шаблон
                    registerPlate(helper, "steel_plate");
                    registerPlate(helper, "dark_steel_plate");
                    registerPlate(helper, "nightmare_alloy_plate");
                    registerPlate(helper, "andromed_alloy_plate");
                    registerPlate(helper, "infinity_alloy_plate");
                    registerPlate(helper, "infinity_plate");
                    registerPlate(helper, "neutronium_plate");
                    registerPlate(helper, "crystal_matrix_plate");
                    registerPlate(helper, "awakened_draconium_plate");
                    registerPlate(helper, "draconium_plate");
                    registerPlate(helper, "sky_steel_plate");
                    registerPlate(helper, "blood_steel_plate");
                    registerPlate(helper, "vingetum_plate");
                    registerPlate(helper, "infernal_plate");
                    registerPlate(helper, "void_alloy_plate");

                }
        );
    }
    private void registerPlate(RegisterEvent.RegisterHelper<Item> helper, String name) {
        Item item = new Item(new Item.Properties());
        helper.register(new ResourceLocation(MODID, name), item);
        CreativeModTab.ALL_ITEMS.add(item);
    }
}
