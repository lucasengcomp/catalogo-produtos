CREATE TABLE IF NOT EXISTS sc_business.tb_product(
    id_product uuid NOT NULL,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(400) NOT NULL,
    img_url VARCHAR(255),
    price double NOT NULL,
    created_at TIMESTAMP without TIME ZONE,
    updated_at TIMESTAMP without TIME ZONE,
    PRIMARY KEY (id_product)
);

select * from sc_business.tb_product