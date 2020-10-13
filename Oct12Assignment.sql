create table Address(
address_id int auto_increment primary key,
address_1 varchar(255),
address_2 varchar(255),
pincode int
);

insert into Address (address_1, address_2,pincode)
values ('3982 NE Roger Road', 'hilsboro OR',92800), ('400 NW Monnies way', 'Beaverton OR', 30015), ('045 SE jenkins road', 'Multonoma New York', 81109),('8007 SE Nehlam road' , 'Toronto CN', 40023),('303 NW Baseline Way', 'Bethany OR', 90032);

create table Employee(
e_id int auto_increment primary key, 
e_name varchar(255),
address_id int,
foreign key (address_id)references Address(address_id)
);
 
insert into Employee (e_name, address_id)
values ('Nidhi',1), ('Dhvani',3), ('Vivek', 2),('Raj',5), ('ankita' , 4);

create table Phone(
phone_id int auto_increment primary key,
mobile varchar(15),
home varchar(10),
fax varchar(15),
e_id int,
foreign key (e_id)references Employee (e_id)
);

insert into Phone(mobile, home, fax, e_id) 
values (9045689345, 123456789, 4562893890,2), (3627894790, 098765432, 4002879113,4),(9187339059, 927384756, 7299367289, 1),(9772890890, 118737452, 8226337488, 3);

insert into Phone(mobile, home, fax, e_id) 
value (3333333333, 090980987, 0789483744, 5);






