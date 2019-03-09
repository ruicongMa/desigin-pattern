package com.mark.factorymethod;

import com.mark.ICourse;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void demo(){
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();
    }

}
