
package net.mcreator.reallifemod.block;

import net.minecraft.block.material.Material;

@RealLifeModModElements.ModElement.Tag
public class OrangeLeafBlock extends RealLifeModModElements.ModElement {

	@ObjectHolder("real_life_mod:orange_leaf")
	public static final Block block = null;

	public OrangeLeafBlock(RealLifeModModElements instance) {
		super(instance, 14);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(1f, 10f).lightValue(0));

			setRegistryName("orange_leaf");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
