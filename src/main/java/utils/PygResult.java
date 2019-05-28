package utils;

import java.io.Serializable;

public class PygResult implements Serializable{
	private Boolean success;
	private String message;
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public PygResult(Boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	
}
