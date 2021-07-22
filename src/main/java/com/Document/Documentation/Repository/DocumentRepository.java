package com.Document.Documentation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Document.Documentation.Entity.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long>{

}
