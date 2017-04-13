CREATE DATABASE `springbootdb`;
USE `springbootdb`;
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `users` (`name`, `age`) VALUES ('Leo', '12');
INSERT INTO `users` (`name`, `age`) VALUES ('Dan', '24');
