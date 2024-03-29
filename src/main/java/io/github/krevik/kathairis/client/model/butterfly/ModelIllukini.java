package io.github.krevik.kathairis.client.model.butterfly;

import io.github.krevik.kathairis.Kathairis;
import io.github.krevik.kathairis.util.FunctionHelper;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModelIllukini<T extends LivingEntity> extends EntityModel<T> {
    public RendererModel Head;
    public RendererModel Wing4;
    public RendererModel Head1;
    public RendererModel Czulko_1;
    public RendererModel lowerbody;
    public RendererModel Head2;
    public RendererModel Body;
    public RendererModel Wing4_1;

    public ModelIllukini() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.lowerbody = new RendererModel(this, 0, 46);
        this.lowerbody.setRotationPoint(-1.9F, 21.8F, 1.0F);
        this.lowerbody.addBox(0.0F, 0.0F, 0.0F, 3, 2, 12, 0.0F);
        this.Czulko_1 = new RendererModel(this, 24, 48);
        this.Czulko_1.setRotationPoint(-3.3F, 18.2F, -15.0F);
        this.Czulko_1.addBox(0.0F, 0.0F, 0.0F, 6, 0, 8, 0.0F);
        this.setRotateAngle(Czulko_1, -0.36425021489121656F, 0.0F, 0.0F);
        this.Wing4_1 = new RendererModel(this, 58, 34);
        this.Wing4_1.setRotationPoint(-1.6F, 22.0F, -11.4F);
        this.Wing4_1.addBox(-16.0F, 0.0F, 0.0F, 16, 0, 28, 0.0F);
        this.Head2 = new RendererModel(this, 16, 36);
        this.Head2.setRotationPoint(-2.8F, 20.49F, -10.0F);
        this.Head2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Body = new RendererModel(this, 0, 18);
        this.Body.setRotationPoint(-2.4F, 21.5F, -5.3F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 4, 3, 8, 0.0F);
        this.Wing4 = new RendererModel(this, 10, 4);
        this.Wing4.setRotationPoint(0.8F, 22.0F, -11.4F);
        this.Wing4.addBox(0.0F, 0.0F, 0.0F, 16, 0, 28, 0.0F);
        this.Head = new RendererModel(this, 0, 38);
        this.Head.setRotationPoint(-2.3F, 20.5F, -8.9F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Head1 = new RendererModel(this, 16, 36);
        this.Head1.setRotationPoint(0.2F, 20.49F, -10.0F);
        this.Head1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    }

    @Override
    public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.lowerbody.render(f5);
        this.Czulko_1.render(f5);
        this.Wing4_1.render(f5);
        this.Head2.render(f5);
        this.Body.render(f5);
        this.Wing4.render(f5);
        this.Head.render(f5);
        this.Head1.render(f5);
    }

    public void setRotateAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    FunctionHelper helper = Kathairis.getHelper();
    @Override
    public void setRotationAngles(T entity, float f, float f1, float f2, float f3, float f4, float f5 )
    {
    	super.setRotationAngles(entity, f, f1, f2, f3, f4, f5);
    	if(entity.getMotion().y!=0D||entity.getMotion().x!=0D||entity.getMotion().z!=0D) {
        	Wing4.rotateAngleZ= MathHelper.sin(f2*0.6f);
        	Wing4_1.rotateAngleZ=-MathHelper.sin(f2*0.6f);
    	}else {
        	Wing4.rotateAngleZ=-helper.degToRad(70)- MathHelper.sin(f2*0.05f)*0.05f;
        	Wing4_1.rotateAngleZ= helper.degToRad(70)+ MathHelper.sin(f2*0.05f)*0.05f;
    	}
    }
}

