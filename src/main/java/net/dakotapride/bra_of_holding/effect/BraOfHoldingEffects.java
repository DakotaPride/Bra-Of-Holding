package net.dakotapride.bra_of_holding.effect;

import net.dakotapride.bra_of_holding.effect.dysphoria.DysphoriaEffect;
import net.dakotapride.bra_of_holding.effect.euphoria.EuphoriaEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BraOfHoldingEffects {

    public static final StatusEffect EUPHORIA = new EuphoriaEffect();
    public static final StatusEffect DYSPHORIA = new DysphoriaEffect();

    public static void BraOfHoldingStatusEffects() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier("braofholding", "euphoria"), EUPHORIA);
        Registry.register(Registry.STATUS_EFFECT, new Identifier("braofholding", "dysphoria"), DYSPHORIA);
    }

}
