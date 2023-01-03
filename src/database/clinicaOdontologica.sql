CREATE DATABASE clinicaOdontologica;

USE clinicaOdontologica;

CREATE TABLE paciente(
  id int PRIMARY KEY AUTO_INCREMENT,
  nome varchar(60) NOT NULL,
  nascimento date NOT NULL,
  cpf varchar(11) NOT NULL,
  telefone varchar(14) DEFAULT '',  
  email varchar(40) DEFAULT ''
) 

USE clinicaOdontologica;

CREATE TABLE doutor(
  id int PRIMARY KEY AUTO_INCREMENT,
  nome varchar(60) NOT NULL,
  cro varchar(20) DEFAULT '',
  especialidade varchar(100) DEFAULT ''
) 

USE clinicaOdontologica;

CREATE TABLE consultaAgendamento (
  id int PRIMARY KEY AUTO_INCREMENT,
  idPaciente int NOT NULL,
  idDoutor int NOT NULL,
  dataHora datetime NOT NULL,
  valor double DEFAULT 0,
  status boolean DEFAULT 1,
    
  CONSTRAINT FK_paciente FOREIGN KEY (idPaciente) REFERENCES paciente (id),     
  CONSTRAINT FK_doutor FOREIGN KEY (idDoutor) REFERENCES doutor (id)   
) 
