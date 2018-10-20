package assignment.zunzelf.org.pra.model;

import android.util.Log;

import java.util.List;

public class ImageClassification {

    String[] arial_models = new String[]{ // arial number models
            "000000777676666666666565554444433322322222222122111",
            "0006666666666666666666644222222222222223454522011112",
            "000000707676665655555555700000007644444444444442211111111112122334345456544212101",
            "000000707666665577766666554544444333220067770101122233344201012222343455564422111",
            "000666666666666670064456666442222344444444221121121112112",
            "0000000000065444444456667000007776766566554544444333230006777010112222233434545442221222212",
            "00000007766442343455556670100007076766666565454444433323222222222212111",
            "000000000000066565565656566566666442222212221212112134444444422",
            "00000007776665567767665655544444433322222211232321211",
            "0000007776766666666665655544444433220777001111223454444343232222211201"
    };

    String[] sev_seg_models = new String[]{ // 7-section number models
            "000000000000000000000000000000000000000000000000000000000000000000000000000000006666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666664444444444444444444444444444444444444444444444444444444444444444444444444444444222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222",
            "000000000000000000006666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666664444444444444444444222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222",
            "00000000000000000000000000000000000000000000000000000000000000000000000000000000666666666666666666666666666666666666666666666666666666666664444444444444444444444444444444444444444444444444444444444456666666666666666666700000000000000000000000000000000000000000000000000000000000666666666666666666644444444444444444444444444444444444444444444444444444444444444444444444444444442222222222222222222222222222222222222222222222222222222222200000000000000000000000000000000000000000000000000000000000122222222222222222223444444444444444444444444444444444444444444444444444444444442222222222222222222",
            "00000000000000000000000000000000000000000000000000000000000000000000000000000000666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666444444444444444444444444444444444444444444444444444444444444444444444444444444422222222222222222220000000000000000000000000000000000000000000000000000000000012222222222222222222344444444444444444444444444444444444444444444444444444444444222222222222222222200000000000000000000000000000000000000000000000000000000000122222222222222222223444444444444444444444444444444444444444444444444444444444442222222222222222222",
            "000000000000000000006666666666666666666666666666666666666667000000000000000000000000000000000000000122222222222222222222222222222222222222200000000000000000006666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666644444444444444444442222222222222222222222222222222222222222222222222222222222234444444444444444444444444444444444444444444444444444444444422222222222222222222222222222222222222222222222222222222222",
            "00000000000000000000000000000000000000000000000000000000000000000000000000000000666666666666666666644444444444444444444444444444444444444444444444444444444444566666666666666666667000000000000000000000000000000000000000000000000000000000006666666666666666666666666666666666666666666666666666666666644444444444444444444444444444444444444444444444444444444444444444444444444444442222222222222222222000000000000000000000000000000000000000000000000000000000001222222222222222222234444444444444444444444444444444444444444444444444444444444422222222222222222222222222222222222222222222222222222222222",
            "0000000000000000000000000000000000000000000000000000000000000000000000000000000066666666666666666664444444444444444444444444444444444444444444444444444444444456666666666666666666700000000000000000000000000000000000000000000000000000000000666666666666666666666666666666666666666666666666666666666664444444444444444444444444444444444444444444444444444444444444444444444444444444222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222",
            "00000000000000000000000000000000000000000000000000000000000000000000000000000000666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666444444444444444444422222222222222222222222222222222222222222222222222222222222222222222222222222223444444444444444444444444444444444444444566666666666666666664444444444444444444222222222222222222222222222222222222222",
            "000000000000000000000000000000000000000000000000000000000000000000000000000000006666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666664444444444444444444444444444444444444444444444444444444444444444444444444444444222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222",
            "0000000000000000000000000000000000000000000000000000000000000000000000000000000066666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666644444444444444444444444444444444444444444444444444444444444444444444444444444442222222222222222222000000000000000000000000000000000000000000000000000000000001222222222222222222234444444444444444444444444444444444444444444444444444444444422222222222222222222222222222222222222222222222222222222222"
    };

    public String tweak(String inp, int size){
        String blank = "";
        for (int i = 0; i < size;i++){
            blank += ""+0;
        }
        return inp+blank;
    }
    public int modelMatching(String inp, String[] models){
        double min = 0;
        int res = 0;
        int idx = 0;
        boolean start = true;
        for (String x : models){
            String tempx = x;
            String tempI = inp;
            int gap = Math.abs(inp.length()-x.length());
            if(inp.length()>x.length()){
                tempx = tweak(x, gap);
            }
            else  tempI = tweak(inp, gap);
            double calc = 0;
            for (int i = 0; i < tempI.length(); i++){
                calc += Math.pow((Character.getNumericValue(tempI.toCharArray()[i]) - Character.getNumericValue(tempx.toCharArray()[i])), 2);
            }
            calc = calc/inp.length();
            if (start){
                min = calc;
                start = false;
            }
            if (calc <= min) {
                min = calc;
                res = idx;
            }
            idx += 1;
        }
        return res;
    }

    public String translate(List<String> input, String mode){
        String res = "";
        for (String s : input){
            if(mode.equals("arial")){
                res += modelMatching(s, arial_models);
            }else {
                res += modelMatching(s, sev_seg_models);
            }
        }
        return res;
    }
}