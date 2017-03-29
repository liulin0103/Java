package pers.liulin.design_pattern.adapter.practice;

import java.io.IOException;

/**
 * Created by LiuLin on 2017/3/30 0030.
 */
public interface FileIO {
    public void readFromFile(String fileName) throws IOException;
    public void writeToFile(String string) throws IOException;
    public void setValue(String key,String value);
    public String getValue(String key);
}
