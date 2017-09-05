package com.stephenboyer.sbhome2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * Created by steve on 8/1/17.
 */
@Controller
public class ParseController {

    @RequestMapping("/headline")
    public String getHeadline(){
        Document doc = null;
        try {
            doc = Jsoup.connect("http://en.wikipedia.org/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements newsHeadlines = doc.select("#mp-itn b a");
        return "Hello";

    }




}
