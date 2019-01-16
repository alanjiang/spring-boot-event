package com.agilean.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StudentAddListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// 1.判断是否是增加学生对象的事件
        if (!(event instanceof StudentAddEvent)) {
            return;
        }

        // 2.是增加学生事件的对象，进行逻辑处理，比如记日志、积分等
        StudentAddEvent studentAddEvent = (StudentAddEvent) event;
        System.out.println("增加了学生:" + studentAddEvent.getName());
		
	}

}
