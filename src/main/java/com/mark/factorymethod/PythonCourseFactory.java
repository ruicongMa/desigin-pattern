package com.mark.factorymethod;

import com.mark.ICourse;
import com.mark.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
