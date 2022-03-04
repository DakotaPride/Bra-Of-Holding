package net.dakotapride.bra_of_holding;

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


	// Status Effects
	public static final StatusEffect EUPHORIA = new EuphoriaEffect();
	public static final StatusEffect DYSPHORIA = new DysphoriaEffect();

	@Override
	public void onInitialize() {

		// Status Effects
		Registry.register(Registry.STATUS_EFFECT, new Identifier("braofholding", "euphoria"), EUPHORIA);
		Registry.register(Registry.STATUS_EFFECT, new Identifier("braofholding", "dysphoria"), DYSPHORIA);

		// Items
		BraOfHoldingItems.registerBraOfHoldingItems();

	}
}
