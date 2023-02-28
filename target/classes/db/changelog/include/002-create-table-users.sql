CREATE TABLE IF NOT EXISTS `whiteboardDatabase`.`users` (
                                                            `id` INT NOT NULL AUTO_INCREMENT,
                                                            `user_name` VARCHAR(45) NOT NULL,
                                                            `password` VARCHAR(45) NOT NULL,
                                                            `full_name` VARCHAR(45) NOT NULL,
                                                            `salutations_id` INT NOT NULL,
                                                            PRIMARY KEY (`id`),
                                                            INDEX `fk_users_salutations_idx` (`salutations_id` ASC) VISIBLE,
                                                            CONSTRAINT `fk_users_salutations`
                                                                FOREIGN KEY (`salutations_id`)
                                                                    REFERENCES `whiteboardDatabase`.`salutations` (`id`)
                                                                    ON DELETE NO ACTION
                                                                    ON UPDATE NO ACTION)
    ENGINE = InnoDB