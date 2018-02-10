package fallentaiyoko.artificereborn.blocks;

import fallentaiyoko.artificereborn.ArtificeReborn;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Basalt extends Block{
    public Basalt() {
        super(Material.ROCK);
        setUnlocalizedName(ArtificeReborn.MODID + ".basalt");
        setRegistryName("Basalt");
        setCreativeTab(ArtificeReborn.artificeBlocks);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
