package com.Document.Documentation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Document.Documentation.Entity.Document;
import com.Document.Documentation.Service.DocumentService;

@RestController
public class BestController {
	@Autowired
	private DocumentService documentService;
	
	@PostMapping("/Documents")
	public Document saveDocument(@RequestBody Document document) {
		return documentService.saveDocument(document);
		
	}
	
	@GetMapping("/Documents")
	public List<Document> viewDocumentList() {
		
		return documentService.viewDocumentList();
		
	}
	@GetMapping("/Documents/{id}")
	public Document viewDocumentById(@PathVariable("id") long documents) {
		
		return documentService.viewDocumentById(documents);
		
	}
	
	@PutMapping("/Documents/{id}")
	public Document updateDocument(@PathVariable("id") long documents,@RequestBody Document document) {
		
		return documentService.updateDocument(documents,document);
		
	}
	@DeleteMapping("/Documents/{id}")
	public String deleteDocumentById(@PathVariable("id") long documents){
		documentService.deleteDocumentById(documents);
		return "Deleted Document Data Sucessful....";
		
		
	}
}