package benji.fruittrees.item;

import benji.fruittrees.util.ModTags;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class ModToolMaterials {
    // Tool Materials
    public static final ToolMaterial MANGO_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2048,
            12.0f,
            3.0f,
            22,
            ModTags.Items.REPAIRS_MANGO_ARMOR
    );
    public static final ToolMaterial POMEGRANATE_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2048,
            12.0f,
            3.0f,
            22,
            ModTags.Items.REPAIRS_POMEGRANATE_ARMOR
    );
    public static final ToolMaterial PINEAPPLE_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2048,
            12.0f,
            3.0f,
            22,
            ModTags.Items.REPAIRS_PINEAPPLE_ARMOR
    );
}
