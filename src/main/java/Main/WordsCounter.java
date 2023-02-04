package Main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordsCounter {
    public WordsCounter() throws IOException {

        String scanTxt = new Scanner(System.in).next();
        FileInputStream fin = new FileInputStream(scanTxt);
        Scanner fileInput = new Scanner(fin);


        List<String> words = new ArrayList<>();
        List<Integer> count = new ArrayList<>();

        while (fileInput.hasNext()) {

            String nextWord = fileInput.next();

            if (words.contains(nextWord)) {
                int index = words.lastIndexOf(nextWord);
                count.set(index, count.get(index) + 1);

            } else {

                words.add(nextWord);
                count.add(1);
            }

        }
        fileInput.close();
        fin.close();
        System.out.println("Result after processing the document :");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(" Word " + words.get(i) + " occurred : " + count.get(i) + " times ");

        }


    }




}
