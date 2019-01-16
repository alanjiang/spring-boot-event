package com.agilean.spring.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class StudentAddBean implements ApplicationContextAware {
   
	/**
     * 定义Spring上下文对象
     */
    private ApplicationContext applicationContext = null;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
        this.applicationContext=applicationContext;
	}
	
	 /**
     * 增加一个学生
     *
     * @param studentName
     */
    public void addStudent(String studentName) {
        // 1.构造一个增加学生的事件
        StudentAddEvent aStudentEvent = new StudentAddEvent(
                applicationContext, studentName);
        // 2.触发增加学生事件
        applicationContext.publishEvent(aStudentEvent);
    }


}
