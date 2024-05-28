package forcefields.setup;

import forcefields.block.ForceFieldBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModBlocks {
    public static final Block FORCE_FIELD_BLOCK = new ForceFieldBlock(FabricBlockSettings.create().strength(4.0f).requiresTool());

    public static void init() {
        // Force Field Block
        Registry.register(Registries.BLOCK, new Identifier("forcefields", "force_field"), FORCE_FIELD_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("forcefields", "force_field"), new BlockItem(FORCE_FIELD_BLOCK, new Item.Settings()));
    }
}
