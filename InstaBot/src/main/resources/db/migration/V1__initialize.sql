-- users table
drop table if exists users cascade;
create table users (
             id                 bigint auto_increment,
             email              varchar(50) not null,
             password           varchar(80) not null,
             role               varchar(30) not null,
             status             varchar(30) not null,
             primary key (id)
);

-- init users
insert into users (email, password, role, status) values
            ('user@gmail.com', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i', 'USER', 'ACTIVE'),
            ('admin@gmail.com', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i', 'ADMIN', 'ACTIVE');