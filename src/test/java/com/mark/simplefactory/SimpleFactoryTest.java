package com.mark.simplefactory;

import com.mark.ICourse;
import com.mark.JavaCourse;
import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void test(){
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();
    }

}
