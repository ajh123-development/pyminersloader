package uk.minersonline.pyminersloader.fabric;

import uk.minersonline.pyminersloader.PyMinersLoader;
import net.fabricmc.api.ModInitializer;

public class PyMinersLoaderFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PyMinersLoader.init();
    }
}