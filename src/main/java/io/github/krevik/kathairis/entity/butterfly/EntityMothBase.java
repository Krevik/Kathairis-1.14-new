package io.github.krevik.kathairis.entity.butterfly;

import io.github.krevik.kathairis.util.KatharianLootTables;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityMothBase extends EntityBasicButterfly
{
    private BlockPos spawnPosition;

    public EntityMothBase(World worldIn, EntityType type)
    {
        super(worldIn,type);
        this.experienceValue=1;
    }

    public EntityMothBase(World world){
        super(world);
    }

    public EntityMothBase(EntityType<? extends EntityMothBase> type, World world) {
        super(type, world);
    }
}