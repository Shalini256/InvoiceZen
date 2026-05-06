package com.example.invoice_generatorapi.repository;

import com.example.invoice_generatorapi.entity.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {
    List<Invoice> findByClerkId(String clerkId);

    Optional<Invoice> findByClerkIdAndId(String clerkId, String id);
}
