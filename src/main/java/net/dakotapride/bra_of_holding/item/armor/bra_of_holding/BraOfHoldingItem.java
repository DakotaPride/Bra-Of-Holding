package net.dakotapride.bra_of_holding.item.armor.bra_of_holding;

import com.google.common.collect.ImmutableMap;
import net.dakotapride.bra_of_holding.BraOfHolding;
import net.dakotapride.bra_of_holding.effect.BraOfHoldingEffects;
import net.dakotapride.bra_of_holding.item.armor.BraOfHoldingArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Map;

public class BraOfHoldingItem extends ArmorItem {
    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())
                    .put(BraOfHoldingArmorMaterials.BRA_OF_HOLDING,
                            new StatusEffectInstance(BraOfHoldingEffects.EUPHORIA, 100, 0)).build();

    public BraOfHoldingItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()) {
            if(entity instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity)entity;

                if(hasFullSuitOfArmorOn(player)) {
                    evaluateArmorEffects(player);
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            StatusEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, ArmorMaterial mapArmorMaterial, StatusEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasStatusEffect(mapStatusEffect.getEffectType());

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addStatusEffect(new StatusEffectInstance(mapStatusEffect.getEffectType(),
                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));

            // if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
            //     player.getInventory().damageArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
            // }
        }
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack breastplate = player.getInventory().getArmorStack(2);

        return !breastplate.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());

        return breastplate.getMaterial() == material;
    }
}