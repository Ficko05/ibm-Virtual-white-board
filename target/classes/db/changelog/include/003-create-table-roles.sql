CREATE TABLE IF NOT EXISTS `whiteboardDatabase`.`role` (
                                                           `id` INT NOT NULL AUTO_INCREMENT,
                                                           `admin` TINYINT NOT NULL DEFAULT 0,
                                                           `users_id` INT NOT NULL,
                                                           PRIMARY KEY (`id`),
                                                           INDEX `fk_role_users1_idx` (`users_id` ASC) VISIBLE,
                                                           CONSTRAINT `fk_role_users1`
                                                               FOREIGN KEY (`users_id`)
                                                                   REFERENCES `whiteboardDatabase`.`users` (`id`)
                                                                   ON DELETE NO ACTION
                                                                   ON UPDATE NO ACTION)
    ENGINE = InnoDB