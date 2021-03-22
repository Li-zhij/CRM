/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : crm

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2021-03-22 23:35:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` char(32) NOT NULL,
  `loginAct` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `loginPwd` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `expireTime` varchar(255) DEFAULT NULL,
  `lockStatus` char(1) DEFAULT NULL,
  `deptno` varchar(255) DEFAULT NULL,
  `allowIps` varchar(255) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `createBy` varchar(255) DEFAULT NULL,
  `editTime` varchar(255) DEFAULT NULL,
  `editBy` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('99ee48dc9bdc462eaffabda422f4bdb0', '123456', '李一', '123456', '11@qq.com', '2023-04-08 00:00:00', '1', null, null, null, null, null, null);
