-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 25 sep. 2023 à 12:00
-- Version du serveur : 8.0.31
-- Version de PHP : 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `db_stock_othmen`
--

-- --------------------------------------------------------

--
-- Structure de la table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `Num_phone` varchar(20) DEFAULT NULL,
  `subscription` varchar(20) DEFAULT NULL,
  `intrest` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `customer`
--

INSERT INTO `customer` (`id`, `name`, `Num_phone`, `subscription`, `intrest`) VALUES
(1, 'Client1', '1234567890', 'premium', 'sport, cinema'),
(2, 'Client2', '9876543210', 'vip', 'musique'),
(3, 'Client3', '5555555555', 'classique', 'sport'),
(4, 'Client4', '6666666666', 'premium', 'cinema, musique'),
(5, 'Client5', '7777777777', 'vip', 'sport, cinema'),
(6, 'Client6', '8888888888', 'classique', 'musique'),
(7, 'Client7', '9999999999', 'vip', 'sport'),
(8, 'Client8', '1111111111', 'premium', 'cinema'),
(9, 'Client9', '2222222222', 'classique', 'musique'),
(10, 'Client10', '3333333333', 'vip', 'sport, cinema');

-- --------------------------------------------------------

--
-- Structure de la table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(20) NOT NULL,
  `type` varchar(50) DEFAULT NULL,
  `brand` varchar(50) DEFAULT NULL,
  `supplier_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `supplier_id` (`supplier_id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `product`
--

INSERT INTO `product` (`id`, `code`, `type`, `brand`, `supplier_id`) VALUES
(1, 'P001', 'Type1', 'Marque1', 1),
(2, 'P002', 'Type2', 'Marque2', 1),
(3, 'P003', 'Type3', 'Marque3', 2),
(4, 'P004', 'Type1', 'Marque1', 3),
(5, 'P005', 'Type2', 'Marque2', 3),
(6, 'P006', 'Type3', 'Marque3', 4),
(7, 'P007', 'Type1', 'Marque1', 4),
(8, 'P008', 'Type2', 'Marque2', 5),
(9, 'P009', 'Type3', 'Marque3', 5),
(10, 'P010', 'Type1', 'Marque1', 2);

-- --------------------------------------------------------

--
-- Structure de la table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE IF NOT EXISTS `supplier` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `supplier`
--

INSERT INTO `supplier` (`id`, `name`) VALUES
(1, 'Fournisseur1'),
(2, 'Fournisseur2'),
(3, 'Fournisseur3'),
(4, 'Fournisseur4'),
(5, 'Fournisseur5');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
