package io.github.robaertschi.accessoires.item;

import io.github.robaertschi.accessoires.Accessoires;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    /**
     * All Items of the Mod.
     * */
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Accessoires.MODID);


    /**
     * Registers all Items of this Mod.
     * @param eventBus The Event Bus for registering the Items.
     * */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
