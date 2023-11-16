package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class FilePath {
    private String path;
    FilePath (String path){
        this.path = path;
    }
    ArrayList<String> getList(){
        ArrayList<String> list = new ArrayList<>();
        try(BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(path)))){
            while (buff.ready()) {
                list.add(buff.readLine());
            }
        }catch (IOException e){
            e.getStackTrace();
        }
        return list;
    }
}
