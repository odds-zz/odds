CREATE DATABASE  IF NOT EXISTS `odds_db` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `odds_db`;
-- MySQL dump 10.13  Distrib 5.5.31, for debian-linux-gnu (i686)
--
-- Host: localhost    Database: odds_db
-- ------------------------------------------------------
-- Server version	5.5.31-0ubuntu0.12.10.1

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
-- Table structure for table `orphanage`
--

DROP TABLE IF EXISTS `orphanage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orphanage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `details` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orphanage`
--

LOCK TABLES `orphanage` WRITE;
/*!40000 ALTER TABLE `orphanage` DISABLE KEYS */;
INSERT INTO `orphanage` VALUES (1,'SoS',NULL,'What is this?'),(2,'Colors',NULL,'What is this?'),(3,'Colors',NULL,'What is this?'),(4,' Peter Children',NULL,'About peter\'s children'),(5,' Peter Children',NULL,'About peter\'s children'),(6,' Peter Children',NULL,'About peter\'s children'),(7,' Peter Children',NULL,'About peter\'s children'),(8,'Micha',NULL,'Colors'),(10,'Mika',NULL,'Welcome'),(11,'Mika',NULL,'Welcome'),(12,'Mika',NULL,'Welcome'),(13,'Mika',NULL,'Welcome'),(15,'asdf',NULL,'asdf'),(16,'asdf',NULL,'asdf'),(17,'asdf',NULL,'asdf'),(18,'asdf',NULL,'asdf'),(19,'asdf',NULL,'asdf');
/*!40000 ALTER TABLE `orphanage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_contact`
--

DROP TABLE IF EXISTS `user_contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) DEFAULT NULL,
  `alt_email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `alt_phone` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`),
  KEY `fk_user_contact` (`user_id`),
  CONSTRAINT `fk_user_contact` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_contact`
--

LOCK TABLES `user_contact` WRITE;
/*!40000 ALTER TABLE `user_contact` DISABLE KEYS */;
INSERT INTO `user_contact` VALUES (1,'kenkataiwa@gmail.co.tz',NULL,NULL,NULL,NULL,1),(2,'peter@gmail.com',NULL,NULL,NULL,NULL,3),(3,'peter@gmail.com',NULL,NULL,NULL,NULL,4),(4,'mike@gmail.com',NULL,NULL,NULL,NULL,5);
/*!40000 ALTER TABLE `user_contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feedback` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `details` longtext,
  `date` datetime DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_feedback_user` (`user_id`),
  CONSTRAINT `fk_feedback_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orphanage_address`
--

DROP TABLE IF EXISTS `orphanage_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orphanage_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `settlement` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `orphanage_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_orphanage_address` (`orphanage_id`),
  CONSTRAINT `fk_orphanage_address` FOREIGN KEY (`orphanage_id`) REFERENCES `orphanage` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orphanage_address`
--

LOCK TABLES `orphanage_address` WRITE;
/*!40000 ALTER TABLE `orphanage_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `orphanage_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `region` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation_category`
--

DROP TABLE IF EXISTS `donation_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation_category`
--

LOCK TABLES `donation_category` WRITE;
/*!40000 ALTER TABLE `donation_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `donation_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `authority` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_roles_1` (`user_id`),
  CONSTRAINT `fk_user_roles_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,1,'ROLE_USER'),(2,1,'ROLE_ADMIN'),(3,3,'ROLE_USER'),(4,4,'ROLE_USER'),(5,5,'ROLE_USER');
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_settings`
--

DROP TABLE IF EXISTS `user_settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_settings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `value` varchar(64) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_settings_1` (`user_id`),
  CONSTRAINT `fk_user_settings_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_settings`
--

LOCK TABLES `user_settings` WRITE;
/*!40000 ALTER TABLE `user_settings` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_settings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `record`
--

DROP TABLE IF EXISTS `record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `status` tinyint(1) DEFAULT '0',
  `details` varchar(45) DEFAULT NULL,
  `orphanage_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_record_1` (`orphanage_id`),
  CONSTRAINT `fk_record_1` FOREIGN KEY (`orphanage_id`) REFERENCES `orphanage` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `record`
--

LOCK TABLES `record` WRITE;
/*!40000 ALTER TABLE `record` DISABLE KEYS */;
/*!40000 ALTER TABLE `record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation`
--

DROP TABLE IF EXISTS `donation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `details` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `donor` varchar(45) DEFAULT NULL,
  `category_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_donation_1` (`user_id`),
  KEY `fk_donation_2` (`category_id`),
  CONSTRAINT `fk_donation_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_donation_2` FOREIGN KEY (`category_id`) REFERENCES `donation_category` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation`
--

LOCK TABLES `donation` WRITE;
/*!40000 ALTER TABLE `donation` DISABLE KEYS */;
/*!40000 ALTER TABLE `donation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(64) DEFAULT NULL,
  `lastname` varchar(64) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `enabled` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Kenneth','Kataiwa','kenkataiwa','5f4dcc3b5aa765d61d8327deb882cf99',1),(3,'Peter','Smith','p.smith','5f4dcc3b5aa765d61d8327deb882cf99',1),(4,'asdf','asdf','asdf','5f4dcc3b5aa765d61d8327deb882cf99',1),(5,'Michael','Jackson','mj','5f4dcc3b5aa765d61d8327deb882cf99',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orphanage_contact`
--

DROP TABLE IF EXISTS `orphanage_contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orphanage_contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(45) DEFAULT NULL,
  `alt_phone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `alt_email` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  `orphanage_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_orphanage_contact_fk` (`orphanage_id`),
  CONSTRAINT `fk_orphanage_contact_fk` FOREIGN KEY (`orphanage_id`) REFERENCES `orphanage` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orphanage_contact`
--

LOCK TABLES `orphanage_contact` WRITE;
/*!40000 ALTER TABLE `orphanage_contact` DISABLE KEYS */;
INSERT INTO `orphanage_contact` VALUES (1,NULL,NULL,'sos@gmail.com',NULL,NULL,1),(2,NULL,NULL,'sos@gmail.com',NULL,NULL,2),(3,NULL,NULL,'sos@gmail.com',NULL,NULL,3),(4,NULL,NULL,'Wait',NULL,NULL,4),(5,NULL,NULL,'Wait',NULL,NULL,5),(6,NULL,NULL,'Wait',NULL,NULL,6),(7,NULL,NULL,'Wait',NULL,NULL,7),(8,NULL,NULL,'kenkataiwa@gmail.com',NULL,NULL,8),(9,NULL,NULL,'co@mika',NULL,NULL,10),(10,NULL,NULL,'co@mika',NULL,NULL,11),(11,NULL,NULL,'co@mika',NULL,NULL,12),(12,NULL,NULL,'co@mika',NULL,NULL,13),(13,NULL,NULL,'adsf',NULL,NULL,15),(14,NULL,NULL,'adsf',NULL,NULL,16),(15,NULL,NULL,'adsf',NULL,NULL,17),(16,NULL,NULL,'adsf',NULL,NULL,18),(17,NULL,NULL,'adsf',NULL,NULL,19);
/*!40000 ALTER TABLE `orphanage_contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `body` varchar(45) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orphanage_admin`
--

DROP TABLE IF EXISTS `orphanage_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orphanage_admin` (
  `orphanage_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`orphanage_id`,`user_id`),
  KEY `fk_orphanage_has_user_user1` (`user_id`),
  KEY `fk_orphanage_has_user_orphanage1` (`orphanage_id`),
  CONSTRAINT `fk_orphanage_has_user_orphanage1` FOREIGN KEY (`orphanage_id`) REFERENCES `orphanage` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_orphanage_has_user_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orphanage_admin`
--

LOCK TABLES `orphanage_admin` WRITE;
/*!40000 ALTER TABLE `orphanage_admin` DISABLE KEYS */;
INSERT INTO `orphanage_admin` VALUES (10,1),(11,1),(12,1),(13,1),(15,1),(16,1),(17,1),(18,3),(19,3);
/*!40000 ALTER TABLE `orphanage_admin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-05-24 14:17:14
