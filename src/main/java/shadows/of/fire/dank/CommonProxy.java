package shadows.of.fire.dank;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import shadows.of.fire.dank.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.SidedProxy;


public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        // Initialization of blocks and items typically goes here:
    	ModRegistry.init();
    	RecipeManager.initRecipes();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

}