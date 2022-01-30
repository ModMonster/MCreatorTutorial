
package com.modmonster.tutorialmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.modmonster.tutorialmod.TutorialmodModElements;

@TutorialmodModElements.ModElement.Tag
public class ArdaniumPickaxeItem extends TutorialmodModElements.ModElement {
	@ObjectHolder("tutorialmod:ardanium_pickaxe")
	public static final Item block = null;

	public ArdaniumPickaxeItem(TutorialmodModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 400;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 16;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ArdaniumIngotItem.block));
			}
		}, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ardanium_pickaxe"));
	}
}
