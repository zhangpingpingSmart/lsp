/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50648
 Source Host           : localhost:3306
 Source Schema         : zppnew

 Target Server Type    : MySQL
 Target Server Version : 50648
 File Encoding         : 65001

 Date: 19/03/2021 15:02:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence`  (
  `next_val` bigint(20) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES (1);

-- ----------------------------
-- Table structure for zpp_menu
-- ----------------------------
DROP TABLE IF EXISTS `zpp_menu`;
CREATE TABLE `zpp_menu`  (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `menu_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单名称',
  `parent_id` bigint(20) NULL DEFAULT 0 COMMENT '父菜单ID',
  `order_num` int(11) NULL DEFAULT 1 COMMENT '显示顺序',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '请求地址',
  `menu_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '类型:M目录,C菜单,F按钮',
  `visible` int(11) NULL DEFAULT 0 COMMENT '菜单状态:0显示,1隐藏',
  `perms` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '权限标识',
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '菜单图标',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '备注',
  `is_delete` int(11) NULL DEFAULT 0 COMMENT '是否删除:0未删除，1删除',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '菜单权限表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of zpp_menu
-- ----------------------------
INSERT INTO `zpp_menu` VALUES (1, '1', 0, 1, '', '', 0, '', '', '', 0);
INSERT INTO `zpp_menu` VALUES (2, '2', 0, 1, '', '', 0, '', '', '', 0);
INSERT INTO `zpp_menu` VALUES (3, '3', 0, 1, '', '', 0, '', '', '', 0);

-- ----------------------------
-- Table structure for zpp_role
-- ----------------------------
DROP TABLE IF EXISTS `zpp_role`;
CREATE TABLE `zpp_role`  (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `parent_role_id` bigint(20) NOT NULL COMMENT '角色父id',
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色描述',
  `is_delete` int(11) NULL DEFAULT 0 COMMENT '是否删除:0未删除，1删除',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of zpp_role
-- ----------------------------
INSERT INTO `zpp_role` VALUES (1, 0, '角色1', '2021-03-17 13:50:54', NULL, NULL);
INSERT INTO `zpp_role` VALUES (2, 0, '2', '2021-03-17 13:52:14', NULL, NULL);

-- ----------------------------
-- Table structure for zpp_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `zpp_role_menu`;
CREATE TABLE `zpp_role_menu`  (
  `role_id` bigint(20) NOT NULL COMMENT '角色ID',
  `menu_id` bigint(20) NOT NULL COMMENT '菜单ID',
  `rm_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  PRIMARY KEY (`rm_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '角色和菜单关联表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of zpp_role_menu
-- ----------------------------
INSERT INTO `zpp_role_menu` VALUES (1, 1, 1);
INSERT INTO `zpp_role_menu` VALUES (1, 2, 2);

-- ----------------------------
-- Table structure for zpp_store
-- ----------------------------
DROP TABLE IF EXISTS `zpp_store`;
CREATE TABLE `zpp_store`  (
  `store_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商家id',
  `store_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商家用户名称',
  `store_addr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商家地址',
  `store_full_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商家真实名称',
  `store_password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商家密码',
  `store_mobile` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商家手机号',
  `store_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商家座机',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `salt` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT 'zpp' COMMENT '盐',
  `is_delete` int(11) NULL DEFAULT 0 COMMENT '是否删除:0未删除，1删除',
  PRIMARY KEY (`store_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of zpp_store
-- ----------------------------
INSERT INTO `zpp_store` VALUES (1, 'zpp', NULL, NULL, '202CB962AC59075B964B07152D234B70', NULL, NULL, NULL, NULL, 'zpp', NULL);
INSERT INTO `zpp_store` VALUES (2, 'zpp2', NULL, NULL, '202CB962AC59075B964B07152D234B70', NULL, NULL, NULL, NULL, 'zpp', NULL);

-- ----------------------------
-- Table structure for zpp_store_role
-- ----------------------------
DROP TABLE IF EXISTS `zpp_store_role`;
CREATE TABLE `zpp_store_role`  (
  `zsr_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `store_id` bigint(20) NOT NULL COMMENT '商户id',
  `role_id` bigint(20) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`zsr_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of zpp_store_role
-- ----------------------------
INSERT INTO `zpp_store_role` VALUES (1, 1, 1);
INSERT INTO `zpp_store_role` VALUES (2, 1, 2);
INSERT INTO `zpp_store_role` VALUES (3, 2, 1);

-- ----------------------------
-- Table structure for zpp_user
-- ----------------------------
DROP TABLE IF EXISTS `zpp_user`;
CREATE TABLE `zpp_user`  (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '标识',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `full_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `mobile` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `login_time` datetime NULL DEFAULT NULL COMMENT '登录时间',
  `last_login_time` datetime NULL DEFAULT NULL COMMENT '上次登录时间',
  `login_count` bigint(20) NULL DEFAULT NULL COMMENT '登录次数',
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'zpp' COMMENT '盐',
  `is_delete` int(11) NULL DEFAULT 0 COMMENT '是否删除:0未删除，1删除',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of zpp_user
-- ----------------------------
INSERT INTO `zpp_user` VALUES (4, 'zpp', '202CB962AC59075B964B07152D234B70', '张平平', NULL, NULL, '2021-03-10 11:47:32', '2021-03-10 11:47:35', '2021-03-10 11:47:37', NULL, 'zpp', NULL);

SET FOREIGN_KEY_CHECKS = 1;
