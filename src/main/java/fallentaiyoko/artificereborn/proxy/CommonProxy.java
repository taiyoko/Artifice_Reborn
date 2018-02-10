package fallentaiyoko.artificereborn.proxy;
import fallentaiyoko.artificereborn.*;
import fallentaiyoko.artificereborn.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import java.io.File;
//TODO: Add imports for block/item/network handler classes as implemented

@Mod.EventBusSubscriber
public class CommonProxy {

    //Config Instance
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "artificereborn.cfg"));
        //Config.readConfig();     WAT

        //Initialize Packet handler
        //PacketHandler.registerMessages("artificereborn");

        //ModEntities.init();
        //MainCompatHandler.registerWaila();
        //MainCompatHandler.registerTOP();
    }

    public void init(FMLInitializationEvent e) {
        //gNetworkRegistry.INSTANCE.registerGuiHandler(ArtificeReborn.instance, new GuiProxy());
    }

    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        //TODO: Register blocks and TEs as implemented
        event.getRegistry().register(new Basalt());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //TODO: Register items and itemblocks as implemented.
        event.getRegistry().register(new ItemBlock(ModBlocks.basalt).setRegistryName(ModBlocks.basalt.getRegistryName()));
    }

}
