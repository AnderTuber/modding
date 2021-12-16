package site.axolotlcraft.al.main;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import site.axolotlcraft.al.proxy.ClientProxy;
import site.axolotlcraft.al.reference.Reference;
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, 
acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSION)
public class Main {
	
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static ClientProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{
		Main.proxy.addOBJLoaderDomainIfOnClient();
		OBJLoader.INSTANCE.addDomain(Reference.MODID);
	};
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {};
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {};
	
	
}
