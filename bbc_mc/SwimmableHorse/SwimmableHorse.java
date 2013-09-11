package bbc_mc.SwimmableHorse;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "SwimmableHorse", name = "SwimmableHorse")
@NetworkMod( //
        clientSideRequired = true, //
        serverSideRequired = true)
public class SwimmableHorse {
    
    @SidedProxy(clientSide = "bbc_mc.SwimmableHorse.client.ClientProxy", serverSide = "bbc_mc.SwimmableHorse.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance("SwimmableHorse")
    public static SwimmableHorse instance;
    
    public SwimmableHorse() {
        instance = this;
    }
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent var1) {
        SHConfig.configure(var1);
        SHEntities.configure();
        proxy.doPreLoadRegistration();
    }
    
    @Mod.EventHandler
    public void load(FMLInitializationEvent var1) {
        SHLocalizedStrings.configure();
        proxy.doOnLoadRegistration();
    }
}
