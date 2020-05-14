package com.rerezd.realmap.images;

import com.rerezd.realmap.realmap;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.map.MapState;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.dimension.DimensionType;

import java.io.File;
import java.io.IOException;

public class ImageMapData {
    public MapState mapData;
    public ItemStack itemStack;

    public ImageMapData(ServerPlayerEntity playerMP, String URLorFileName) throws IOException {
        int id = playerMP.getServerWorld().getNextMapId();

        mapData = new MapState("map_"+id);
        mapData.scale = (byte)0;
        mapData.zCenter = 999999;
        mapData.unlimitedTracking = false;
        mapData.showIcons = false;
        mapData.xCenter = 0;
        mapData.dimension = DimensionType.byRawId(0);
        mapData.colors = ImageProcess.getMapDataOfURLorFileName(URLorFileName);
        mapData.locked = true;
        mapData.markDirty();
        playerMP.getServerWorld().putMapState(mapData);

        ItemStack map = new ItemStack(Items.FILLED_MAP);

        CompoundTag tag = new CompoundTag();

        tag.putInt("map", id);
        map.setTag(tag);

        playerMP.giveItemStack(map);
    }
}
