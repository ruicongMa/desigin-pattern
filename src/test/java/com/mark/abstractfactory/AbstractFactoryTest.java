package com.mark.abstractfactory;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void test(){
        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();
    }
}
