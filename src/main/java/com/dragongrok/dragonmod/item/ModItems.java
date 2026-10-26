package com.dragongrok.dragonmod.item;

import com.dragongrok.dragonmod.DragonMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item DRAGON_SCALE = registerItem("dragon_scale",
            new Item(new Item.Settings()));

    public static final Item DRAGON_EGG_ITEM = registerItem("dragon_egg_item",
            new Item(new Item.Settings().maxCount(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DragonMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DragonMod.LOGGER.info("Registering Dragon Mod items...");
    }
}
