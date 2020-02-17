drop table if exists tasks;
create table tasks(
    id integer auto_increment,
    title varchar (100) not null,
    description text,
    primary key (id)
);
