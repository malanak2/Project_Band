package com.malanak.projectband.item;

import com.malanak.projectband.ProjectBand;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    public static final Item BAND = registerItem(
        "band",
        new Item(new Item.Settings()),
        ModItemGroup.PROJECT_BAND
    );
    public static final Item RUBY = registerItem(
            "ruby",
            new Item(new Item.Settings()),
            ModItemGroup.PROJECT_BAND
    );

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(ProjectBand.MOD_ID, name), item);
    }


    public static void registerModItems() {
        ProjectBand.LOGGER.debug("Registering mod items for " + ProjectBand.MOD_ID);
    }
}
