-- Active: 1665969323236@@127.0.0.1@5432@funcionarioEmp@public
CREATE TABLE "time" (
  "tim_cd_id" serial not null,
  "tim_tx_nome" varchar(20) not null,
   PRIMARY KEY ("tim_cd_id")
);

CREATE TABLE "funcionario" (
  "func_cd_id" serial not null,
  "func_tx_nome" varchar(50) not null,
  "func_tx_email" varchar(80) not null ,
  "func_tx_senha" varchar(6) not null,
  "func_tx_cpf" varchar(11) not null,
  "func_tx_apelido" varchar(20) not null,
  "fk_tim_cd_id" int not null,
  CONSTRAINT "FK_funcionario.fk_tim_cd_id"
    FOREIGN KEY ("fk_tim_cd_id")
      REFERENCES "time"("tim_cd_id")
);