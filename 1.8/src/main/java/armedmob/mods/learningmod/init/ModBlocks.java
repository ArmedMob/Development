package armedmob.mods.learningmod.init;

import armedmob.mods.learningmod.References;
import armedmob.mods.learningmod.blocks.BlockCopperOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Armed Mob on 2/22/2017.
 */
public class ModBlocks {

    public static Block copper_ore;

    public static void init() {

        copper_ore = new BlockCopperOre("copper_ore");
    }

    public static void register() {

        registerBlock(copper_ore);
    }

    public static void registerRenders() {

        registerRender(copper_ore);
    }

    public static void registerBlock(Block block) {

        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
        System.out.println("Registered Block: " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {

        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
