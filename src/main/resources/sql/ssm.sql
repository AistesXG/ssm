/*
Navicat MySQL Data Transfer

Source Server         : bendi
Source Server Version : 50644
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50644
File Encoding         : 65001

Date: 2019-06-20 14:51:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for appointment
-- ----------------------------
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment` (
  `book_id` bigint(20) NOT NULL COMMENT '图书ID',
  `student_id` bigint(20) NOT NULL COMMENT '学号',
  `appoint_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '预约时间',
  PRIMARY KEY (`book_id`,`student_id`),
  KEY `idx_appoint_time` (`appoint_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='预约图书表';

-- ----------------------------
-- Records of appointment
-- ----------------------------
INSERT INTO `appointment` VALUES ('1000', '12345678910', '2019-06-20 14:01:51');
INSERT INTO `appointment` VALUES ('1001', '12345678910', '2019-06-20 14:28:45');
INSERT INTO `appointment` VALUES ('1003', '1234567890', '2019-06-20 14:47:44');
INSERT INTO `appointment` VALUES ('1002', '1234567890', '2019-06-20 14:48:57');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(100) NOT NULL COMMENT '图书名称',
  `number` int(11) NOT NULL COMMENT '馆藏数量',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8 COMMENT='图书表';

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1000', 'Java程序设计', '9');
INSERT INTO `book` VALUES ('1001', '数据结构', '8');
INSERT INTO `book` VALUES ('1002', '设计模式', '8');
INSERT INTO `book` VALUES ('1003', '编译原理', '8');
