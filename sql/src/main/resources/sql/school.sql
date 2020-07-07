/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : school

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2020-07-07 10:49:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(255) DEFAULT NULL,
  `t_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `score_id` int(11) NOT NULL,
  `course_id` int(11) DEFAULT NULL,
  `s_id` int(11) DEFAULT NULL,
  `score` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`score_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_birthday` date DEFAULT NULL,
  `s_gender` tinyint(4) DEFAULT NULL,
  `s_name` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for syllabus
-- ----------------------------
DROP TABLE IF EXISTS `syllabus`;
CREATE TABLE `syllabus` (
  `course_id` int(11) NOT NULL,
  `s_id` int(11) NOT NULL,
  PRIMARY KEY (`course_id`,`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_name` varchar(255) DEFAULT NULL,
  `t_gender` varchar(255) DEFAULT NULL,
  `t_birthday` date DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
