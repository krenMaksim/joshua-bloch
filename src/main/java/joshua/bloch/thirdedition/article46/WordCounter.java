package joshua.bloch.thirdedition.article46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter {

    static final Path textPath = Paths.get("./src/main/resources/text.txt");

    public static void main(String[] args) {

	countWordsGoodCode();

    }

    static void countWordsBadCode() {
	Map<String, Long> freq = new HashMap<>();

	try (Stream<String> words = searchWords(Files.readAllLines(textPath))) {
	    words.forEach(word -> freq.merge(word.toLowerCase(), 1L, Long::sum));
	} catch (IOException e) {
	    // ommited
	}

	System.out.println(freq);

    }

    static void countWordsGoodCode() {
	Map<String, Long> freq = new HashMap<>();

	try (Stream<String> words = searchWords(Files.readAllLines(textPath))) {
	    freq = words.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
	} catch (IOException e) {
	    // ommited
	}

	System.out.println(freq);
    }

    static Stream<String> searchWords(List<String> text) {
	return text.stream()
	           .map(textLine -> Arrays.asList(textLine.split(" ")))
	           .flatMap(List::stream);
    }

}
