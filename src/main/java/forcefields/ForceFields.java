package forcefields;

import net.fabricmc.api.ModInitializer;

import forcefields.setup.*;

public class ForceFields implements ModInitializer {
	@Override
	public void onInitialize() {
		ModBlocks.init();
	}
}