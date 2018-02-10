package fallentaiyoko.artificereborn;

import fallentaiyoko.artificereborn.proxy.CommonProxy;
import fallentaiyoko.artificereborn.blocks.Basalt;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockSpecial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;
import net.minecraft.creativetab.CreativeTabs;

import static fallentaiyoko.artificereborn.ModBlocks.basalt;

@Mod(modid = ArtificeReborn.MODID, name = ArtificeReborn.MODNAME, version = ArtificeReborn.MODVERSION, dependencies = "required-after:forge@[14.21.1.2387,)")
public class ArtificeReborn {
    public static final String MODID = "artificereborn";
    public static final String MODNAME = "Artifice Reborn";
    public static final String MODVERSION = "0.0.1";

    @SidedProxy(clientSide = "fallentaiyoko.artificereborn.proxy.ClientProxy", serverSide = "fallentaiyoko.artificereborn.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ArtificeReborn instance;
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

    public static CreativeTabs artificeBlocks = new CreativeTabs("Artifice Blocks") {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem() {
            return new ItemStack(new ItemBlock(ModBlocks.basalt));
        }

    };
}
