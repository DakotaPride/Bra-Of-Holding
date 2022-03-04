package net.dakotapride.bra_of_holding.effect.dysphoria;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class DysphoriaEffect extends StatusEffect {
    public DysphoriaEffect() {
        super(StatusEffectCategory.HARMFUL,
                0xBC5E5E);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}