package com;

public class InsufficientBalanceException extends RuntimeException{
	 private String msg;
	InsufficientBalanceException(String msg){
		this.msg=msg;
	}
	 String getmsg(){
		return msg;
	}

}
//Rules to work with custom/UserDefined Exception
//1.create class with Exception name;
//2.if a class extends exception then its known exception 
//if a class extends RuntimeException then its unknown Exception.
//3.Override getmsg()-->(Variable,Constructor,method);   -->( this method is present in throwable class)
//4.invoke the Exception object using throw keyword.
//and handle it using try and catch block.
//throw keyword use to invoke and throws is to indicate
