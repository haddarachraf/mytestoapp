create table DEMO_CONTACT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NOM varchar(40) not null,
    PRENOM varchar(30) not null,
    DATE_NAISSANCE date,
    EMAIL varchar(60),
    TEL bigint,
    PHOTO varchar(255),
    --
    primary key (ID)
);
