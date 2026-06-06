CREATE DATABASE cloudcostdb;

USE cloudcostdb;

CREATE TABLE cloud_cost (

id BIGINT PRIMARY KEY AUTO_INCREMENT,

service_name VARCHAR(100),

cost DOUBLE,

billing_month VARCHAR(20)

);

INSERT INTO cloud_cost
(service_name,cost,billing_month)

VALUES
('AWS EC2',1200,'May'),
('AWS S3',450,'May'),
('Azure VM',980,'May');
