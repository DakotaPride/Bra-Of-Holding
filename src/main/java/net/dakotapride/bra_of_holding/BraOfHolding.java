package net.dakotapride.bra_of_holding;

import net.dakotapride.bra_of_holding.effect.BraOfHoldingEffects;
import net.dakotapride.bra_of_holding.item.BraOfHoldingItems;
import net.dakotapride.bra_of_holding.item.painting.BraOfHoldingPaintings;
import net.dakotapride.bra_of_holding.tag.BraOfHoldingTags;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BraOfHolding implements ModInitializer {
	public static final String MOD_ID = "braofholding";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		// Status Effects
		BraOfHoldingEffects.registerBraOfHoldingStatusEffects();

		// Items
		BraOfHoldingItems.registerBraOfHoldingItems();
		// Paintings
		BraOfHoldingPaintings.registerBraOfHoldingPaintings();

		// Tags
		BraOfHoldingTags.registerBraOfHoldingTags();

	}
}
