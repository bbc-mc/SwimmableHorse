package bbc_mc.SwimmableHorse.client;

import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.renderer.entity.RenderHorse;
import net.minecraft.world.World;
import bbc_mc.SwimmableHorse.CommonProxy;
import bbc_mc.SwimmableHorse.entity.EntitySwimmableHorse;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
    
    public void doOnLoadRegistration() {
        // register Renderer
        RenderingRegistry.registerEntityRenderingHandler(EntitySwimmableHorse.class, new RenderHorse(new ModelHorse(), 0.75F));
    }
    
    public World getClientWorld() {
        return FMLClientHandler.instance().getClient().theWorld;
    }
    
}
