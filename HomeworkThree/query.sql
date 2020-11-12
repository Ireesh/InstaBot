begin;
use grocery_shop;

set foreign_key_checks = 0;
drop table if exists customer cascade;
create table customer (id bigint primary key auto_increment, `name` varchar(30));
insert into customer (`name`) values ('Mike'), ('Elly'), ('Chucky');

drop table if exists product cascade;
create table product (id bigint primary key auto_increment, title varchar(20), cost decimal(15,2));
insert into product (title, cost) values ('apple', 1.234), ('orange', 1.008), ('banana', 2.12), ('melon', 2);

drop table if exists `order` cascade;
create table `order` (id bigint primary key auto_increment, `date` date, customer_id bigint, product_id bigint, fair_price decimal(15,2),
                      foreign key (customer_id) references customer(id),
                      foreign key (product_id) references product(id));
insert into `order` (`date`, customer_id, product_id, fair_price) values
('2020-11-1', 1, 1, 1.01),
('2020-11-1', 2, 1, 1.02),
('2020-11-1', 3, 1, 1.5),
('2020-11-2', 1, 2, 1.9),
('2020-11-2', 1, 4, 2);
set foreign_key_checks = 1;

commit;