CREATE TABLE IF NOT EXISTS `whiteboardDatabase`.`salutations`
(
    `id`         INT        NOT NULL AUTO_INCREMENT,
    `salutation` VARCHAR(5) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `salutation_UNIQUE` (`salutation` ASC) VISIBLE
)
    ENGINE = InnoDB