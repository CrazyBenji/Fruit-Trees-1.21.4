package benji.fruittrees;

import benji.fruittrees.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FruitTrees implements ModInitializer {
	public static final String MOD_ID = "fruittrees";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModBlocks.initialize();
		ModWorldGeneration.generateModWorldGen();
	}
}