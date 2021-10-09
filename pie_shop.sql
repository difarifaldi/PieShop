-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 22, 2020 at 12:11 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pie_shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_chef`
--

CREATE TABLE `tbl_chef` (
  `id_chef` int(5) NOT NULL,
  `nama` varchar(50) CHARACTER SET utf8 NOT NULL,
  `pengalaman` varchar(50) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_chef`
--

INSERT INTO `tbl_chef` (`id_chef`, `nama`, `pengalaman`) VALUES
(1, 'Juna Roripandey', 'Juri Master Chef Indonesia'),
(2, 'Arnold Poernomo', 'Juri Master Chef Indonesia'),
(3, 'Renata Moeloek', 'Juri Master Chef Indonesia');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pelanggan`
--

CREATE TABLE `tbl_pelanggan` (
  `username` varchar(50) CHARACTER SET utf8 NOT NULL,
  `password` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `email` varchar(50) NOT NULL,
  `no_hp` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_pelanggan`
--

INSERT INTO `tbl_pelanggan` (`username`, `password`, `nama`, `alamat`, `email`, `no_hp`) VALUES
('acika', 'acika', 'acika', 'cibubur', 'acikarnt@gmail.com', '08129505088'),
('fadel', 'fadel', 'fadel', 'bintaro', 'fadel@gmail,com', '088888');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pie`
--

CREATE TABLE `tbl_pie` (
  `id_pie` int(5) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `harga` double NOT NULL,
  `rasa` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_pie`
--

INSERT INTO `tbl_pie` (`id_pie`, `nama`, `harga`, `rasa`) VALUES
(1, 'Salted Caramel Choco Pie', 50000, 'Chocolate with caramel sauce '),
(2, 'Frozen Blueberries Pie', 45000, 'Blueberries fruit '),
(3, 'Pie With Cheese Caramel ', 80000, 'Cheese with caramel sauce '),
(4, 'Halloween Apple Pie ', 100000, 'Apple fruit (include : halloween custome)');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_trx`
--

CREATE TABLE `tbl_trx` (
  `id_trx` int(11) NOT NULL,
  `namapembeli` varchar(50) NOT NULL,
  `nama pie` varchar(50) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `namachef` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_chef`
--
ALTER TABLE `tbl_chef`
  ADD PRIMARY KEY (`id_chef`);

--
-- Indexes for table `tbl_pelanggan`
--
ALTER TABLE `tbl_pelanggan`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `tbl_pie`
--
ALTER TABLE `tbl_pie`
  ADD PRIMARY KEY (`id_pie`);

--
-- Indexes for table `tbl_trx`
--
ALTER TABLE `tbl_trx`
  ADD PRIMARY KEY (`id_trx`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_chef`
--
ALTER TABLE `tbl_chef`
  MODIFY `id_chef` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=564;

--
-- AUTO_INCREMENT for table `tbl_trx`
--
ALTER TABLE `tbl_trx`
  MODIFY `id_trx` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_trx`
--
ALTER TABLE `tbl_trx`
  ADD CONSTRAINT `tbl_trx_ibfk_1` FOREIGN KEY (`id_trx`) REFERENCES `tbl_chef` (`id_chef`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
