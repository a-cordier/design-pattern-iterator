package com.acordier.patterns;

public class IteratorApp {
	
	public static void main(String[]args) {
		Documents documents = getDocuments();
		DocumentIterator it = documents.iterator(DocType.ALL);
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("=================");
		it = documents.iterator(DocType.FOLDER);
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	  private static Documents getDocuments() {
		  Documents documents = new DocumentsImpl();
		  documents.addDocument(new Document(DocType.FILE));
		  documents.addDocument(new Document(DocType.FOLDER));
		  documents.addDocument(new Document(DocType.ORDERED_FOLDER));
		  documents.addDocument(new Document(DocType.FILE));
		  documents.addDocument(new Document(DocType.FILE));
		  documents.addDocument(new Document(DocType.ORDERED_FOLDER));
		  documents.addDocument(new Document(DocType.NOTE));
		  documents.addDocument(new Document(DocType.FOLDER));
		  documents.addDocument(new Document(DocType.FILE));
		  documents.addDocument(new Document(DocType.ORDERED_FOLDER));
		  return documents;
		  
		  
	    }
}
