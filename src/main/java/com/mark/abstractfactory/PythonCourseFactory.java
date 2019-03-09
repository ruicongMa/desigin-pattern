package com.mark.abstractfactory;

public class PythonCourseFactory implements CourseFactory {

    public INote createNote() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }
}
