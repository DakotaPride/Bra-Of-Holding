package net.dakotapride.bra_of_holding;

import net.dakotapride.bra_of_holding.effect.BraOfHoldingEffects;
import net.dakotapride.bra_of_holding.effect.dysphoria.DysphoriaEffect;
import net.dakotapride.bra_of_holding.effect.euphoria.EuphoriaEffect;
import net.dakotapride.bra_of_holding.item.BraOfHoldingItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BraOfHolding implements ModInitializer {
	public static final String MOD_ID = "braofholding";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		// Status Effects
		BraOfHoldingEffects.BraOfHoldingStatusEffects();

		// Items
		BraOfHoldingItems.registerBraOfHoldingItems();

	}
}
