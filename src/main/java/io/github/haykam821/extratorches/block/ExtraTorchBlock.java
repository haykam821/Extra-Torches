package io.github.haykam821.extratorches.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.TorchBlock;

public class ExtraTorchBlock extends TorchBlock {
	public ExtraTorchBlock(int lightLevel) {
		super(FabricBlockSettings.copyOf(Blocks.TORCH).lightLevel(lightLevel));
	}
}