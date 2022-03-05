package net.dakotapride.bra_of_holding.item.group;

import net.dakotapride.bra_of_holding.item.BraOfHoldingItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;

public class BraOfHoldingItemGroup {

    public static final ItemGroup BraOfHoldingItemGroup = FabricItemGroupBuilder.create(
                    new Identifier("braofholding", "bra_of_holding"))
            .icon(() -> new ItemStack(BraOfHoldingItems.BRA_OF_HOLDING))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(BraOfHoldingItems.BRA_OF_HOLDING));
                stacks.add(new ItemStack(BraOfHoldingItems.BRA_OF_DYSPHORIA));
            })
            .build();

}
