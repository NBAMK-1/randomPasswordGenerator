package projects4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int length = 10;
        System.out.println(generatePswd(length));

    }

    private static char[] generatePswd(int len) {
        System.out.println("Your Password:");
        String charsCap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456879";
        String symbols= "!@#$%^&*_=+-?.?<>)";

        String passSymbols = charsCap+chars+nums+symbols;
        Random rnd = new Random();

        char[] password = new char [len];
        //int index = 0 ;
        for(int i = 0 ; i < len ; i++){
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }

        return password;
    }
}
