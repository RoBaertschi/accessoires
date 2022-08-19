package io.github.robaertschi.accessoires;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;

public class AccessoiresFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        CommonClass.init();
    }
}
