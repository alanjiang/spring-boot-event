package com.spring.demo.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.agilean.spring.event.StudentAddBean;
import com.agilean.spring.event.StudentAddListener;
import com.example.demo.DemoApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
//@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/beans.xml")
public class SpringEventTestCase {
        /*
         * 
         * StudentAddListener， StudentAddBean 必须注入容器，否则事件不起作用。
         * 
         * 
         */
	    @Autowired
	    private StudentAddBean studentAddBean;
	    //@Autowired
	    //private StudentAddListener studentAddListener;
	    @Test
	    public void testStudentAddEvent() {
	    	studentAddBean.addStudent("张三");
	    	studentAddBean.addStudent("李四");
	    }
	    
	    
	   
}
