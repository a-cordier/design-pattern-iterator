package com.acordier.patterns;

public class Document {
	
	private DocType type;
		
	public Document(DocType type) {
		this.type = type;
	}


	public DocType getType(){
		return type;
	}


	@Override
	public String toString() {
		return "Document [type=" + type + "]";
	}
	
}
