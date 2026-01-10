package com.homura.more_food_enchantment.Item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

/**
 * 食物，也是本模组的核心,因为本mod主打的就是个食物
 * @author Akemi0Homura
 */
public class ModFood {
    /**
     * 定位：
     * 牛扒：战斗
     * 猪扒：赶路
     * 鱼：水下
     */

    /**
     * 普通金
     */
    //金牛扒,获得8点饥饿值，20点饱食度。获得力量2，三分钟
    public static final FoodComponent beef=new FoodComponent.Builder().hunger(8).saturationModifier(1.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 1),1.0f).build();

    //金猪扒，获得14点饥饿值，5点饱食度。获得迅捷2，三分钟
    public static final FoodComponent pork=new FoodComponent.Builder().hunger(14).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600,1), 1.0f).build();

    //金鲑鱼 不是白色那条。饥饿值和饱食度对齐金胡萝卜。获得水肺呼吸，三分钟
    public static final FoodComponent redFish=new FoodComponent.Builder().hunger(6).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 3600,0), 1.0f).build();

    /**
     * 附魔金
     */
    //附魔金牛扒，获得8点饥饿值，20点饱食度，获得 力量2 急迫1 六分钟
    public static final FoodComponent BEEF=new FoodComponent.Builder().hunger(8).saturationModifier(1.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 7200, 2),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 7200, 0),1.0f)
            .build();

    //附魔金猪扒，获得14点饥饿值，5点饱食度。获得 迅捷2 跳跃提升2 饱和1 六分钟
    public static final FoodComponent PORK=new FoodComponent.Builder().hunger(14).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 7200, 1),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 7200, 1),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 7200, 0),1.0f)
            .build();

    //附魔金鲑鱼，饿值和饱食度对齐金胡萝卜。获得 水肺效果 夜视 海豚的恩惠(就是加游泳速度) 均为六分钟
    public static final FoodComponent REDFISH=new FoodComponent.Builder().hunger(6).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 7200, 0),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 7200, 0),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 7200, 0),1.0f)
            .build();
}

