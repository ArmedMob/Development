package armedmob.mods.learningmod;

import armedmob.mods.learningmod.init.ModBlocks;
import armedmob.mods.learningmod.init.ModItems;
import armedmob.mods.learningmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static armedmob.mods.learningmod.References.*;
import static net.minecraftforge.fml.common.Mod.*;

@Mod(modid = MODID, version = VERSION, name =NAME)
public class Main
{
    @SidedProxy(serverSide = References.SERVER_PROXY_CLASS, clientSide = References.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @Instance(MODID)
    public static Main instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent preEvent)
    {
        System.out.println(MODID + ":"+ "preInit Event");

        ModBlocks.init();
        ModItems.init();
        ModBlocks.register();
        ModItems.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println(MODID + ":"+ "init Event");

        proxy.registerRenders();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent postEvent)
    {
        System.out.println(MODID + ":"+ "postEvent");
    }
}
