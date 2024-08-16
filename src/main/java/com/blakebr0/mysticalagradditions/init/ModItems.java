package com.blakebr0.mysticalagradditions.init;

import com.blakebr0.cucumber.item.BaseItem;
import com.blakebr0.mysticalagradditions.MysticalAgradditions;
import com.blakebr0.mysticalagradditions.item.CreativeEssenceItem;
import com.blakebr0.mysticalagradditions.item.EssenceAppleItem;
import com.blakebr0.mysticalagradditions.item.EssenceCoalItem;
import com.blakebr0.mysticalagradditions.item.EssenceItem;
import com.blakebr0.mysticalagradditions.item.EssencePaxelItem;
import com.blakebr0.mysticalagradditions.item.WitheringSoulItem;
import com.blakebr0.mysticalagradditions.lib.ModCropTiers;
import com.blakebr0.mysticalagradditions.lib.ModItemTier;
import com.blakebr0.mysticalagradditions.util.EssenceAppleTier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
	private static final Item.Properties BUCKET_PROPERTIES = new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1);

	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Registries.ITEM, MysticalAgradditions.MOD_ID);

	// register block items here for class load order purposes
	static {
		ModBlocks.BLOCK_ITEMS.forEach(REGISTRY::register);
	}

	public static final DeferredHolder<Item, Item> INSANIUM_ESSENCE = REGISTRY.register("insanium_essence", () -> new EssenceItem(ModCropTiers.SIX));
	public static final DeferredHolder<Item, Item> INSANIUM_INGOT = REGISTRY.register("insanium_ingot", () -> new BaseItem());
	public static final DeferredHolder<Item, Item> INSANIUM_NUGGET = REGISTRY.register("insanium_nugget", () -> new BaseItem());
	public static final DeferredHolder<Item, Item> INSANIUM_GEMSTONE = REGISTRY.register("insanium_gemstone", () -> new BaseItem());
	public static final DeferredHolder<Item, Item> NETHER_STAR_SHARD = REGISTRY.register("nether_star_shard", () -> new BaseItem());
	public static final DeferredHolder<Item, Item> WITHERING_SOUL = REGISTRY.register("withering_soul", WitheringSoulItem::new);
	public static final DeferredHolder<Item, Item> DRAGON_EGG_CHUNK = REGISTRY.register("dragon_egg_chunk", () -> new BaseItem());
	public static final DeferredHolder<Item, Item> DRAGON_SCALE = REGISTRY.register("dragon_scale", () -> new BaseItem());
	public static final DeferredHolder<Item, Item> CREATIVE_ESSENCE = REGISTRY.register("creative_essence", CreativeEssenceItem::new);
	public static final DeferredHolder<Item, Item> INFERIUM_COAL = REGISTRY.register("inferium_coal", () -> new EssenceCoalItem(2400));
	public static final DeferredHolder<Item, Item> PRUDENTIUM_COAL = REGISTRY.register("prudentium_coal", () -> new EssenceCoalItem(4800));
	public static final DeferredHolder<Item, Item> TERTIUM_COAL = REGISTRY.register("tertium_coal", () -> new EssenceCoalItem(9600));
	public static final DeferredHolder<Item, Item> IMPERIUM_COAL = REGISTRY.register("imperium_coal", () -> new EssenceCoalItem(19200));
	public static final DeferredHolder<Item, Item> SUPREMIUM_COAL = REGISTRY.register("supremium_coal", () -> new EssenceCoalItem(38400));
	public static final DeferredHolder<Item, Item> INSANIUM_COAL = REGISTRY.register("insanium_coal", () -> new EssenceCoalItem(76800));
	public static final DeferredHolder<Item, Item> INFERIUM_APPLE = REGISTRY.register("inferium_apple", () -> new EssenceAppleItem(EssenceAppleTier.INFERIUM));
	public static final DeferredHolder<Item, Item> PRUDENTIUM_APPLE = REGISTRY.register("prudentium_apple", () -> new EssenceAppleItem(EssenceAppleTier.PRUDENTIUM));
	public static final DeferredHolder<Item, Item> TERTIUM_APPLE = REGISTRY.register("tertium_apple", () -> new EssenceAppleItem(EssenceAppleTier.TERTIUM));
	public static final DeferredHolder<Item, Item> IMPERIUM_APPLE = REGISTRY.register("imperium_apple", () -> new EssenceAppleItem(EssenceAppleTier.IMPERIUM));
	public static final DeferredHolder<Item, Item> SUPREMIUM_APPLE = REGISTRY.register("supremium_apple", () -> new EssenceAppleItem(EssenceAppleTier.SUPREMIUM));
	public static final DeferredHolder<Item, Item> INSANIUM_APPLE = REGISTRY.register("insanium_apple", () -> new EssenceAppleItem(EssenceAppleTier.INSANIUM));

	public static final DeferredHolder<Item, Item> INFERIUM_PAXEL = REGISTRY.register("inferium_paxel", () -> new EssencePaxelItem(ModItemTier.INFERIUM, 1, 1));
	public static final DeferredHolder<Item, Item> PRUDENTIUM_PAXEL = REGISTRY.register("prudentium_paxel", () -> new EssencePaxelItem(ModItemTier.PRUDENTIUM, 2, 1));
	public static final DeferredHolder<Item, Item> TERTIUM_PAXEL = REGISTRY.register("tertium_paxel", () -> new EssencePaxelItem(ModItemTier.TERTIUM, 3, 1));
	public static final DeferredHolder<Item, Item> IMPERIUM_PAXEL = REGISTRY.register("imperium_paxel", () -> new EssencePaxelItem(ModItemTier.IMPERIUM, 4, 1));
	public static final DeferredHolder<Item, Item> SUPREMIUM_PAXEL = REGISTRY.register("supremium_paxel", () -> new EssencePaxelItem(ModItemTier.SUPREMIUM, 5, 1));
	public static final DeferredHolder<Item, Item> AWAKENED_SUPREMIUM_PAXEL = REGISTRY.register("awakened_supremium_paxel", () -> new EssencePaxelItem(ModItemTier.AWAKENED_SUPREMIUM, 5, 2));

	public static final DeferredHolder<Item, Item> MOLTEN_INFERIUM_BUCKET = REGISTRY.register("molten_inferium_bucket", () -> new BucketItem(ModFluids.MOLTEN_INFERIUM.get(), BUCKET_PROPERTIES));
	public static final DeferredHolder<Item, Item> MOLTEN_PRUDENTIUM_BUCKET = REGISTRY.register("molten_prudentium_bucket", () -> new BucketItem(ModFluids.MOLTEN_PRUDENTIUM.get(), BUCKET_PROPERTIES));
	public static final DeferredHolder<Item, Item> MOLTEN_TERTIUM_BUCKET = REGISTRY.register("molten_tertium_bucket", () -> new BucketItem(ModFluids.MOLTEN_TERTIUM.get(), BUCKET_PROPERTIES));
	public static final DeferredHolder<Item, Item> MOLTEN_IMPERIUM_BUCKET = REGISTRY.register("molten_imperium_bucket", () -> new BucketItem(ModFluids.MOLTEN_IMPERIUM.get(), BUCKET_PROPERTIES));
	public static final DeferredHolder<Item, Item> MOLTEN_SUPREMIUM_BUCKET = REGISTRY.register("molten_supremium_bucket", () -> new BucketItem(ModFluids.MOLTEN_SUPREMIUM.get(), BUCKET_PROPERTIES));
	public static final DeferredHolder<Item, Item> MOLTEN_SOULIUM_BUCKET = REGISTRY.register("molten_soulium_bucket", () -> new BucketItem(ModFluids.MOLTEN_SOULIUM.get(), BUCKET_PROPERTIES));
}
