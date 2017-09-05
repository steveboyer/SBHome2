package com.stephenboyer.sbhome2.footbatx.controller;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by sjb19_000 on 12/13/2016.
 */
public class CSVFileController extends FileController {

    public CSVFileController(){
        super();
    }

    public CSVFileController(File file){
        super(file);
    }

    public ArrayList<String[]> readFile() {
        try {
            // Open file, create reader, read everything into List, cast to ArrayList, return
            return (ArrayList<String[]>) (new CSVReader(new FileReader(file))).readAll();
        } catch (IOException e){
            return null;
        }
    }

    public static ArrayList<String[]> readFile(String name){
        try {
            return (ArrayList<String[]>) (new CSVReader(new FileReader(new File(name)))).readAll();
        } catch (Exception ex) {

            return null;
        }

    }

}
