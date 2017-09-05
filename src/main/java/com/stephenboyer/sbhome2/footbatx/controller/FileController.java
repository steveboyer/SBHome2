package com.stephenboyer.sbhome2.footbatx.controller;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by sjb19_000 on 12/13/2016.
 */
public abstract class FileController {
    protected Boolean multiFile; // More later maybe, might as well handle them together

    protected File file;

    protected ArrayList<File> files;

    protected FileController(){
        super();
    }

    protected FileController(File file){
        this(file, false);
    }

    private FileController(File file, Boolean multi_file){
        this.file = file;
        this.multiFile = multi_file;
    }

    public void setFile(File file){
        this.file = file;
    }

    public void setMultiFile(Boolean multiFile){
        this.multiFile = multiFile;
    }

    public abstract ArrayList<String[]> readFile();
}
