package site.axolotlcraft.al.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import site.axolotlcraft.al.init.Items;
import site.axolotlcraft.al.main.Main;
import site.axolotlcraft.al.utils.interfaces.IHasModel;

public class ItemSphereItem extends Item implements IHasModel
{
	public ItemSphereItem(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		
		Items.ITEMS.add(this);
		
		
	}
	
	 @SideOnly(Side.CLIENT)
	    public void initModel() {
	    }

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
