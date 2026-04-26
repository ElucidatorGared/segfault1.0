package org.elucidatorgared.segfault.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import org.elucidatorgared.segfault.CreativeModTab;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class rods {
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.ITEMS,
                helper -> {
                //  registerPlate(helper, "_rod"); Шаблон
                    registerRod(helper, "steel_rod");
                    registerRod(helper, "dark_steel_rod");
                    registerRod(helper, "nightmare_alloy_rod");
                    registerRod(helper, "andromed_alloy_rod");
                    registerRod(helper, "infinity_alloy_rod");
                    registerRod(helper, "infinity_rod");
                    registerRod(helper, "neutronium_rod");
                    registerRod(helper, "crystal_matrix_rod");
                    registerRod(helper, "awakened_draconium_rod");
                    registerRod(helper, "draconium_rod");
                    registerRod(helper, "sky_steel_rod");
                    registerRod(helper, "blood_steel_rod");
                    registerRod(helper, "vingetum_rod");
                    registerRod(helper, "infernal_rod");
                    registerRod(helper, "void_alloy_rod");
                }
        );
    }

    private void registerRod(RegisterEvent.RegisterHelper<Item> helper, String name) {
        Item item = new Item(new Item.Properties());
        helper.register(new ResourceLocation(MODID, name), item);
        CreativeModTab.ALL_ITEMS.add(item);
    }
}