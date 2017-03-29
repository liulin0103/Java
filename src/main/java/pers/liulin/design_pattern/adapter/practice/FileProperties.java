package pers.liulin.design_pattern.adapter.practice;

import java.io.*;
import java.util.*;

/**
 * Created by LiuLin on 2017/3/30 0030.
 */
public class FileProperties implements FileIO {
    Properties properties;
    InputStream is;
    OutputStream os;

    public FileProperties() {
        this.properties = new Properties();
    }

    public void readFromFile(String fileName) throws IOException {
        this.is = new FileInputStream(fileName);
        try {
            this.properties.load(this.is);
        } catch (IOException e) {
            throw e;
        } finally {
            this.is.close();
        }
    }

    public void writeToFile(String string) throws IOException {
        String note = "written by FileProperties";
        this.os = new FileOutputStream(string);
        try{
            this.properties.store(os,note);
        }catch (IOException e){
            throw e;
        }finally {
            os.close();
        }
    }

    public void setValue(String key, String value) {
        if (null != this.properties){
            this.properties.setProperty(key,value);
        }
    }

    public String getValue(String key) {
        if (null != this.properties) {
            return this.properties.getProperty(key);
        } else {
            return null;
        }
    }
}
