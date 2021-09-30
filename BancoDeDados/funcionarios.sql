SELECT * FROM rh.funcionarios;

USE Rh;

INSERT INTO funcionarios (nome, idade, salario, endereco) VALUES ("David", 28, "2500.00", "Rua ABCDE"),("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE"),
("David", 28, "2500.00", "Rua ABCDE");


select * from funcionarios where salario > 2000;
select * from funcionarios where salario < 2000;
update funcionarios set salario = "1000" where id = 6;
