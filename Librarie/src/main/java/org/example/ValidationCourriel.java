package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationCourriel {
    public static void main( String[] args ) throws IOException {
        List<String> emails = new ArrayList();
        emails.add("jo@pipo.org");
        emails.add("ma_mu@m.ca");
        emails.add("a.a@a.aa");
        emails.add("ab@ab");
        emails.add("a.b@ab");
        emails.add("jo");

        String regex = "[a-zA-Z0-9]" + "[a-zA-Z0-9_.]" + "*@[a-zA-Z0-9]" + "+([.][a-zA-Z]+)+";

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches())
            {
                System.out.println("Ok : " + email);
            }
            else
                System.out.println("Ko : " + email);

        }
    }
}
