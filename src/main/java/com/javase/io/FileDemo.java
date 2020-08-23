package com.javase.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author: Admin
 * @create: 2020/8/15 14:55
 */
public class FileDemo {
    public static void main(String[] args) throws Exception {
        //String fileName = "D:\\IDEWorkSpace\\idea-workspace\\javase-demo\\src\\main\\java\\com\\javase" + File.separator;
        String fileName = "E:\\gamelogin" + File.separator;
        System.out.println(fileName);
        File file = new File(fileName);
        //fileReadWrite(file);
        printFile(file,0);
    }

    //读取文件
    public static void fileReadWrite(File file) throws Exception {
        long start = new Date().getTime();

        System.out.println(file.getName());
        FileInputStream in = new FileInputStream(file);
        BufferedInputStream bi = new BufferedInputStream(in);
        //ByteArrayInputStream bin=new ByteArrayInputStream();
        byte[] b = new byte[1024];
        int l = 0;
        String s = "";
        while ((l = in.read(b)) != -1) {
            s = new String(b, 0, l);
        }
        System.out.println(s);
        in.close();

        long end = new Date().getTime() - start;
        System.out.println(end);
    }

    //递归打印文件
    public static void printFile(File file,int deep) throws Exception {

        if (file != null) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files != null) {
                    for (int i = 0; i < files.length; i++) {
                        printFile(files[i],deep+1);
                    }
                }
            } else {
                for (int i = 0; i < deep; i++) {
                    System.out.print("-");
                }
                System.out.println(file);
                //fileReadWrite(file);
            }
        }
    }
}
