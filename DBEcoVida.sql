CREATE DATABASE attempt1;

USE attempt1;

CREATE TABLE TBusuario (
    idUsuario INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(20) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    tipo VARCHAR(20) CHECK (tipo IN ('Cliente', 'Administrador')) NOT NULL
);

CREATE TABLE TBcliente (
    idCliente INT PRIMARY KEY, -- Debe coincidir con idUsuario
    nombre VARCHAR(30) NOT NULL,
    telefono VARCHAR(9) NOT NULL,
    distrito VARCHAR(20) NOT NULL,
    correo VARCHAR(30) NOT NULL UNIQUE,
    FOREIGN KEY (idCliente) REFERENCES TBusuario(idUsuario) ON DELETE CASCADE
);

CREATE TABLE TBadministrador (
    idAdministrador INT PRIMARY KEY,
    FOREIGN KEY (idAdministrador) REFERENCES TBusuario(idUsuario) ON DELETE CASCADE
);

CREATE TABLE TBactividad (
    idActividad INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(30) NOT NULL,
    descripcion VARCHAR(200),
    distrito VARCHAR(50) NOT NULL,
    fecha VARCHAR(10) NOT NULL,
    aceptado BIT NOT NULL,
    idCliente INT,
    FOREIGN KEY (idCliente) REFERENCES TBcliente(idCliente) ON DELETE SET NULL
);

CREATE TABLE TBtienda (
    idTienda INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    link VARCHAR(50) NOT NULL,
    idAdministrador INT,
    FOREIGN KEY (idAdministrador) REFERENCES TBadministrador(idAdministrador) ON DELETE SET NULL
);

CREATE TABLE TBarticulo (
    idArticulo INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descripcion varchar(2000),
    -- Autor VARCHAR(50),
    fecha varchar(10) NOT NULL,
	aceptado BIT NOT NULL,
    idCliente INT,
    FOREIGN KEY (idCliente) REFERENCES TBcliente(idCliente) ON DELETE SET NULL
);

CREATE TABLE TBarticulo_favorito (
    idArticulo_favorito INT AUTO_INCREMENT PRIMARY KEY,
    idCliente INT NOT NULL,
    idArticulo INT NOT NULL,
    -- fechaMarcado DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (idCliente) REFERENCES TBusuario(idUsuario) ON DELETE CASCADE,
    FOREIGN KEY (idArticulo) REFERENCES TBarticulo(idArticulo) ON DELETE CASCADE
);

CREATE TABLE TBcliente_actividad (
    idCliente INT,
    idActividad INT,
    asistencia BIT NOT NULL DEFAULT 0, -- 0: No asistió, 1: Asistió
    PRIMARY KEY (idCliente, idActividad),
    FOREIGN KEY (idCliente) REFERENCES TBcliente(idCliente) ON DELETE CASCADE,
    FOREIGN KEY (idActividad) REFERENCES TBactividad(idActividad) ON DELETE CASCADE
);

CREATE TABLE TBcliente_articulo (
    idCliente INT,
    idArticulo INT,
    favorito BIT NOT NULL DEFAULT 0, -- 0: No favorito, 1: favorito
    PRIMARY KEY (idCliente, idArticulo),
    FOREIGN KEY (idCliente) REFERENCES TBcliente(idCliente) ON DELETE CASCADE,
    FOREIGN KEY (idArticulo) REFERENCES TBarticulo(idArticulo) ON DELETE CASCADE
);