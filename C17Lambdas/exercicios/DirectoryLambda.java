package C17Lambdas.exercicios;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Fredson Sumi
 */
public class DirectoryLambda {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Giorgio\\Downloads");
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
        directoryStream                
                .forEach(
                value -> System.out.printf("%s%n", value.getFileName()));
        
    }
}
