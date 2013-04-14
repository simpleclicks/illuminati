CREATE DATABASE  IF NOT EXISTS `univesitydb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `univesitydb`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: univesitydb
-- ------------------------------------------------------
-- Server version  5.5.30

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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `courseName` varchar(45) NOT NULL,
  `courseSection` varchar(45) NOT NULL,
  `meetingTime` datetime DEFAULT NULL,
  `location` varchar(45) NOT NULL,
  `courseId` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`courseId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `courseinstructormap`
--

DROP TABLE IF EXISTS `courseinstructormap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `courseinstructormap` (
  `cIId` int(11) NOT NULL AUTO_INCREMENT,
  `courseId` int(11) DEFAULT NULL,
  `instructorId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cIId`),
  KEY `instructorId3_idx` (`instructorId`),
  KEY `courseId3_idx` (`courseId`),
  CONSTRAINT `courseId3` FOREIGN KEY (`courseId`) REFERENCES `course` (`courseId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `instructorId3` FOREIGN KEY (`instructorId`) REFERENCES `instructor` (`instructorId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `coursestudentmap`
--

DROP TABLE IF EXISTS `coursestudentmap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coursestudentmap` (
  `courseId` int(11) DEFAULT NULL,
  `studentId` varchar(45) DEFAULT NULL,
  `csid` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`csid`),
  KEY `studentId_idx` (`studentId`),
  KEY `courseId2_idx` (`courseId`),
  CONSTRAINT `studentId2` FOREIGN KEY (`studentId`) REFERENCES `student` (`studentId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `courseId2` FOREIGN KEY (`courseId`) REFERENCES `course` (`courseId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `instructor`
--

DROP TABLE IF EXISTS `instructor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `instructor` (
  `instructorId` varchar(45) NOT NULL,
  `department` varchar(45) DEFAULT NULL,
  `officeHours` time DEFAULT NULL,
  `personId` int(11) NOT NULL,
  PRIMARY KEY (`instructorId`),
  KEY `personId_idx` (`personId`),
  CONSTRAINT `personId1` FOREIGN KEY (`personId`) REFERENCES `person` (`personId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `zipCode` int(11) DEFAULT NULL,
  `personId` int(11) NOT NULL AUTO_INCREMENT,
  `associatedCourses` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `studentId` varchar(45) NOT NULL,
  `personId` int(11) NOT NULL,
  PRIMARY KEY (`studentId`),
  KEY `personId_idx` (`personId`),
  CONSTRAINT `personId` FOREIGN KEY (`personId`) REFERENCES `person` (`personId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-04-14 14:10:19
