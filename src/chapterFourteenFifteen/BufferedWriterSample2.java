package chapterFourteenFifteen;

import utils.AppUtils;

import java.io.*;

public class BufferedWriterSample2 {
    public static void main(String[] args) {
        String [] words = {"QWERTY", "ASDFG","ZXCVB", "POIUY", "LKJHG", "MNBVC"};
        try(OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(AppUtils.appAssetLocation+"\\test.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            bufferedWriter.write(words[0]);

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
