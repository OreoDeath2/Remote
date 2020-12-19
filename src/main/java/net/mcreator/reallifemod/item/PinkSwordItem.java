
package net.mcreator.reallifemod.item;

@RealLifeModModElements.ModElement.Tag
public class PinkSwordItem extends RealLifeModModElements.ModElement {

	@ObjectHolder("real_life_mod:pink_sword")
	public static final Item block = null;

	public PinkSwordItem(RealLifeModModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("pink_sword"));
	}

}
