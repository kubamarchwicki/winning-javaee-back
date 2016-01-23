-- MySQL dump 10.13  Distrib 5.5.46, for debian-linux-gnu (x86_64)
--
-- Host: 172.17.0.2    Database: test
-- ------------------------------------------------------
-- Server version	5.5.44-0ubuntu0.14.04.1

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
-- Table structure for table `REVINFO`
--

DROP TABLE IF EXISTS `REVINFO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `REVINFO` (
  `REV` int(11) NOT NULL AUTO_INCREMENT,
  `REVTSTMP` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`REV`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `REVINFO`
--

LOCK TABLES `REVINFO` WRITE;
/*!40000 ALTER TABLE `REVINFO` DISABLE KEYS */;
INSERT INTO `REVINFO` VALUES (1,1453586726771),(2,1453586729486),(3,1453586733145),(4,1453586738455),(5,1453586742322),(6,1453586743271),(7,1453586745881),(8,1453586745910),(9,1453586754323),(10,1453586759881),(11,1453586762836),(12,1453586820306),(13,1453586854530),(14,1453586855248),(15,1453586856406),(16,1453586861383),(17,1453586861415),(18,1453586861461),(19,1453586878591);
/*!40000 ALTER TABLE `REVINFO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `access_log`
--

DROP TABLE IF EXISTS `access_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `access_log` (
  `id` bigint(20) NOT NULL,
  `date` datetime DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `uuid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `access_log`
--

LOCK TABLES `access_log` WRITE;
/*!40000 ALTER TABLE `access_log` DISABLE KEYS */;
INSERT INTO `access_log` VALUES (1,'2016-01-23 22:05:24','readuser','3363689e-8778-4cb6-a13e-610d00e7befd'),(3,'2016-01-23 22:05:26','readuser','217169f4-fe9d-4cf4-afa4-bce9e208cd92'),(7,'2016-01-23 22:05:29','readuser','03b442e8-cdf4-4b74-aae4-4cac78f69ab3'),(11,'2016-01-23 22:05:33','readuser','10c9132d-b909-4e61-b23b-205f26e0387e'),(15,'2016-01-23 22:05:38','readuser','b46d03ec-1333-431d-9450-f0cea07a72fb'),(18,'2016-01-23 22:05:39','readuser','54f8493b-1c11-4e93-83cb-7d073d9ab9f5'),(20,'2016-01-23 22:05:41','readuser','83abbc1b-2770-4a0f-87de-0de6dddf0750'),(22,'2016-01-23 22:05:42','readuser','ae6a4a97-165e-49fb-a842-b8dc97e611aa'),(25,'2016-01-23 22:05:43','readuser','a8565592-356b-4e7c-a4ea-637d48b43170'),(28,'2016-01-23 22:05:44','readuser','5444b83d-703a-44c2-828e-135afb328b89'),(30,'2016-01-23 22:05:45','readuser','fb09224d-3563-43f3-8669-78a238fd86ea'),(32,'2016-01-23 22:05:45','readuser','074c94c2-b09b-4fb8-bca3-529fafcf4a42'),(34,'2016-01-23 22:05:54','writeuser','26b57f0e-376f-4a1d-95c6-fcc5958660d7'),(38,'2016-01-23 22:05:59','writeuser','fd4e8ef7-5866-48ed-aa3a-7d7724cb8503'),(43,'2016-01-23 22:06:02','writeuser','57749050-f3d2-42d2-9781-b39ce5de379b'),(46,'2016-01-23 22:07:00','writeuser','f9348dc1-2121-4cde-bb20-f2dad16dd17f'),(49,'2016-01-23 22:07:26','writeuser','5433f874-7b95-4688-9a29-7408a395b8bf'),(51,'2016-01-23 22:07:31','readuser','246c1e1a-e643-49c5-91cb-4c86b2b31285'),(53,'2016-01-23 22:07:34','readuser','7addcd9d-ec0d-40ec-8011-4f70b3d67625'),(56,'2016-01-23 22:07:35','readuser','c3cd34cd-ec97-4462-b6ef-c673e7d99840'),(59,'2016-01-23 22:07:36','readuser','5e32d2c7-2d4f-46b8-b5b6-6e1f4cc5b590'),(62,'2016-01-23 22:07:38','writeuser','4179d678-74ab-4a90-a2f3-5ef8a78cced5'),(64,'2016-01-23 22:07:41','readuser','77e1ff26-5a6b-4dd2-b48e-8fcc479beca9'),(66,'2016-01-23 22:07:41','readuser','85b1d834-ffc0-457c-a01e-5ce58688a70a'),(68,'2016-01-23 22:07:41','readuser','e8016fe5-36e4-423d-ad6c-d6d23e272815'),(70,'2016-01-23 22:07:46','writeuser','a039ef12-3307-4b75-bdf3-defe6501a354'),(72,'2016-01-23 22:07:58','writeuser','a9493dc3-e5c3-4859-a78d-9fc00acc022f'),(74,'2016-01-23 22:08:01','readuser','de07e94b-eb38-42a3-b828-10e7ffa5035c');
/*!40000 ALTER TABLE `access_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event_log`
--

DROP TABLE IF EXISTS `event_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event_log` (
  `event_type` varchar(31) NOT NULL,
  `id` bigint(20) NOT NULL,
  `date` datetime DEFAULT NULL,
  `timing` bigint(20) NOT NULL,
  `uuid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event_log`
--

LOCK TABLES `event_log` WRITE;
/*!40000 ALTER TABLE `event_log` DISABLE KEYS */;
INSERT INTO `event_log` VALUES ('read',2,'2016-01-23 22:05:24',29,'3363689e-8778-4cb6-a13e-610d00e7befd'),('write',5,'2016-01-23 22:05:26',20,'217169f4-fe9d-4cf4-afa4-bce9e208cd92'),('write',10,'2016-01-23 22:05:29',18,'03b442e8-cdf4-4b74-aae4-4cac78f69ab3'),('write',14,'2016-01-23 22:05:33',21,'10c9132d-b909-4e61-b23b-205f26e0387e'),('write',17,'2016-01-23 22:05:38',11,'b46d03ec-1333-431d-9450-f0cea07a72fb'),('read',19,'2016-01-23 22:05:39',10,'54f8493b-1c11-4e93-83cb-7d073d9ab9f5'),('read',21,'2016-01-23 22:05:41',4,'83abbc1b-2770-4a0f-87de-0de6dddf0750'),('write',24,'2016-01-23 22:05:42',5,'ae6a4a97-165e-49fb-a842-b8dc97e611aa'),('write',27,'2016-01-23 22:05:43',16,'a8565592-356b-4e7c-a4ea-637d48b43170'),('read',29,'2016-01-23 22:05:44',5,'5444b83d-703a-44c2-828e-135afb328b89'),('delete',31,'2016-01-23 22:05:45',6,'fb09224d-3563-43f3-8669-78a238fd86ea'),('delete',33,'2016-01-23 22:05:45',14,'074c94c2-b09b-4fb8-bca3-529fafcf4a42'),('write',36,'2016-01-23 22:05:54',124,'26b57f0e-376f-4a1d-95c6-fcc5958660d7'),('write',41,'2016-01-23 22:05:59',23,'fd4e8ef7-5866-48ed-aa3a-7d7724cb8503'),('write',45,'2016-01-23 22:06:02',20,'57749050-f3d2-42d2-9781-b39ce5de379b'),('write',47,'2016-01-23 22:07:00',5,'f9348dc1-2121-4cde-bb20-f2dad16dd17f'),('read',50,'2016-01-23 22:07:26',7,'5433f874-7b95-4688-9a29-7408a395b8bf'),('read',52,'2016-01-23 22:07:31',16,'246c1e1a-e643-49c5-91cb-4c86b2b31285'),('write',55,'2016-01-23 22:07:34',8,'7addcd9d-ec0d-40ec-8011-4f70b3d67625'),('write',58,'2016-01-23 22:07:35',12,'c3cd34cd-ec97-4462-b6ef-c673e7d99840'),('write',61,'2016-01-23 22:07:36',4,'5e32d2c7-2d4f-46b8-b5b6-6e1f4cc5b590'),('read',63,'2016-01-23 22:07:38',5,'4179d678-74ab-4a90-a2f3-5ef8a78cced5'),('delete',65,'2016-01-23 22:07:41',8,'77e1ff26-5a6b-4dd2-b48e-8fcc479beca9'),('delete',67,'2016-01-23 22:07:41',6,'85b1d834-ffc0-457c-a01e-5ce58688a70a'),('delete',69,'2016-01-23 22:07:41',9,'e8016fe5-36e4-423d-ad6c-d6d23e272815'),('read',71,'2016-01-23 22:07:46',4,'a039ef12-3307-4b75-bdf3-defe6501a354'),('delete',73,'2016-01-23 22:07:58',6,'a9493dc3-e5c3-4859-a78d-9fc00acc022f'),('read',75,'2016-01-23 22:08:01',3,'de07e94b-eb38-42a3-b828-10e7ffa5035c');
/*!40000 ALTER TABLE `event_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (76);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `todos`
--

DROP TABLE IF EXISTS `todos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `todos` (
  `todo_id` bigint(20) NOT NULL,
  `todo_completed` bit(1) DEFAULT NULL,
  `todo_order` bigint(20) DEFAULT NULL,
  `todo_title` varchar(255) NOT NULL,
  PRIMARY KEY (`todo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `todos`
--

LOCK TABLES `todos` WRITE;
/*!40000 ALTER TABLE `todos` DISABLE KEYS */;
/*!40000 ALTER TABLE `todos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `todos_change_log`
--

DROP TABLE IF EXISTS `todos_change_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `todos_change_log` (
  `todo_id` bigint(20) NOT NULL,
  `REV` int(11) NOT NULL,
  `modification_type` tinyint(4) DEFAULT NULL,
  `todo_completed` bit(1) DEFAULT NULL,
  `todo_title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`todo_id`,`REV`),
  KEY `FK_8ykdv6seqimnsckjehr3ne5nj` (`REV`),
  CONSTRAINT `FK_8ykdv6seqimnsckjehr3ne5nj` FOREIGN KEY (`REV`) REFERENCES `REVINFO` (`REV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `todos_change_log`
--

LOCK TABLES `todos_change_log` WRITE;
/*!40000 ALTER TABLE `todos_change_log` DISABLE KEYS */;
INSERT INTO `todos_change_log` VALUES (4,1,0,'\0','New todo'),(4,19,2,NULL,NULL),(8,2,0,'\0','Another new todo'),(8,5,1,'','Another new todo'),(8,7,2,NULL,NULL),(12,3,0,'\0','One more tojo'),(12,4,1,'\0','One more todo- edited'),(12,6,1,'','One more todo- edited'),(12,8,2,NULL,NULL),(35,9,0,'\0','API todo'),(35,15,1,'','API todo'),(35,16,2,NULL,NULL),(39,10,0,'\0','API todo #2'),(39,13,1,'','API todo #2'),(39,17,2,NULL,NULL),(42,11,0,'\0','API todo #3'),(42,12,1,'\0','API todo #3 - edited'),(42,14,1,'','API todo #3 - edited'),(42,18,2,NULL,NULL);
/*!40000 ALTER TABLE `todos_change_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `write_log`
--

DROP TABLE IF EXISTS `write_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `write_log` (
  `id` bigint(20) NOT NULL,
  `todo_id` bigint(20) DEFAULT NULL,
  `uuid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `write_log`
--

LOCK TABLES `write_log` WRITE;
/*!40000 ALTER TABLE `write_log` DISABLE KEYS */;
INSERT INTO `write_log` VALUES (6,4,'217169f4-fe9d-4cf4-afa4-bce9e208cd92'),(9,8,'03b442e8-cdf4-4b74-aae4-4cac78f69ab3'),(13,12,'10c9132d-b909-4e61-b23b-205f26e0387e'),(16,12,'b46d03ec-1333-431d-9450-f0cea07a72fb'),(23,8,'ae6a4a97-165e-49fb-a842-b8dc97e611aa'),(26,12,'a8565592-356b-4e7c-a4ea-637d48b43170'),(37,35,'26b57f0e-376f-4a1d-95c6-fcc5958660d7'),(40,39,'fd4e8ef7-5866-48ed-aa3a-7d7724cb8503'),(44,42,'57749050-f3d2-42d2-9781-b39ce5de379b'),(48,42,'f9348dc1-2121-4cde-bb20-f2dad16dd17f'),(54,39,'7addcd9d-ec0d-40ec-8011-4f70b3d67625'),(57,42,'c3cd34cd-ec97-4462-b6ef-c673e7d99840'),(60,35,'5e32d2c7-2d4f-46b8-b5b6-6e1f4cc5b590');
/*!40000 ALTER TABLE `write_log` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-01-23 23:08:40
