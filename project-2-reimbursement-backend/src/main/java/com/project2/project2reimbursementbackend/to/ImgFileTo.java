package com.project2.project2reimbursementbackend.to;

public class ImgFileTo {
	 private String name;
	  private String url;
	  private String type;
	  private int size;
	 
	  private String message;
	  // response file
	  public ImgFileTo() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public ImgFileTo(String message) {
		super();
		this.message = message;
	}
	public ImgFileTo(String name, String url, String type, int size) {
	    this.name = name;
	    this.url = url;
	    this.type = type;
	    this.size = size;
	  }
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public String getUrl() {
	    return url;
	  }
	  public void setUrl(String url) {
	    this.url = url;
	  }
	  public String getType() {
	    return type;
	  }
	  public void setType(String type) {
	    this.type = type;
	  }
	  public long getSize() {
	    return size;
	  }
	  public void setSize(int size) {
	    this.size = size;
	  }
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ImgFileTo [name=" + name + ", url=" + url + ", type=" + type + ", size=" + size + "]";
	}
}
