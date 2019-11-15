/*
Navicat MySQL Data Transfer

Source Server         : dafei
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : car

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-11-11 19:39:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for carbrand
-- ----------------------------
DROP TABLE IF EXISTS `carbrand`;
CREATE TABLE `carbrand` (
  `brand_id` int(100) NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(100) DEFAULT NULL,
  `brand_log` varchar(255) DEFAULT NULL,
  `brand_time` datetime DEFAULT NULL,
  PRIMARY KEY (`brand_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=131 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of carbrand
-- ----------------------------
INSERT INTO `carbrand` VALUES ('1', '宾利', 'imgs/1.jpg', '2019-11-11 14:23:24');
INSERT INTO `carbrand` VALUES ('2', '奥迪', 'imgs/16.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('3', '奥迪', 'imgs/17.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('4', '奥迪', 'imgs/18.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('5', '奥迪', 'imgs/19.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('6', '奥迪', 'imgs/20.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('7', '奥迪', 'imgs/21.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('8', '奥迪', 'imgs/22.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('9', '奥迪', 'imgs/23.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('10', '奥迪', 'imgs/24.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('11', '奥迪', 'imgs/25.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('12', '奥迪', 'imgs/26.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('13', '奥迪', 'imgs/27.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('14', '奥迪', 'imgs/28.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('15', '奥迪', 'imgs/29.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('16', '奥迪', 'imgs/30.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('17', '宝马', 'imgs/31.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('18', '宝马', 'imgs/32.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('19', '宝马', 'imgs/33.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('20', '宝马', 'imgs/34.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('21', '宝马', 'imgs/35.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('22', '宝马', 'imgs/36.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('23', '宝马', 'imgs/37.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('24', '宝马', 'imgs/38.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('25', '宝马', 'imgs/39.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('26', '宝马', 'imgs/40.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('27', '奔驰', 'imgs/2.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('28', '奔驰', 'imgs/3.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('29', '奔驰', 'imgs/4.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('30', '奔驰', 'imgs/5.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('31', '奔驰', 'imgs/6.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('32', '奔驰', 'imgs/7.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('33', '奔驰', 'imgs/8.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('34', '奔驰', 'imgs/9.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('35', '奔驰', 'imgs/10.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('36', '奔驰', 'imgs/11.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('37', '奔驰', 'imgs/12.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('38', '奔驰', 'imgs/13.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('39', '奔驰', 'imgs/14.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('40', '奔驰', 'imgs/15.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('41', '别克', 'imgs/86.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('42', '别克', 'imgs/87.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('43', '别克', 'imgs/88.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('44', '别克', 'imgs/89.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('45', '别克', 'imgs/90.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('46', '别克', 'imgs/91.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('47', '别克', 'imgs/92.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('48', '别克', 'imgs/93.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('49', '别克', 'imgs/94.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('50', '别克', 'imgs/95.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('51', '大众', 'imgs/106.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('52', '大众', 'imgs/107.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('53', '大众', 'imgs/108.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('54', '大众', 'imgs/109.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('55', '大众', 'imgs/110.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('56', '大众', 'imgs/111.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('57', '大众', 'imgs/112.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('58', '大众', 'imgs/113.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('59', '大众', 'imgs/114.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('60', '大众', 'imgs/115.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('61', '大众', 'imgs/116.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('62', '大众', 'imgs/117.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('63', '大众', 'imgs/118.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('64', '大众', 'imgs/119.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('65', '大众', 'imgs/120.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('66', '丰田', 'imgs/96.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('67', '丰田', 'imgs/97.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('68', '丰田', 'imgs/98.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('69', '丰田', 'imgs/99.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('70', '丰田', 'imgs/100.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('71', '丰田', 'imgs/101.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('72', '丰田', 'imgs/102.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('73', '丰田', 'imgs/103.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('74', '丰田', 'imgs/104.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('75', '丰田', 'imgs/105.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('76', '福特', 'imgs/76.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('77', '福特', 'imgs/77.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('78', '福特', 'imgs/78.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('79', '福特', 'imgs/79.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('80', '福特', 'imgs/80.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('81', '福特', 'imgs/81.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('82', '福特', 'imgs/82.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('83', '福特', 'imgs/83.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('84', '福特', 'imgs/84.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('85', '福特', 'imgs/85.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('86', '马自达', 'imgs/121.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('87', '马自达', 'imgs/122.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('88', '马自达', 'imgs/123.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('89', '马自达', 'imgs/124.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('90', '马自达', 'imgs/125.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('91', '马自达', 'imgs/126.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('92', '马自达', 'imgs/127.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('93', '马自达', 'imgs/128.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('94', '马自达', 'imgs/129.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('95', '马自达', 'imgs/130.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('96', '起亚', 'imgs/56.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('97', '起亚', 'imgs/57.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('98', '起亚', 'imgs/58.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('99', '起亚', 'imgs/59.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('100', '起亚', 'imgs/60.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('101', '起亚', 'imgs/61.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('102', '起亚', 'imgs/62.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('103', '起亚', 'imgs/63.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('104', '起亚', 'imgs/64.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('105', '起亚', 'imgs/65.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('106', '现代', 'imgs/66.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('107', '现代', 'imgs/67.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('108', '现代', 'imgs/68.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('109', '现代', 'imgs/69.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('110', '现代', 'imgs/70.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('111', '现代', 'imgs/71.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('112', '现代', 'imgs/72.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('113', '现代', 'imgs/73.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('114', '现代', 'imgs/74.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('115', '现代', 'imgs/75.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('116', '雪佛兰', 'imgs/41.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('117', '雪佛兰', 'imgs/42.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('118', '雪佛兰', 'imgs/43.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('119', '雪佛兰', 'imgs/44.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('120', '雪佛兰', 'imgs/45.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('121', '雪佛兰', 'imgs/46.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('122', '雪佛兰', 'imgs/47.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('123', '雪佛兰', 'imgs/48.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('124', '雪佛兰', 'imgs/49.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('125', '雪佛兰', 'imgs/50.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('126', '雪佛兰', 'imgs/51.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('127', '雪佛兰', 'imgs/52.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('128', '雪佛兰', 'imgs/53.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('129', '雪佛兰', 'imgs/54.jpg', '2019-11-13 14:48:20');
INSERT INTO `carbrand` VALUES ('130', '雪佛兰', 'imgs/55.jpg', '2019-11-13 14:48:20');

-- ----------------------------
-- Table structure for carcanshu1
-- ----------------------------
DROP TABLE IF EXISTS `carcanshu1`;
CREATE TABLE `carcanshu1` (
  `car_canshu_id` int(50) NOT NULL,
  `car_biansuxiang` varchar(50) DEFAULT NULL,
  `car_shushidu` varchar(50) DEFAULT NULL,
  `car_chuchangriqi` date DEFAULT NULL,
  `car_gonglishu` varchar(50) DEFAULT NULL,
  `car_pailiang` varchar(50) DEFAULT NULL,
  `car_tese` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`car_canshu_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of carcanshu1
-- ----------------------------

-- ----------------------------
-- Table structure for carkuan
-- ----------------------------
DROP TABLE IF EXISTS `carkuan`;
CREATE TABLE `carkuan` (
  `carkuan_id` int(100) NOT NULL AUTO_INCREMENT,
  `carxin_name` varchar(255) DEFAULT NULL,
  `brand_name` varchar(255) DEFAULT NULL,
  `carkuan_time` int(100) DEFAULT NULL,
  `carxi_name` varchar(255) DEFAULT NULL,
  `car_type` varchar(255) DEFAULT NULL,
  `car_price` double(50,2) DEFAULT NULL,
  PRIMARY KEY (`carkuan_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of carkuan
-- ----------------------------
INSERT INTO `carkuan` VALUES ('1', '2017款 e 200l 运动型', '奔驰', '20190012', '奔驰xl', 'SUV', '130000.00');
INSERT INTO `carkuan` VALUES ('2', '2017款 e 200l 运动型', '宝马', '20190012', '宝马SSS', 'SUV', '1300000.00');
INSERT INTO `carkuan` VALUES ('3', '2017款 e 200l 运动型', '雷克萨斯', '20190012', '雷克萨斯SSS', 'SUV', '1300000.00');
INSERT INTO `carkuan` VALUES ('4', '2017款 e 200l 运动型', '劳斯莱斯', '20190012', '劳斯莱斯SSS', 'SUV', '1300000.00');
INSERT INTO `carkuan` VALUES ('5', '2017款 e 200l 运动型', '保时捷', '20190012', '保时捷SSS', 'SUV', '13000000.00');

-- ----------------------------
-- Table structure for carxi
-- ----------------------------
DROP TABLE IF EXISTS `carxi`;
CREATE TABLE `carxi` (
  `carxi_id` int(100) NOT NULL AUTO_INCREMENT,
  `carxi_name` varchar(255) DEFAULT NULL,
  `brand_name` varchar(255) DEFAULT NULL,
  `car_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`carxi_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of carxi
-- ----------------------------
INSERT INTO `carxi` VALUES ('1', '雷克萨斯xl', '雷克萨斯', 'SUV');
INSERT INTO `carxi` VALUES ('2', '宝马X5', '宝马', 'SUV');
INSERT INTO `carxi` VALUES ('3', '宝马X5', '宝马', 'suv');

-- ----------------------------
-- Table structure for center_tb_carbrand_carkuan
-- ----------------------------
DROP TABLE IF EXISTS `center_tb_carbrand_carkuan`;
CREATE TABLE `center_tb_carbrand_carkuan` (
  `brand_id` int(50) DEFAULT NULL,
  `carkuan_id` int(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of center_tb_carbrand_carkuan
-- ----------------------------
INSERT INTO `center_tb_carbrand_carkuan` VALUES ('1', '1');

-- ----------------------------
-- Table structure for center_tb_carcanshu_carkuan
-- ----------------------------
DROP TABLE IF EXISTS `center_tb_carcanshu_carkuan`;
CREATE TABLE `center_tb_carcanshu_carkuan` (
  `carkuan_id` int(50) DEFAULT NULL,
  `car_canshu_id` int(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of center_tb_carcanshu_carkuan
-- ----------------------------
INSERT INTO `center_tb_carcanshu_carkuan` VALUES ('1', '1');

-- ----------------------------
-- Table structure for factory
-- ----------------------------
DROP TABLE IF EXISTS `factory`;
CREATE TABLE `factory` (
  `factory_id` int(100) NOT NULL AUTO_INCREMENT,
  `factory_name` varchar(255) DEFAULT NULL,
  `brand_name` varchar(255) DEFAULT NULL,
  `factory_log` varchar(255) DEFAULT NULL,
  `factory_time` datetime DEFAULT NULL,
  PRIMARY KEY (`factory_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of factory
-- ----------------------------
INSERT INTO `factory` VALUES ('1', '厂商1', '宾利', 'imgs/111a.jpg', '2019-11-20 14:32:33');
INSERT INTO `factory` VALUES ('2', '厂商2', '奔驰', 'imgs/222a.jpg', '2019-11-22 14:41:12');
INSERT INTO `factory` VALUES ('3', '厂商3', '奥迪', 'imgs/333a.jpg', '2019-11-22 14:41:12');
INSERT INTO `factory` VALUES ('4', '厂商4', '宝马', 'imgs/444a.jpg', '2019-11-22 14:41:12');
INSERT INTO `factory` VALUES ('5', '厂商5', '马自达', 'imgs/555a.jpg', '2019-11-22 14:41:12');
INSERT INTO `factory` VALUES ('6', '厂商6', '大众', 'imgs/666a.jpg', '2019-11-22 14:41:12');
INSERT INTO `factory` VALUES ('7', '厂商7', '现代', 'imgs/777a.jpg', '2019-11-22 14:41:12');
INSERT INTO `factory` VALUES ('8', '厂商8', '丰田', 'imgs/888a.jpg', '2019-11-22 14:41:12');
INSERT INTO `factory` VALUES ('9', '厂商9', '福特', 'imgs/999a.jpg', '2019-11-22 14:41:12');
INSERT INTO `factory` VALUES ('10', '厂商10', '别克', 'imgs/1010.jpg', '2019-11-22 14:41:12');
INSERT INTO `factory` VALUES ('11', '厂商11', '起亚', 'imgs/1111.jpg', '2019-11-22 14:41:12');
INSERT INTO `factory` VALUES ('12', '厂商12', '雪佛兰', 'imgs/1212.jpg', '2019-11-22 14:41:12');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `perm_id` int(100) NOT NULL,
  `perm_name` varchar(255) DEFAULT NULL,
  `perm_time` datetime DEFAULT NULL,
  PRIMARY KEY (`perm_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '1', '2019-11-18 14:33:09');
INSERT INTO `permission` VALUES ('2', '2', '2019-11-13 14:41:31');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(100) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  `role_time` datetime DEFAULT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员', '2019-11-07 16:09:37');
INSERT INTO `role` VALUES ('2', '会员', '2019-11-02 16:09:41');
INSERT INTO `role` VALUES ('3', '2', '2019-11-26 14:32:48');
INSERT INTO `role` VALUES ('4', '3', '2019-11-27 14:41:43');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(100) NOT NULL,
  `user_account` int(100) DEFAULT NULL,
  `user_nicheng` varchar(100) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_sex` varchar(100) DEFAULT NULL,
  `user_time` datetime DEFAULT NULL,
  `user_email` varchar(100) DEFAULT NULL,
  `user_address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1862162165', 'xxx', 'admin', '123', '男', '2019-11-13 16:11:09', 'sad@163.com', '西安');
INSERT INTO `user` VALUES ('2', '1895985165', '小昭', '王昭君', '123', '女', '2019-11-12 14:21:24', 'sad@163.com', '延安');
INSERT INTO `user` VALUES ('3', '1895985165', '小哈', '大乔', '123', '女', '2019-11-12 14:21:24', 'sad@163.com', '西安');
INSERT INTO `user` VALUES ('4', '1895985165', '小松鼠', '孙权', '123', '男', '2019-11-12 14:21:24', 'sad@163.com', '西安');
INSERT INTO `user` VALUES ('5', '1888888888', '哈士奇', '张飞', '1234', '男', '2019-11-20 16:06:47', '123@163.com', '西安');

-- ----------------------------
-- Table structure for user_permission
-- ----------------------------
DROP TABLE IF EXISTS `user_permission`;
CREATE TABLE `user_permission` (
  `role_id` int(100) DEFAULT NULL,
  `perm_id` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of user_permission
-- ----------------------------
INSERT INTO `user_permission` VALUES ('1', '1');
INSERT INTO `user_permission` VALUES ('1', '2');
INSERT INTO `user_permission` VALUES ('2', '2');
INSERT INTO `user_permission` VALUES ('3', '3');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_id` int(100) NOT NULL,
  `role_id` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1');
INSERT INTO `user_role` VALUES ('1', '2');
INSERT INTO `user_role` VALUES ('2', '2');
