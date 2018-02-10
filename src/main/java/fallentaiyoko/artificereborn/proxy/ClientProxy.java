package fallentaiyoko.artificereborn.proxy;

import fallentaiyoko.artificereborn.ArtificeReborn;
import fallentaiyoko.artificereborn.ModBlocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
//TODO: Add imports as things are implemented

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy{
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);

        OBJLoader.INSTANCE.addDomain(ArtificeReborn.MODID);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        //TODO: uncomment when keybinds are implemented
        //MinecraftForge.EVENT_BUS.register(new InputHandler());
        //KeyBindings.init();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
        ModBlocks.initModels();
        //ModItems.initModels();
    }
}
