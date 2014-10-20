package com.acordier.patterns;

public interface Documents {
	public void addDocument(Document document);
	public void removeDocument(Document document);
	public DocumentIterator iterator(DocType type);
}
