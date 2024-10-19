DROP DATABASE IF EXISTS adt3_ejemplo1;

CREATE DATABASE adt3_ejemplo1;

USE adt3_ejemplo1;

DROP TABLE IF EXISTS articulos;

CREATE TABLE articulos (
                           id VARCHAR(10) NOT NULL COLLATE 'latin1_spanish_ci',
                           nombre VARCHAR(50) NOT NULL COLLATE 'latin1_spanish_ci',
                           precio DECIMAL(7,2) NOT NULL,
                           stock INT(11) NOT NULL,
                           imagen VARCHAR(50) COLLATE 'latin1_spanish_ci',
                           descripcion VARCHAR(50) COLLATE 'latin1_spanish_ci',
                           PRIMARY KEY (id)
)COLLATE='latin1_spanish_ci'ENGINE=InnoDB;


DELETE FROM articulos;

INSERT INTO articulos (id, nombre, precio, stock, imagen, descripcion) VALUES
                                                                           ('i1', 'Reloj 1', 20.00, 7, 'img/reloj1.jpg', 'descripción del reloj 1'),
                                                                           ('i2', 'Reloj 2', 24.00, 5, 'img/reloj2.jpg', 'descripción del reloj 2'),
                                                                           ('i3', 'Reloj 3', 18.00, 84, 'img/reloj3.jpg', 'descripción del reloj 3'),
                                                                           ('i4', 'Reloj 4', 30.00, 15, 'img/reloj4.jpg', 'descripción del reloj 4'),
                                                                           ('i5', 'Reloj 5', 28.00, 7, 'img/reloj5.jpg', 'descripción del reloj 5'),
                                                                           ('i6', 'Camiseta 1', 20.00, 76, 'img/camiseta1.jpg', 'descripción de la camiseta 1'),
                                                                           ('i7', 'Camiseta 2', 30.00, 0, 'img/camiseta2.jpg', 'descripción de la camiseta 2'),
                                                                           ('i8', 'Camiseta 3', 15.00, 55, 'img/camiseta3.jpg', 'descripción de la camiseta 3'),
                                                                           ('i9', 'Camiseta 4', 18.00, 20, 'img/camiseta4.jpg', 'descripción de la camiseta 4');