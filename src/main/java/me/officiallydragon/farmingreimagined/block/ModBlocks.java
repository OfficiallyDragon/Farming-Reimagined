package me.officiallydragon.farmingreimagined.block;

import me.officiallydragon.farmingreimagined.FarmingReimagined;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SUPPORT_STICK = registerBlock("support_stick",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.BAMBOO_WOOD)
                    .nonOpaque())
    );

    public static final Block GROW_DOME = registerBlock("grow_dome",
            new Block(AbstractBlock.Settings.create()
                    .strength(1.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DECORATED_POT)
                    .nonOpaque())
    );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FarmingReimagined.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FarmingReimagined.MOD_ID,name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        FarmingReimagined.LOGGER.info("Registering Mod Blocks for " + FarmingReimagined.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.GROW_DOME);
            entries.add(ModBlocks.SUPPORT_STICK);

        });
    }
}
