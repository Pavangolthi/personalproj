package com.security.app.config;

import java.util.HashSet;
import java.util.Set;


public enum ApplicationUserRoles {
	STUDENT{
		@Override
		public Set<ApplicationUserPermission> applicationUserPermission() {
			// TODO Auto-generated method stub
			return null;
		}
	}, 
	ADMIN{
		@Override
		public Set<ApplicationUserPermission> applicationUserPermission() {
			// TODO Auto-generated method stub
			Set<ApplicationUserPermission> adminperm =  new HashSet<ApplicationUserPermission>();
			adminperm.add(ApplicationUserPermission.COURSE_READ);
			adminperm.add(ApplicationUserPermission.COURSE_WRITE);
			adminperm.add(ApplicationUserPermission.STUDENT_READ);
			adminperm.add(ApplicationUserPermission.STUDENT_WRITE);
			return adminperm;
		}
	},
	
	ADMINTRAINEE{
		@Override
		public Set<ApplicationUserPermission> applicationUserPermission() {
			Set<ApplicationUserPermission> adminperm =  new HashSet<ApplicationUserPermission>();
			adminperm.add(ApplicationUserPermission.COURSE_READ);
			adminperm.add(ApplicationUserPermission.STUDENT_READ);
			return adminperm;
		}
	};
	
	public abstract Set<ApplicationUserPermission> applicationUserPermission();
	
	
}
