package atividade5;

public class MessageException {
	public String message;

	public MessageException(String msg) {
		message = msg;
	}
	public MessageException(Throwable msg) {
		message = msg.getMessage();
	}
	
}
