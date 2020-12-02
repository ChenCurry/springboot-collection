DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL ,
  `name` varchar(50),
	`pwd` varchar(50),
	`perms` varchar(50),
  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8;

insert into `user` (`id`,`name`,`pwd`,`perms`) values (1,'root','123','user:add');
insert into `user` (`id`,`name`,`pwd`,`perms`) values (2,'ch','123','user:update');
insert into `user` (`id`,`name`,`pwd`,`perms`) values (3,'test','123','');

select * from user