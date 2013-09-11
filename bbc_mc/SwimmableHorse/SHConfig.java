package bbc_mc.SwimmableHorse;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import bbc_mc.utilforge.UtilForgeConfig;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class SHConfig {
    
    // System
    public static boolean enabled;
    public static double jumpUpPower;
    public static float jumpUpFrequency;
    public static boolean setSpawnRateLow;
    
    // ID: Creature
    public static int idEntitySwimmableHorse;
    
    public static void configure(FMLPreInitializationEvent event) {
        Configuration var1 = new Configuration(event.getSuggestedConfigurationFile());
        
        try {
            var1.load();
            
            // System
            enabled = UtilForgeConfig.loadConfigBoolean(var1, "SwimmingHorse_enabled", "system", true,
                    "Enable / Disable spawn of this mod's monsters.");
            jumpUpPower = UtilForgeConfig.loadConfigDouble(var1, "SwimmingHorce_jumpUpPower", "system", 0.15, "JumpUp Power.[defalut=0.15]");
            jumpUpFrequency = UtilForgeConfig.loadConfigFloat(var1, "SwimmingHorse_jumpUpFrequency", "system", 0.95F,
                    "JumpUp Frequency.[default=0.95]");
            setSpawnRateLow = UtilForgeConfig.loadConfigBoolean(var1, "SwimmingHorce_setSpawnRateLow", "system", true,
                    "set SwimmingHorse spawn rate Low, or not. [default=true]");
            
            // Entity
            idEntitySwimmableHorse = UtilForgeConfig.loadConfigInt(var1, "SwimmingHorse", "mob", 130, "Mob ID.");
            
        } catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, "Config has a problem loading it's configuration");
        } finally {
            var1.save();
        }
    }
}
