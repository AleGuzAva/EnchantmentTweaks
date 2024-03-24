package EnchantmentTweaks.mixins;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.InfinityEnchantment;
import net.minecraft.enchantment.MendingEnchantment;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(InfinityEnchantment.class)
public class MixinInfinityEnchantment extends Enchantment {

    public MixinInfinityEnchantment() {
        super(null, null, null);
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return other instanceof MendingEnchantment || super.canAccept(other);
    }
}
