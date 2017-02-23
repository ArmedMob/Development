package armedmob.mods.learningmod.init;

import armedmob.mods.learningmod.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.lwjgl.Sys;

/**
 * Created by Armed Mob on 2/22/2017.
 */
public class ModItems {

    public static Item copper_ingot;

    public static void init() {

        copper_ingot = new Item().setUnlocalizedName("copper_ingot");
    }

    public static void register() {

        registerItem(copper_ingot);
    }

    public static void registerRenders() {

        registerRender(copper_ingot);
    }

    public static void registerItem(Item item) {

        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5), References.MODID);
        System.out.println("Registerd item: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}

