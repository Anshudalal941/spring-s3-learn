package com.example.spring_s3_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringS3LearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringS3LearnApplication.class, args);
	}

}
/*
1. Set Up AWS S3 Bucket
2. Create an S3 Bucket - Region:ap-south-1
						 Leave all defaults as-is (or disable "Block public access")
3. Create IAM User with Programmatic Access
	Go to IAM Console.
	Choose Users → Add users
	Set: User name: e.g. springboot-s3-user
	Enable Programmatic access
	Attach policies directly → Choose AmazonS3FullAccess
	Complete and save the Access key ID and Secret access key. IN CSV
4.
Download AWS CLI Installer
IN CMD- aws configure
Then enter:
AWS Access Key ID
AWS Secret Access Key
Default region (e.g., ap-south-1)
Default output format: json
 */