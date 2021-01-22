USE `fa`;

CREATE  TABLE IF NOT EXISTS `users` (
  `id` INT AUTO_INCREMENT ,
  `firstName` VARCHAR(50) NOT NULL,
  `lastName` VARCHAR(50) NOT NULL,

  PRIMARY KEY (`id`)
) ENGINE = InnoDB;