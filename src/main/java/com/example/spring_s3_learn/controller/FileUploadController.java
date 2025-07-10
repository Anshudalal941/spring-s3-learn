package com.example.spring_s3_learn.controller;
import com.example.spring_s3_learn.services.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/files")
public class FileUploadController {

    @Autowired
    private S3Service s3Service;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            String url = s3Service.uploadFile(file);
            return ResponseEntity.ok("✅ File uploaded successfully: " + url);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("❌ Upload failed: " + e.getMessage());
        }
    }
}
