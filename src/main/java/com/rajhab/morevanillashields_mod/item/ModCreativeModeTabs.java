package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;

@Mod.EventBusSubscriber(modid = morevanillashields.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, morevanillashields.MOD_ID);

    /*public static final RegistryObject<CreativeModeTab> ITEM_GROUP = CREATIVE_MODE_TABS.register("morevanillashields",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_SHIELD.get()))
                    .title(Component.translatable("creativetab.morevanillashields"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.LEATHER_SHIELD.get());
                        pOutput.accept(ModItems.COAL_SHIELD.get());
                        pOutput.accept(ModItems.GOLD_SHIELD.get());
                        //pOutput.accept(ModItems.REDSTONE_SHIELD.get());
                        pOutput.accept(ModItems.EMERALD_SHIELD.get());
                        pOutput.accept(ModItems.AMETHYST_SHIELD.get());
                        pOutput.accept(ModItems.DIAMOND_SHIELD.get());
                        pOutput.accept(ModItems.OBSIDIAN_SHIELD.get());
                        pOutput.accept(ModItems.NETHERITE_SHIELD.get());
                        pOutput.accept(ModItems.END_CRYSTAL_SHIELD.get());

                    })
                    .build()); */

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent pOutput) {

        if(pOutput.getTabKey() == CreativeModeTabs.COMBAT) {

            pOutput.accept(ModItems.LEATHER_SHIELD);
            pOutput.accept(ModItems.COAL_SHIELD);
            pOutput.accept(ModItems.GOLD_SHIELD);
            pOutput.accept(ModItems.EMERALD_SHIELD);
            pOutput.accept(ModItems.AMETHYST_SHIELD);
            pOutput.accept(ModItems.GLASS_SHIELD);
            pOutput.accept(ModItems.TINTED_GLASS_SHIELD);
            pOutput.accept(ModItems.DIAMOND_SHIELD);
            pOutput.accept(ModItems.OBSIDIAN_SHIELD);
            pOutput.accept(ModItems.NETHERITE_SHIELD);
            pOutput.accept(ModItems.END_CRYSTAL_SHIELD);
        }
    }


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}