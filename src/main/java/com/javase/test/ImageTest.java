package com.javase.test;

import com.sun.istack.internal.NotNull;
import org.junit.Test;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * @author: Admin
 * @create: 2022/2/23 21:42
 */

public class ImageTest {
    //fail("123");
    //assertNotNull(new Object());
    @Test
    public void test() {
        try {
            BufferedImage image = ImageIO.read(new File("D:/gamematerial/images/BadTank1.png"));
            assertNotNull(image);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}