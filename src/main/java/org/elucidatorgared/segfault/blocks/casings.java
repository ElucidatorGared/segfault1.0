package org.elucidatorgared.segfault.blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import static org.elucidatorgared.segfault.Segfault.MODID;

public class casings {
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.BLOCKS,
                helper -> {
                    helper.register(new ResourceLocation(MODID, "phytogenic_incubator_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "crusher_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "furnace_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "avaritia_collector_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "floral_collector_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "ore_miner_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "soul_extractor_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "soul_creator_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "plasma_generator_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "steam_turbine_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "nuclear_reactor_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "nephrite_extractor_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "star_alloy_extractor_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "nightmare_world_portal_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "mirror_stabilizer_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "superalloy_cooler_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "black_hole_destroyer_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "spark_of_destruction_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "spark_of_creation_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "blood_altar_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "exoworld_sphere_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "gaia_all_seeing_eye_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "infinity_creator_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "dragon_fusion_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "blood_extractor_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "lightning_generator_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "thunder_earth_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "time_space_bridge_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));
                    helper.register(new ResourceLocation(MODID, "space_destroyer_casing"), new Block(BlockBehaviour.Properties.of().strength(20.0F, 600.0F).sound(SoundType.METAL)));

        }
        );
    }
}
