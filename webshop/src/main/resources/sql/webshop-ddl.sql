DROP TABLE IF EXISTS `webshop`.`login`;
CREATE TABLE `webshop`.`login` (
  `userid` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `lastlogin` DATE NOT NULL
  );
  
DROP TABLE IF EXISTS `webshop`.`users`;
CREATE TABLE `webshop`.`users` (
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NULL,
  `email` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `phone` BIGINT NOT NULL
  );
  
  
  
