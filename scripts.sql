-- Active: 1665969323236@@127.0.0.1@5432@funcionarioEmp@public

CREATE TABLE "funcionario" (
  "func_cd_id" serial not null,
  "func_tx_nome" varchar(50) not null,
  "func_tx_email" varchar(80) not null ,
  "func_tx_senha" varchar(6) not null,
  "func_tx_cpf" varchar(11) not null,
  "func_tx_apelido" varchar(20) not null,
  "func_tx_time" varchar(20) not null
);

insert into time (tim_tx_nome) values
(
  'Front-End mobile'
),
(
  'Front-End web'
),
(
  'Back-End'
);

insert into funcionario (func_tx_nome, func_tx_email, func_tx_senha, func_tx_cpf, func_tx_apelido, func_tx_time) values
(
  'Marcus',
  'marcos@email.com',
  '123',
  '19020071711',
  'Marquinhos',
  'FE'
),
(
  'Maria',
  'marias@email.com',
  '321',
  '19020071722',
  'Mari',
  'BE'
),
(
  'Jonas',
  'jonas@email.com',
  '1234',
  '19020071733',
  'John',
  'API'
);


-- CREATE TABLE "time" (
--   "tim_cd_id" serial not null,
--   "tim_tx_nome" varchar(20) not null,
--    PRIMARY KEY ("tim_cd_id")
-- );

-- CREATE TABLE "funcionario" (
--   "func_cd_id" serial not null,
--   "func_tx_nome" varchar(50) not null,
--   "func_tx_email" varchar(80) not null ,
--   "func_tx_senha" varchar(6) not null,
--   "func_tx_cpf" varchar(11) not null,
--   "func_tx_apelido" varchar(20) not null,
--   "fk_tim_cd_id" int not null,
--   CONSTRAINT "FK_funcionario.fk_tim_cd_id"
--     FOREIGN KEY ("fk_tim_cd_id")
--       REFERENCES "time"("tim_cd_id")
-- );