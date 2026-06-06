# Cloud Cost Monitoring Dashboard

## Project Overview

Cloud Cost Monitoring Dashboard is a DevSecOps-based project developed using Spring Boot, MySQL, Docker, Jenkins, Kubernetes, Prometheus, and Grafana.

The application helps monitor cloud service costs and provides REST APIs to manage billing information. The project demonstrates a complete CI/CD pipeline with security scanning, containerization, orchestration, and monitoring.

---

## Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Docker
* Jenkins
* SonarQube
* Trivy
* Nexus Repository
* Kubernetes
* Prometheus
* Grafana
* Git & GitHub
* AWS EC2

---

## Project Architecture

GitHub → Jenkins → Maven Build → SonarQube → Trivy → Nexus → Docker → Kubernetes → Prometheus → Grafana

---

## Features

* Store cloud service cost details
* REST API for cost management
* MySQL database integration
* Docker containerization
* CI/CD pipeline automation
* Code quality analysis using SonarQube
* Security scanning using Trivy
* Kubernetes deployment
* Monitoring using Prometheus and Grafana

---

## Project Structure

cloud-cost-dashboard/

├── src/

├── k8s/

├── Dockerfile

├── Jenkinsfile

├── pom.xml

├── cloudcost.sql

└── README.md

---

## API Endpoints

### Get All Costs

GET

/api/costs

### Add Cost

POST

/api/costs

Sample Request:

{
"serviceName": "AWS EC2",
"cost": 1200,
"billingMonth": "May"
}

---

## Build Application

mvn clean package

---

## Run Application

java -jar target/cloud-cost-dashboard-1.0.jar

---

## Docker Build

docker build -t cloud-cost-dashboard .

docker run -p 8080:8080 cloud-cost-dashboard

---

## Kubernetes Deployment

kubectl apply -f k8s/

kubectl get all

---

## Monitoring

Prometheus Metrics Endpoint:

/actuator/prometheus

Grafana Dashboard can be configured using Prometheus as the datasource.

---

## Author

Sriram

Cloud & DevOps Enthusiast

AWS | Docker | Kubernetes | Jenkins | Spring Boot


