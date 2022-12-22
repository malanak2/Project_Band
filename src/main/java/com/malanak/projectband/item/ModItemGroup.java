package com.malanak.projectband.item;

import com.malanak.projectband.ProjectBand;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PROJECT_BAND = FabricItemGroup.builder(new Identifier(ProjectBand.MOD_ID))
            .displayName(Text.literal("Project Band"))
            .icon(() -> new ItemStack(ModItems.BAND))
            .build();
}
