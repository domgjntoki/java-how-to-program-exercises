package C15Arquivos;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 *
 * @author Fredson Sumi
 */
public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file or directory name: ");
        // cria o objeto Path com base na entrada de usuário
        Path path = Paths.get(input.nextLine());
        
        // se o caminho existe, gera uma saída das informações sobre ele
        if(Files.exists(path)) {
            System.out.printf("%n%s exists%n", path.getFileName());
            System.out.printf("%s a directory%n", 
                    Files.isDirectory(path) ? "Is" : "Is not");
            System.out.printf("%s an absolute path%n", 
                    path.isAbsolute() ? "Is": "Is not");
            System.out.printf("Last modified: %s%n", 
                    Files.getLastModifiedTime(path));
            System.out.printf("Size: %s%n", Files.size(path));
            System.out.printf("Path: %s%n", path);
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());
            
            if(Files.isDirectory(path)){
                System.out.printf("%nDirectory contents: %n");
                
                // objeto para iteração pelo conteúdo de um diretório
                DirectoryStream<Path> directoryStream = 
                        Files.newDirectoryStream(path);
                
                for(Path p : directoryStream){
                    System.out.println(p.getFileName());
                }
            }
        } else{
            System.out.printf("%s does not exist%n", path);
        }
    }
}
