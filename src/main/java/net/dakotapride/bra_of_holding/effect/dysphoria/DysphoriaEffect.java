package net.dakotapride.bra_of_holding.effect.dysphoria;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class DysphoriaEffect extends StatusEffect {
    public DysphoriaEffect() {
        super(StatusEffectCategory.HARMFUL,
                0xBC5E5E);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }


    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).animateDamage();
        }
        super.applyUpdateEffect(entity, amplifier);
    }
}