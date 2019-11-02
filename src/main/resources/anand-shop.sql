create database anand_shop;
use anand_shop;

drop table category;
create table category(category_name varchar(30) primary key Not null ,remarks varchar(50) , updated_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,created_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP);
insert into category(category_name,remarks) values('House Appliance','House Appliance');
insert into category(category_name,remarks) values('Iron','iron');

create table category(category_name varchar(30) primary key Not null ,remarks varchar(50) , updated_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,created_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP);

create table sub_category(sub_category_name varchar(30) primary key Not null ,category_name varchar(30) , remarks varchar(50) , updated_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,created_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP, FOREIGN key (category_name) references category(category_name));


insert into sub_category (sub_category_name,category_name,remarks) values ('Paraikol','iron','paaraikol');
insert into sub_category(sub_category_name,category_name,remarks)values('plastic','House Appliance','plastic');

create table supplier(supplier_name varchar(30) primary key Not null ,phone_number varchar(30),remarks varchar(50) , updated_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,created_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP);

insert into supplier(supplier_name,phone_number,remarks) values('yusuf','04652-254546','plastic items');

create table quantity(quantity_name varchar(30) primary key Not null ,remarks varchar(50) , updated_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,created_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP);

insert into quantity(quantity_name,remarks) values('1 piece','1 piece');

create table item_details(category_name varchar(30),sub_category_name varchar(30), Item_name varchar(30) primary key Not null , quantity_name varchar(30),  supplier_name varchar(30), updated_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,created_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,FOREIGN key (category_name) references category(category_name),FOREIGN key (sub_category_name) references sub_category(sub_category_name),FOREIGN key (supplier_name) references supplier(supplier_name),FOREIGN key (quantity_name) references quantity(quantity_name));

insert into item_details (category_name,sub_category_name,Item_name,quantity_name,supplier_name)  values
('House Appliance','plastic','Kudam','1 piece','yusuf')

create table stock_details(item_name varchar(30)  Not null , stock_name varchar(30) primary key Not null  ,brought_price int, selling_price int, available_quantity int, remarks varchar(50) , updated_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,created_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
FOREIGN key (item_name) references item_details(item_name)
);

insert into stock_details (item_name,stock_name,brought_price,selling_price,available_quantity,remarks) values ( 'Kudam','medium Kudam',40,100,10,'medium kudam');

