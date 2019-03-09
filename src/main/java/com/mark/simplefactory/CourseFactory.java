package com.mark.simplefactory;

import com.mark.ICourse;

public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz){
        if(null != clazz){
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
