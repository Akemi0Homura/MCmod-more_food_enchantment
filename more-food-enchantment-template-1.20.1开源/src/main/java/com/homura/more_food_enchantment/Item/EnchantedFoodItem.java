package com.homura.more_food_enchantment.Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * 让物品都有附魔的紫色光效
 * @author Akemi0Homura
 */
public class EnchantedFoodItem extends Item {
    public EnchantedFoodItem(Settings settings) {
        super(settings);
    }

    /**
     * 重新这个方法，直接返回true，这样只要拿这个类去注册物品<br>
     * 都有附魔光效
     */
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
