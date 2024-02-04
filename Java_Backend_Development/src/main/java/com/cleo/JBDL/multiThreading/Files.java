package com.cleo.JBDL.multiThreading;

import java.io.*;

public class Files {

    private static final int BUFFER_SIZE = 8 * 1024;

    private static final String FILE = "a.txt";
    static String firstLineOfFile(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }catch (IOException e){
            return "Error Opening file: " + e.getMessage();

        }
    }
    static void copy(String source, String destination){
        try(InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(destination)){
            byte[] buffer = new byte[BUFFER_SIZE];
            int n;
            while((n=in.read(buffer))>=0)
                out.write(buffer,0,n);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = Files.class.getResource("a.txt").getFile().toString();
        System.out.println(firstLineOfFile(path));
        copy(path,"b.txt");

    }

}
