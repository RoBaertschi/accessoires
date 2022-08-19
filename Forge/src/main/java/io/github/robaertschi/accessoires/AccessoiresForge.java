package io.github.robaertschi.accessoires;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class AccessoiresForge {
    
    public AccessoiresForge() {
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
    }
}