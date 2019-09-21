package io.github.krevik.kathairis.entity.butterfly;

import io.github.krevik.kathairis.block.BlockButterflyFlower;
import io.github.krevik.kathairis.block.BlockKathairisPlant;
import io.github.krevik.kathairis.init.ModBlocks;
import io.github.krevik.kathairis.init.ModEntities;
import io.github.krevik.kathairis.util.KatharianLootTables;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.gen.Heightmap;

import javax.annotation.Nullable;

public class EntityButterfly extends EntityBasicButterfly
{
    public BlockPos butterflyFlowerPos=null;

    public EntityButterfly(World worldIn)
    {
        super(worldIn, ModEntities.COMMON_BUTTERFLY1);
        this.setIsBirdSitting(true);
        this.experienceValue=1;
    }

    public EntityButterfly(EntityType<EntityButterfly> entityButterflyEntityType, World world) {
        super(world);
    }

    @Override
    public int getMaxSpawnedInChunk()
    {
        return 2;
    }

    @Override
    protected void registerAttributes()
    {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
    }

}