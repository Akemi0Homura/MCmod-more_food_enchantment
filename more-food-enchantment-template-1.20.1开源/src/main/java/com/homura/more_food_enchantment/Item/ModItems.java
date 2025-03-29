package com.homura.more_food_enchantment.Item;

import com.homura.more_food_enchantment.MoreFoodEnchantment;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

/**
 * 注册mod物品进游戏
 * @author Akemi0Homura
 */
public class ModItems {
    public static final Item beef=register("beef",new Item(new Item.Settings().food(ModFood.beef)));
    public static final Item pork=register("pork",new Item(new Item.Settings().food(ModFood.pork)));
    public static final Item redFish=register("redfish",new Item(new Item.Settings().food(ModFood.redFish)));

    //这里属于附魔食物，用我们自己重写好的item类去创建
    public static final Item BEEF=register("beefest",new EnchantedFoodItem(new Item.Settings().food(ModFood.BEEF)));
    public static final Item PORK=register("porkest",new EnchantedFoodItem(new Item.Settings().food(ModFood.PORK)));
    public static final Item REDFISH=register("redfishest",new EnchantedFoodItem(new Item.Settings().food(ModFood.REDFISH)));



    public static Item register(String id, Item item) {
        return register(new Identifier(MoreFoodEnchantment.MOD_ID,id), item);
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return (Item) Registry.register(Registries.ITEM, key, item);
    }

    private static void addItem(FabricItemGroupEntries entries){
        entries.add(beef);
        entries.add(pork);
        entries.add(redFish);

        entries.add(BEEF);
        entries.add(PORK);
        entries.add(REDFISH);
    }

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItem);
    }
}
