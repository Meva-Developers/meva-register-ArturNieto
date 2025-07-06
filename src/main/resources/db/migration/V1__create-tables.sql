

CREATE TABLE "family"(
    id_family SERIAL PRIMARY KEY,
    description VARCHAR(255) NOT NULL

);

CREATE TABLE category(
    id_category SERIAL PRIMARY KEY,
    description VARCHAR(250) NOT NULL

);

CREATE TABLE sub_category(
    id_sub_category SERIAL PRIMARY KEY,
    description VARCHAR(250) NOT NULL,
    id_category INTEGER NOT NULL,

    FOREIGN KEY (id_category)
    REFERENCES "category" (id_category)

);


CREATE TABLE "user_meva"(
    cpf CHAR(11) PRIMARY KEY,
    "name" VARCHAR(250) NOT NULL,
    genre CHAR(1) NOT NULL,
    birth DATE NOT NULL,
    "state" VARCHAR(100) NOT NULL,
    "city" VARCHAR(100) NOT NULL,
    id_family INTEGER NOT NULL,


    FOREIGN KEY ( id_family)
    REFERENCES "family" ( id_family)

);

CREATE TABLE month_expenses(
    id_month_expenses SERIAL PRIMARY KEY,
    description VARCHAR(250) NOT NULL,
    "value" DOUBLE PRECISION NOT NULL,
    id_family INTEGER NOT NULL,
    id_category INTEGER NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    type VARCHAR(50) NOT NULL, -- FIXO OU VARIAVEL
    "date" DATE NOT NULL,
    parcel INTEGER,
    bank VARCHAR,

    FOREIGN KEY (id_family)
    REFERENCES "family" (id_family),

    FOREIGN KEY (cpf)
    REFERENCES "user_meva" (cpf),

    FOREIGN KEY (id_category)
    REFERENCES "category" (id_category)

);

CREATE TABLE close_month(
    id_close_month SERIAL PRIMARY KEY,
    valor_total DOUBLE PRECISION NOT NULL,
    "month" DATE NOT NULL,
    date_update DATE NOT NULL,
    id_family INTEGER NOT NULL,

    FOREIGN KEY (id_family)
    REFERENCES "family" (id_family)

);

CREATE TABLE life_cost(
    id_life_cost SERIAL PRIMARY KEY,
    description VARCHAR(250) NOT NULL,
    "value" DOUBLE PRECISION NOT NULL,
    "month" DATE NOT NULL,
    id_family INTEGER NOT NULL,

    FOREIGN KEY (id_family)
    REFERENCES "family" (id_family)

);


CREATE TABLE debt(
    id_debt SERIAL PRIMARY KEY,
    description VARCHAR(250) NOT NULL,
    "value" DOUBLE PRECISION NOT NULL,
    id_family INTEGER NOT NULL,
    id_category INTEGER NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    "date" DATE NOT NULL,
    parcel INTEGER NOT NULL,
    bank VARCHAR,

    FOREIGN KEY (id_family)
    REFERENCES "family" (id_family),

    FOREIGN KEY (cpf)
    REFERENCES "user_meva" (cpf),

    FOREIGN KEY (id_category)
    REFERENCES "category" (id_category));
