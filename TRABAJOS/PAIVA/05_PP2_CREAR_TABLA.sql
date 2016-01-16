Use BDSYSPRO
Go

--ELIMINAR TABLA TMDETALLETICKET SI EXISTE
IF EXISTS(SELECT 1 FROM sys.objects 
WHERE OBJECT_ID = OBJECT_ID(N'tmDetalleTicket') AND 
type = (N'U')) DROP TABLE tmDetalleTicket;

--ELIMINAR TABLA TMTICKET SI EXISTE
IF EXISTS(SELECT 1 FROM sys.objects 
WHERE OBJECT_ID = OBJECT_ID(N'tmTicket') AND 
type = (N'U')) DROP TABLE tmTicket;

--ELIMINAR TABLA TMPROYECTO SI EXISTE
IF EXISTS(SELECT 1 FROM sys.objects 
WHERE OBJECT_ID = OBJECT_ID(N'tmProyecto') AND 
type = (N'U')) DROP TABLE tmProyecto;


--ELIMINAR TABLA TMUSUARIO SI EXISTE
IF EXISTS(SELECT 1 FROM sys.objects 
WHERE OBJECT_ID = OBJECT_ID(N'tmUsuario') AND 
type = (N'U')) DROP TABLE tmUsuario;

--ELIMINAR TABLA TPERFILDETALLE SI EXISTE
IF EXISTS(SELECT 1 FROM sys.objects 
WHERE OBJECT_ID = OBJECT_ID(N'tmPerfilDetalle') AND 
type = (N'U')) DROP TABLE tmPerfilDetalle;

--ELIMINAR TABLA TMTABLA SI EXISTE
IF EXISTS(SELECT 1 FROM sys.objects 
WHERE OBJECT_ID = OBJECT_ID(N'tmTabla') AND 
type = (N'U')) DROP TABLE tmTabla;

--ELIMINAR TABLA TMPERFIL SI EXISTE
IF EXISTS(SELECT 1 FROM sys.objects 
WHERE OBJECT_ID = OBJECT_ID(N'tmPerfil') AND 
type = (N'U')) DROP TABLE tmPerfil;

--ELIMINAR TABLA TMEMPRESA SI EXISTE
IF EXISTS(SELECT 1 FROM sys.objects 
WHERE OBJECT_ID = OBJECT_ID(N'tmEmpresa') AND 
type = (N'U')) DROP TABLE tmEmpresa;


--CREAR TABLA TMEMPRESA
create table tmEmpresa(
emp_cod nvarchar(6) not null,
emp_nombre  nvarchar(30),
emp_descripcion nvarchar(50),
PRIMARY KEY (emp_cod));
--INTSERTAR EMPRESA
insert into tmEmpresa values ('EMP001','HIPER S.A.','TECNOLOGIAS DE LA INFORMACION');
insert into tmEmpresa values ('EMP002','BCP','BANCO DE CREDITO DEL PERU');
insert into tmEmpresa values ('EMP003','BBVA','BANCO CONTINENTAL');
insert into tmEmpresa values ('EMP004','PROCESOSMC','MASTERCARD PERU');

--CREAR TABLA TMPERFIL
create table tmPerfil(
perf_cod nvarchar(6) not null,
perf_nombre nvarchar(15),
perf_descripcion nvarchar(30),
PRIMARY KEY (perf_cod));

--INTSERTAR PERFIL
insert into tmPerfil values ('PER001','ADMINISTRADOR','Solo para administradores');
insert into tmPerfil values ('PER002','SUPERVISOR','Solo para supervisores');
insert into tmPerfil values ('PER003','EMPLEADO','Solo para empleados');

--CREAR TABLA TMTABLA
create table tmTabla(
tabl_cod nvarchar(6) not null,
tabl_nombre nvarchar(15),
PRIMARY KEY (tabl_cod));

--INTSERTAR TABLA
insert into tmTabla values ('TAB001','USUARIOS');
insert into tmTabla values ('TAB002','CLIENTES');
insert into tmTabla values ('TAB003','PROYECTOS');
insert into tmTabla values ('TAB004','TICKETS');
insert into tmTabla values ('TAB005','REPORTES');
insert into tmTabla values ('TAB006','PERFIL');
insert into tmTabla values ('TAB007','ASIGNARPERFIL');

--CREAR TABLA TMPERFILDETALLE
create table tmPerfilDetalle(
tabl_cod_perf nvarchar(6) REFERENCES tmPerfil(perf_cod) not null,
tabl_cod_tabl nvarchar(6) REFERENCES tmTabla(tabl_cod) not null,
tabl_estado nvarchar(13),
tabl_tipo nvarchar(9),
PRIMARY KEY (tabl_cod_perf,tabl_cod_tabl));

--INTSERTAR PERFILDETALLE
insert into tmPerfilDetalle values ('PER001','TAB001','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB002','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB003','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB004','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB005','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB006','ACTIVO','ESCRITURA');
insert into tmPerfilDetalle values ('PER001','TAB007','ACTIVO','ESCRITURA');

--CREAR TABLA TMUSUARIO
create table tmUsuario(
cod_usu nvarchar(6) not null,
nombre  nvarchar(30),
ape_pate nvarchar(20),
ape_mate nvarchar(20),
telefono nvarchar(9),
usu_perf_cod nvarchar(6) not null,
correo nvarchar(30),
pass   nvarchar(12),
PRIMARY KEY (cod_usu),
FOREIGN KEY (usu_perf_cod) REFERENCES tmPerfil(perf_cod));
--INSERTAR USUARIO
insert into tmusuario values ('USU001','Enrique','Paiva','Rodriguez','941385146','PER001', 'epaiva@hiper.com.pe', 'admin');
insert into tmusuario values ('USU002','Emily','Mego','Davila','900000000','PER002', 'emgo@bcp.com.pe', 'admin');
insert into tmusuario values ('USU003','Dora','Juarez','Mora','900000000','PER003', 'djuarez@bbva.com.pe', 'admin');

--CREAR TABLA TMPROYECTO
create table tmProyecto(
pro_cod nvarchar(6) not null,
pro_respcod nvarchar(6) not null,
pro_nombre  nvarchar(200),
pro_descripcion nvarchar(2000),
pro_emp_cod nvarchar(6) not null
PRIMARY KEY (pro_cod),
FOREIGN KEY (pro_respcod) REFERENCES tmUsuario(cod_usu),
FOREIGN KEY (pro_emp_cod) REFERENCES tmEmpresa(emp_cod));
--INSERTAR PROYECTO
insert into tmProyecto values ('PRO001','USU001','MANTENIMIENTO PROCESOS','-EVALUACIÓN'+char(13)+'-MONITOREO','EMP001');
insert into tmProyecto values ('PRO002','USU001','MANTENIMIENTO PROCESOS','-EVALUACIÓN'+char(13)+'-MONITOREO','EMP001');
insert into tmProyecto values ('PRO003','USU001','MANTENIMIENTO PROCESOS','-EVALUACIÓN'+char(13)+'-MONITOREO','EMP001');
insert into tmProyecto values ('PRO004','USU002','MANTENIMIENTO PROCESOS','-EVALUACIÓN'+char(13)+'-MONITOREO','EMP001');
insert into tmProyecto values ('PRO005','USU002','MANTENIMIENTO PROCESOS','-EVALUACIÓN'+char(13)+'-MONITOREO','EMP001');

--CREAR TABLA TMTICKET
create table tmTicket(
tic_cod nvarchar(6) not null,
tic_pro_cod nvarchar(6) not null,
tic_nombre  nvarchar(200),
tic_fcreate nvarchar(8),
tic_descripcion nvarchar(2000)
PRIMARY KEY (tic_cod),
FOREIGN KEY (tic_pro_cod) REFERENCES tmProyecto(pro_cod)
);
--INSERTAR PROYECTO
insert into tmTicket values ('TIC001','PRO001','MEJORA MODULO CHIPS','20151010','MEJORA MODULO CHIPS');
insert into tmTicket values ('TIC002','PRO001','MEJORA DE REPLICOR','20151010','MEJORA DE REPLICOR');


--CREAR TABLA TMTICKET
create table tmDetalleTicket(
dtic_cod nvarchar(6) not null,
dtic_tic_cod nvarchar(6) not null,
dtic_usu_cod nvarchar(6) not null,
dtic_tarea   nvarchar(20),
dtic_fcreate nvarchar(8),
dtic_hora int,
dtic_minuto int,
PRIMARY KEY (dtic_cod),
FOREIGN KEY (dtic_tic_cod) REFERENCES tmTicket(tic_cod),
FOREIGN KEY (dtic_usu_cod) REFERENCES tmUsuario(cod_usu)
);
