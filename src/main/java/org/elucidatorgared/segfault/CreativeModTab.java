package org.elucidatorgared.segfault;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class CreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final List<Item> ALL_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> SEGFAULT_TAB = CREATIVE_TABS.register("segfault_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable(MODID + ".segfault_tab"))
                    .icon(() -> {
                        if (!ALL_ITEMS.isEmpty()) {
                            return new ItemStack(ALL_ITEMS.get(0));
                        }
                        return new ItemStack(net.minecraft.world.item.Items.IRON_INGOT);
                    })
                    .displayItems((params, output) -> {
                        for (Item item : ALL_ITEMS) {
                            output.accept(item);
                        }
                    })
                    .build()
    );
}