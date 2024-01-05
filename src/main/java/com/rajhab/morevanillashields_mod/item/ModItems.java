package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.config.ShieldConfig;
import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AnvilBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, morevanillashields.MOD_ID);

    //Shield
    public static final RegistryObject<Item> LEATHER_SHIELD = ITEMS.register("leather_shield",
            () -> new ShieldItem(new Item.Properties().durability(196)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.leather_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });



    public static final RegistryObject<Item> GOLD_SHIELD = ITEMS.register("gold_shield",
            () -> new ShieldItem(new Item.Properties().durability(322)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.gold_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield",
            () -> new ShieldItem(new Item.Properties().durability(ShieldConfig.diamond_shield_durability.getDefault()))

    {

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.diamond_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> GLASS_SHIELD = ITEMS.register("glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.glass_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> TINTED_GLASS_SHIELD = ITEMS.register("tinted_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.tinted_glass_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> NETHERITE_SHIELD = ITEMS.register("netherite_shield",
            () -> new ShieldItem(new Item.Properties().durability(2042)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.netherite_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }

                @Override
                public boolean isFireResistant() {
                    return true;
                }
            });

    /*public static final RegistryObject<Item> REDSTONE_SHIELD = ITEMS.register("redstone_shield",
            () -> new ShieldItem(new Item.Properties().durability(316)));*/

    public static final RegistryObject<Item> EMERALD_SHIELD = ITEMS.register("emerald_shield",
            () -> new ShieldItem(new Item.Properties().durability(512)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.emerald_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> AMETHYST_SHIELD = ITEMS.register("amethyst_shield",
            () -> new ShieldItem(new Item.Properties().durability(432)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.amethyst_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> OBSIDIAN_SHIELD = ITEMS.register("obsidian_shield",
            () -> new ShieldItem(new Item.Properties().durability(610)){

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.obsidian_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> COAL_SHIELD = ITEMS.register("coal_shield",
            () -> new ShieldItem(new Item.Properties().durability(268)) {
                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 2400;
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.coal_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> END_CRYSTAL_SHIELD = ITEMS.register("end_crystal_shield",
            () -> new ShieldItem(new Item.Properties().durability(750)) {

                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.end_crystal_shield").withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }


            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
