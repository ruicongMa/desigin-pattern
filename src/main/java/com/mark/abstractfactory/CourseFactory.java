package com.mark.abstractfactory;

public interface CourseFactory {

    INote createNote();

    IVideo createVideo();

}
