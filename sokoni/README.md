# Sokoni POS System

This is a simple Point of Sale (POS) system written in Kotlin.

## Build and Run

```bash
./gradlew build
java -jar build/libs/sokoni-0.0.1.jar
```

## Docker

To build and run the Docker image:

```bash
docker build -t sokoni:0.0.1 .
docker run -p 8080:8080 sokoni:0.0.1
```
