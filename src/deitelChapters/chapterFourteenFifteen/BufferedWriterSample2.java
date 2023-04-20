package deitelChapters.chapterFourteenFifteen;

import utils.AppUtils;

import java.io.*;

public class BufferedWriterSample2 {
    public static void main(String[] args) {
        String [] words = {"QWERTY", "ASDFG","ZXCVB", "POIUY", "LKJHG", "MNBVC"};
        try(OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(AppUtils.appAssetLocation+"\\output.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            bufferedWriter.write(words[0]+" "+words[3]);
            bufferedWriter.flush();
            bufferedWriter.write(words[1]);
            bufferedWriter.close();

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
