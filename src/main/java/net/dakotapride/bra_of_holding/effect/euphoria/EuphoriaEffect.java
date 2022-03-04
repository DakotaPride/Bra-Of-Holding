package net.dakotapride.bra_of_holding.effect.euphoria;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class EuphoriaEffect extends StatusEffect {
    public EuphoriaEffect() {
        super(StatusEffectCategory.BENEFICIAL,
                0x6bc3a9);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
