package armedmob.mods.learningmod.proxy;

import armedmob.mods.learningmod.init.ModBlocks;
import armedmob.mods.learningmod.init.ModItems;

/**
 * Created by Armed Mob on 2/22/2017.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {

        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}
