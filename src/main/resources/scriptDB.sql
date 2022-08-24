create table HCK_TRANSPORTE (
id_transp  SERIAL NOT NULL,
c_negocio  VARCHAR(20) NOT NULL,
c_canal    VARCHAR(20),
a_patente  VARCHAR(20) NOT NULL,
id_desp    int    NOT NULL,
PRIMARY KEY (id_transp)
);

--------------------------------------------------------
create table HCK_CLIENTE(
  id_cliente SERIAL    not null,
  c_negocio  VARCHAR(20)  not null,
  c_canal    VARCHAR(20),
  a_nombre   VARCHAR(50)  not null,
  a_email    VARCHAR(50)  not null,
  a_celular  VARCHAR(50)  not null,
PRIMARY KEY (id_cliente)
);

--------------------------------------------------------
create table HCK_DIRECCION(
  id_direccion SERIAL    not null,
  c_negocio    VARCHAR(20)  not null,
  c_canal      VARCHAR(20),
  a_alias      VARCHAR(50)  not null,
  a_calle      VARCHAR(50)  not null,
  a_numero     VARCHAR(50),
  id_cliente   int    not null,
  PRIMARY KEY (id_direccion)
);

--------------------------------------------------------
create table HCK_ZONA(
  id_zona      SERIAL    not null,
  c_negocio    VARCHAR(20)  not null,
  c_canal      VARCHAR(20),
  a_tipo_zona  VARCHAR(50)  not null,
PRIMARY KEY (id_zona)
);

--------------------------------------------------------
create table HCK_NOTIFICACION(
  id_notificacion   SERIAL    not null,
  c_negocio         VARCHAR(20)  not null,
  c_canal           VARCHAR(20),
  n_orden           VARCHAR(50)  not null,
  id_mensaje        int    not null,
  a_frecu_notif     VARCHAR(50)  not null,
  d_fecha_notif     VARCHAR(50)  not null,
  id_zona           int    not null,
PRIMARY KEY (id_notificacion)
);

---------------------------------------------------------
create table HCK_ORDEN(
  id_orden    serial   not null,
  n_orden     VARCHAR(20) not null,
  id_desp     int   not null,
  c_negocio   VARCHAR(20) not null,
  c_canal     VARCHAR(20),
  id_cliente  int   not null,
PRIMARY KEY (id_orden)
);

---------------------------------------------------------  

create table HCK_DESPACHO(
  id_despacho   serial   not null,
  c_negocio     VARCHAR(20) not null,
  c_canal       VARCHAR(20),
  n_orden       VARCHAR(20) not null,
  n_f12         VARCHAR(20) not null,
  id_direccion  int   not null,
  id_transporte int   not null,
  id_zona       int   not null,
PRIMARY KEY (id_despacho)
);

---------------------------------------------------------
create table HCK_PRODUCTO(
  id_producto       serial    not null,
  c_canal           VARCHAR(20),
  c_negocio         VARCHAR(20)  not null,
  n_sku             VARCHAR(10)  not null,
  a_nombre_producto VARCHAR(100) not null,
  n_cantidad        VARCHAR(20)  not null,
  id_despacho       VARCHAR(20)  not null,
  a_tamaño          VARCHAR(20)  not null,
  a_volumen         VARCHAR(20)  not null,
PRIMARY KEY (id_producto)
);

--------------------------------------------------------
create table HCK_MENSAJE(
  id_mensaje        serial    not null,
  tipo_mensaje      VARCHAR(20)  not null,
  mensaje           VARCHAR(500) not null,
PRIMARY KEY (id_mensaje)
);

  