package com.rerezd.realmap.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.rerezd.realmap.images.ImageMapData;
import com.rerezd.realmap.images.Utils;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.MessageType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.MutableText;
import net.minecraft.util.Formatting;


import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class CommandCreate {

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean b) {

        LiteralArgumentBuilder<ServerCommandSource> literal = CommandManager.literal("createmap").then(
                CommandManager.argument("URL_OR_File",StringArgumentType.greedyString())
                        .executes(context -> execute(context, StringArgumentType.getString(context, "URL_OR_File"))));


        dispatcher.register(literal);
    }

    public static int execute(CommandContext<ServerCommandSource> context, String msg) throws CommandSyntaxException {
        ServerPlayerEntity src = context.getSource().getPlayer();
        ItemStack diamond = new ItemStack(Items.DIAMOND);
        int slot = context.getSource().getPlayer().inventory.selectedSlot;
        if(context.getSource().getPlayer().inventory.getStack(slot).getItem() != Items.DIAMOND && context.getSource().getPlayer().inventory.getStack(slot).getCount() != 2){
            MutableText dmsg = new LiteralText("2 Diamonds must be in your main hand!");
            src.sendMessage(dmsg.formatted(Formatting.RED), MessageType.CHAT);
        }else if(context.getSource().getPlayer().inventory.getStack(slot).getItem() == Items.DIAMOND && context.getSource().getPlayer().inventory.getStack(slot).getCount() == 2) {
            MutableText dmsg = new LiteralText("You have purchased a map for 2 diamonds!");
            context.getSource().getPlayer().inventory.removeStack(slot);
            src.sendMessage(dmsg.formatted(Formatting.AQUA), MessageType.CHAT);


            MutableText errormsg = new LiteralText("That is not a valid file or url");

            if (context.getSource() != null) {
                String URLorFileName = msg;

                if (Utils.isURL(URLorFileName)) {
                    //is URL
                    try {
                        //the result of the URL is an image?
                        if (Utils.URLisImage(URLorFileName)) {
                            //Yes, create itemStack and put into player's inventory
                            giveTheMap(src, URLorFileName);
                        } else {
                            //No, not a valid URL
                            src.sendMessage(errormsg.formatted(Formatting.DARK_RED), MessageType.CHAT);
                        }
                    } catch (IOException ignored) {
                    }
                } else {
                    //Not URL, it's a file name
                    //Is the file exist?
                    if (Utils.theImageExist(URLorFileName)) {
                        //Yes
                        try {
                            giveTheMap(src, URLorFileName);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //No
                        src.sendMessage(errormsg.formatted(Formatting.DARK_RED), MessageType.CHAT);
                    }
                }
            }
        }
        return 1;
    }

    private static void giveTheMap(ServerPlayerEntity playerMP, String URLorFileName) throws IOException {
        ImageMapData imageMapData = new ImageMapData(playerMP,URLorFileName);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (imageMapData.itemStack!=null){
                    playerMP.giveItemStack(imageMapData.itemStack);

                    this.cancel();
                }
            }
        },0,1000);
    }

}
