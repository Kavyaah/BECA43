package com;

public class InvalidChoiceException extends Exception {
private String msg;
 public InvalidChoiceException(String msg) {
	 this.msg=msg;
 }
 String getmsg() {
	 return msg;
 }
}
