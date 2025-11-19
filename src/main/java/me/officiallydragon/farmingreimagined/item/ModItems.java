package me.officiallydragon.farmingreimagined.item;

import me.officiallydragon.farmingreimagined.FarmingReimagined;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item BLUEBERRY = registerItem("blueberry", new Item(new Item.Settings()));
    public static final Item KIWI = registerItem("kiwi", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FarmingReimagined.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FarmingReimagined.LOGGER.info("Registering Mod Items for " + FarmingReimagined.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(BLUEBERRY);
            entries.add(KIWI);
        });
    }
}
