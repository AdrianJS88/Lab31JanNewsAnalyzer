package Main;

import newsanalizer.usermanagement.Login;

import java.io.IOException;


public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("News Analyzer");
        Login l = new Login();
        l.doLogin();
        System.out.println("Please enter your document path  :");
        new WordsCounter();







    }


}

