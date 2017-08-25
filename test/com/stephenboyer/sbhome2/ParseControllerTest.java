package com.stephenboyer.sbhome2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by steve on 8/2/17.
 */
public class ParseControllerTest {


    @Test
    public void test1(){
        Document doc = null;
        try {
            doc = Jsoup.connect("http://en.wikipedia.org/").get();
            Elements newsHeadlines = doc.select("#mp-itn b a");
            System.out.println(newsHeadlines);
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void test2(){
        Document doc = null;
        try {
            doc = Jsoup.connect("http://www.cnn.com").get();
            Elements newsHeadlines = doc.select(".breaking-news");
            //printElements(newsHeadlines);
            System.out.println(newsHeadlines);

        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test3(){
        Document doc = null;
        try {
            doc = Jsoup.connect("http://www.imdb.com/find?ref_=nv_sr_fn&q=south+park&s=all").get();
//            Elements newsHeadlines = doc.select(".breaking-news");

            System.out.println(doc.body());

        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }

    }

    public void printElements(Elements elements){
        for(Element e : elements){
           System.out.println(e.data());
           for(Element e2 : e.getAllElements()){
               System.out.println(e2.data());
           }
        }
    }
}
