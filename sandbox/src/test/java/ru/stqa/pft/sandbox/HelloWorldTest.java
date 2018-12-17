package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {

   @Test

    public void testHello(){
        Square br=new Square(6,7);

        Assert.assertEquals(br.area(),42.0);
    }
}
