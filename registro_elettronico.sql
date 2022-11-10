-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2022 at 12:35 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `registro_elettronico`
--

-- --------------------------------------------------------

--
-- Table structure for table `classi`
--

CREATE TABLE `classi` (
  `ID` varchar(5) NOT NULL,
  `classe` int(11) NOT NULL,
  `sezione` varchar(1) NOT NULL,
  `indirizzo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `classi`
--

INSERT INTO `classi` (`ID`, `classe`, `sezione`, `indirizzo`) VALUES
('00001', 5, 'A', 'TEL'),
('00002', 5, 'A', 'CHI'),
('00003', 5, 'B', 'TEL'),
('00004', 5, 'B', 'CHI');

-- --------------------------------------------------------

--
-- Table structure for table `docenti`
--

CREATE TABLE `docenti` (
  `ID` varchar(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cognome` varchar(50) NOT NULL,
  `materia` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `docenti`
--

INSERT INTO `docenti` (`ID`, `nome`, `cognome`, `materia`) VALUES
('00001', 'Lorenzo', 'Drusin', 'TPS'),
('00002', 'Armando', 'Solfrizzo', 'Telecomunicazioni'),
('00003', 'Giovanni', 'Codognato', 'SeR'),
('00004', 'David', 'Palma', 'GPO');

-- --------------------------------------------------------

--
-- Table structure for table `materie`
--

CREATE TABLE `materie` (
  `ID` varchar(5) NOT NULL,
  `nome` varchar(20) NOT NULL,
  `oreSettimanali` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `materie`
--

INSERT INTO `materie` (`ID`, `nome`, `oreSettimanali`) VALUES
('00001', 'TPS', 3),
('00002', 'Telecomunicazioni', 5),
('00003', 'GPO', 3),
('00004', 'SeR', 4);

-- --------------------------------------------------------

--
-- Table structure for table `studenti`
--

CREATE TABLE `studenti` (
  `ID` varchar(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cognome` varchar(50) NOT NULL,
  `classe` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studenti`
--

INSERT INTO `studenti` (`ID`, `nome`, `cognome`, `classe`) VALUES
('34000', 'Carlo', 'Devastati', '5TELA'),
('34010', 'Carlo', 'Macinati', '5TELA'),
('34056', 'Joel', 'Embiid', '5TELA'),
('34085', 'Mathis', 'Tagako', '5TELA');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `classi`
--
ALTER TABLE `classi`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `docenti`
--
ALTER TABLE `docenti`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `materie`
--
ALTER TABLE `materie`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `studenti`
--
ALTER TABLE `studenti`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
