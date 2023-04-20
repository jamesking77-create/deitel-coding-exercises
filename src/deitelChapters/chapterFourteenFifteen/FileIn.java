package deitelChapters.chapterFourteenFifteen;

import utils.AppUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileIn {
    public static void main(String[] args) {
                try (FileInputStream fileInputStream = new FileInputStream(AppUtils.appAssetLocation+"\\text.txt")) {
                    byte[] bytes = fileInputStream.readAllBytes();
                    System.out.println(Arrays.toString(bytes));
                    for (byte b : bytes) {
                        System.out.print(Character.toString(b) + " ");
                    }
                } catch (IOException exception) {
                    System.err.println(exception.getMessage());
                }
            }
        }

