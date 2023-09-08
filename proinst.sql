create database proinst;
use proinst;

create table usuarios(
id int PRIMARY KEY AUTO_INCREMENT,
nome varchar(30),
login varchar(30),
senha text,
permissao varchar(30)
);

INSERT INTO usuarios (nome, login, senha,permissao) VALUES
('adm', 'adm', '123','Administrador'),
('vendedor', 'vendas1', '123','Vendedor'),
('projetista','proj','123','Projetista');


create table clientes(
id int PRIMARY KEY AUTO_INCREMENT,
nome varchar(30),
cpf_cnpj varchar(30),
endereco varchar(40),
numero varchar(5),
complemento varchar(15),
bairro varchar(20),
cidade varchar(30),
uf varchar(2),
cep varchar(11),
email varchar(40),
telefone varchar(20)
);


create table fotovoltaico(
id int PRIMARY KEY AUTO_INCREMENT,
fabricante varchar(30),
qtdPlacas int,
potPlacas double,
potGerador double,
potInversor double,
tipoTelhado varchar(30),
concessionariaEnergia varchar(30),
cliente_id int
);


ALTER TABLE fotovoltaico
ADD CONSTRAINT fk_cliente_id FOREIGN KEY (cliente_id)
REFERENCES clientes (id)
ON DELETE RESTRICT
ON UPDATE RESTRICT;


select * from usuarios;  

select  *from clientes;

select * from fotovoltaico;

select f.id, f.fabricante, f.qtdPlacas, f.potPlacas, f.potGerador, f.potInversor, f.tipoTelhado,f.concessionariaEnergia, c.nome from fotovoltaico f, clientes c WHERE f.cliente_id=c.id;

