create database pizzaria;

use pizzaria;

create table gerentes (
    cpf varchar(11) primary key not null,
    email varchar(120) unique not null,
    senha varchar(20) not null,
    telefone varchar(10) unique not null,
    cnpj varchar(14) unique not null
);

create table funcionarios (
    cpf varchar(11) primary key not null,
    nome varchar(150) not null,
    email varchar(120) unique not null,
    telefone varchar(10) unique not null,
    turno varchar(5),
    CONSTRAINT chk_turno CHECK turno in ('manhã', 'tarde', 'noite')
);

create table entregadores (
    documento varchar(14) primary key not null,
    tipo_documento tinyint(1) not null,
    email varchar(120) unique not null,
    telefone varchar(10) unique not null,
    cnh varchar(11) unique not null
)

create table pizzas (
    id integer primary key auto_increment not null,
    nome varchar(50) not null,
    ingredientes varchar(180) not null,
    contem_gluten tinyint(1) not null,
    tamanho varchar(8) not null,
    valor numeric(5, 2) not null,
    CONSTRAINT chk_tamanho CHECK tamanho in ('brotinho','média','grande')
);

create table vendas (
    id integer primary key auto_increment not null,
    id_pizza integer not null,
    id_entregador integer not null,
    qtde integer not null,
    data_entregador date not null
);