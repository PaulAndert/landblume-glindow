--liquibase formatted sql
--changeset PAUL_ANDERT:1 labels:vacation endDelimiter:/

CREATE TABLE ${schema}.vac_vacation (
    vac_id INT GENERATED ALWAYS AS IDENTITY,
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    activ_from DATE,
    activ_until DATE,
    CONSTRAINT vac_pk PRIMARY KEY (vac_id)
);

COMMENT ON TABLE ${schema}.vac_vacation IS 'table for storing vacation entries';
COMMENT ON COLUMN ${schema}.vac_vacation.vac_id IS 'primary key of the table';
COMMENT ON COLUMN ${schema}.vac_vacation.title IS 'heading or title of the entry';
COMMENT ON COLUMN ${schema}.vac_vacation.description IS 'more elaborate description of the entry';
COMMENT ON COLUMN ${schema}.vac_vacation.activ_from IS 'date from when this entry should be displayed';
COMMENT ON COLUMN ${schema}.vac_vacation.activ_until IS 'date until when this entry should be displayed';

/