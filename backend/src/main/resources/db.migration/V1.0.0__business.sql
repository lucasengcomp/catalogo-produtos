CREATE TABLE IF NOT EXISTS sc_business.tb_product (
    id_product uuid NOT NULL,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(400) NOT NULL,
    img_url VARCHAR(255),
    price double NOT NULL,
    data_criacao TIMESTAMP without TIME ZONE,
    data_atualizacao TIMESTAMP without TIME ZONE,
    mensagem_id uuid,
    PRIMARY KEY (id_product)
);
