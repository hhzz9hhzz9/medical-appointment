/*
 Navicat Premium Data Transfer

 Source Server         : llf_java
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : groupllfproject

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 26/03/2020 12:57:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for appointment
-- ----------------------------
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment`  (
  `appointment_id` int(11) NOT NULL AUTO_INCREMENT,
  `astatus_id` int(11) NULL DEFAULT NULL,
  `doctor_id` int(11) NULL DEFAULT NULL,
  `patient_id` int(11) NULL DEFAULT NULL,
  `aname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `atime` timestamp(0) NULL DEFAULT NULL,
  PRIMARY KEY (`appointment_id`) USING BTREE,
  INDEX `FK_Relationship_11`(`astatus_id`) USING BTREE,
  INDEX `FK_Relationship_7`(`patient_id`) USING BTREE,
  INDEX `FK_Relationship_8`(`doctor_id`) USING BTREE,
  CONSTRAINT `FK_Relationship_11` FOREIGN KEY (`astatus_id`) REFERENCES `astatus` (`astatus_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Relationship_7` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Relationship_8` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for astatus
-- ----------------------------
DROP TABLE IF EXISTS `astatus`;
CREATE TABLE `astatus`  (
  `astatus_id` int(11) NOT NULL AUTO_INCREMENT,
  `astatus_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`astatus_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for doctor
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor`  (
  `doctor_id` int(11) NOT NULL AUTO_INCREMENT,
  `zhenshi_id` int(11) NULL DEFAULT NULL,
  `office_id` int(11) NULL DEFAULT NULL,
  `doctor_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`doctor_id`) USING BTREE,
  INDEX `FK_Relationship_13`(`zhenshi_id`) USING BTREE,
  INDEX `FK_Relationship_3`(`office_id`) USING BTREE,
  CONSTRAINT `FK_Relationship_13` FOREIGN KEY (`zhenshi_id`) REFERENCES `zhenshi` (`zhenshi_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Relationship_3` FOREIGN KEY (`office_id`) REFERENCES `office` (`office_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for medical
-- ----------------------------
DROP TABLE IF EXISTS `medical`;
CREATE TABLE `medical`  (
  `medical_id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_id` int(11) NULL DEFAULT NULL,
  `doctor_id` int(11) NULL DEFAULT NULL,
  `medical_info` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `medical_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`medical_id`) USING BTREE,
  INDEX `FK_Relationship_14`(`patient_id`) USING BTREE,
  INDEX `FK_Relationship_15`(`doctor_id`) USING BTREE,
  CONSTRAINT `FK_Relationship_14` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Relationship_15` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for office
-- ----------------------------
DROP TABLE IF EXISTS `office`;
CREATE TABLE `office`  (
  `office_id` int(11) NOT NULL AUTO_INCREMENT,
  `office_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`office_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for paidui
-- ----------------------------
DROP TABLE IF EXISTS `paidui`;
CREATE TABLE `paidui`  (
  `pd_id` int(11) NOT NULL AUTO_INCREMENT,
  `zhenshi_id` int(11) NULL DEFAULT NULL,
  `office_id` int(11) NULL DEFAULT NULL,
  `pd_no` int(11) NULL DEFAULT NULL,
  `pd_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`pd_id`) USING BTREE,
  INDEX `FK_Relationship_16`(`zhenshi_id`) USING BTREE,
  INDEX `FK_Relationship_17`(`office_id`) USING BTREE,
  CONSTRAINT `FK_Relationship_16` FOREIGN KEY (`zhenshi_id`) REFERENCES `zhenshi` (`zhenshi_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Relationship_17` FOREIGN KEY (`office_id`) REFERENCES `office` (`office_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient`  (
  `patient_id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `patient_age` int(11) NULL DEFAULT NULL,
  `patient_account` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `patient_pwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `patient_gender` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `patient_status` int(11) NULL DEFAULT NULL COMMENT '0表示在黑名单，1表示正常',
  PRIMARY KEY (`patient_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES (1, '张三', 40, 'admin1', '123456', '男', 1);
INSERT INTO `patient` VALUES (9, NULL, NULL, 'aaa', '123', NULL, NULL);
INSERT INTO `patient` VALUES (10, NULL, NULL, 'bbb', '123321', NULL, NULL);
INSERT INTO `patient` VALUES (11, '李四', 44, 'qqq', '123123', NULL, NULL);

-- ----------------------------
-- Table structure for relationship_9
-- ----------------------------
DROP TABLE IF EXISTS `relationship_9`;
CREATE TABLE `relationship_9`  (
  `doctor_id` int(11) NOT NULL,
  `scheduling_id` int(11) NOT NULL,
  PRIMARY KEY (`doctor_id`, `scheduling_id`) USING BTREE,
  INDEX `FK_Relationship_10`(`scheduling_id`) USING BTREE,
  CONSTRAINT `FK_Relationship_10` FOREIGN KEY (`scheduling_id`) REFERENCES `scheduling` (`scheduling_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Relationship_9` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for scheduling
-- ----------------------------
DROP TABLE IF EXISTS `scheduling`;
CREATE TABLE `scheduling`  (
  `scheduling_id` int(11) NOT NULL AUTO_INCREMENT,
  `start_time` datetime(0) NULL DEFAULT NULL,
  `end_time` datetime(0) NULL DEFAULT NULL,
  `duration` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`scheduling_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sourcepool
-- ----------------------------
DROP TABLE IF EXISTS `sourcepool`;
CREATE TABLE `sourcepool`  (
  `source_pool_id` int(11) NOT NULL AUTO_INCREMENT,
  `doctor_id` int(11) NULL DEFAULT NULL,
  `source_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `max_count` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`source_pool_id`) USING BTREE,
  INDEX `FK_Relationship_6`(`doctor_id`) USING BTREE,
  CONSTRAINT `FK_Relationship_6` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sourcepoolinfo
-- ----------------------------
DROP TABLE IF EXISTS `sourcepoolinfo`;
CREATE TABLE `sourcepoolinfo`  (
  `spi_id` int(11) NOT NULL AUTO_INCREMENT,
  `source_pool_id` int(11) NULL DEFAULT NULL,
  `sp_time` date NULL DEFAULT NULL,
  `sp_stock` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`spi_id`) USING BTREE,
  INDEX `FK_Relationship_1`(`source_pool_id`) USING BTREE,
  CONSTRAINT `FK_Relationship_1` FOREIGN KEY (`source_pool_id`) REFERENCES `sourcepool` (`source_pool_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for zhenshi
-- ----------------------------
DROP TABLE IF EXISTS `zhenshi`;
CREATE TABLE `zhenshi`  (
  `zhenshi_id` int(11) NOT NULL AUTO_INCREMENT,
  `office_id` int(11) NULL DEFAULT NULL,
  `zhenshi_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`zhenshi_id`) USING BTREE,
  INDEX `FK_Relationship_12`(`office_id`) USING BTREE,
  CONSTRAINT `FK_Relationship_12` FOREIGN KEY (`office_id`) REFERENCES `office` (`office_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
