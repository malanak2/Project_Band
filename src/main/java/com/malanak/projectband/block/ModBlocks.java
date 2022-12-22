package com.malanak.projectband.block;

import com.malanak.projectband.ProjectBand;
import com.malanak.projectband.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
        new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroup.PROJECT_BAND);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {

        registerBlockItem(name, block, tab);

        return Registry.register(Registries.BLOCK, new Identifier(ProjectBand.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {

        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(block));

        return Registry.register(Registries.ITEM, new Identifier(ProjectBand.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {
        ProjectBand.LOGGER.debug("Registering mod blocks for " + ProjectBand.MOD_ID);
    }
}
