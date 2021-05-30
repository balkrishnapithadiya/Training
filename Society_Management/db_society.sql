-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2021 at 10:13 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_society`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `fn` varchar(20) NOT NULL,
  `ln` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `fpd` varchar(20) NOT NULL,
  `pp` longblob NOT NULL,
  `fb` varchar(20) NOT NULL,
  `fln` varchar(20) NOT NULL,
  `mn` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `fn`, `ln`, `email`, `pass`, `dob`, `fpd`, `pp`, `fb`, `fln`, `mn`) VALUES
(1, 'david', 'adams', 'david@gmail.com', 'David@12345', '23-02-1995', '01-02-2010', 0x89504e470d0a1a0a0000000d49484452000000e1000000e10803000000096d224800000033504c5445e4e6e7aeb4b7e7e9eaabb1b4e9ebece0e2e3b0b6b9c9cdcfe3e5e6abb1b5b4b9bcb8bdc0d0d3d5c6caccd4d7d8dddfe1bfc4c6a60afc030000052e49444154789ced9dd9b2db200c406d8137b031ffffb5856cf7dec46e0c88201c9d69a7af3923211683da340cc3300cc3300cc3300cc3300cc3300cc3300cc3300cc3300cc3300cc39c1090725ccdec31661da584d2bf081390a359f42484fbe3f1ffa8c57467b194dda09c54fb841355c30ad54b02182da667bb1f4b3537553b4233b42fc17b965cc67a1d61106ffc2e8ed35269ae4ab39f9ecf719c65e95f1b0e34fa40fc1e8eaaab2d8c2e80c7fd2e8e435d61041b28d8b693ae2a8a2119fa8862df95fed98719c3f5ae8e6b2561ec2202589562bc60258addc149b05ec53e45d029522f37a0d204dbb62fadf07f64f83cf812444d79ea87d095cc16d34078288e0882beda94f6d845260fc22b3dd520c28c124217c485aa229220d92923623fb10bcd7a9ab25a7b66a2586ca4c5136c5b4530889821243963608e420fc191882b48b09c62cd850f436a7322d672e69722b1345d93f6bd9b86a6b4d35f06e424755852698a9fa4d4d21467dbf464486a4ac4d8f9be1852da0903ea8aed0ea563fe1cc3d041c810322429ad65cd9ac570223423622fd9ae102a3530a0af682ed099f3f394524a3b28d0790c159d186632a4736e9afe396687d2620f20f18bda1ea2b4d8033664c30a0ccf5f69ce3f5b9c7fc63fffaa6dc8634867e59de59886d4ee29d30e98d299709e538c89d029c6179c449dfe3431cb410da542d3346386831a5aa7fa32c3da5b500aa17f1d836e4868bef7e0cf8894ce833df8694aebf321e2adbd8720b59b0ae8df48695552cf17dc1842bef545acce78ce7f730f35881443f80d3768cf7f0bfa1b6eb2a36d84a90a62151b7a93fd0f28794a37473d082fbbc8d6d11b081f694a2bbc23f695f31dca83f0465ab5a9e1956cd2765f980a041b887feb5c8760826215297a434564ead4d6d4df24629f2174e91f1d860c5ddd907edfbc098c2a60348abea221f8c085f1681c6b6bbf730760796dd3b6e567ebed6806cdf22e8e42d89a4ae82bd0cc6a5f524cfd506ffcee00ac8b9a362c85e897137415bc00b2338b12bf982665e7ee247a374042b79a7970cc66ede02c7d2fbf0800907f8093a4a8f3824bebd9c55aad54dff7adfbdb2baded72c9d6c6bb96fe9571f818ad66b1aabdd6968d52ea9bd2b6bdb6b313ad4cd3cbcdd6379e3db46cf3fe7a315d25890bb2318b76d3c111b7bf9abd9b40a8975890eba00fafb73734a7d69a86ec2a1cc0d8ad01171c4c3d8f0425dddacca6db3d24153549d92d3dee4505174943a6f05c1a5ae7b89bd80f24ba4403ccc8e1fbe528ec5a3a59dd363e47f87e49eaa28e07b6f0088eca94723c7a0c83e058268e30bf6b288fe8a83f7f96036b9fe785fa9ee3f2d9f31c1891efe91d506c3ff95d4ace473be66332e94f8531ac633e26e2335535b8633ea6e2271e99802d90a03f8a6dee2f38d0c57cfb4475ccfb1107a51372aa62ce7718c19f3db320f275fc960b05c1d65f3fcd134659b4c6fc61ca526f409311cc73f1064a4df3dbe02b1213c45794d404b12f50615c8c4507f3427f8ef79318e0091258c96c82d61904f7cd1622c2e2ac517375104240cc1851245965ee60541bb283f04a8f90a7a405111a2fc84c0d92d0486e80423b473d89af4d09d7d13b690b549809ed987649322cfde38f90526ca8ae479f397908538288deeb221bd186f40be995e8462f79bab0e520f2d969ae6e8819885d805713c2d85a437fc1f643d416a3a2248d4c53595108dd663fc2b09e4aea89f9e456cd747f257c2056350ca336c239fa046624a229519ea6abf9089f11c91e03ef105e6a6a9aef3dc127fcf5ec9c6e04f76ff7777f6b62a2f3bf0c300cc3300cc3300cc3300cc3305fca3f4f55526c410222370000000049454e44ae426082, 'A', '20', '9878969545'),
(2, 'john', 'adams', 'john@gmail.com', 'John@12345', '12-01-1990', '12-01-2015', 0x50502e706e67, 'B', '10', '9965875421');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `id` int(11) NOT NULL,
  `type` varchar(20) NOT NULL,
  `photo` varchar(200) NOT NULL,
  `color` varchar(20) NOT NULL,
  `reg_num` varchar(20) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`id`, `type`, `photo`, `color`, `reg_num`, `user_id`) VALUES
(5, 'Bike', 'bike.jpg', 'Red And Black', 'B_03_vehicle', 1),
(6, 'Car', 'car.jpg', 'Dark Blue', 'C_10_vehicle', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `vehicle`
--
ALTER TABLE `vehicle`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
