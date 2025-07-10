package com.example.spring_s3_learn.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.io.IOException;

@Service
public class S3Service {
    private final S3Client s3Client;
    private final String bucketName = "learn-spring-bucket"; // replace with your bucket name

    public S3Service() {
        this.s3Client = S3Client.builder()
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(ProfileCredentialsProvider.create())
                .build();
    }

    public String uploadFile(MultipartFile file) throws IOException {
        String key = file.getOriginalFilename();

        PutObjectRequest request = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(key)
                .build();

        s3Client.putObject(request, RequestBody.fromBytes(file.getBytes()));

        return "https://" + bucketName + ".s3.amazonaws.com/" + key;
    }
}
