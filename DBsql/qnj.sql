/*
Navicat MySQL Data Transfer

Source Server         : con
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : qnj

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2020-02-18 13:43:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sNo` int(11) NOT NULL AUTO_INCREMENT,
  `sName` varchar(255) DEFAULT NULL,
  `sSex` varchar(255) DEFAULT NULL,
  `sClass` varchar(255) DEFAULT NULL,
  `sbirthday` date DEFAULT NULL,
  PRIMARY KEY (`sNo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
