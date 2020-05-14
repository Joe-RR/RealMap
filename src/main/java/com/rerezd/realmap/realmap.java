package com.rerezd.realmap;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;


import com.rerezd.realmap.commands.CommandCreate;
import com.rerezd.realmap.config.ColorData;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;


import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class realmap implements ModInitializer {
	public static final String MOD_ID = "realmap";
	public static final String MOD_NAME = "RealMap";
	private static realmap INSTANCE;
	public static File configdir = FabricLoader.getInstance().getConfigDirectory();//repurposed code from PVP opt-in - Ill pretty this up later. My main focus is functionality
	public static File modconfigdir=new File(configdir,"Images");
	public static File colorFile = new File(modconfigdir.getPath(), "ColorTable.TXT");
	public static Logger Log = LogManager.getLogger("[RealMap] ");

	@Override
	public void onInitialize() {

		init();

		CommandRegistrationCallback.EVENT.register(CommandCreate::register);


	}
	
	private static void init(){

		//create config/Images/
		if(!modconfigdir.exists()) {
			if (!modconfigdir.exists()) {
				modconfigdir.mkdir();
			}
		}

		//create and fill config/Images/ColorTable.TXT
		if (!colorFile.exists()){
			try {
				colorFile.createNewFile();

				FileWriter writer = new FileWriter(colorFile);
				writer.write(ColorData.CLRTBL);
				writer.close();
			} catch (IOException e) {
				Log.error("Unable to create ColorTable.txt. Functionality may be negatively affected!");
			}

		}

		try {
			ColorData.setColorMap();
		} catch (IOException e) {
			Log.error("Unable to set the color map using ColorTable.txt. Functionality may be negatively affected!");
		}

	}

}