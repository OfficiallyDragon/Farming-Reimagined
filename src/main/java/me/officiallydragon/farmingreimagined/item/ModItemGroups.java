package me.officiallydragon.farmingreimagined.item;

import me.officiallydragon.farmingreimagined.FarmingReimagined;
import me.officiallydragon.farmingreimagined.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup FARMING_REIMAGINED_FUNCTIONAL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FarmingReimagined.MOD_ID, "farming_reimagined_functional_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.GROW_DOME))
                    .displayName(Text.translatable("itemgroup.farmingreimagined.Functional_blocks_group"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.GROW_DOME);
                        entries.add(ModBlocks.SUPPORT_STICK);

                    })
                    .build());

    public static final ItemGroup FARMING_REIMAGINED_FRIUTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FarmingReimagined.MOD_ID, "farming_reimagined_fruits"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.BLUEBERRY))
                    .displayName(Text.translatable("itemgroup.farmingreimagined.fruit_group"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.BLUEBERRY);
                        entries.add(ModItems.KIWI);

                    })
                    .build());


    public static void registerItemGroups() {
        FarmingReimagined.LOGGER.info("Registering Item Groups for " + FarmingReimagined.MOD_ID);
    }

}
