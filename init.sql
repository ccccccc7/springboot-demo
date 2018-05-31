CREATE DATABASE `t1`
  CHARACTER SET utf8
  COLLATE utf8_general_ci;
USE `t1`;

/*创建用户表*/
DROP TABLE IF EXISTS `t1`.`user`;
CREATE TABLE `t1`.`user` (
  `id`       INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(32)      NOT NULL,
  `password` VARCHAR(100)     NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = INNODB
  CHARSET = utf8
  COLLATE = utf8_general_ci;
/*初始化用户表*/
INSERT INTO `t1`.`user` (`username`, `password`) VALUES ('admin', 'admin');

/*创建角色表*/
DROP TABLE IF EXISTS `t1`.`role`;
CREATE TABLE `t1`.`role` (
  `id`   INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(32)      NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = INNODB
  CHARSET = utf8
  COLLATE = utf8_general_ci;
/*初始化角色表*/
INSERT INTO `t1`.`role` (`name`) VALUES ('管理员');

/*创建用户角色表*/
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id`      INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) UNSIGNED NOT NULL,
  `role_id` INT(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = INNODB
  CHARSET = utf8
  COLLATE = utf8_general_ci;
/*初始化用户角色*/
INSERT INTO `t1`.`user_role` (user_id, role_id) VALUES (1, 1);

/*创建权限表permission*/
DROP TABLE IF EXISTS `t1`.`permission`;
CREATE TABLE `t1`.`permission` (
  `id`      INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name`    VARCHAR(32)      NOT NULL,
  `role_id` INT(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = INNODB
  CHARSET = utf8
  COLLATE = utf8_general_ci;
/*初始化权限表*/
INSERT INTO `t1`.`permission` (name, role_id) VALUES ('添加用户', 1)

/**
demo表
 */
CREATE TABLE `demo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8