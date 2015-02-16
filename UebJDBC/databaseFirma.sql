drop user scott;
drop database firma;
CREATE USER scott WITH PASSWORD 'tiger';
CREATE DATABASE firma;
GRANT ALL PRIVILEGES ON DATABASE firma to scott;

psql scott -h localhost -d firma