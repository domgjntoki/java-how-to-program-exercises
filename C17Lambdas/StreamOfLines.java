package C17Lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Fredson Sumi
 */
public class StreamOfLines {
    // src\C17Lambdas\animes.txt
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("");
        Map<String, Long> wordCounts = 
                Files.lines(Paths.get("src\\C17Lambdas\\animes.txt"))
                        .map(line -> 
                                line.replaceAll("temporada", "")
                                        .replace("acabou", "")
                                        .replaceAll("ep", "")
                                        .replaceAll("[^a-zA-Z\\s]", "")
                                        .trim())
                        .flatMap(line -> pattern.splitAsStream(line))
                        .collect(Collectors.groupingBy(String::toLowerCase,
                                TreeMap::new, Collectors.counting()));
        wordCounts.forEach((key, value) -> System.out.printf("%s %d%n", key, value));
        // exibe as palavras agrupadas pela letra inicial
        wordCounts.entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(entry -> entry.getKey().charAt(0),
                                TreeMap::new, Collectors.toList()))
                
                .forEach((letter, wordList) ->{
                    System.out.printf("%n%C%n", letter);
                    wordList.stream()
                            
                            .forEach(word -> System.out.printf(
                            
                        "%5s%s: %d%n", " ",word.getKey(), word.getValue()));
                    }
                );
        
    }
}
