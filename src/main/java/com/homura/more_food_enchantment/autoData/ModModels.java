package com.homura.more_food_enchantment.autoData;

import com.homura.more_food_enchantment.Item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

/**
 * 材质数据生成
 * @author Akemi0Homura
 */
public class ModModels extends FabricModelProvider {
    public ModModels(FabricDataOutput output) {
        super(output);
    }

    /**
     * 负责方块
     */
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    /**
     * 负责物品
     */
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.beef, Models.GENERATED);
        itemModelGenerator.register(ModItems.pork, Models.GENERATED);
        itemModelGenerator.register(ModItems.redFish, Models.GENERATED);

        itemModelGenerator.register(ModItems.BEEF, Models.GENERATED);
        itemModelGenerator.register(ModItems.PORK, Models.GENERATED);
        itemModelGenerator.register(ModItems.REDFISH, Models.GENERATED);
    }
}
