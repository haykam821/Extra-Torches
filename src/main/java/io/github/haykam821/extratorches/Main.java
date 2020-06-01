package io.github.haykam821.extratorches;

import io.github.haykam821.extratorches.block.TorchTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	public static final String MOD_ID = "extratorches";

	private static final Identifier STONE_ROD_ID = new Identifier(MOD_ID, "stone_rod");
	public static final Item STONE_ROD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, STONE_ROD_ID, STONE_ROD);
		TorchTypes.initialize();
	}
}