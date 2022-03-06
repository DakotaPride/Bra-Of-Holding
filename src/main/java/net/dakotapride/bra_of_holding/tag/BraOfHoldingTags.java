package net.dakotapride.bra_of_holding.tag;

import net.dakotapride.bra_of_holding.BraOfHolding;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

import static net.dakotapride.bra_of_holding.tag.BraOfHoldingTags.Items.DYSPHORIC;
import static net.dakotapride.bra_of_holding.tag.BraOfHoldingTags.Items.EUPHORIC;

public class BraOfHoldingTags {

    public static void registerBraOfHoldingTags() {
        Tag.Identified<Item> dysphoric = DYSPHORIC;
        Tag.Identified<Item> euphoric = EUPHORIC;
    }

    public static class Items {

        public static final Tag.Identified<Item> DYSPHORIC = createCommonTag("dysphoric");
        public static final Tag.Identified<Item> EUPHORIC = createCommonTag("euphoric");

        private static Tag.Identified<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }
    }

}
