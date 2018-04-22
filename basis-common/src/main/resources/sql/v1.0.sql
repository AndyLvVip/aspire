create database aspire_basis;
use aspire_basis;
create table user(
	id char(32) not null,
    username varchar(32) not null,
    password char(64) null,
    phoneNo char(11) not null,
    email varchar(255) null,
    createdOn datetime not null,
    createdBy varchar(32) not null,
    updatedOn datetime not null,
    updatedBy varchar(32) not null,
    primary key (id)
) engine = InnoDB charset = utf8;