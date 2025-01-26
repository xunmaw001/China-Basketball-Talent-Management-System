-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmna5js
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ssmna5js`
--

/*!40000 DROP DATABASE IF EXISTS `ssmna5js`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmna5js` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmna5js`;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussguojiadui`
--

DROP TABLE IF EXISTS `discussguojiadui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussguojiadui` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` varchar(200) DEFAULT NULL COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='国家队评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussguojiadui`
--

LOCK TABLES `discussguojiadui` WRITE;
/*!40000 ALTER TABLE `discussguojiadui` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussguojiadui` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussqiuyuan`
--

DROP TABLE IF EXISTS `discussqiuyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussqiuyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` varchar(200) DEFAULT NULL COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='球员评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussqiuyuan`
--

LOCK TABLES `discussqiuyuan` WRITE;
/*!40000 ALTER TABLE `discussqiuyuan` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussqiuyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussxinwenzixun`
--

DROP TABLE IF EXISTS `discussxinwenzixun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussxinwenzixun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` varchar(200) DEFAULT NULL COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='新闻资讯评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussxinwenzixun`
--

LOCK TABLES `discussxinwenzixun` WRITE;
/*!40000 ALTER TABLE `discussxinwenzixun` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussxinwenzixun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guojiadui`
--

DROP TABLE IF EXISTS `guojiadui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guojiadui` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `qiuyuanxingming` varchar(200) NOT NULL COMMENT '球员姓名',
  `qiuyuantupian` varchar(200) NOT NULL COMMENT '球员图片',
  `xiaolijulebu` varchar(200) DEFAULT NULL COMMENT '效力俱乐部',
  `changshangweizhi` varchar(200) DEFAULT NULL,
  `qiuyihaoma` varchar(200) DEFAULT NULL,
  `shengao` varchar(200) DEFAULT NULL,
  `tizhong` varchar(200) DEFAULT NULL,
  `gerenshuju` longtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='国家队';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guojiadui`
--

LOCK TABLES `guojiadui` WRITE;
/*!40000 ALTER TABLE `guojiadui` DISABLE KEYS */;
INSERT INTO `guojiadui` VALUES (41,'2022-12-07 01:58:07','球员姓名1','upload/guojiadui_qiuyuantupian1.jpg,upload/guojiadui_qiuyuantupian2.jpg,upload/guojiadui_qiuyuantupian3.jpg','效力俱乐部1','场上位置1','球衣号码1','身高1','体重1','个人数据1'),(42,'2022-12-07 01:58:07','球员姓名2','upload/guojiadui_qiuyuantupian2.jpg,upload/guojiadui_qiuyuantupian3.jpg,upload/guojiadui_qiuyuantupian4.jpg','效力俱乐部2','场上位置2','球衣号码2','身高2','体重2','个人数据2'),(43,'2022-12-07 01:58:07','球员姓名3','upload/guojiadui_qiuyuantupian3.jpg,upload/guojiadui_qiuyuantupian4.jpg,upload/guojiadui_qiuyuantupian5.jpg','效力俱乐部3','场上位置3','球衣号码3','身高3','体重3','个人数据3'),(44,'2022-12-07 01:58:07','球员姓名4','upload/guojiadui_qiuyuantupian4.jpg,upload/guojiadui_qiuyuantupian5.jpg,upload/guojiadui_qiuyuantupian6.jpg','效力俱乐部4','场上位置4','球衣号码4','身高4','体重4','个人数据4'),(45,'2022-12-07 01:58:07','球员姓名5','upload/guojiadui_qiuyuantupian5.jpg,upload/guojiadui_qiuyuantupian6.jpg,upload/guojiadui_qiuyuantupian7.jpg','效力俱乐部5','场上位置5','球衣号码5','身高5','体重5','个人数据5'),(46,'2022-12-07 01:58:07','球员姓名6','upload/guojiadui_qiuyuantupian6.jpg,upload/guojiadui_qiuyuantupian7.jpg,upload/guojiadui_qiuyuantupian8.jpg','效力俱乐部6','场上位置6','球衣号码6','身高6','体重6','个人数据6'),(47,'2022-12-07 01:58:07','球员姓名7','upload/guojiadui_qiuyuantupian7.jpg,upload/guojiadui_qiuyuantupian8.jpg,upload/guojiadui_qiuyuantupian9.jpg','效力俱乐部7','场上位置7','球衣号码7','身高7','体重7','个人数据7'),(48,'2022-12-07 01:58:07','球员姓名8','upload/guojiadui_qiuyuantupian8.jpg,upload/guojiadui_qiuyuantupian9.jpg,upload/guojiadui_qiuyuantupian10.jpg','效力俱乐部8','场上位置8','球衣号码8','身高8','体重8','个人数据8');
/*!40000 ALTER TABLE `guojiadui` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `avatarurl` varchar(200) DEFAULT NULL COMMENT '头像',
  `content` longtext NOT NULL COMMENT '留言内容',
  `cpicture` varchar(200) DEFAULT NULL COMMENT '留言图片',
  `reply` longtext COMMENT '回复内容',
  `rpicture` varchar(200) DEFAULT NULL COMMENT '回复图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='在线留言';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (81,'2022-12-07 01:58:07',1,'用户名1','upload/messages_avatarurl1.jpg','留言内容1','upload/messages_cpicture1.jpg','回复内容1','upload/messages_rpicture1.jpg'),(82,'2022-12-07 01:58:07',2,'用户名2','upload/messages_avatarurl2.jpg','留言内容2','upload/messages_cpicture2.jpg','回复内容2','upload/messages_rpicture2.jpg'),(83,'2022-12-07 01:58:07',3,'用户名3','upload/messages_avatarurl3.jpg','留言内容3','upload/messages_cpicture3.jpg','回复内容3','upload/messages_rpicture3.jpg'),(84,'2022-12-07 01:58:07',4,'用户名4','upload/messages_avatarurl4.jpg','留言内容4','upload/messages_cpicture4.jpg','回复内容4','upload/messages_rpicture4.jpg'),(85,'2022-12-07 01:58:07',5,'用户名5','upload/messages_avatarurl5.jpg','留言内容5','upload/messages_cpicture5.jpg','回复内容5','upload/messages_rpicture5.jpg'),(86,'2022-12-07 01:58:07',6,'用户名6','upload/messages_avatarurl6.jpg','留言内容6','upload/messages_cpicture6.jpg','回复内容6','upload/messages_rpicture6.jpg'),(87,'2022-12-07 01:58:07',7,'用户名7','upload/messages_avatarurl7.jpg','留言内容7','upload/messages_cpicture7.jpg','回复内容7','upload/messages_rpicture7.jpg'),(88,'2022-12-07 01:58:07',8,'用户名8','upload/messages_avatarurl8.jpg','留言内容8','upload/messages_cpicture8.jpg','回复内容8','upload/messages_rpicture8.jpg');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qiuyuan`
--

DROP TABLE IF EXISTS `qiuyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qiuyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `qiuyuanxingming` varchar(200) NOT NULL COMMENT '球员姓名',
  `nianlingduan` varchar(200) NOT NULL COMMENT '年龄段',
  `qiuyuantupian` varchar(200) NOT NULL COMMENT '球员图片',
  `suozaixuexiao` varchar(200) DEFAULT NULL,
  `changshangweizhi` varchar(200) DEFAULT NULL,
  `qiuyihaoma` varchar(200) DEFAULT NULL,
  `shengao` varchar(200) DEFAULT NULL,
  `tizhong` varchar(200) DEFAULT NULL,
  `gerenshuju` longtext,
  `paiming` int(11) NOT NULL,
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='球员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qiuyuan`
--

LOCK TABLES `qiuyuan` WRITE;
/*!40000 ALTER TABLE `qiuyuan` DISABLE KEYS */;
INSERT INTO `qiuyuan` VALUES (21,'2022-12-07 01:58:07','球员姓名1','中学生','upload/qiuyuan_qiuyuantupian1.jpg,upload/qiuyuan_qiuyuantupian2.jpg,upload/qiuyuan_qiuyuantupian3.jpg','所在学校1','场上位置1','球衣号码1','身高1','体重1','个人数据1',1,1),(22,'2022-12-07 01:58:07','球员姓名2','中学生','upload/qiuyuan_qiuyuantupian2.jpg,upload/qiuyuan_qiuyuantupian3.jpg,upload/qiuyuan_qiuyuantupian4.jpg','所在学校2','场上位置2','球衣号码2','身高2','体重2','个人数据2',2,2),(23,'2022-12-07 01:58:07','球员姓名3','中学生','upload/qiuyuan_qiuyuantupian3.jpg,upload/qiuyuan_qiuyuantupian4.jpg,upload/qiuyuan_qiuyuantupian5.jpg','所在学校3','场上位置3','球衣号码3','身高3','体重3','个人数据3',3,3),(24,'2022-12-07 01:58:07','球员姓名4','中学生','upload/qiuyuan_qiuyuantupian4.jpg,upload/qiuyuan_qiuyuantupian5.jpg,upload/qiuyuan_qiuyuantupian6.jpg','所在学校4','场上位置4','球衣号码4','身高4','体重4','个人数据4',4,4),(25,'2022-12-07 01:58:07','球员姓名5','中学生','upload/qiuyuan_qiuyuantupian5.jpg,upload/qiuyuan_qiuyuantupian6.jpg,upload/qiuyuan_qiuyuantupian7.jpg','所在学校5','场上位置5','球衣号码5','身高5','体重5','个人数据5',5,5),(26,'2022-12-07 01:58:07','球员姓名6','中学生','upload/qiuyuan_qiuyuantupian6.jpg,upload/qiuyuan_qiuyuantupian7.jpg,upload/qiuyuan_qiuyuantupian8.jpg','所在学校6','场上位置6','球衣号码6','身高6','体重6','个人数据6',6,6),(27,'2022-12-07 01:58:07','球员姓名7','中学生','upload/qiuyuan_qiuyuantupian7.jpg,upload/qiuyuan_qiuyuantupian8.jpg,upload/qiuyuan_qiuyuantupian9.jpg','所在学校7','场上位置7','球衣号码7','身高7','体重7','个人数据7',7,7),(28,'2022-12-07 01:58:07','球员姓名8','中学生','upload/qiuyuan_qiuyuantupian8.jpg,upload/qiuyuan_qiuyuantupian9.jpg,upload/qiuyuan_qiuyuantupian10.jpg','所在学校8','场上位置8','球衣号码8','身高8','体重8','个人数据8',8,8);
/*!40000 ALTER TABLE `qiuyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `saichengxinxi`
--

DROP TABLE IF EXISTS `saichengxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `saichengxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `saishimingcheng` varchar(200) NOT NULL COMMENT '赛事名称',
  `nianlingduan` varchar(200) NOT NULL,
  `tupian` varchar(200) NOT NULL COMMENT '图片',
  `zhuangtai` varchar(200) DEFAULT NULL COMMENT '状态',
  `zhudui` varchar(200) DEFAULT NULL COMMENT '主队',
  `kedui` varchar(200) DEFAULT NULL COMMENT '客队',
  `bifen` varchar(200) DEFAULT NULL,
  `bisaishijian` datetime NOT NULL COMMENT '比赛时间',
  `bisaijieshao` longtext COMMENT '比赛介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='赛程信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `saichengxinxi`
--

LOCK TABLES `saichengxinxi` WRITE;
/*!40000 ALTER TABLE `saichengxinxi` DISABLE KEYS */;
INSERT INTO `saichengxinxi` VALUES (31,'2022-12-07 01:58:07','赛事名称1','中学生','upload/saichengxinxi_tupian1.jpg,upload/saichengxinxi_tupian2.jpg,upload/saichengxinxi_tupian3.jpg','未开赛','主队1','客队1','比分1','2022-12-07 09:58:07','比赛介绍1'),(32,'2022-12-07 01:58:07','赛事名称2','中学生','upload/saichengxinxi_tupian2.jpg,upload/saichengxinxi_tupian3.jpg,upload/saichengxinxi_tupian4.jpg','未开赛','主队2','客队2','比分2','2022-12-07 09:58:07','比赛介绍2'),(33,'2022-12-07 01:58:07','赛事名称3','中学生','upload/saichengxinxi_tupian3.jpg,upload/saichengxinxi_tupian4.jpg,upload/saichengxinxi_tupian5.jpg','未开赛','主队3','客队3','比分3','2022-12-07 09:58:07','比赛介绍3'),(34,'2022-12-07 01:58:07','赛事名称4','中学生','upload/saichengxinxi_tupian4.jpg,upload/saichengxinxi_tupian5.jpg,upload/saichengxinxi_tupian6.jpg','未开赛','主队4','客队4','比分4','2022-12-07 09:58:07','比赛介绍4'),(35,'2022-12-07 01:58:07','赛事名称5','中学生','upload/saichengxinxi_tupian5.jpg,upload/saichengxinxi_tupian6.jpg,upload/saichengxinxi_tupian7.jpg','未开赛','主队5','客队5','比分5','2022-12-07 09:58:07','比赛介绍5'),(36,'2022-12-07 01:58:07','赛事名称6','中学生','upload/saichengxinxi_tupian6.jpg,upload/saichengxinxi_tupian7.jpg,upload/saichengxinxi_tupian8.jpg','未开赛','主队6','客队6','比分6','2022-12-07 09:58:07','比赛介绍6'),(37,'2022-12-07 01:58:07','赛事名称7','中学生','upload/saichengxinxi_tupian7.jpg,upload/saichengxinxi_tupian8.jpg,upload/saichengxinxi_tupian9.jpg','未开赛','主队7','客队7','比分7','2022-12-07 09:58:07','比赛介绍7'),(38,'2022-12-07 01:58:07','赛事名称8','中学生','upload/saichengxinxi_tupian8.jpg,upload/saichengxinxi_tupian9.jpg,upload/saichengxinxi_tupian10.jpg','未开赛','主队8','客队8','比分8','2022-12-07 09:58:07','比赛介绍8');
/*!40000 ALTER TABLE `saichengxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','管理员','2022-12-07 01:58:07');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xinwenfenlei`
--

DROP TABLE IF EXISTS `xinwenfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xinwenfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xinwenfenlei` varchar(200) NOT NULL COMMENT '新闻分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='新闻分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xinwenfenlei`
--

LOCK TABLES `xinwenfenlei` WRITE;
/*!40000 ALTER TABLE `xinwenfenlei` DISABLE KEYS */;
INSERT INTO `xinwenfenlei` VALUES (61,'2022-12-07 01:58:07','新闻分类1'),(62,'2022-12-07 01:58:07','新闻分类2'),(63,'2022-12-07 01:58:07','新闻分类3'),(64,'2022-12-07 01:58:07','新闻分类4'),(65,'2022-12-07 01:58:07','新闻分类5'),(66,'2022-12-07 01:58:07','新闻分类6'),(67,'2022-12-07 01:58:07','新闻分类7'),(68,'2022-12-07 01:58:07','新闻分类8');
/*!40000 ALTER TABLE `xinwenfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xinwenzixun`
--

DROP TABLE IF EXISTS `xinwenzixun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xinwenzixun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `laiyuan` varchar(200) NOT NULL COMMENT '来源',
  `xinwenfenlei` varchar(200) DEFAULT NULL COMMENT '新闻分类',
  `fengmianbeijing` varchar(200) DEFAULT NULL COMMENT '封面背景',
  `bianjiren` varchar(200) DEFAULT NULL COMMENT '编辑人',
  `xinwenneirong` longtext COMMENT '新闻内容',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='新闻资讯';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xinwenzixun`
--

LOCK TABLES `xinwenzixun` WRITE;
/*!40000 ALTER TABLE `xinwenzixun` DISABLE KEYS */;
INSERT INTO `xinwenzixun` VALUES (51,'2022-12-07 01:58:07','标题1','来源1','新闻分类1','upload/xinwenzixun_fengmianbeijing1.jpg,upload/xinwenzixun_fengmianbeijing2.jpg,upload/xinwenzixun_fengmianbeijing3.jpg','管理员','新闻内容1','2022-12-07 09:58:07'),(52,'2022-12-07 01:58:07','标题2','来源2','新闻分类2','upload/xinwenzixun_fengmianbeijing2.jpg,upload/xinwenzixun_fengmianbeijing3.jpg,upload/xinwenzixun_fengmianbeijing4.jpg','管理员','新闻内容2','2022-12-07 09:58:07'),(53,'2022-12-07 01:58:07','标题3','来源3','新闻分类3','upload/xinwenzixun_fengmianbeijing3.jpg,upload/xinwenzixun_fengmianbeijing4.jpg,upload/xinwenzixun_fengmianbeijing5.jpg','管理员','新闻内容3','2022-12-07 09:58:07'),(54,'2022-12-07 01:58:07','标题4','来源4','新闻分类4','upload/xinwenzixun_fengmianbeijing4.jpg,upload/xinwenzixun_fengmianbeijing5.jpg,upload/xinwenzixun_fengmianbeijing6.jpg','管理员','新闻内容4','2022-12-07 09:58:07'),(55,'2022-12-07 01:58:07','标题5','来源5','新闻分类5','upload/xinwenzixun_fengmianbeijing5.jpg,upload/xinwenzixun_fengmianbeijing6.jpg,upload/xinwenzixun_fengmianbeijing7.jpg','管理员','新闻内容5','2022-12-07 09:58:07'),(56,'2022-12-07 01:58:07','标题6','来源6','新闻分类6','upload/xinwenzixun_fengmianbeijing6.jpg,upload/xinwenzixun_fengmianbeijing7.jpg,upload/xinwenzixun_fengmianbeijing8.jpg','管理员','新闻内容6','2022-12-07 09:58:07'),(57,'2022-12-07 01:58:07','标题7','来源7','新闻分类7','upload/xinwenzixun_fengmianbeijing7.jpg,upload/xinwenzixun_fengmianbeijing8.jpg,upload/xinwenzixun_fengmianbeijing9.jpg','管理员','新闻内容7','2022-12-07 09:58:07'),(58,'2022-12-07 01:58:07','标题8','来源8','新闻分类8','upload/xinwenzixun_fengmianbeijing8.jpg,upload/xinwenzixun_fengmianbeijing9.jpg,upload/xinwenzixun_fengmianbeijing10.jpg','管理员','新闻内容8','2022-12-07 09:58:07');
/*!40000 ALTER TABLE `xinwenzixun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `yonghushouji` varchar(200) DEFAULT NULL COMMENT '用户手机',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2022-12-07 01:58:07','用户账号1','123456','用户姓名1','男','年龄1','upload/yonghu_touxiang1.jpg','13823888881'),(12,'2022-12-07 01:58:07','用户账号2','123456','用户姓名2','男','年龄2','upload/yonghu_touxiang2.jpg','13823888882'),(13,'2022-12-07 01:58:07','用户账号3','123456','用户姓名3','男','年龄3','upload/yonghu_touxiang3.jpg','13823888883'),(14,'2022-12-07 01:58:07','用户账号4','123456','用户姓名4','男','年龄4','upload/yonghu_touxiang4.jpg','13823888884'),(15,'2022-12-07 01:58:07','用户账号5','123456','用户姓名5','男','年龄5','upload/yonghu_touxiang5.jpg','13823888885'),(16,'2022-12-07 01:58:07','用户账号6','123456','用户姓名6','男','年龄6','upload/yonghu_touxiang6.jpg','13823888886'),(17,'2022-12-07 01:58:07','用户账号7','123456','用户姓名7','男','年龄7','upload/yonghu_touxiang7.jpg','13823888887'),(18,'2022-12-07 01:58:07','用户账号8','123456','用户姓名8','男','年龄8','upload/yonghu_touxiang8.jpg','13823888888');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-12 12:35:10
