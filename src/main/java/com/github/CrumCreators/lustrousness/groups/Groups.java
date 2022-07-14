package com.github.CrumCreators.lustrousness.groups;

import com.github.CrumCreators.lustrousness.item.Parts;
import eu.pb4.polymer.api.item.PolymerItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.github.CrumCreators.lustrousness.Main.modid;

public class Groups {
    public static final PolymerItemGroup WTOOLS_GROUP = PolymerItemGroup.create(new Identifier(modid, "wanderlust_tools_group"), Text.literal("Wanderlust Tools")).setIcon(() -> new ItemStack(Parts.AXE_HEAD_STENCIL));
    public static final PolymerItemGroup WARMOR_GROUP = PolymerItemGroup.create(new Identifier(modid, "wanderlust_armor_group"), Text.literal("Wanderlust Armor")).setIcon(() -> new ItemStack(Items.DIAMOND_CHESTPLATE));
    public static final PolymerItemGroup WATTRIBUTES_GROUP = PolymerItemGroup.create(new Identifier(modid, "wanderlust_attributes_group"), Text.literal("Wanderlust Attributes")).setIcon(() -> new ItemStack(Items.ENCHANTED_BOOK));
}
