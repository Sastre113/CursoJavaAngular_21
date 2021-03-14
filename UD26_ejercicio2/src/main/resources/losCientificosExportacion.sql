-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 192.168.1.50    Database: loscientificos
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `asignadoa`
--

DROP TABLE IF EXISTS `asignadoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignadoa` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cientifico_id` varchar(8) NOT NULL,
  `proyecto_id` char(4) NOT NULL,
  PRIMARY KEY (`id`,`cientifico_id`,`proyecto_id`),
  UNIQUE KEY `cientifico_id` (`cientifico_id`),
  UNIQUE KEY `proyecto_id` (`proyecto_id`),
  CONSTRAINT `cientifico_id` FOREIGN KEY (`cientifico_id`) REFERENCES `cientifico` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `proyecto_id` FOREIGN KEY (`proyecto_id`) REFERENCES `proyecto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignadoa`
--

LOCK TABLES `asignadoa` WRITE;
/*!40000 ALTER TABLE `asignadoa` DISABLE KEYS */;
INSERT INTO `asignadoa` VALUES (1,'83225367','1'),(10,'95752090','10'),(2,'10284470','2'),(3,'79033066','3'),(4,'38444048','4'),(5,'40219395','5'),(6,'63773951','6'),(7,'79260594','7'),(8,'59519298','8'),(9,'09639281','9');
/*!40000 ALTER TABLE `asignadoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cientifico`
--

DROP TABLE IF EXISTS `cientifico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cientifico` (
  `dni` varchar(8) NOT NULL,
  `nomapel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`dni`),
  UNIQUE KEY `dni` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cientifico`
--

LOCK TABLES `cientifico` WRITE;
/*!40000 ALTER TABLE `cientifico` DISABLE KEYS */;
INSERT INTO `cientifico` VALUES ('09639281','Gregor Mendel '),('10284470','G-Man'),('38444048','Isaac Newton'),('40219395','Stephen Hawking'),('59519298','Louis Pasteur '),('63773951','Marie Curie'),('79033066','Gordon Freeman'),('79260594','Charles Darwin'),('83225367','Albert Einstein'),('95752090','Arquímedes de Siracusa');
/*!40000 ALTER TABLE `cientifico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyecto`
--

DROP TABLE IF EXISTS `proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyecto` (
  `id` char(4) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `horas` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyecto`
--

LOCK TABLES `proyecto` WRITE;
/*!40000 ALTER TABLE `proyecto` DISABLE KEYS */;
INSERT INTO `proyecto` VALUES ('1','Manhattan',5),('10','Ticket free',10),('2','Destruir el mundo',10),('3','Salvar al mundo',20),('4','Utopia',270),('5','eCola',300),('6','Sin Alimentos',30),('7','Salud mental',50),('8','Fin de curso',10),('9','Jangular',20);
/*!40000 ALTER TABLE `proyecto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-14 14:13:30
