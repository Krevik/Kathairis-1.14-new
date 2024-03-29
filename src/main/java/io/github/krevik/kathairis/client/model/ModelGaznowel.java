package io.github.krevik.kathairis.client.model;

import io.github.krevik.kathairis.Kathairis;
import io.github.krevik.kathairis.entity.EntityGaznowel;
import io.github.krevik.kathairis.util.FunctionHelper;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * ModelGaznowel - Undefined
 * Created using Tabula 7.0.0
 */

@OnlyIn(Dist.CLIENT)
public class ModelGaznowel<T extends LivingEntity> extends EntityModel<EntityGaznowel> {
    public RendererModel Cloud1;
    public RendererModel Body2;
    public RendererModel Body1;
    public RendererModel RightLeg1;
    public RendererModel LeftLeg1;
    public RendererModel Cloud2;
    public RendererModel Cloud3;
    public RendererModel Cloud4;
    public RendererModel Cloud5;
    public RendererModel Cloud6;
    public RendererModel LeftArm1;
    public RendererModel RightArm1;
    public RendererModel Head1;
    public RendererModel LeftArm2;
    public RendererModel RightArm2;
    public RendererModel Head3;
    public RendererModel RightEyeHole;
    public RendererModel LeftEyeHole;
    public RendererModel NoseHole;
    public RendererModel Head2;
    public RendererModel RightLeg2;
    public RendererModel LeftLeg2;

    public ModelGaznowel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.RightLeg2 = new RendererModel(this, 51, 28);
        this.RightLeg2.setRotationPoint(0.0F, 8.5F, -0.5F);
        this.RightLeg2.addBox(-1.5F, 1.5F, -1.5F, 3, 8, 3, 0.0F);
        this.setRotateAngle(RightLeg2, 1.5707963267948966F, 0.0F, 0.0F);
        this.Head2 = new RendererModel(this, 0, 38);
        this.Head2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Head2.addBox(-3.0F, 0.0F, -6.0F, 6, 2, 6, 0.0F);
        this.setRotateAngle(Head2, 0.04363323129985824F, 0.0F, 0.0F);
        this.RightArm1 = new RendererModel(this, 42, 18);
        this.RightArm1.setRotationPoint(-3.5F, -3.0F, -2.0F);
        this.RightArm1.addBox(-1.5F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(RightArm1, 0.5235987755982988F, 0.08726646259971647F, 0.4363323129985824F);
        this.RightLeg1 = new RendererModel(this, 51, 15);
        this.RightLeg1.setRotationPoint(-2.0F, 5.5F, 0.0F);
        this.RightLeg1.addBox(-1.5F, 0.0F, -2.0F, 3, 10, 3, 0.0F);
        this.setRotateAngle(RightLeg1, -0.7853981633974483F, 0.2617993877991494F, 0.0F);
        this.LeftArm2 = new RendererModel(this, 42, 28);
        this.LeftArm2.mirror = true;
        this.LeftArm2.setRotationPoint(0.5F, 7.0F, 0.0F);
        this.LeftArm2.addBox(-1.0F, 1.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(LeftArm2, -1.5707963267948966F, 0.0F, 0.0F);
        this.Body2 = new RendererModel(this, 40, 53);
        this.Body2.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.Body2.addBox(-4.0F, 0.0F, -2.0F, 8, 7, 4, 0.0F);
        this.LeftArm1 = new RendererModel(this, 42, 18);
        this.LeftArm1.mirror = true;
        this.LeftArm1.setRotationPoint(3.5F, -3.0F, -2.0F);
        this.LeftArm1.addBox(-0.5F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(LeftArm1, 0.5235987755982988F, -0.08726646259971647F, -0.4363323129985824F);
        this.LeftLeg1 = new RendererModel(this, 51, 15);
        this.LeftLeg1.mirror = true;
        this.LeftLeg1.setRotationPoint(2.0F, 5.5F, 0.0F);
        this.LeftLeg1.addBox(-1.5F, 0.0F, -2.0F, 3, 10, 3, 0.0F);
        this.setRotateAngle(LeftLeg1, -0.7853981633974483F, -0.2617993877991494F, 0.0F);
        this.Cloud2 = new RendererModel(this, 0, 18);
        this.Cloud2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cloud2.addBox(0.0F, -4.0F, 1.0F, 7, 4, 4, 0.0F);
        this.Head3 = new RendererModel(this, 0, 46);
        this.Head3.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.Head3.addBox(-4.0F, 0.0F, -2.0F, 8, 2, 2, 0.0F);
        this.setRotateAngle(Head3, 0.04363323129985824F, 0.0F, 0.0F);
        this.Cloud1 = new RendererModel(this, 0, 26);
        this.Cloud1.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.Cloud1.addBox(-5.0F, -5.0F, -4.0F, 10, 4, 8, 0.0F);
        this.Body1 = new RendererModel(this, 44, 46);
        this.Body1.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.Body1.addBox(-3.0F, -3.0F, -4.0F, 6, 3, 4, 0.0F);
        this.Cloud6 = new RendererModel(this, 22, 18);
        this.Cloud6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cloud6.addBox(1.0F, -1.0F, 2.0F, 5, 3, 5, 0.0F);
        this.NoseHole = new RendererModel(this, 32, 60);
        this.NoseHole.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NoseHole.addBox(-1.0F, -3.0F, -4.0F, 2, 1, 1, 0.0F);
        this.Cloud3 = new RendererModel(this, 0, 6);
        this.Cloud3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cloud3.addBox(-6.0F, -3.0F, -2.0F, 5, 4, 8, 0.0F);
        this.Head1 = new RendererModel(this, 0, 50);
        this.Head1.setRotationPoint(0.0F, -3.0F, -2.0F);
        this.Head1.addBox(-4.0F, -8.0F, -4.0F, 8, 6, 8, 0.0F);
        this.setRotateAngle(Head1, 0.0F, 0.0F, -0.17453292519943295F);
        this.RightEyeHole = new RendererModel(this, 32, 62);
        this.RightEyeHole.mirror = true;
        this.RightEyeHole.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightEyeHole.addBox(1.0F, -4.0F, -4.0F, 3, 1, 1, 0.0F);
        this.LeftEyeHole = new RendererModel(this, 32, 62);
        this.LeftEyeHole.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftEyeHole.addBox(-4.0F, -4.0F, -4.0F, 3, 1, 1, 0.0F);
        this.Cloud5 = new RendererModel(this, 26, 9);
        this.Cloud5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cloud5.addBox(0.0F, -6.0F, -5.0F, 8, 3, 6, 0.0F);
        this.Cloud4 = new RendererModel(this, 28, 0);
        this.Cloud4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cloud4.addBox(-4.0F, -2.0F, -6.0F, 6, 2, 7, 0.0F);
        this.RightArm2 = new RendererModel(this, 42, 28);
        this.RightArm2.setRotationPoint(-0.5F, 7.0F, 0.0F);
        this.RightArm2.addBox(-1.0F, 1.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(RightArm2, -1.5707963267948966F, 0.0F, 0.0F);
        this.LeftLeg2 = new RendererModel(this, 51, 28);
        this.LeftLeg2.mirror = true;
        this.LeftLeg2.setRotationPoint(0.0F, 8.5F, -0.5F);
        this.LeftLeg2.addBox(-1.5F, 1.5F, -1.5F, 3, 8, 3, 0.0F);
        this.setRotateAngle(LeftLeg2, 1.5707963267948966F, 0.0F, 0.0F);
        this.RightLeg1.addChild(this.RightLeg2);
        this.Head3.addChild(this.Head2);
        this.Body1.addChild(this.RightArm1);
        this.LeftArm1.addChild(this.LeftArm2);
        this.Body1.addChild(this.LeftArm1);
        this.Cloud1.addChild(this.Cloud2);
        this.Head1.addChild(this.Head3);
        this.Cloud1.addChild(this.Cloud6);
        this.Head1.addChild(this.NoseHole);
        this.Cloud1.addChild(this.Cloud3);
        this.Body1.addChild(this.Head1);
        this.Head1.addChild(this.RightEyeHole);
        this.Head1.addChild(this.LeftEyeHole);
        this.Cloud1.addChild(this.Cloud5);
        this.Cloud1.addChild(this.Cloud4);
        this.RightArm1.addChild(this.RightArm2);
        this.LeftLeg1.addChild(this.LeftLeg2);
    }

    @Override
    public void render(EntityGaznowel entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.RightLeg1.render(f5);
        this.Body2.render(f5);
        this.LeftLeg1.render(f5);
        this.Cloud1.render(f5);
        this.Body1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    private float[] cloudBasePositionX = new float[7];
    private float[] cloudBasePositionY = new float[7];
    private float[] cloudBasePositionZ = new float[7];

    private void initCloudsInPlace() {
        for(int x=1;x<=6;x++){
            cloudBasePositionX[x]=0;
            cloudBasePositionY[x]=0;
            cloudBasePositionZ[x]=0;
        }
    }
        private void setCloudsInPlace(Entity entity, double dX, double dY, double dZ){
        for(int x=1;x<=6;x++){
            cloudBasePositionX[x]=(float)dX-(float)entity.posX;
            cloudBasePositionY[x]=(float)dY-(float)entity.posY;
            cloudBasePositionZ[x]=(float)dZ-(float)entity.posZ;
        }
    }

    FunctionHelper helper = Kathairis.getHelper();
    float distanceFromCenterMultiplier=0.05f;

    @Override
    public void setRotationAngles(EntityGaznowel entity, float limbSwing, float limbSwingAmount, float age, float f3, float f4, float f5 ) {
        super.setRotationAngles(entity, limbSwing, limbSwingAmount, age, f3, f4, f5);
        initCloudsInPlace();
        //clouds
        Cloud1.offsetX=cloudBasePositionX[1]+ MathHelper.sin(age*0.05f)*distanceFromCenterMultiplier;
        Cloud1.offsetY=cloudBasePositionY[1]- MathHelper.cos(age*0.05f)*distanceFromCenterMultiplier;
        Cloud1.offsetZ=cloudBasePositionZ[1];
        Cloud2.offsetX=cloudBasePositionX[2]+ MathHelper.sin(age*0.005f)*distanceFromCenterMultiplier;
        Cloud2.offsetZ=cloudBasePositionY[2]- MathHelper.sin(age*0.005f)*distanceFromCenterMultiplier;
        Cloud2.offsetZ=cloudBasePositionZ[2];
        Cloud3.offsetX=cloudBasePositionX[3]+ MathHelper.sin(age*0.018f)*distanceFromCenterMultiplier;
        Cloud3.offsetZ=cloudBasePositionY[3]- MathHelper.sin(age*0.012f)*distanceFromCenterMultiplier;
        Cloud3.offsetZ=cloudBasePositionZ[3];
        Cloud4.offsetX=cloudBasePositionX[4]+ MathHelper.sin(age*0.016f)*distanceFromCenterMultiplier;
        Cloud4.offsetZ=cloudBasePositionY[4]- MathHelper.sin(age*0.013f)*distanceFromCenterMultiplier;
        Cloud4.offsetZ=cloudBasePositionZ[4];
        Cloud5.offsetX=cloudBasePositionX[5]+ MathHelper.sin(age*0.015f)*distanceFromCenterMultiplier;
        Cloud5.offsetZ=cloudBasePositionY[5]- MathHelper.sin(age*0.015f)*distanceFromCenterMultiplier;
        Cloud5.offsetZ=cloudBasePositionZ[5];
        Cloud6.offsetX=cloudBasePositionX[6]+ MathHelper.sin(age*0.012f)*distanceFromCenterMultiplier;
        Cloud6.offsetZ=cloudBasePositionY[6]- MathHelper.sin(age*0.08f)*distanceFromCenterMultiplier;
        Cloud6.offsetZ=cloudBasePositionZ[6];


            if(entity.getAttackTarget()!=null){
                RightArm1.rotateAngleX=helper.degToRad(-52.35f);
                RightArm1.rotateAngleY=helper.degToRad(-17.84f);
                RightArm1.rotateAngleZ=helper.degToRad(25f);
                RightArm2.rotateAngleX=helper.degToRad(-33.25f);
                RightArm2.rotateAngleY=helper.degToRad(0f);
                RightArm2.rotateAngleZ=helper.degToRad(0f);

                LeftArm1.rotateAngleX=helper.degToRad(-53.05f);
                LeftArm1.rotateAngleY=helper.degToRad(30.99f);
                LeftArm1.rotateAngleZ=helper.degToRad(-29.84f);
                LeftArm2.rotateAngleX=helper.degToRad(-34.64f);
                LeftArm2.rotateAngleY=helper.degToRad(0f);
                LeftArm2.rotateAngleZ=helper.degToRad(-2.08f);
            }else{
                //upper arms
                RightArm1.rotateAngleY=helper.degToRad(5)+ MathHelper.cos(age*0.065f)*0.075f;
                RightArm1.rotateAngleX=helper.degToRad(30)+ MathHelper.sin(age*0.065f)*0.075f;
                LeftArm1.rotateAngleY=helper.degToRad(-5)+ MathHelper.cos(age*0.065f)*0.075f;
                LeftArm1.rotateAngleX=helper.degToRad(30)- MathHelper.sin(age*0.065f)*0.075f;

                //lower arms
                RightArm2.rotateAngleX=helper.degToRad(-90)+ MathHelper.sin(age*0.065f)*0.05f;
                LeftArm2.rotateAngleX=helper.degToRad(-90)+ MathHelper.sin(age*0.065f)*0.05f;
            }

        //jaw and head
        Head2.rotateAngleX=helper.degToRad(2.5F)+ MathHelper.sin(age*0.050f)*0.03f;
        Head1.rotateAngleX= MathHelper.sin(age*0.050f)*0.03f;

        //body
        Body1.rotateAngleX=helper.degToRad(10f)+ MathHelper.sin(age*0.050f)*0.08f;
        Body1.offsetY= MathHelper.clamp(MathHelper.sin(age*0.050f)*0.04f,0.055f,0.20f);
        Body2.rotateAngleX= MathHelper.sin(age*0.05f)*0.02f;

        // legs
        RightLeg1.rotateAngleY=helper.degToRad(15f)- MathHelper.sin(age*0.05f)*0.05f;
        LeftLeg1.rotateAngleY=helper.degToRad(-15f)- MathHelper.sin(age*0.05f)*0.05f;
        RightLeg1.rotateAngleX=helper.degToRad(-45f)- MathHelper.sin(age*0.05f+50)*0.03f;
        LeftLeg1.rotateAngleX=helper.degToRad(-45f)- MathHelper.sin(age*0.05f+50)*0.03f;
        RightLeg1.rotateAngleZ=-MathHelper.sin(age*0.05f)*0.02f;
        LeftLeg1.rotateAngleZ=-MathHelper.sin(age*0.05f)*0.02f;

        RightLeg2.rotateAngleX=helper.degToRad(90)+ MathHelper.sin(age*0.05f)*0.03f;
        LeftLeg2.rotateAngleX=helper.degToRad(90)- MathHelper.sin(age*0.05f)*0.03f;

    }

    public void postRenderArm(float scale, HandSide side)
    {
        this.getArmForSide(side).postRender(scale);
    }

    protected RendererModel getArmForSide(HandSide side)
    {
        return side == HandSide.LEFT ? this.LeftArm1 : this.RightArm1;
    }

}
