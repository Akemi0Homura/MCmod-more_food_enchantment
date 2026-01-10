package com.homura.more_food_enchantment.autoData;

import com.homura.more_food_enchantment.Item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

/**
 * 简体中文语言文件
 * @author Akemi0Homura
 */
public class ModChineseJz extends FabricLanguageProvider {
    public ModChineseJz(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.beef,"金牛排");
        translationBuilder.add(ModItems.pork,"金猪排");
        translationBuilder.add(ModItems.redFish,"金鲑鱼");

        translationBuilder.add(ModItems.BEEF,"附魔金牛排");
        translationBuilder.add(ModItems.PORK,"附魔金猪排");
        translationBuilder.add(ModItems.REDFISH,"附魔金鲑鱼");
    }
}
