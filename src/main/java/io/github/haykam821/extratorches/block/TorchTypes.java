package io.github.haykam821.extratorches.block;

import io.github.haykam821.extratorches.Main;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public enum TorchTypes {
	STONE_TORCH("stone");

	public final TorchBlock standingBlock;
	public final WallTorchBlock wallBlock;
	public final BlockItem item;

	private TorchTypes(String type, int lightLevel) {
		Identifier id = new Identifier(Main.MOD_ID, type + "_torch");
		Identifier wallId = new Identifier(Main.MOD_ID, type + "_wall_torch");

		this.standingBlock = new ExtraTorchBlock(lightLevel);
		this.wallBlock = new ExtraWallTorchBlock(lightLevel, this.standingBlock);

		Item.Settings itemSettings = new Item.Settings().group(ItemGroup.DECORATIONS);
		this.item = new WallStandingBlockItem(this.standingBlock, this.wallBlock, itemSettings);

		Registry.register(Registry.BLOCK, id, this.standingBlock);
		Registry.register(Registry.BLOCK, wallId, this.wallBlock);
		Registry.register(Registry.ITEM, id, this.item);
	}

	private TorchTypes(String type) {
		this(type, 14);
	}

	public static TorchTypes initialize() {
		return null;
	}
}