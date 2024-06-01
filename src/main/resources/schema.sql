create table if not exists Taco_order
(
    id              bigserial primary key,
    delivery_name   varchar(50) not null,
    delivery_street varchar(50) not null,
    delivery_city   varchar(50) not null,
    delivery_state  varchar(2)  not null,
    delivery_zip    varchar(10) not null,
    cc_number       varchar(16) not null,
    cc_expiration   varchar(5)  not null,
    cc_cvv          varchar(3)  not null,
    placed_at        timestamp   not null
);

create table if not exists Taco
(
    id             bigserial primary key,
    name           varchar(50) not null,
    taco_order     bigint references Taco_order (id),
    taco_order_key bigint      not null,
    created_at     timestamp   not null
);

create table if not exists Ingredient
(
    id   varchar(4) primary key not null,
    name varchar(25) not null,
    type varchar(10) not null
);

create table if not exists Ingredient_Ref
(
    ingredient varchar(4) references Ingredient (id),
    taco       bigint not null,
    taco_key   bigint not null
);

