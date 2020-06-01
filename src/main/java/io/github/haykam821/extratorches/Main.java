package io.github.haykam821.extratorches;

import io.github.haykam821.extratorches.block.TorchTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	public static final String MOD_ID = "extratorches";

	@Override
	public void onInitialize() {
		TorchTypes.initialize();
	}
}