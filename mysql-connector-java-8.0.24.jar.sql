-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 18, 2023 at 12:47 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_onlinebanking`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_signup`
--

CREATE TABLE `tb_signup` (
  `fdSNo` int(11) NOT NULL,
  `fdName` varchar(255) NOT NULL,
  `fd_PhoneNumber` varchar(255) NOT NULL,
  `fdPan` varchar(255) NOT NULL,
  `fdPinCode` varchar(255) NOT NULL,
  `fdAccountType` varchar(255) NOT NULL,
  `fd_Address` varchar(255) NOT NULL,
  `fd_Gender` varchar(255) NOT NULL,
  `fd_Nationality` varchar(255) NOT NULL,
  `fd_Dob` varchar(255) NOT NULL,
  `fd_AccountId` varchar(255) NOT NULL,
  `fd_Amount` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_signup`
--

INSERT INTO `tb_signup` (`fdSNo`, `fdName`, `fd_PhoneNumber`, `fdPan`, `fdPinCode`, `fdAccountType`, `fd_Address`, `fd_Gender`, `fd_Nationality`, `fd_Dob`, `fd_AccountId`, `fd_Amount`) VALUES
(5, 'aliya khan', '9693784882', 'EDCPR', '123456', 'Current', 'Ashiana', 'Female', 'Indian', '22/05/1993', '4591', '17500'),
(6, 'shahnawaz khan', '9693784882', 'EDCPR', '456789', 'Current', 'Ashiana', 'Male', 'Indian', '22/03/1996', '2682', '12500'),
(7, 'shad khan', '9876543210', 'EDCP', '12345', 'Current', 'U.p', 'Male', 'Indian', '26/06/1996', '9135', '7000'),
(8, 'jauhar khan', '9693784882', 'EDCP', '12345678', 'Current', 'Ashiana', 'Male', 'Indian', '26/06/1996', '5462', '4000'),
(13, 'suraj', '1234567890', 'ECDPR6788E', '12345678901', 'Current', 'U.P', 'Male', 'Indian', '26/06/1996', '8712', '10000');

-- --------------------------------------------------------

--
-- Table structure for table `tb_transactions`
--

CREATE TABLE `tb_transactions` (
  `fd_SNo` int(11) NOT NULL,
  `fd_SenderId` varchar(255) NOT NULL,
  `fd_RecieverId` varchar(255) NOT NULL,
  `fd_Amount` varchar(255) NOT NULL,
  `fd_DateTime` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_transactions`
--

INSERT INTO `tb_transactions` (`fd_SNo`, `fd_SenderId`, `fd_RecieverId`, `fd_Amount`, `fd_DateTime`) VALUES
(1, '6', '4591', '5000', '11/01/23 07:07:43'),
(2, '6', '4591', '2000', '11/01/23 07:09:32'),
(3, '6', '4591', '1000', '11/01/23 07:11:02'),
(4, '6', '4591', '500', '12/01/23 05:23:21'),
(5, '5', '2682', '5000', '13/01/23 12:51:41'),
(6, '7', '2682', '5000', '13/01/23 03:45:05'),
(7, '8', '4591', '10000', '14/01/23 08:12:59'),
(8, '13', '4591', '4000', '18/01/23 04:44:19'),
(9, '13', '2682', '1000', '18/01/23 04:46:10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_signup`
--
ALTER TABLE `tb_signup`
  ADD PRIMARY KEY (`fdSNo`);

--
-- Indexes for table `tb_transactions`
--
ALTER TABLE `tb_transactions`
  ADD PRIMARY KEY (`fd_SNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_signup`
--
ALTER TABLE `tb_signup`
  MODIFY `fdSNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `tb_transactions`
--
ALTER TABLE `tb_transactions`
  MODIFY `fd_SNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
