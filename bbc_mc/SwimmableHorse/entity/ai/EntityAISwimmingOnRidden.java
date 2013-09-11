package bbc_mc.SwimmableHorse.entity.ai;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;

public class EntityAISwimmingOnRidden extends EntityAISwimming {
    
    private EntityLiving theEntity;
    private float jumpUpFrequency;
    private double jumpUpPower;
    
    public EntityAISwimmingOnRidden(EntityLiving par1EntityLiving, float jumpUpFrequency, double jumpUpPower) {
        super(par1EntityLiving);
        this.theEntity = par1EntityLiving;
        this.jumpUpFrequency = jumpUpFrequency;
        this.jumpUpPower = jumpUpPower;
    }
    
    /**
     * @see EntityAISwimming#updateTask
     */
    @Override
    public void updateTask() {
        super.updateTask();
        if (this.theEntity.getRNG().nextFloat() < this.jumpUpFrequency) {
            this.theEntity.motionY = this.jumpUpPower;
        }
    }
}
