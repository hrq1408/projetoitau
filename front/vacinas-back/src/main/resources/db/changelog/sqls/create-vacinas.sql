CREATE TABLE IF NOT EXISTS public.vacinas
(
    id                  bigint not null,
    cpf                 bigint,
    data_nasc           TIMESTAMP WITHOUT TIME ZONE,
    data_vac            TIMESTAMP WITHOUT TIME ZONE,
    dose                TIMESTAMP WITHOUT TIME ZONE,
    endereco            varchar(255),
    grupo_prioridade    varchar(255),
    nome                varchar(255),
    nome_mae            varchar(255),
    nome_pai            varchar(255),
    raca_cor            varchar(255),
    sexo                varchar(255),
    telefone            varchar(255),

    constraint vacinas_pkey primary key (id)
);

CREATE SEQUENCE IF NOT EXISTS public.vacinas_seq
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1;

ALTER TABLE public.vacinas_seq OWNER TO postgres;