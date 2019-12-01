/*package com.ftwitter.demo;

import java.util.Objects; 

public class Login{
	
	private String userName; 
	private String password; 
	
	public String getUserName() {
		return userName; 
	}
	
	
	
	public void setUserName(String userName) {
		
		this.userName = userName; 
		// TODO Auto-generated method stub

	}
	
	public String getPassword() {
		return password;
		
	}
	
	public void setPassword(String password) {
		this.password = password; 
		
	}
	
	@Override public int hashCode () {
		return Objects.hash(password, userName);
	}
	
	@Override
	public boolean equals (Object obj) {
		if (this == obj) {
			return true; 
			
			}
		if (!(obj instanceof Login)) {
			return false; 
		}
		
		Login other = (Login)obj; 
		return Objects.equals(password, other.password) && Objects.equals(userName, other.userName);
		
	}
	@Override 
	public String toString() {
		return "Login [userName=" + userName + ",password=" + password + "]";
	}

}*/
