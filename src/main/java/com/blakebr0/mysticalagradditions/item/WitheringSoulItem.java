package com.blakebr0.mysticalagradditions.item;

import com.blakebr0.cucumber.item.BaseItem;
import com.blakebr0.mysticalagradditions.config.ModConfigs;
import com.blakebr0.mysticalagradditions.lib.ModTooltips;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class WitheringSoulItem extends BaseItem {
    public WitheringSoulItem() {
        super();
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> tooltip, TooltipFlag flag) {
        var chance = ModConfigs.WITHERING_SOUL_DROP_CHANCE.get();

        tooltip.add(ModTooltips.DROP_CHANCE.args(chance * 100 + "%").build());
    }
}
