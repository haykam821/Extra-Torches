package io.github.haykam821.extratorches;

import io.github.haykam821.extratorches.block.TorchTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ClientMain implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		RenderLayer torchRenderLayer = RenderLayer.getCutout();

		for (TorchTypes torchType : TorchTypes.values()) {
			BlockRenderLayerMap.INSTANCE.putBlocks(torchRenderLayer, torchType.standingBlock, torchType.wallBlock);
		}
	}
}