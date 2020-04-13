package homeWork10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadMyText {
    public static void main(String[] args) {
        Path myTextFile = Paths.get("src\\homeWork10\\mytext.txt");
        List<String> textLines = null;
        try {
            textLines = readAllLines(myTextFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (textLines != null && textLines.size() > 1) {
//      count and write the number of symbols in every line.
            printCharactersAmount(textLines);

//      find the longest and the shortest line\
            findAndPrintMinMaxLengthLine(textLines);

//      find and write only that lines, which consist of word «var»
            printAllLinesThatConsistOf(textLines, "var");
        }
    }


    public static List<String> readAllLines(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    public static void printCharactersAmount(List<String> lines) {
        if (lines == null || lines.size() < 1) return;
        System.out.println("The number of characters in each line:");
        int lineNumber = 0;
        for (String s : lines) {
            lineNumber++;
            System.out.printf("The number of chars in line #%2$d: %1$d%n", s.length(), lineNumber);
        }
    }

    public static void findAndPrintMinMaxLengthLine(List<String> fileLines) {
//    public static void findAndPrintMinMaxLengthLine(List<String> lines) {
        List<String> lines = new ArrayList<>(fileLines);
//        Collections.copy(fileLines, lines);
        lines.sort(Comparator.comparingInt(String::length));
        String longest = lines.get(lines.size() - 1);
        String shortest = lines.get(0);
        System.out.println("\nThe longest line: \n\"" + longest + "\", length: " + longest.length() + "\n");
        System.out.println("The shortest line: \n\"" + lines.get(0) + "\", length: " + shortest.length() + "\n");
    }

    public static void printAllLinesThatConsistOf(List<String> lines, String substring) {
        String p = "^(" + substring + ")+$";
        Pattern pattern = Pattern.compile(p);
        for (int i = 0; i < lines.size(); i++) {
            Matcher matcher = pattern.matcher(lines.get(i));
            if (matcher.find()) {
                System.out.printf("Line #%d consists of substring \"%s\" only %n", (i + 1), substring);
            }
        }
    }
}