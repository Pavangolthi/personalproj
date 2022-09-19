package com.security.app.config;

public enum ApplicationUserPermission {
	STUDENT_READ("student:read"),
	STUDENT_WRITE("student:write"),
	COURSE_READ("course:read"),
	COURSE_WRITE("course:write");
	
	private final String permission;
	
	private ApplicationUserPermission(final String permission) {
		this.permission=permission;
	}
	
	public String getPermission() {
		return permission;
	}
	
}	
