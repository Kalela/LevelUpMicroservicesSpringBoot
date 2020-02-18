CREATE TABLE exchange_value (
    currency_id int NOT NULL,
    currency_from varchar(5),
    currency_to varchar(5),
    conversion_multiple numeric,
    port int DEFAULT NULL,
    PRIMARY KEY (currency_id)
);

INSERT INTO exchange_value(currency_id,currency_from,currency_to,conversion_multiple,port)
VALUES (10001,'USD','INR',65,0);
INSERT INTO exchange_value(currency_id,currency_from,currency_to,conversion_multiple,port)
VALUES (10002,'EUR','INR',75,0);
INSERT INTO exchange_value(currency_id,currency_from,currency_to,conversion_multiple,port)
VALUES (10003,'USD','KSH',100,0);
INSERT INTO exchange_value(currency_id,currency_from,currency_to,conversion_multiple,port)
VALUES (10004,'KSH','USD',0.001,0);