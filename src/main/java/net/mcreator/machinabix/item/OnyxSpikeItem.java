
package net.mcreator.machinabix.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.machinabix.itemgroup.ToolsItemGroup;
import net.mcreator.machinabix.MachinabixModElements;

@MachinabixModElements.ModElement.Tag
public class OnyxSpikeItem extends MachinabixModElements.ModElement {
	@ObjectHolder("machinabix:onyx_spike")
	public static final Item block = null;
	public OnyxSpikeItem(MachinabixModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ToolsItemGroup.tab).maxStackSize(64));
			setRegistryName("onyx_spike");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
