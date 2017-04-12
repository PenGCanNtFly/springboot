CREATE DATABASE springboot_mybatis;
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(4) NOR NULL auto_increment,
  `name` varchar(50) NOT NULL,
  `age` int(3) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT users (name,age) VALUES ('aaa',12),('bbb',24),('ccc',36);
