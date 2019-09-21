package io.github.krevik.kathairis.init;

import io.github.krevik.kathairis.particle.BasicKatharianParticle;
import io.github.krevik.kathairis.particle.BasicKatharianParticleType;
import io.github.krevik.kathairis.util.ModUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.registries.ObjectHolder;

import static io.github.krevik.kathairis.util.ModReference.MOD_ID;


public class ModParticles {
    public static BasicParticleType FAST_PARTICLE = ModUtil._null();

    public static void registerParticles(){
        FAST_PARTICLE = register("fast_particle",false);
    }

    public static BasicParticleType register(String name, boolean alwaysShow) {
        return (BasicParticleType) Registry.<ParticleType<? extends IParticleData>>register(Registry.PARTICLE_TYPE, new ResourceLocation(MOD_ID,name), new BasicParticleType(alwaysShow));
    }



}
