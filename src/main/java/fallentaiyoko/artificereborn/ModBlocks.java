package fallentaiyoko.artificereborn;

import fallentaiyoko.artificereborn.blocks.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
    @GameRegistry.ObjectHolder("artificereborn:basalt")
    public static Basalt basalt;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        basalt.initModel();
    }
}
