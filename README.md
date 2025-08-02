# spring-s3-learn

A sample Spring Boot project to demonstrate integration with Amazon S3 for file upload, download, and management. This repository is intended for learning purposes and provides simple examples to help you get started with AWS S3 operations in a Spring application.

## Features

- Upload files to an S3 bucket
- Download files from an S3 bucket
- List files in a bucket
- Delete files from S3
- Example REST endpoints using Spring Boot

## Technologies Used

- Java
- Spring Boot
- AWS SDK for Java (S3)
- Maven

## Getting Started

### Prerequisites

- Java 8 or above
- Maven
- AWS account with S3 access
- AWS credentials configured locally (via `~/.aws/credentials` or environment variables)

### Clone the Repository

```bash
git clone https://github.com/Anshudalal941/spring-s3-learn.git
cd spring-s3-learn
```

### Configuration

Set your AWS credentials and S3 bucket details in `application.properties`:

```properties
aws.accessKeyId=YOUR_ACCESS_KEY
aws.secretKey=YOUR_SECRET_KEY
aws.region=us-east-1
aws.s3.bucket=your-bucket-name
```

> **Note:** Never commit your credentials to version control.

### Build and Run

```bash
mvn clean install
mvn spring-boot:run
```

### Example Usage

The project exposes REST endpoints for basic S3 operations. You can test them using tools like Postman or curl.

- **Upload a file:**  
  `POST /s3/upload` (multipart/form-data)

- **Download a file:**  
  `GET /s3/download/{filename}`

- **List files:**  
  `GET /s3/list`

- **Delete a file:**  
  `DELETE /s3/delete/{filename}`

## Project Structure

```
src/
└── main/
    ├── java/
    │   └── com/
    │       └── example/
    │           └── s3/
    │               ├── controller/
    │               └── service/
    └── resources/
        └── application.properties
```

## Contributing

Pull requests and suggestions for improvement are welcome! Please open an issue or PR for discussion.

## License

This project is licensed under the MIT License.
