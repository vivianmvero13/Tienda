 
/*Se crea la base de datos */
drop schema if exists prueba_a; 
drop user if exists usuario_a;
CREATE SCHEMA prueba_a;

/*Se crea un usuario para la base de datos llamado "usuario_a" y tiene la contraseña "cliente_a"*/
create user 'usuario_a'@'%' identified by 'cliente_a.';

/*Se asignan los prvilegios sobr ela base de datos PRUEBA_A al usuario creado */
grant all privileges on techshop.* to 'usuario_a'@'%';
flush privileges;

/* la tabla de revision contiene revisiones*/ 
create table prueba_a.revision (
  id_revision int auto_increment,
  resena varchar(30),
  precio_revision double,
  edicion int,
   imagen varchar(1024),
  PRIMARY KEY (id_revision))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

/*Se insertan 3 registros en la tabla revision como */
INSERT INTO techshop.usuario (id_revision, resena,precio_revision,edicion, imagen) VALUES 
(11,'Muy buen producto, 5 estrellas','5000','2', 'https://st.depositphotos.com/1020804/1337/i/450/depositphotos_13376488-stock-photo-coffee-cup-and-beans.jpg'),
(12,'Cafe sin sabor, 2 estrellas','1000','1', 'https://st.depositphotos.com/1020804/1337/i/450/depositphotos_13376488-stock-photo-coffee-cup-and-beans.jpg'),
(113,'Excelente sabor, 5 estrellas','5500','3', 'https://st.depositphotos.com/1020804/1337/i/450/depositphotos_13376488-stock-photo-coffee-cup-and-beans.jpg')