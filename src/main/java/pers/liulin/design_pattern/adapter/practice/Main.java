package pers.liulin.design_pattern.adapter.practice;

import java.io.IOException;

/**
 * Created by LiuLin on 2017/3/30 0030.
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try{
            f.readFromFile(Main.class.getResource("/file.text").getFile());
            System.out.println(f.getValue("year"));
            f.setValue("year","2017");
            f.setValue("month","3");
            f.setValue("day","30");
            f.writeToFile("/D:/ideaProjects/JavaPratice/src/main/resources/newfile.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
