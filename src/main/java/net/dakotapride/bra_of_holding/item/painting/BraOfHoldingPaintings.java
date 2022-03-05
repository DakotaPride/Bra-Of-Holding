package net.dakotapride.bra_of_holding.item.painting;

import net.dakotapride.bra_of_holding.BraOfHolding;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BraOfHoldingPaintings {

    public static final PaintingMotive TRANSGENDER = registerPainting("transgender", new PaintingMotive(16, 16));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(BraOfHolding.MOD_ID, name), paintingMotive);
    }

    public static void registerBraOfHoldingPaintings() {
        System.out.println("Registering Paintings for " + BraOfHolding.MOD_ID);
    }
}
