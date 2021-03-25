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

 Date: 25/03/2021 17:47:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `category_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '分类id',
  `category_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分类编码',
  `category_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `parent_id` int(11) NULL DEFAULT NULL COMMENT '父id',
  `category_level` int(11) NULL DEFAULT NULL COMMENT '层级',
  `category_seq` int(11) NULL DEFAULT NULL COMMENT '顺序号',
  `is_end` int(11) NULL DEFAULT 0 COMMENT '是否末级：0非末级，1末级',
  `category_status` int(11) NULL DEFAULT 0 COMMENT '状态：0启用，1停用',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `category_logo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分类图标地址',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '是否删除：0未删除，1删除',
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of category
-- ----------------------------

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goods_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `category_id` int(11) NULL DEFAULT NULL COMMENT '分类id',
  `goods_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `goods_as` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '别名',
  `goods_label` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品标签',
  `goods_brand` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品品牌',
  `goods_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品详情',
  `store_id` bigint(20) NULL DEFAULT NULL COMMENT '商家id',
  `goods_seq` int(11) NULL DEFAULT NULL COMMENT '顺序号',
  `goods_status` int(11) NULL DEFAULT 0 COMMENT '商品状态：0上架，1下架',
  `goods_remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品备注',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `is_delete` int(11) NULL DEFAULT 0 COMMENT '是否删除：0未删除，1删除',
  PRIMARY KEY (`goods_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods
-- ----------------------------

-- ----------------------------
-- Table structure for goods_format
-- ----------------------------
DROP TABLE IF EXISTS `goods_format`;
CREATE TABLE `goods_format`  (
  `format_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '规格id',
  `goods_id` bigint(20) NULL DEFAULT NULL COMMENT '商品id',
  `unit_id` int(11) NULL DEFAULT NULL COMMENT '单位id',
  `format_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '规格名称',
  `format_price` decimal(12, 2) NULL DEFAULT NULL COMMENT '价格',
  `format_num` int(11) NULL DEFAULT NULL COMMENT '数量',
  `format_seq` int(11) NULL DEFAULT NULL COMMENT '顺序号',
  `format_status` int(11) NULL DEFAULT 0 COMMENT '状态：0启用，1禁用',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `platform_price` decimal(12, 2) NULL DEFAULT NULL COMMENT '平台价格',
  `is_delete` int(11) NULL DEFAULT 0 COMMENT '是否删除：0未删除，1删除',
  PRIMARY KEY (`format_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods_format
-- ----------------------------

-- ----------------------------
-- Table structure for goods_method
-- ----------------------------
DROP TABLE IF EXISTS `goods_method`;
CREATE TABLE `goods_method`  (
  `gm_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品加工方式关联表id',
  `goods_id` bigint(20) NULL DEFAULT NULL COMMENT '商品id',
  `method_id` int(11) NULL DEFAULT NULL COMMENT '加工方式id',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`gm_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods_method
-- ----------------------------

-- ----------------------------
-- Table structure for goods_picture
-- ----------------------------
DROP TABLE IF EXISTS `goods_picture`;
CREATE TABLE `goods_picture`  (
  `pic_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图片主键id',
  `goods_id` bigint(20) NULL DEFAULT NULL COMMENT '商品id',
  `pic_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片url',
  `pic_seq` int(11) NULL DEFAULT NULL COMMENT '顺序号',
  `is_main` int(11) NULL DEFAULT NULL COMMENT '是否主图',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `is_delete` int(11) NULL DEFAULT 0 COMMENT '是否删除：0未删除，1删除',
  PRIMARY KEY (`pic_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods_picture
-- ----------------------------

-- ----------------------------
-- Table structure for goods_unit
-- ----------------------------
DROP TABLE IF EXISTS `goods_unit`;
CREATE TABLE `goods_unit`  (
  `unit_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '单位id',
  `unit_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '单位名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`unit_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods_unit
-- ----------------------------

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
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail`  (
  `odetail_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单商品主键',
  `order_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单编号',
  `format_id` bigint(20) NULL DEFAULT NULL COMMENT '规格id',
  `method_id` bigint(20) NULL DEFAULT NULL COMMENT '加工方式id',
  `goods_num` int(11) NULL DEFAULT NULL COMMENT '商品数量',
  `goods_price` decimal(12, 2) NULL DEFAULT NULL COMMENT '商品价格',
  PRIMARY KEY (`odetail_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info`  (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `buyer_id` bigint(20) NULL DEFAULT NULL COMMENT '卖家id',
  `address_id` bigint(20) NULL DEFAULT NULL COMMENT '地址id',
  `order_status` int(11) NULL DEFAULT NULL COMMENT '订单状态：0进行中，1已完成，2取消交易',
  `pay_status` int(11) NULL DEFAULT NULL COMMENT '支付状态：0未付款，1已付款，2线下付款，3线下付款已收款',
  `order_amout` decimal(12, 2) NULL DEFAULT NULL COMMENT '订单金额',
  `pay_amout` decimal(12, 2) NULL DEFAULT NULL COMMENT '支付金额',
  `total_amout` decimal(12, 2) NULL DEFAULT NULL COMMENT '商品最终总金额',
  `pay_time` datetime NULL DEFAULT NULL COMMENT '支付时间',
  `pay_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '支付订单号',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `delivery_type` int(11) NULL DEFAULT NULL COMMENT '配送方式',
  `delivery_status` int(11) NULL DEFAULT NULL COMMENT '配送状态：0未收货，1送货中，2已送货',
  `seller_status` int(11) NULL DEFAULT NULL COMMENT '商家状态：0备货中，1备货完成，2缺货',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `buyer_status` int(11) NULL DEFAULT NULL COMMENT '卖家状态：0待收货，1已收货，2换货，3退货',
  `delivery_money` decimal(12, 2) NULL DEFAULT NULL COMMENT '配送费',
  `delivery_receive_time` datetime NULL DEFAULT NULL COMMENT '配送收货时间',
  `delivery_finish_time` datetime NULL DEFAULT NULL COMMENT '配送完成时间',
  `seller_finish_time` datetime NULL DEFAULT NULL COMMENT '卖家完成时间',
  `buyer_finish_time` datetime NULL DEFAULT NULL COMMENT '买家完成时间',
  `is_delete` int(11) NULL DEFAULT 0 COMMENT '是否删除：0未删除：1删除',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of order_info
-- ----------------------------

-- ----------------------------
-- Table structure for process_method
-- ----------------------------
DROP TABLE IF EXISTS `process_method`;
CREATE TABLE `process_method`  (
  `method_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '加工方式id',
  `method_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '加工方式名称',
  `method_status` int(11) NULL DEFAULT 0 COMMENT '状态：0启用，1停用',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `is_delete` int(11) NULL DEFAULT 0 COMMENT '是否删除：0未删除，1删除',
  PRIMARY KEY (`method_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of process_method
-- ----------------------------

-- ----------------------------
-- Table structure for shop_cart
-- ----------------------------
DROP TABLE IF EXISTS `shop_cart`;
CREATE TABLE `shop_cart`  (
  `cart_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '购物车id',
  `user_id` bigint(20) NULL DEFAULT NULL COMMENT '用户id',
  `format_id` bigint(20) NULL DEFAULT NULL COMMENT '规格id',
  `goods_num` int(11) NULL DEFAULT NULL COMMENT '商品数量',
  `store_id` bigint(20) NULL DEFAULT NULL COMMENT '商家id',
  `is_selected` int(11) NULL DEFAULT NULL COMMENT '是否选择：1未选择，1选择',
  `method_id` bigint(20) NULL DEFAULT NULL COMMENT '加工方式',
  `create_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`cart_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of shop_cart
-- ----------------------------

-- ----------------------------
-- Table structure for user_address
-- ----------------------------
DROP TABLE IF EXISTS `user_address`;
CREATE TABLE `user_address`  (
  `address_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '地址id',
  `user_id` bigint(20) NULL DEFAULT NULL COMMENT '用户id',
  `address_name` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '详细地址',
  `province` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省',
  `city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '市',
  `area` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '区',
  `street` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '街道',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `is_delete` int(11) NULL DEFAULT NULL COMMENT '是否删除：0未删除，1删除',
  PRIMARY KEY (`address_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_address
-- ----------------------------

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
