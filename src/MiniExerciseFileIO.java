import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MiniExerciseFileIO {
    public static void main(String[] args) {
//        Path pathToTestDir = Paths.get("src/test");
//        try {
//            if(Files.notExists(pathToTestDir)) {
//                Files.createDirectory(pathToTestDir);
//            }else{
//                System.out.println("The" + pathToTestDir + "directory already exist");
//            }
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
        Path pathToOurFile = Paths.get("src/test","list.txt");
        try {
            if(Files.notExists(pathToOurFile)) {
                Files.createFile(pathToOurFile);
            }else{
                System.out.println("The" + pathToOurFile + "file already exist");
            }
        } catch (IOException ioe) {
            System.out.println("There was a problem!");
            ioe.printStackTrace();
        }
    }
}