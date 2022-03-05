package net.dakotapride.bra_of_holding.item;

import net.dakotapride.bra_of_holding.BraOfHolding;
import net.dakotapride.bra_of_holding.item.armor.BraOfHoldingArmorMaterials;
import net.dakotapride.bra_of_holding.item.armor.bra_of_dysphoria.BraOfDysphoriaItem;
import net.dakotapride.bra_of_holding.item.armor.bra_of_holding.BraOfHoldingItem;
import net.dakotapride.bra_of_holding.item.group.BraOfHoldingItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BraOfHoldingItems {

    public static final Item BRA_OF_HOLDING = registerItem("bra_of_holding",
            new BraOfHoldingItem(BraOfHoldingArmorMaterials.BRA_OF_HOLDING, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(BraOfHoldingItemGroup.BraOfHoldingItemGroup)));

    public static final Item BRA_OF_DYSPHORIA = registerItem("bra_of_dysphoria",
            new BraOfDysphoriaItem(BraOfHoldingArmorMaterials.BRA_OF_DYSPHORIA, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(BraOfHoldingItemGroup.BraOfHoldingItemGroup)));


    private static Item registerItem (String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BraOfHolding.MOD_ID, name), item);
    }

    public static void registerBraOfHoldingItems() {
        BraOfHolding.LOGGER.info("Registering Mod Items for " + BraOfHolding.MOD_ID);
    }
}
