-- Setup DB for liquibase to work on

-- create database
CREATE DATABASE landblume;

-- switch to database
\c landblume

-- create schema
CREATE SCHEMA landblume_prod;

-- create user liquibase
CREATE ROLE liquibase WITH PASSWORD 'xxx' NOSUPERUSER NOCREATEDB NOCREATEROLE inherit LOGIN NOREPLICATION NOBYPASSRLS CONNECTION LIMIT -1;

-- create user landblume_app
CREATE ROLE landblume_app WITH PASSWORD 'xxx' NOSUPERUSER NOCREATEDB NOCREATEROLE inherit LOGIN NOREPLICATION NOBYPASSRLS CONNECTION LIMIT -1;

-- grant privileges
GRANT ALL ON SCHEMA landblume_prod TO liquibase;

GRANT USAGE ON SCHEMA landblume_prod TO landblume_app;
GRANT SELECT, INSERT, UPDATE ON ALL TABLES IN SCHEMA landblume_prod TO landblume_app;

ALTER DEFAULT PRIVILEGES FOR USER liquibase IN SCHEMA landblume_prod GRANT SELECT, INSERT, UPDATE ON TABLES TO landblume_app;
