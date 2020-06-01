package io.github.haykam821.extratorches.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallTorchBlock;

public class ExtraWallTorchBlock extends WallTorchBlock {
	public ExtraWallTorchBlock(int lightLevel, Block standingTorch) {
		super(FabricBlockSettings.copyOf(Blocks.WALL_TORCH).lightLevel(lightLevel).dropsLike(standingTorch));
	}
}