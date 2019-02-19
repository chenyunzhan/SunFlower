package com.sunflower.model;


public class ResultVo {
	private int status;
	private String message;
	private String document;
	private Object data;
	
    private ResultVo(int status, Object data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
    public static ResultVo create(int status, Object data, String msg) {
        return new ResultVo(status, data, msg);
    }
    
    public static ResultVo create(int status, String msg) {
        return new ResultVo(status, null, msg);
    }
}
