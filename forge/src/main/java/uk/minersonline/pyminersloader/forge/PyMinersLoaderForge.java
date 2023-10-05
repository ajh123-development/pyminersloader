package uk.minersonline.pyminersloader.forge;

import dev.architectury.platform.forge.EventBuses;
import uk.minersonline.pyminersloader.PyMinersLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PyMinersLoader.MOD_ID)
public class PyMinersLoaderForge {
    public PyMinersLoaderForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(PyMinersLoader.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        PyMinersLoader.init();
    }
}