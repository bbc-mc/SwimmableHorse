package bbc_mc.SwimmableHorse;

import bbc_mc.util.UtilLocalize;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class SHLocalizedStrings {
    public static void configure() {
        LanguageRegistry reg = LanguageRegistry.instance();
        
        // entity
        UtilLocalize.registerStringForEntity(reg, "SwimmableHorse", "SwimmableHorse", "泳げる馬");
    }
}
