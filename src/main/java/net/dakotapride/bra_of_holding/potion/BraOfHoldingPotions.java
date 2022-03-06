package net.dakotapride.bra_of_holding.potion;

import net.dakotapride.bra_of_holding.BraOfHolding;
import net.dakotapride.bra_of_holding.effect.BraOfHoldingEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.registry.Registry;

public class BraOfHoldingPotions {
    public static final Potion EUPHORIA = register
            ("euphoria", new Potion(new StatusEffectInstance[] { new StatusEffectInstance(BraOfHoldingEffects.EUPHORIA, 3600) })),
            LONG_EUPHORIA = register
                    ("long_euphoria", new Potion("euphoria", new StatusEffectInstance[] { new StatusEffectInstance(BraOfHoldingEffects.EUPHORIA, 9600) })),
            STRONG_EUPHORIA = register
                    ("strong_euphoria", new Potion("euphoria", new StatusEffectInstance[] { new StatusEffectInstance(BraOfHoldingEffects.EUPHORIA, 1800, 1) })),
            DYSPHORIA = register
                    ("dysphoria", new Potion(new StatusEffectInstance[] { new StatusEffectInstance(BraOfHoldingEffects.DYSPHORIA, 3600) })),
            LONG_DYSPHORIA = register
                    ("long_dysphoria", new Potion("dysphoria", new StatusEffectInstance[] { new StatusEffectInstance(BraOfHoldingEffects.DYSPHORIA, 9600) })),
            STRONG_DYSPHORIA = register
                    ("strong_dysphoria", new Potion("dysphoria", new StatusEffectInstance[] { new StatusEffectInstance(BraOfHoldingEffects.DYSPHORIA, 1800, 1) }));




    private static Potion register(String name, Potion potion) {
        return Registry.<Potion>register(Registry.POTION, name, potion);
    }

    public static void registerBraOfHoldingPotions() {
        BraOfHolding.LOGGER.info("Registering Mod Potions for " + BraOfHolding.MOD_ID);
    }
}
