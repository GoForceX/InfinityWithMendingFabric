package cn.irchat.infwithmend.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.InfinityEnchantment;
import net.minecraft.entity.EquipmentSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(InfinityEnchantment.class)
public class InfinityEnchantmentMixin extends Enchantment {
	public InfinityEnchantmentMixin(Enchantment.Rarity weight, EquipmentSlot... slotTypes) {
		super(weight, EnchantmentTarget.BOW, slotTypes);
	}

	/**
	 * @author GoForceX
	 * @reason Make infinity enchantment work with mending.
	 */
	@Overwrite
	public boolean canAccept(Enchantment other) {
		return this != other;
	}
}
