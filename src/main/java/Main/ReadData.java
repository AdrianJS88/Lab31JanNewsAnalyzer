package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadData {
    public ReadData(String s) throws IOException, InterruptedException {
        super();

        String sc =new Scanner(System.in).nextLine();
        FileReader fr = new FileReader(sc);
        BufferedReader br = new BufferedReader(fr);

        String str;

        while ((str = br.readLine()) != null) {
            System.out.println(str);

        }

        br.close();

    }


}