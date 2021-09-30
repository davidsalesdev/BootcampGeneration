CREATE DATABASE ecommerce;
USE ecommerce;

CREATE TABLE tb_produtos (
    id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(30) not null,
    preco decimal(6,2),
    marca_id INTEGER not null
    
);


 
  SELECT * FROM tb_produtos;
  
INSERT INTO tb_produtos (nome,preco,marca_id) VALUES ("Sapato","60.53",11),

("Camisa","58.18",9),
("Meias","92.81",3),
("Blusa","76.95",9),
("Tênis","96.56",4),
("Calça","61.16",8);

select * from tb_produtos where preco > 500;

select * from tb_produtos where preco < 500;

update tb_produtos set preco = 400 where id = 15;