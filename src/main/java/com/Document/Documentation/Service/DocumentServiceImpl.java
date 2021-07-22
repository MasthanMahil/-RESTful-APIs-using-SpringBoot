package com.Document.Documentation.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Document.Documentation.Entity.Document;
import com.Document.Documentation.Repository.DocumentRepository;

@Service
public class DocumentServiceImpl implements DocumentService{
@Autowired
	private DocumentRepository documentRepository;

@Override
public Document saveDocument(Document document) {
	// TODO Auto-generated method stub
	 return documentRepository.save(document);
}

@Override
public List<Document> viewDocumentList(){
	
	return documentRepository.findAll();
}

@Override
public Document viewDocumentById(long documents) {
	// TODO Auto-generated method stub
	return  documentRepository.findById(documents).get() ;
}

@Override
public Document updateDocument(long documents, Document document) {
	
	Document doucDB=documentRepository.findById(documents).get();
	
	if(Objects.nonNull(document.getDepartmentName()) && !"".equalsIgnoreCase(document.getDepartmentName())){
		
		doucDB.setDepartmentName(document.getDepartmentName());
	}	
	

	if(Objects.nonNull(document.getDepartmentCode()) && !"".equalsIgnoreCase(document.getDepartmentCode())){
		
		doucDB.setDepartmentCode(document.getDepartmentCode());
	}	
	return  documentRepository.save(doucDB);
}

@Override
public void deleteDocumentById(long documents) {
	documentRepository.deleteById(documents);
	
}



}
