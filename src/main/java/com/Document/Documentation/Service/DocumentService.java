package com.Document.Documentation.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Document.Documentation.Entity.Document;

@Service
public interface DocumentService {


	public Document saveDocument(Document document);



	public Document viewDocumentById(long documents);



	public List<Document> viewDocumentList();



	
public Document updateDocument(long documents, Document document);



public void deleteDocumentById(long documents);



	

}
