package bbc_mc.SwimmableHorse.entity;

import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.World;
import bbc_mc.SwimmableHorse.SHConfig;
import bbc_mc.SwimmableHorse.entity.ai.EntityAISwimmingOnRidden;

public class EntitySwimmableHorse extends EntityHorse {
    
    private EntityAITasks myTasks;
    
    public EntitySwimmableHorse(World par1World) {
        super(par1World);
        myTasks = new EntityAITasks(this.worldObj.theProfiler);
        myTasks.addTask(0, new EntityAISwimmingOnRidden(this, SHConfig.jumpUpFrequency, SHConfig.jumpUpPower));
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        
        // update myTasks only if this entity is ridden.
        if (this.riddenByEntity != null) {
            myTasks.onUpdateTasks();
        }
    }
}
