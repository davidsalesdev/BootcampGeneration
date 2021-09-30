create database db_pizzaria_legal;
use  db_pizzaria_legal;
create table tb_categoria(
id integer auto_increment,
Sabores  varchar(35),
Promoção varchar(3),
Tamanho varchar(35),
primary key(id)
);


insert into tb_categoria(Sabores, Promoção, Tamanho)
values
("Catupiry","Sim","Grande"),
("Mussarela","Sim","Grande"),
("Frango","Não","Grande"),
("Napolitana", "Não","Grande");


create table tb_pizza(
id integer auto_increment,
Nome varchar (35) not null,
Refri varchar (3),
Preço decimal(4,2),
Pagamento varchar (15),
categoria_id integer not null,

primary key(id),
foreign key (categoria_id) references tb_categoria(id)

);
 insert into  tb_pizza(Nome, Refri, Preço, Pagamento, categoria_id)
 values
 ("Calabresa", "Sim",28.00,"Cartão", 1),
 ("Mussarela", "Não",32.50, "Dinheiro",2),
 ("Carne","Sim",27.00,"Dinheiro",3),
 ("Portuguesa","Sim",24.00,"QRcode",4),
 ("Brigadeiro","Sim",36.00,"Cartão",5),
 ("Frango", "Sim",32.50, "Qrcode",5),
 ("Atum", "Sim",29.00,"Dinheiro",1),
 ("Bacon com Queijo", "Sim",23.00, "Dinheiro",2);

select * from tb_pizza where Preço > 30;
select * from tb_pizza where Preço between 29 and 31;
select * from tb_pizza where nome like "%ca%";
select * from tb_pizza
	
inner join tb_categoria on tb_categoria.id=tb_pizza.categoria_id;
select  tb_pizza.Nome,tb_pizza.Preço,tb_categoria.Tamanho,tb_categoria.Promoção from tb_pizza
inner join tb_categoria on tb_categoria.id=tb_pizza.categoria_id;

