package com.acordier.patterns;

import java.util.ArrayList;
import java.util.List;


public class DocumentsImpl implements Documents {

	private List<Document> documents;

	public DocumentsImpl() {
		this.documents = new ArrayList<Document>();
	}

	@Override
	public void addDocument(Document document) {
		this.documents.add(document);
	}

	@Override
	public void removeDocument(Document document) {
		this.documents.remove(document);
	}

	@Override
	public DocumentIterator iterator(DocType type) {
		return new DocumentIteratorImpl(type, documents);
	}

	private class DocumentIteratorImpl implements DocumentIterator {

		private int position;
		private DocType type;
		private List<Document> documents;

		public DocumentIteratorImpl(DocType type, List<Document> documents) {
			this.type = type;
			this.documents = documents;
		}

		@Override
		public boolean hasNext() {
			while (position < documents.size()) {
				Document doc = documents.get(position);
				if (doc.getType().equals(type) || type.equals(DocType.ALL)) {
					return true;
				} else {
					position++;
				}				
			}
			return false;
		}

		@Override
		public Document next() {
			return documents.get(position++);
		}

	}
}
