package com.slasherman.doulacontinent.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent HUOYUHAO_GRILLED_FISH = new FoodComponent.Builder().hunger(8).saturationModifier(1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,1200,1),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,1200,3),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,1200,0),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,1200,1),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,600,3),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 5),1.0F)
            .alwaysEdible()
            .build();
}
