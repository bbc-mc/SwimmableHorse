package bbc_mc.SwimmableHorse;

import java.util.List;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import bbc_mc.SwimmableHorse.entity.EntitySwimmableHorse;

import com.google.common.collect.Lists;

import cpw.mods.fml.common.registry.EntityRegistry;

public class SHEntities {
    
    public static void configure() {
        registerCreatures(SwimmableHorse.instance);
    }
    
    private static void registerCreatures(SwimmableHorse mod) {
        EntityRegistry.registerGlobalEntityID(EntitySwimmableHorse.class, "SwimmingHorse", SHConfig.idEntitySwimmableHorse, 0xFFFFFF, 0x000000);
        EntityRegistry.registerModEntity(EntitySwimmableHorse.class, "SwimmingHorse", SHConfig.idEntitySwimmableHorse, mod, 150, 1, true);
        
        if (SHConfig.enabled) {
            List<BiomeGenBase> spawn = Lists.newArrayList();
            spawn.add(BiomeGenBase.plains);
            
            if (SHConfig.setSpawnRateLow) {
                EntityRegistry.addSpawn(EntitySwimmableHorse.class, 1, 1, 2, EnumCreatureType.creature, spawn.toArray(new BiomeGenBase[1]));
            } else {
                EntityRegistry.addSpawn(EntitySwimmableHorse.class, 5, 2, 6, EnumCreatureType.creature, spawn.toArray(new BiomeGenBase[1]));
            }
        }
    }
}
