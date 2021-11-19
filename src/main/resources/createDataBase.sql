CREATE DATABASE `pos`;
USE `pos`;

CREATE TABLE `book`
   (`isbn` varchar(200) PRIMARY KEY,
   `title` varchar(200) NOT NULL UNIQUE,
   `publisher` varchar(200), 
   `year` int, -- VA FI INDEXAT
   `genre` varchar(200), -- -- VA FI INDEXAT
   `stock` int,
   `price` int)
;

CREATE INDEX `idx_year` 
ON `book`(`year`)
;

CREATE INDEX `idx_genre_year`
ON `book`(`genre`,`year`)
;

CREATE INDEX `idx_genre`
ON `book`(`genre`)
;

CREATE TABLE `author`
    (`id` INT auto_increment PRIMARY KEY NOT NULL ,
    `first_name` varchar(200) NOT NULL, 
	`last_name` varchar(200) NOT NULL)
;

CREATE INDEX `idx_first_name`
ON `author`(`first_name`)
;

CREATE INDEX `idx_last_name`
ON `author`(`last_name`)
;

CREATE TABLE `book_author`
    (`id` INT PRIMARY KEY auto_increment,
    `isbn` varchar(200) ,
    `id_author` INT,
    FOREIGN KEY (`isbn`) REFERENCES `book`(`isbn`),
    FOREIGN KEY (`id_author`) REFERENCES `author`(`id`))
;

