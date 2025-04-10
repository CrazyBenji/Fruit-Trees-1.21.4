package benji.fruittrees.block.entity;

import benji.fruittrees.FruitTrees;
import benji.fruittrees.ModBlocks;
import benji.fruittrees.block.custom.FruitSnackCrafterBlock;
import benji.fruittrees.block.entity.custom.FruitSnackCrafterBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class MobBlockEntities {
    public static final BlockEntityType<FruitSnackCrafterBlockEntity> FRUIT_SNACK_CRAFTER_BE =
            register("fruit_snack_crafter_be", FruitSnackCrafterBlock::new, ModBlocks.FRUIT_SNACK_CRAFTER);


    private static <T extends BlockEntity> BlockEntityType<T> register(
            String name,
            FabricBlockEntityTypeBuilder.Factory<? extends T> entityFactory,
            Block... blocks
    ) {
        Identifier id = Identifier.of(FruitTrees.MOD_ID, name);
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, id, FabricBlockEntityTypeBuilder.<T>create(entityFactory, blocks).build());
    }

    public static void registerBlockEntities() {
        FruitTrees.LOGGER.info("Registering Block Entities for " + FruitTrees.MOD_ID);
    }
}
