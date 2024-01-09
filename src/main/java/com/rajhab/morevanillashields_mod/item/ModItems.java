package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.ShieldConfig;
import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
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
            () -> new ShieldItem(new Item.Properties().defaultDurability(196)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.LEATHER_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.leather_shield").append(String.valueOf(ShieldConfig.LEATHER_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });



    public static final RegistryObject<Item> GOLD_SHIELD = ITEMS.register("gold_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(322)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.GOLD_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.gold_shield").append(String.valueOf(ShieldConfig.GOLD_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(512)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.DIAMOND_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.diamond_shield").append(String.valueOf(ShieldConfig.DIAMOND_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> GLASS_SHIELD = ITEMS.register("glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.glass_shield").append(String.valueOf(ShieldConfig.GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> TINTED_GLASS_SHIELD = ITEMS.register("tinted_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.TINTED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.tinted_glass_shield").append(String.valueOf(ShieldConfig.TINTED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> NETHERITE_SHIELD = ITEMS.register("netherite_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(2042)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.NETHERITE_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.netherite_shield").append(String.valueOf(ShieldConfig.NETHERITE_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
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

    public static final RegistryObject<Item> EMERALD_SHIELD = ITEMS.register("emerald_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(512)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.EMERALD_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.emerald_shield").append(String.valueOf(ShieldConfig.EMERALD_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> AMETHYST_SHIELD = ITEMS.register("amethyst_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(432)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.AMETHYST_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.amethyst_shield").append(String.valueOf(ShieldConfig.AMETHYST_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> OBSIDIAN_SHIELD = ITEMS.register("obsidian_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(610)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.OBSIDIAN_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.obsidian_shield").append(String.valueOf(ShieldConfig.OBSIDIAN_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> COAL_SHIELD = ITEMS.register("coal_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(268)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.COAL_SHIELD_DURABILITY.get();
                }

                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 2400;
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.coal_shield").append(String.valueOf(ShieldConfig.COAL_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                    } else {
                        components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                    }

                    super.appendHoverText(stack, level, components, flag);
                }
            });

    public static final RegistryObject<Item> END_CRYSTAL_SHIELD = ITEMS.register("end_crystal_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(750)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.END_CRYSTAL_SHIELD_DURABILITY.get();
                }

                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (Screen.hasShiftDown()) {
                        components.add(Component.translatable("item.moditems.end_crystal_shield").append(String.valueOf(ShieldConfig.END_CRYSTAL_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
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
