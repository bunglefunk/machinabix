
package net.mcreator.machinabix.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.machinabix.itemgroup.ResourcesItemGroup;
import net.mcreator.machinabix.MachinabixModElements;

@MachinabixModElements.ModElement.Tag
public class OnyxShardItem extends MachinabixModElements.ModElement {
	@ObjectHolder("machinabix:onyx_shard")
	public static final Item block = null;
	public OnyxShardItem(MachinabixModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ResourcesItemGroup.tab).maxStackSize(64));
			setRegistryName("onyx_shard");
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
