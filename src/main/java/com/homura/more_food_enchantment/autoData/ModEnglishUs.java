package com.homura.more_food_enchantment.autoData;

import com.homura.more_food_enchantment.Item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

/**
 * 英语的语言文件
 * @author Akemi0Homura
 */
public class ModEnglishUs extends FabricLanguageProvider {
    //默认英文
    public ModEnglishUs(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.beef,"gold beef");
        translationBuilder.add(ModItems.pork,"gold pock");
        translationBuilder.add(ModItems.redFish,"gold salmon");

        translationBuilder.add(ModItems.BEEF,"Enchantment gold beef");
        translationBuilder.add(ModItems.PORK,"Enchantment gold pock");
        translationBuilder.add(ModItems.REDFISH,"Enchantment gold salmon");
    }
}
