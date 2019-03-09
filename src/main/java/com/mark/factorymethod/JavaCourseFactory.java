package com.mark.factorymethod;

import com.mark.ICourse;
import com.mark.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new JavaCourse();
    }

}
