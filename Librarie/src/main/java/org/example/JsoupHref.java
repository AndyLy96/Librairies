package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class JsoupHref
{
    public static void main( String[] args ) throws IOException {
        Document doc = Jsoup.connect("https://info.cegepmontpetit.ca/3N5-Prog3/z/").get();
        Elements link = doc.select("a[href]");
        for ( Element links : link){
            System.out.println(links.attr("href"));
            //Lien absolu
            //System.out.println(links.attr("abs:href"));
        }

    }
}
