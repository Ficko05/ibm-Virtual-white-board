CREATE TABLE IF NOT EXISTS `whiteboardDatabase`.`post_table`
(
    `id`         INT          NOT NULL,
    `caption`    VARCHAR(288) NULL,
    `video_link` VARCHAR(288) NULL,
    `image`      BLOB         NULL,
    `users_id`   INT          NOT NULL,
    `time_stamp` TIMESTAMP    NOT NULL,
    PRIMARY KEY (`id`),
    INDEX `fk_upload_users1_idx` (`users_id` ASC) VISIBLE,
    CONSTRAINT `fk_upload_users1`
        FOREIGN KEY (`users_id`)
            REFERENCES `whiteboardDatabase`.`users` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB