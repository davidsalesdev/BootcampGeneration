-- Exercicio 01
create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (
id integer(3) primary key auto_increment,
nomeclass varchar(255),
armaInicial varchar(255),
armaduraInicial varchar(255));

create table tb_personagem(
id integer(3) primary key auto_increment,
nomechar varchar(255), 
nivel integer (3),
arma varchar(255),
armadura varchar (255),
forca integer (255),
agilidade integer (255),
energia integer (255),
vida integer(3),
mana integer(3),
danoAtaque integer(3),
danoHabilidade integer(3),
guild varchar (30),
world varchar (15),
ranking varchar (20),
classeId integer(3),
foreign key (classeId) references tb_classe (Id));

insert into tb_classe (nomeclass,armaInicial,armaduraInicial) values ("Summoner","Inicial Sword", "inicial Set");
insert into tb_classe (nomeclass,armaInicial,armaduraInicial) values ("Wizard","inicial Staff", "inicial Set");
insert into tb_classe (nomeclass,armaInicial,armaduraInicial) values ("Knight","inicialGladius", "inicial Set");
insert into tb_classe (nomeclass,armaInicial,armaduraInicial) values ("Elf","inicialCrossbow", "inicial Set");
insert into tb_classe (nomeclass,armaInicial,armaduraInicial) values ("Elf","InicialCrossbow", "inicial Set");

insert into tb_personagem (nomechar,nivel, arma, armadura, forca, agilidade, energia, vida, mana, danoAtaque,danoHabilidade, guild, world,Ranking, classeId) 
values

("Admin","1000","Giant Sword", "Brave Set", 62767,"62767","62767","62767","62767","62767","62767", "GENERATION", "1", "Arena",1),
("SrLancelot","550", "Katana", "Brave Set",32767,32000,15000,30767,22767,12767,32767,"DRAGONS ","2", "Devias",2),
("Crush","Katana","550", "Brave Set",22767,22767,12767,32767,12767,32767,32767,"WarRed", "3","Kali",3),
("Pr0z1nh0","Staff","550", "Eclipse",32767,12767,12767,12767,12767,12767,12767,"DRAGONS ","4", "Kundun",4),
("Seu Vagem","Crossbow","550", "Divine Set",10000,31000,32767,32767,32767,32767,32767,"VForce", "5","Noria",5),
("zType","Battle Axe","458", "Dragon Knight Set", 12767,19000,10767,12767,12767,3560,13267,"Ryzen","6", "Dungeon1",6),
("Canonymous","Crossbow","150", "Divine Set",10000,15500,7350,9400,8500,12000,12767,"GODS","7", "Dungeon2",7),
("HaLLsFire","Battle Axe","350", "Bronze Set",14567,23377,13000,14505,12167,12767,13767,"WarRed","8", "Templo da Ilusao",8);

select *from tb_personagem;

select * from tb_personagem where danoAtaque > 20000;
select * from tb_personagem where danoHabilidade between 10000 and 20000;
select * from tb_personagem where nomechar like '%c%';
select * from tb_personagem p inner join tb_classe c on p.classeId = c.id;
select * from tb_personagem p inner join tb_classe c on p.classeId = c.id where c.nomeclass = 'Elf';