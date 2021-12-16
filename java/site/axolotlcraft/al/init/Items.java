package site.axolotlcraft.al.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import site.axolotlcraft.al.items.ItemSphereItem;
import site.axolotlcraft.al.proxy.ClientProxy;
import site.axolotlcraft.al.proxy.CommonProxy;

public class Items 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item SPHERE_ITEM = new ItemSphereItem("sphere_item");
	public static CommonProxy serverProxy = new CommonProxy();
	public static ClientProxy clientProxy = new ClientProxy();
}
