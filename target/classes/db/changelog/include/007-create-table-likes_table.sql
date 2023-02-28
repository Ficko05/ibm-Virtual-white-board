CREATE TABLE IF NOT EXISTS `whiteboardDatabase`.`likes_tabel`
(
    `post_table_id` INT          NOT NULL,
    `likes`         INT          NOT NULL DEFAULT 0,
    `comment`       VARCHAR(288) NULL,
    INDEX `fk_likes_tabel_post_table1_idx` (`post_table_id` ASC) VISIBLE,
    PRIMARY KEY (`post_table_id`),
    CONSTRAINT `fk_likes_tabel_post_table1`
        FOREIGN KEY (`post_table_id`)
            REFERENCES `whiteboardDatabase`.`post_table` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB