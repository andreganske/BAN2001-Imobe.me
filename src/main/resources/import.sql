--
-- JBoss, Home of Professional Open Source
-- Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
-- contributors by the @authors tag. See the copyright.txt in the
-- distribution for a full listing of individual contributors.
--
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
-- http://www.apache.org/licenses/LICENSE-2.0
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
--

-- You can use this file to load seed data into the database using SQL statements
insert into Member (id, name, email, phone_number) values (0, 'John Smith', 'john.smith@mailinator.com', '2125551212');

insert into Endereco (id, logradouro,numero,complemento,bairro,cep,cidade,estado) VALUES (1, 'Rua Sao Miguel',184,'Casa','Boa Vista',89206200,'Joinville','SC');
insert into Endereco (id, logradouro,numero,complemento,bairro,cep,cidade,estado) VALUES (2, 'Rua Xavantes',641,'Casa','Atiradores',88243201,'Joinville','SC');
insert into Endereco (id, logradouro,numero,complemento,bairro,cep,cidade,estado) VALUES (3, 'Rua Gomes De Carvalho',1609,'4º Andar','Vila Olímpia',04547006,'São Paulo','SP');
insert into Endereco (id, logradouro,numero,complemento,bairro,cep,cidade,estado) VALUES (4, 'Rua São Miguel Maria',312,'Casa','Boa Vista',89206200,'Joinville','SC');
insert into Endereco (id, logradouro,numero,complemento,bairro,cep,cidade,estado) VALUES (5, 'Rua Xavantes Da Silva',641,'Casa','Atiradores',88243201,'Joinville','SC');
insert into Endereco (id, logradouro,numero,complemento,bairro,cep,cidade,estado) VALUES (6, 'Rua Gomes De Carvalho E Silva',1609,'4º Andar','Vila Olímpia',04547006,'São Paulo','SP');

insert into Pessoa (id, nome,cpf,rg,dtNascimento,telefone1,telefone2,email,endereco_id) VALUES (7, 'Victor Hugo dos Santos', 08553805948, 4543634, '1993-02-26', 88685082, 30290259, 'vhsantos26@gmail.com', 1);
insert into Pessoa (id, nome,cpf,rg,dtNascimento,telefone1,telefone2,email,endereco_id) VALUES (8, 'Joao', 12345678345, 9876543, '1985-12-31', 4799256179, 4734323245, 'tas@tas.com', 2);
insert into Pessoa (id, nome,cpf,rg,dtNascimento,telefone1,telefone2,email,endereco_id) VALUES (9, 'Maria da Silva', 43562849342, 6534879, '1995-01-30', 4785463269, 4734553245, 'maria@maria.com', 3);
insert into Pessoa (id, nome,cpf,rg,dtNascimento,telefone1,telefone2,email,endereco_id) VALUES (10, 'Marcos Serafino', 49875849342, 4563879, '1978-06-30', 4785587459, 476547853245, 'abc@abc.com', 4);

insert into Imovel (id, dono_id, endereco_id, tipo, qtdQuartos, qtdGaragens, qtdBanheiros, qtdAndares, areaUtil, areaTotal)  VALUES (11, 7, 5, 1, 4, 2, 2, 0, 50, 120);
insert into Imovel (id, dono_id, endereco_id, tipo, qtdQuartos, qtdGaragens, qtdBanheiros, qtdAndares, areaUtil, areaTotal)  VALUES (12, 8, 6, 1, 3, 1, 1, 2, 200, 570);

insert into Aluguel (id, Locatario_id, Imovel_id, valor, dtContrato, dtInicio, dtFim, incluiCondominio, incluiIPTU, incluiAgua, incluiLuz, cancelado) VALUES (13, 9, 11, 578, '2014-05-18', '2014-05-20', '2015-05-20', 0, 1, 1, 1, 0);
insert into Aluguel (id, Locatario_id, Imovel_id, valor, dtContrato, dtInicio, dtFim, incluiCondominio, incluiIPTU, incluiAgua, incluiLuz, cancelado) VALUES (14, 10, 12, 778, '2012-05-18', '2013-05-20', '2015-05-20', 1, 0, 1, 0, 0);
