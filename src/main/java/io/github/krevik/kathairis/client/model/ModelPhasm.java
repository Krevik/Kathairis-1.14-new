package io.github.krevik.kathairis.client.model;

import io.github.krevik.kathairis.Kathairis;
import io.github.krevik.kathairis.entity.EntityPhasm;
import io.github.krevik.kathairis.util.FunctionHelper;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
@OnlyIn(Dist.CLIENT)
public class ModelPhasm<T extends LivingEntity> extends EntityModel<EntityPhasm> {
    public RendererModel Head;
    public RendererModel Body1;
    public RendererModel InnerHead;
    public RendererModel Body2;
    public RendererModel LeftArm;
    public RendererModel RightArm;
    public RendererModel InnerBody;
    public RendererModel Body3;

    public ModelPhasm() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.RightArm = new RendererModel(this, 32, 48);
        this.RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RightArm, 0.0F, 0.0F, -0.31869712141416456F);
        this.LeftArm = new RendererModel(this, 40, 16);
        this.LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.LeftArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LeftArm, 0.0F, 0.0F, 0.40980330836826856F);
        this.InnerBody = new RendererModel(this, 24, 0);
        this.InnerBody.setRotationPoint(0.0F, 7.0F, 0.7F);
        this.InnerBody.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.Body1 = new RendererModel(this, 16, 16);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body1.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.Body3 = new RendererModel(this, 0, 54);
        this.Body3.setRotationPoint(-1.5F, 6.0F, -2.0F);
        this.Body3.addBox(0.0F, 0.0F, 0.0F, 7, 6, 4, 0.0F);
        this.setRotateAngle(Body3, 0.3665191429188092F, 0.0F, 0.0F);
        this.Head = new RendererModel(this, 32, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.Body2 = new RendererModel(this, 0, 43);
        this.Body2.setRotationPoint(-1.95F, 11.2F, -0.1F);
        this.Body2.addBox(-2.0F, 0.0F, -2.0F, 8, 6, 4, 0.0F);
        this.setRotateAngle(Body2, 0.36425021489121656F, 0.0F, 0.0F);
        this.InnerHead = new RendererModel(this, 0, 0);
        this.InnerHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.InnerHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Body1.addChild(this.RightArm);
        this.Body1.addChild(this.LeftArm);
        this.Body1.addChild(this.InnerBody);
        this.Body2.addChild(this.Body3);
        this.Body1.addChild(this.Body2);
        this.Head.addChild(this.InnerHead);
    }

    @Override
    public void render(EntityPhasm entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body1.render(f5);
        this.Head.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    FunctionHelper helper = Kathairis.getHelper();

    @Override
    public void setRotationAngles(EntityPhasm entity, float limbSwing, float limbSwingAmount, float f2, float f3, float f4, float f5) {
        super.setRotationAngles(entity, limbSwing, limbSwingAmount, f2, f3, f4, f5);
        setRotateAngle(LeftArm,0+ MathHelper.sin(f2*0.05f)*0.1f,0,helper.degToRad(23.48f)- MathHelper.sin(f2*0.05f)*0.1f);
        setRotateAngle(RightArm,0- MathHelper.sin(f2*0.05f)*0.1f,0,helper.degToRad(-18.26f)+ MathHelper.sin(f2*0.05f)*0.1f);
        setRotateAngle(Body2,helper.degToRad(21)+ MathHelper.sin(f2*0.05f)*0.15f,0,0);
            if(entity.getIsSwingingArms()){
                setRotateAngle(LeftArm,helper.degToRad(-86)+ MathHelper.sin(f2*0.05f)*0.1f,0,helper.degToRad(23.48f)- MathHelper.sin(f2*0.05f)*0.1f);
                setRotateAngle(RightArm,helper.degToRad(-86)- MathHelper.sin(f2*0.05f)*0.1f,0,helper.degToRad(-18.26f)+ MathHelper.sin(f2*0.05f)*0.1f);

            }
    }
}