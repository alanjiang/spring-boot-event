package com.agilean.spring.event;

import org.springframework.context.ApplicationEvent;

public class StudentAddEvent extends ApplicationEvent {

    private String name;
    
	public StudentAddEvent(Object source, String name) {
		super(source);
		this.name=name;
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Object getSource() {
		// TODO Auto-generated method stub
		return super.getSource();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
