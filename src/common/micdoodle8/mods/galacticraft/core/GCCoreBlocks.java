package micdoodle8.mods.galacticraft.core;

import micdoodle8.mods.galacticraft.API.GCBlockBreathableAir;
import micdoodle8.mods.galacticraft.core.GCCoreBlockLandingPad;
import micdoodle8.mods.galacticraft.core.GCCoreBlockOxygenCollector;
import micdoodle8.mods.galacticraft.core.GCCoreBlockOxygenDistributor;
import micdoodle8.mods.galacticraft.core.GCCoreBlockOxygenPipe;
import micdoodle8.mods.galacticraft.core.GCCoreBlockUnlitTorch;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.MapColor;
import net.minecraft.src.Material;
import net.minecraft.src.MaterialLiquid;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Copyright 2012, micdoodle8
 * 
 *  All rights reserved.
 *
 */
public class GCCoreBlocks 
{
	public static GCBlockBreathableAir breatheableAir;
	public static Block treasureChest;
	public static Block landingPad;
	public static GCCoreBlockUnlitTorch unlitTorch;
	public static GCCoreBlockUnlitTorch unlitTorchLit;
	public static GCCoreBlockOxygenDistributor airDistributor;
	public static GCCoreBlockOxygenDistributor airDistributorActive;
	public static GCCoreBlockOxygenPipe oxygenPipe;
	public static Block blockOres;
	public static Block blockAirCollector;
	
	public static void initBlocks() 
	{
		blockOres = 											new GCCoreBlockOre					(GCCoreConfigManager.idBlockOre,  						0)						.setHardness(3.0F) 																				 																											.setBlockName("blockores");
		breatheableAir = (GCBlockBreathableAir)					new GCBlockBreathableAir			(GCCoreConfigManager.idBlockBreatheableAir, 			16)						.setHardness(0.0F) 		.setResistance(1000F)													.setCreativeTab((CreativeTabs)null)																.setBlockName("breatheableAir");
		treasureChest = 										new GCCoreBlockTreasureChest		(GCCoreConfigManager.idBlockTreasureChest				)						.setHardness(1.0F)      .setResistance(10.0F)   												.setCreativeTab(CreativeTabs.tabDecorations)       	.setStepSound(Block.soundStoneFootstep)                 .setBlockName("treasureChest");
		landingPad = 											new GCCoreBlockLandingPad			(GCCoreConfigManager.idBlockLandingPad,					6)						.setHardness(1.0F)      .setResistance(10.0F)  	 												.setCreativeTab(CreativeTabs.tabDecorations)       	.setStepSound(Block.soundStoneFootstep)                 .setBlockName("landingPad");
		unlitTorch = (GCCoreBlockUnlitTorch) 					new GCCoreBlockUnlitTorch 			(GCCoreConfigManager.idBlockUnlitTorch,             	11, false)				.setHardness(0.0F)								.setLightValue(0.2F)							.setCreativeTab((CreativeTabs)null)					.setStepSound(Block.soundWoodFootstep)					.setBlockName("unlitTorch");
		unlitTorchLit = (GCCoreBlockUnlitTorch) 				new GCCoreBlockUnlitTorch 			(GCCoreConfigManager.idBlockUnlitTorchLit,             	11, true)				.setHardness(0.0F)								.setLightValue(0.9375F)							.setCreativeTab((CreativeTabs)null)					.setStepSound(Block.soundWoodFootstep)					.setBlockName("unlitTorchLit");
		airDistributor = (GCCoreBlockOxygenDistributor)			new GCCoreBlockOxygenDistributor	(GCCoreConfigManager.idBlockAirDistributor, 			false)					.setHardness(3.5F)																				.setCreativeTab(CreativeTabs.tabDecorations)		.setStepSound(Block.soundStoneFootstep)					.setBlockName("distributor");
		airDistributorActive = (GCCoreBlockOxygenDistributor)	new GCCoreBlockOxygenDistributor	(GCCoreConfigManager.idBlockAirDistributorActive, 		true)					.setHardness(3.5F)																				.setCreativeTab((CreativeTabs)null)					.setStepSound(Block.soundStoneFootstep)					.setBlockName("distributorActive");
		oxygenPipe = (GCCoreBlockOxygenPipe)					new GCCoreBlockOxygenPipe			(GCCoreConfigManager.idBlockAirPipe, 					40)						.setHardness(0.3F)																				.setCreativeTab(CreativeTabs.tabDecorations)  		.setStepSound(Block.soundGlassFootstep)                 .setBlockName("oxygenPipe");
		Item.itemsList[blockOres.blockID] = 					new GCCoreItemBlockOre				(blockOres.blockID - 256)																																																																	.setItemName("blockores");	
		blockAirCollector = 									new GCCoreBlockOxygenCollector		(GCCoreConfigManager.idBlockAirCollector, 				8)						.setHardness(3.5F)  	  																		.setCreativeTab(CreativeTabs.tabDecorations) 		.setStepSound(Block.soundStoneFootstep)					.setBlockName("oxygenCollector");
	}

	public static void setHarvestLevels() 
	{
		MinecraftForge.setBlockHarvestLevel(blockOres, 0, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(blockOres, 1, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(blockOres, 2, "pickaxe", 3);
	}
	
	public static void registerBlocks() 
	{
		GameRegistry.registerBlock(treasureChest);
		GameRegistry.registerBlock(landingPad);
		GameRegistry.registerBlock(unlitTorch);
		GameRegistry.registerBlock(unlitTorchLit);
		GameRegistry.registerBlock(breatheableAir);
		GameRegistry.registerBlock(airDistributor);
		GameRegistry.registerBlock(airDistributorActive);
		GameRegistry.registerBlock(oxygenPipe);
		GameRegistry.registerBlock(blockAirCollector);
	}

	public static void addNames() 
	{
		addName(treasureChest);
		addName(landingPad);
		addName(unlitTorch);
		addName(unlitTorchLit);
		addName(airDistributor);
		addName(airDistributorActive);
		addName(oxygenPipe);
		addNameWithMetadata("tile.blockores.aluminumearth.name");
		addNameWithMetadata("tile.blockores.copperearth.name");
		addNameWithMetadata("tile.blockores.titaniumearth.name");
		addName(blockAirCollector);
	}
	
	private static void addName(Block block)
	{
        LanguageRegistry.instance().addStringLocalization(block.getBlockName() + ".name", GalacticraftCore.lang.get(block.getBlockName() + ".name"));
	}
	
	private static void addNameWithMetadata(String string)
	{
        LanguageRegistry.instance().addStringLocalization(string, GalacticraftCore.lang.get(string));
	}
}
