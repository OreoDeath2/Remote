
package net.mcreator.reallifemod.item;

@RealLifeModModElements.ModElement.Tag
public class StickpinkItem extends RealLifeModModElements.ModElement {

	@ObjectHolder("real_life_mod:stickpink")
	public static final Item block = null;

	public StickpinkItem(RealLifeModModElements instance) {
		super(instance, 16);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("stickpink");
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
