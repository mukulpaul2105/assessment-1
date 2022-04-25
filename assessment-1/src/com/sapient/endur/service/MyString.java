package com.sapient.endur.service;

public class MyString {

	private String message;
	
	public MyString() {
		
	}
	

	public boolean checkPalindrome() {
		StringBuffer sb = new StringBuffer(this.message);
		if(sb.equals(sb.reverse())) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
	
	public boolean presentChar(CharSequence ch) {

		if(this.message.contains(ch)) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
	
	public boolean checkExistance(String me) {
		if(this.message.contains(me)) {
			return true;
			
		} else {
			return false;
		}
	}
	
	
	public String displayChar() {
		return message.substring(2, 5);
	}
	
	
}

















