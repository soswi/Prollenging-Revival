package net.soswi.prollengingrevival.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.soswi.prollengingrevival.ProllengingRevival;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ProllengingRevival.MOD_ID);

    public static void register(IEventsBus eventsBus) {
        BLOCKS.register(eventsBus);
    }
}
