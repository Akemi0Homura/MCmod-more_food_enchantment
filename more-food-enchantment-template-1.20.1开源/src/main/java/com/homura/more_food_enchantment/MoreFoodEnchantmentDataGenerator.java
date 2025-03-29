package com.homura.more_food_enchantment;

import com.homura.more_food_enchantment.autoData.ModChineseJz;
import com.homura.more_food_enchantment.autoData.ModEnglishUs;
import com.homura.more_food_enchantment.autoData.ModModels;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * 数据生成
 * @author Akemi0Homura
 */
public class MoreFoodEnchantmentDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack a= fabricDataGenerator.createPack();

        a.addProvider(ModEnglishUs::new);
        a.addProvider(ModChineseJz::new);
        a.addProvider(ModModels::new);
    }
}
