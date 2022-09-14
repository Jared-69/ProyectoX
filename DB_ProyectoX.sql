drop database if exists DB_ProyectoX;
create database DB_ProyectoX;
use DB_ProyectoX;

Create table Persona(
  idPersona int not null auto_increment,
  sexo varchar(20)not null,
  nombre varchar(100) not null,
  direccion varchar(70) not null,
  telefono varchar(8) not null,
  email varchar(50) not null,
 primary key PK_idPersona(idPersona)
);

Create table Categoria(
  idCategoria int not null auto_increment,
  nombre varchar(50) not null,
  descripcion varchar(255) not null,
  primary key PK_idCategoria (idCategoria)
);

Create table Articulo(
  idArticulo int not null auto_increment,
  idCategoria int not null,
  nombre varchar(100) not null,
  precio_venta decimal(11,2) not null ,
  stock int not null,
  descripcion varchar(225) not null,
  imagen longblob null,
  primary key PK_idArticulo(idArticulo),
  constraint FK_Categoria_Articulo foreign key(idCategoria) references Categoria(idCategoria)
    );

Create table Usuario(
  idUsuario int not null auto_increment,
  nombre varchar(100) not null,
  email varchar(50) not null,
  clave varchar(100)not null,
  primary key PK_idUsuario(idUsuario)
  );

Create table Venta(
  idVenta int not null auto_increment,
  idCliente int not null,
  idUsuario int not null,
  fecha datetime not null,
  total decimal(11,2) not null,
  estado varchar(20) not null,
  primary key PK_idVenta(idVenta),
  constraint FK_Persona_Venta foreign key (idCliente)  references Persona(idPersona),
  constraint FK_Usuario_Venta  foreign key (idUsuario)  references Usuario(idUsuario)
);
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Detalle_venta(
  idDetalle_venta int not null auto_increment,
  idVenta int not null,
  idArticulo int not null,
  cantidad int not null,
  precio decimal(11,2) not null,
  descuento decimal(11,2) not null,
  PRIMARY KEY PK_idDetalle_venta(idDetalle_venta),
  constraint FK_Venta_DEtalle_venta foreign key (idVenta) references Venta (idVenta),
  constraint FK_Articulo_DEtalle_venta foreign key (idArticulo) references Articulo(idArticulo)
);
Create table Pago(
  idPago int not null auto_increment,
  monto decimal(11,2) not null,
  primary key PK_idPago(idPago)
  );

Create table Compras(
  idCompra int not null auto_increment,
  idUsuario int not null,
  idPago int not null,
  fechaCompra date not null,
  estado varchar(45) not null,
  primary key (idCompra),
  
  constraint FK_Pago_Compras foreign key (idPago) references Pago(idPago),
  constraint FK_Usuario_Compras foreign key (idUsuario) references Usuario(idUsuario)
);

Create table Detalle_Compra(
  idDetalleC int not null auto_increment,
  idArticulo int not null,
  idCompra int not null,
  cantidad int not null,
  precio_compra DECIMAL(11,2)not null,
  PRIMARY KEY PK_idDetalleC(idDetalleC),
  constraint idArticulo foreign key (idArticulo) references Articulo(idArticulo),
  constraint idCompra foreign key (idCompra) references Compras(idCompra)
);

Create table About(
  Carnet int not null,
  nombre varchar(45) not null,
  apellido varchar(45) not null,
  seccion varchar(45) not null,
  primary key PK_Carne(Carnet)
  );