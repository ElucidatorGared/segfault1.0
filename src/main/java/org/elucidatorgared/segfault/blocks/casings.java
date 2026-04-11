package org.elucidatorgared.segfault.blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class casings {
    private static final String[] CASING_NAMES = {
            "avaritia_collector_casing",
            "black_hole_destroyer_casing",
            "blood_altar_casing",
            "blood_extractor_casing",
            "crusher_casing",
            "dragon_fusion_casing",
            "exoworld_sphere_casing",
            "floral_collector_casing",
            "furnace_casing",
            "gaia_all_seeing_eye_casing",
            "infinity_creator_casing",
            "lightning_generator_casing",
            "mirror_stabilizer_casing",
            "nephrite_extractor_casing",
            "nightmare_world_portal_casing",
            "nuclear_reactor_casing",
            "ore_miner_casing",
            "phytogenic_incubator_casing",
            "plasma_generator_casing",
            "soul_creator_casing",
            "soul_extractor_casing",
            "space_destroyer_casing",
            "spark_of_creation_casing",
            "spark_of_destruction_casing",
            "star_alloy_extractor_casing",
            "steam_turbine_casing",
            "superalloy_cooler_casing",
            "thunder_earth_casing",
            "time_space_bridge_casing"
    };
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
            for (String name : CASING_NAMES) {
                helper.register(new ResourceLocation(MODID, name),
                        new Block(BlockBehaviour.Properties.of().strength(60.0F, 9000.0F).sound(SoundType.METAL)));
            }
        });

        event.register(ForgeRegistries.Keys.ITEMS, helper -> {
            for (String name : CASING_NAMES) {
                Block block = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, name));
                helper.register(new ResourceLocation(MODID, name),
                        new BlockItem(block, new Item.Properties()));
            }
        });
    }
}
