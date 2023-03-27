package chapterFourteenFifteen;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

public class Files2 {
        public static void main(String[] args) {
            Path path = Path.of("C:\\Users\\USER\\Desktop\\j_files_pract");
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
                Iterator<Path> iterator = directoryStream.iterator();
                if (iterator.hasNext()) {
                    Path path2 = iterator.next();
                    System.out.println(path2.getFileName());
                }
                directoryStream.iterator();
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
