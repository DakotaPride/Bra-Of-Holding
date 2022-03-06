package net.dakotapride.bra_of_holding.potion;

import net.dakotapride.bra_of_holding.BraOfHolding;
import net.dakotapride.bra_of_holding.effect.BraOfHoldingEffects;
import net.dakotapride.bra_of_holding.mixin.BrewingRecipeRegistryMixin;
import net.dakotapride.bra_of_holding.tag.BraOfHoldingTags;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BraOfHoldingPotions {
    public static Potion EUPHORIA_POTION;
    public static Potion DYSPHORIA_POTION;

    public static Potion registerEuphoriaPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(BraOfHolding.MOD_ID, name),
                new Potion(new StatusEffectInstance(BraOfHoldingEffects.EUPHORIA, 200, 0)));
    }

    public static Potion registerDysphoriaPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(BraOfHolding.MOD_ID, name),
                new Potion(new StatusEffectInstance(BraOfHoldingEffects.DYSPHORIA, 200, 0)));
    }

    public static void registerBraOfHoldingPotions() {
        EUPHORIA_POTION = registerEuphoriaPotion("euphoria_potion");
        DYSPHORIA_POTION = registerDysphoriaPotion("dysphoria_potion");


        registerBraOfHoldingPotionRecipes();
    }

    public static void registerBraOfHoldingPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.DANDELION,
                BraOfHoldingPotions.EUPHORIA_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.ROTTEN_FLESH,
                BraOfHoldingPotions.DYSPHORIA_POTION);
    }
}
