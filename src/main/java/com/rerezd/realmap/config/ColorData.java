package com.rerezd.realmap.config;

import com.rerezd.realmap.realmap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class ColorData {

    public static String CLRTBL =
                    "4,89,125,39" + System.lineSeparator() +
                    "5,109,153,48" + System.lineSeparator() +
                    "6,127,178,56" + System.lineSeparator() +
                    "7,67,94,29" + System.lineSeparator() +
                    "8,174,164,115" + System.lineSeparator() +
                    "9,213,201,140" + System.lineSeparator() +
                    "10,247,233,163" + System.lineSeparator() +
                    "11,130,123,86" + System.lineSeparator() +
                    "12,140,140,140" + System.lineSeparator() +
                    "13,171,171,171" + System.lineSeparator() +
                    "14,199,199,199" + System.lineSeparator() +
                    "15,105,105,105" + System.lineSeparator() +
                    "16,180,0,0" + System.lineSeparator() +
                    "17,220,0,0" + System.lineSeparator() +
                    "18,255,0,0" + System.lineSeparator() +
                    "19,135,0,0" + System.lineSeparator() +
                    "20,112,112,180" + System.lineSeparator() +
                    "21,138,138,220" + System.lineSeparator() +
                    "22,160,160,255" + System.lineSeparator() +
                    "23,84,84,135" + System.lineSeparator() +
                    "24,117,117,117" + System.lineSeparator() +
                    "25,144,144,144" + System.lineSeparator() +
                    "26,167,167,167" + System.lineSeparator() +
                    "27,88,88,88" + System.lineSeparator() +
                    "28,0,87,0" + System.lineSeparator() +
                    "29,0,106,0" + System.lineSeparator() +
                    "30,0,124,0" + System.lineSeparator() +
                    "31,0,65,0" + System.lineSeparator() +
                    "32,180,180,180" + System.lineSeparator() +
                    "33,220,220,220" + System.lineSeparator() +
                    "34,255,255,255" + System.lineSeparator() +
                    "35,135,135,135" + System.lineSeparator() +
                    "36,115,118,129" + System.lineSeparator() +
                    "37,141,144,158" + System.lineSeparator() +
                    "38,164,168,184" + System.lineSeparator() +
                    "39,86,88,97" + System.lineSeparator() +
                    "40,106,76,54" + System.lineSeparator() +
                    "41,130,94,66" + System.lineSeparator() +
                    "42,151,109,77" + System.lineSeparator() +
                    "43,79,57,40" + System.lineSeparator() +
                    "44,79,79,79" + System.lineSeparator() +
                    "45,96,96,96" + System.lineSeparator() +
                    "46,112,112,112" + System.lineSeparator() +
                    "47,59,59,59" + System.lineSeparator() +
                    "48,45,45,180" + System.lineSeparator() +
                    "49,55,55,220" + System.lineSeparator() +
                    "50,64,64,255" + System.lineSeparator() +
                    "51,33,33,135" + System.lineSeparator() +
                    "52,100,84,50" + System.lineSeparator() +
                    "53,123,102,62" + System.lineSeparator() +
                    "54,143,119,72" + System.lineSeparator() +
                    "55,75,63,38" + System.lineSeparator() +
                    "56,180,177,172" + System.lineSeparator() +
                    "57,220,217,211" + System.lineSeparator() +
                    "58,255,252,245" + System.lineSeparator() +
                    "59,135,133,129" + System.lineSeparator() +
                    "60,152,89,36" + System.lineSeparator() +
                    "61,186,109,44" + System.lineSeparator() +
                    "62,216,127,51" + System.lineSeparator() +
                    "63,114,67,27" + System.lineSeparator() +
                    "64,125,53,152" + System.lineSeparator() +
                    "65,153,65,186" + System.lineSeparator() +
                    "66,178,76,216" + System.lineSeparator() +
                    "67,94,40,114" + System.lineSeparator() +
                    "68,72,108,152" + System.lineSeparator() +
                    "69,88,132,186" + System.lineSeparator() +
                    "70,102,153,216" + System.lineSeparator() +
                    "71,54,81,114" + System.lineSeparator() +
                    "72,161,161,36" + System.lineSeparator() +
                    "73,197,197,44" + System.lineSeparator() +
                    "74,229,229,51" + System.lineSeparator() +
                    "75,121,121,27" + System.lineSeparator() +
                    "76,89,144,17" + System.lineSeparator() +
                    "77,109,176,21" + System.lineSeparator() +
                    "78,127,204,25" + System.lineSeparator() +
                    "79,67,108,13" + System.lineSeparator() +
                    "80,170,89,116" + System.lineSeparator() +
                    "81,208,109,142" + System.lineSeparator() +
                    "82,242,127,165" + System.lineSeparator() +
                    "83,128,67,87" + System.lineSeparator() +
                    "84,53,53,53" + System.lineSeparator() +
                    "85,65,65,65" + System.lineSeparator() +
                    "86,76,76,76" + System.lineSeparator() +
                    "87,40,40,40" + System.lineSeparator() +
                    "88,108,108,108" + System.lineSeparator() +
                    "89,132,132,132" + System.lineSeparator() +
                    "90,153,153,153" + System.lineSeparator() +
                    "91,81,81,81" + System.lineSeparator() +
                    "92,53,89,108" + System.lineSeparator() +
                    "93,65,109,132" + System.lineSeparator() +
                    "94,76,127,153" + System.lineSeparator() +
                    "95,40,67,81" + System.lineSeparator() +
                    "96,89,44,125" + System.lineSeparator() +
                    "97,109,54,153" + System.lineSeparator() +
                    "98,127,63,178" + System.lineSeparator() +
                    "99,67,33,94" + System.lineSeparator() +
                    "100,36,53,125" + System.lineSeparator() +
                    "101,44,65,153" + System.lineSeparator() +
                    "102,51,76,178" + System.lineSeparator() +
                    "103,27,40,94" + System.lineSeparator() +
                    "104,72,53,36" + System.lineSeparator() +
                    "105,88,65,44" + System.lineSeparator() +
                    "106,102,76,51" + System.lineSeparator() +
                    "107,54,40,27" + System.lineSeparator() +
                    "108,72,89,36" + System.lineSeparator() +
                    "109,88,109,44" + System.lineSeparator() +
                    "110,102,127,51" + System.lineSeparator() +
                    "111,54,67,27" + System.lineSeparator() +
                    "112,108,36,36" + System.lineSeparator() +
                    "113,132,44,44" + System.lineSeparator() +
                    "114,153,51,51" + System.lineSeparator() +
                    "115,81,27,27" + System.lineSeparator() +
                    "116,17,17,17" + System.lineSeparator() +
                    "117,21,21,21" + System.lineSeparator() +
                    "118,25,25,25" + System.lineSeparator() +
                    "119,13,13,13" + System.lineSeparator() +
                    "120,176,168,54" + System.lineSeparator() +
                    "121,215,205,66" + System.lineSeparator() +
                    "122,250,238,77" + System.lineSeparator() +
                    "123,132,126,40" + System.lineSeparator() +
                    "124,64,154,150" + System.lineSeparator() +
                    "125,79,188,183" + System.lineSeparator() +
                    "126,92,219,213" + System.lineSeparator() +
                    "127,48,115,112" + System.lineSeparator() +
                    "128,52,90,180" + System.lineSeparator() +
                    "129,63,110,220" + System.lineSeparator() +
                    "130,74,128,255" + System.lineSeparator() +
                    "131,39,67,135" + System.lineSeparator() +
                    "132,0,153,40" + System.lineSeparator() +
                    "133,0,187,50" + System.lineSeparator() +
                    "134,0,217,58" + System.lineSeparator() +
                    "135,0,114,30" + System.lineSeparator() +
                    "136,91,60,34" + System.lineSeparator() +
                    "137,111,74,42" + System.lineSeparator() +
                    "138,129,86,49" + System.lineSeparator() +
                    "139,68,45,25" + System.lineSeparator() +
                    "140,79,1,0" + System.lineSeparator() +
                    "141,96,1,0" + System.lineSeparator() +
                    "142,112,2,0" + System.lineSeparator() +
                    "143,59,1,0" + System.lineSeparator() +
                    "144,147,124,113" + System.lineSeparator() +
                    "145,180,152,138" + System.lineSeparator() +
                    "146,209,177,161" + System.lineSeparator() +
                    "147,110,93,85" + System.lineSeparator() +
                    "148,112,57,25" + System.lineSeparator() +
                    "149,137,70,31" + System.lineSeparator() +
                    "150,159,82,36" + System.lineSeparator() +
                    "151,84,43,19" + System.lineSeparator() +
                    "152,105,61,76" + System.lineSeparator() +
                    "153,128,75,93" + System.lineSeparator() +
                    "154,149,87,108" + System.lineSeparator() +
                    "155,78,46,57" + System.lineSeparator() +
                    "156,79,76,97" + System.lineSeparator() +
                    "157,96,93,119" + System.lineSeparator() +
                    "158,112,108,138" + System.lineSeparator() +
                    "159,59,57,73" + System.lineSeparator() +
                    "160,131,93,25" + System.lineSeparator() +
                    "161,160,114,31" + System.lineSeparator() +
                    "162,186,133,36" + System.lineSeparator() +
                    "163,98,70,19" + System.lineSeparator() +
                    "164,72,82,37" + System.lineSeparator() +
                    "165,88,100,45" + System.lineSeparator() +
                    "166,103,117,53" + System.lineSeparator() +
                    "167,54,61,28" + System.lineSeparator() +
                    "168,112,54,55" + System.lineSeparator() +
                    "169,138,66,67" + System.lineSeparator() +
                    "170,160,77,78" + System.lineSeparator() +
                    "171,84,40,41" + System.lineSeparator() +
                    "172,40,28,24" + System.lineSeparator() +
                    "173,49,35,30" + System.lineSeparator() +
                    "174,57,41,35" + System.lineSeparator() +
                    "175,30,21,18" + System.lineSeparator() +
                    "176,95,75,69" + System.lineSeparator() +
                    "177,116,92,84" + System.lineSeparator() +
                    "178,135,107,98" + System.lineSeparator() +
                    "179,71,56,51" + System.lineSeparator() +
                    "180,61,64,64" + System.lineSeparator() +
                    "181,75,79,79" + System.lineSeparator() +
                    "182,87,92,92" + System.lineSeparator() +
                    "183,46,48,48" + System.lineSeparator() +
                    "184,86,51,62" + System.lineSeparator() +
                    "185,105,62,75" + System.lineSeparator() +
                    "186,122,73,88" + System.lineSeparator() +
                    "187,64,38,46" + System.lineSeparator() +
                    "188,53,43,64" + System.lineSeparator() +
                    "189,65,53,79" + System.lineSeparator() +
                    "190,76,62,92" + System.lineSeparator() +
                    "191,40,32,48" + System.lineSeparator() +
                    "192,53,35,24" + System.lineSeparator() +
                    "193,65,43,30" + System.lineSeparator() +
                    "194,76,50,35" + System.lineSeparator() +
                    "195,40,26,18" + System.lineSeparator() +
                    "196,53,57,29" + System.lineSeparator() +
                    "197,65,70,36" + System.lineSeparator() +
                    "198,76,82,42" + System.lineSeparator() +
                    "199,40,43,22" + System.lineSeparator() +
                    "200,100,42,32" + System.lineSeparator() +
                    "201,122,51,39" + System.lineSeparator() +
                    "202,142,60,46" + System.lineSeparator() +
                    "203,75,31,24" + System.lineSeparator() +
                    "204,26,15,11" + System.lineSeparator() +
                    "205,31,18,13" + System.lineSeparator() +
                    "206,37,22,16" + System.lineSeparator() +
                    "207,19,11,8" + System.lineSeparator();


    public static Map<Integer, int[]> colorMap = new HashMap<>();

    //read index-RGB data from "ColorTable.TXT", create a hash map
    public static void setColorMap() throws IOException {
        Scanner s = new Scanner(realmap.colorFile);
        List<String> colors = new ArrayList<String>();
        while (s.hasNext()){
            colors.add(s.next());
        }
        s.close();

        for (String string:colors
        ) {
            String[] ints = string.split(",");
            addValue(Integer.parseInt(ints[0]), Integer.parseInt(ints[1]), Integer.parseInt(ints[2]), Integer.parseInt(ints[3]));
        }
    }

    //add value to map
    private static void addValue(int index, int red, int green, int blue){
        int[] rgb = {red,green,blue};
        colorMap.put(index, rgb);
    }




}
