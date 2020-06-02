-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 02, 2020 at 11:30 PM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gig-central`
--

-- --------------------------------------------------------

--
-- Table structure for table `amenity`
--

CREATE TABLE `amenity` (
  `AmenityKey` int(11) NOT NULL,
  `AmenityName` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `amenity`
--

INSERT INTO `amenity` (`AmenityKey`, `AmenityName`) VALUES
(1, 'Wi-Fi'),
(2, 'Food'),
(3, 'Bar'),
(4, 'Outlets'),
(5, 'Food'),
(6, 'Outdoor Seating'),
(7, 'Parking'),
(8, 'Wheelchair Accessable');

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `CompanyID` int(10) UNSIGNED NOT NULL,
  `Name` varchar(100) DEFAULT '',
  `Address` varchar(85) DEFAULT '',
  `CompanyCity` varchar(40) DEFAULT '',
  `CompanyState` varchar(25) DEFAULT 'WA',
  `ZipCode` varchar(25) DEFAULT '',
  `CompanyPhone` varchar(25) DEFAULT '',
  `Website` varchar(100) DEFAULT '',
  `CompanyContactID` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`CompanyID`, `Name`, `Address`, `CompanyCity`, `CompanyState`, `ZipCode`, `CompanyPhone`, `Website`, `CompanyContactID`) VALUES
(1, 'Amazon', '440 Terry Ave N', 'Seattle', 'WA', '98109', '(206) 266-1000', 'https://amazon.com', 1),
(2, 'Microsoft', 'Microsoft Headquarters One Microsoft Way', 'Redmond', 'WA', '98052', '(206) 123-4567', 'https://microsoft.com', 2),
(3, 'Google', '601 N 34th St', 'Seattle', 'WA', '98103', '(206) 123-1000', 'https://google.com', 3),
(4, 'The Crocodile', '1234 West Ave St', 'Seattle', 'WA', '98126', '1231234444', 'thecrocodile.com', 4),
(5, 'XYZ corporation', '123 Redmond Ave s Suite 768', 'Bellevue', 'WA', '98123', '2062899988', 'xyz.com', 5);

-- --------------------------------------------------------

--
-- Table structure for table `companycontact`
--

CREATE TABLE `companycontact` (
  `CompanyContactID` int(10) UNSIGNED NOT NULL,
  `FirstName` varchar(30) DEFAULT NULL,
  `LastName` varchar(30) DEFAULT NULL,
  `Email` varchar(75) DEFAULT NULL,
  `Phone` varchar(25) DEFAULT NULL,
  `CompanyID` int(10) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `companycontact`
--

INSERT INTO `companycontact` (`CompanyContactID`, `FirstName`, `LastName`, `Email`, `Phone`, `CompanyID`) VALUES
(1, 'Jeff', 'Bezos', 'jeff.bezos@amazon.com', '(206) 266-1000', 1),
(2, 'Satya', 'Nadella', 'satya.nadella@microsoft.com', '(206) 123-4567', 2),
(3, 'Sundar', 'Pichai', 'sundar.pichai@amazon.com', '(206) 123-1000', 3),
(4, 'Crocker', 'Diles', 'crocker.diles@example.com', '1231231234', 4),
(5, 'Peter', 'Parker', 'peter@gmail.com', '1231231234', 5);

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `Id` int(11) NOT NULL,
  `Name` varchar(128) NOT NULL,
  `Email` varchar(128) NOT NULL,
  `Subject` text NOT NULL,
  `Message` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `gigs`
--

CREATE TABLE `gigs` (
  `GigID` int(10) UNSIGNED NOT NULL,
  `CompanyID` int(10) UNSIGNED NOT NULL,
  `GigQualify` varchar(500) DEFAULT '',
  `GigDuration` varchar(500) DEFAULT '',
  `EmploymentType` varchar(255) DEFAULT '',
  `GigOutline` varchar(500) DEFAULT '',
  `SpInstructions` varchar(350) DEFAULT '',
  `PayRate` varchar(50) DEFAULT '',
  `GigPosted` datetime DEFAULT NULL,
  `LastUpdated` timestamp NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `id` int(10) UNSIGNED NOT NULL,
  `GigCloseDate` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `gigs`
--

INSERT INTO `gigs` (`GigID`, `CompanyID`, `GigQualify`, `GigDuration`, `EmploymentType`, `GigOutline`, `SpInstructions`, `PayRate`, `GigPosted`, `LastUpdated`, `id`, `GigCloseDate`) VALUES
(1, 1, 'HTML/CSS', '', 'Web Developer', 'Web maintenance', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(2, 2, 'C#/.NET', '', 'Computer Engineer', 'Development of web apps', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(3, 3, 'Photoshop', '', 'Graphic Designer', 'Designing site mockups', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(4, 4, 'JavaScript', '', 'Web Developer', 'Front end web development', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(5, 5, 'WordPress', '', 'Web Designer', 'Designing site mockups', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(6, 1, 'HTML/CSS/JS/PHP', '', 'Web Developer', 'Full stack development', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(7, 2, 'C#/.NET', '', 'Computer Engineer', 'Full stack development', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(8, 3, 'HTML/CSS/JS', '', 'Web Developer', 'Front end web development', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(9, 1, 'HTML/CSS/JS/Node', '', 'Web Developer', 'Full stack development', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(10, 2, 'Photoshop/HTML/CSS', '', 'Web Designer', 'Designing site mockups', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(11, 1, 'HTML/CSS', '', 'Web Developer', 'Build layouts to meet specifications', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(12, 2, 'JavaScript/React', '', 'Web Developer', 'Design and build react components', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(13, 3, 'Photoshop', '', 'Web Designer', 'Design and build layouts', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(14, 3, 'Photoshop/WordPress', '', 'Web Designer', 'Customize templates', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(15, 1, 'HTML/CSS', '', 'Web Designer', 'Design UX/UI', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, ''),
(16, 2, 'C#/.NET/Java', '', 'Computer Engineer', 'Development of web apps', 'Email me your resume', 'None', '2017-05-20 14:30:35', '2019-06-08 07:13:47', 0, '');

-- --------------------------------------------------------

--
-- Table structure for table `markers`
--

CREATE TABLE `markers` (
  `id` int(11) NOT NULL,
  `lat` float(10,6) NOT NULL,
  `lng` float(10,6) NOT NULL,
  `GigID` int(10) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `markers`
--

INSERT INTO `markers` (`id`, `lat`, `lng`, `GigID`) VALUES
(1, 47.615856, -122.339966, 1),
(2, 47.614998, -122.193939, 2),
(3, 47.649269, -122.350624, 3),
(4, 47.663166, -122.313095, 4),
(5, 47.502205, -122.169411, 5);

-- --------------------------------------------------------

--
-- Table structure for table `profile`
--

CREATE TABLE `profile` (
  `id` int(10) UNSIGNED NOT NULL,
  `i_am_a` text,
  `first_name` text,
  `last_name` text,
  `email` text,
  `github` text,
  `linkedin` text,
  `password` text NOT NULL,
  `picture` varchar(24) DEFAULT NULL,
  `bio` text,
  `subscribed_to_newsletters` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profile`
--

INSERT INTO `profile` (`id`, `i_am_a`, `first_name`, `last_name`, `email`, `github`, `linkedin`, `password`, `picture`, `bio`, `subscribed_to_newsletters`) VALUES
(1, 'employee', 'this.first', 'this.last', 'this.me@example.com', '', '', '$2y$10$1x8vkIuGHLyrnitybdJIdO2LuvP8NG5nqcbgtW3mo1P4g1.Xr5T8e', 'picID.jpg', 'Bio? I shower daily! I would have you know!', 1);

-- --------------------------------------------------------

--
-- Table structure for table `test_customers`
--

CREATE TABLE `test_customers` (
  `CustomerID` int(10) UNSIGNED NOT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `FirstName` varchar(50) DEFAULT NULL,
  `Email` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `test_customers`
--

INSERT INTO `test_customers` (`CustomerID`, `LastName`, `FirstName`, `Email`) VALUES
(1, 'Smith', 'Bob', 'bob@example.com'),
(2, 'Jones', 'Bll', 'bill@example.com'),
(3, 'Doe', 'John', 'john@example.com'),
(4, 'Rules', 'Ann', 'ann@example.com');

-- --------------------------------------------------------

--
-- Table structure for table `venue`
--

CREATE TABLE `venue` (
  `VenueKey` int(10) UNSIGNED NOT NULL,
  `VenueName` varchar(50) DEFAULT '',
  `VenueTypeKey` int(10) UNSIGNED DEFAULT '0',
  `VenueAddress` varchar(255) DEFAULT '',
  `City` varchar(255) DEFAULT '',
  `State` varchar(50) DEFAULT '',
  `ZipCode` varchar(10) DEFAULT '',
  `VenuePhone` varchar(10) DEFAULT '',
  `VenueWebsite` varchar(50) DEFAULT '',
  `VenueHours` varchar(50) DEFAULT '',
  `Food` varchar(5) DEFAULT '',
  `Bar` varchar(5) DEFAULT '',
  `Outlets` varchar(10) DEFAULT '',
  `WiFi` varchar(10) DEFAULT '',
  `Outdoor` varchar(10) DEFAULT '',
  `Wheelchair` varchar(10) DEFAULT '',
  `Parking` varchar(10) DEFAULT '',
  `VenuePostDate` datetime NOT NULL,
  `VenueExpirationDate` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `venue`
--

INSERT INTO `venue` (`VenueKey`, `VenueName`, `VenueTypeKey`, `VenueAddress`, `City`, `State`, `ZipCode`, `VenuePhone`, `VenueWebsite`, `VenueHours`, `Food`, `Bar`, `Outlets`, `WiFi`, `Outdoor`, `Wheelchair`, `Parking`, `VenuePostDate`, `VenueExpirationDate`) VALUES
(1, 'Elliott Bay Book Company', 1, '1521 10th Ave', 'Seattle', 'WA', '98122', '2066246600', 'http://www.elliottbaybook.com', 'M-Th 10am-10pm, F-S 10am-11pm, Sun', 'No', 'No', 'Yes', 'Yes', 'No', 'Yes', 'No', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(2, 'Caffe Vita', 2, '1005 E Pike St', 'Seattle', 'WA', '98122', '2067094440', 'http://www.caffevita.com/locations/wa/capitol-hill', 'M-F 6am-11pm, S-Sun 7am-11pm', 'Yes', 'No', 'Yes', 'Yes', 'Yes', 'Yes', 'No', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(3, 'Seattle Public Library - Capitol Hill Branch', 3, '425 Harvard Ave E', 'Seattle', 'WA', '98102', '2066844715', 'http://www.spl.org/locations/capitol-hill-branch', 'M-Th 10am-8pm, F-S 10am-6pm, Sun 1pm-5pm', 'No', 'No', 'Yes', 'Yes', 'No', 'Yes', 'No', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(4, 'Seattle Hotel', 5, '12345 example st', 'Seattle', 'WA', '98000', '1234456789', 'http://www.website.com', 'M-Th 10am-8pm, F-S 10am-6pm, Sun 1pm-5pm', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', '0000-00-00 00:00:00', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `venueamenity`
--

CREATE TABLE `venueamenity` (
  `VenueAmenityKey` int(11) NOT NULL,
  `AmenityKey` int(11) NOT NULL,
  `VenueKey` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `venueamenity`
--

INSERT INTO `venueamenity` (`VenueAmenityKey`, `AmenityKey`, `VenueKey`) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 4, 1),
(4, 1, 2),
(5, 4, 2),
(6, 1, 3),
(7, 4, 3);

-- --------------------------------------------------------

--
-- Table structure for table `venuetype`
--

CREATE TABLE `venuetype` (
  `VenueTypeKey` int(10) UNSIGNED NOT NULL,
  `VenuetypeName` varchar(50) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `venuetype`
--

INSERT INTO `venuetype` (`VenueTypeKey`, `VenuetypeName`) VALUES
(1, 'Coffee shop'),
(2, 'Library'),
(3, 'School'),
(4, 'Community Center'),
(5, 'Other');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `amenity`
--
ALTER TABLE `amenity`
  ADD PRIMARY KEY (`AmenityKey`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`CompanyID`);

--
-- Indexes for table `companycontact`
--
ALTER TABLE `companycontact`
  ADD PRIMARY KEY (`CompanyContactID`),
  ADD KEY `CompanyID` (`CompanyID`);

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `email` (`Email`);

--
-- Indexes for table `gigs`
--
ALTER TABLE `gigs`
  ADD PRIMARY KEY (`GigID`),
  ADD KEY `CompanyID` (`CompanyID`);

--
-- Indexes for table `markers`
--
ALTER TABLE `markers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `GigID` (`GigID`);

--
-- Indexes for table `profile`
--
ALTER TABLE `profile`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `test_customers`
--
ALTER TABLE `test_customers`
  ADD PRIMARY KEY (`CustomerID`);

--
-- Indexes for table `venue`
--
ALTER TABLE `venue`
  ADD PRIMARY KEY (`VenueKey`),
  ADD KEY `VenueTypeKey` (`VenueTypeKey`),
  ADD KEY `VenueKey_index` (`VenueKey`);

--
-- Indexes for table `venueamenity`
--
ALTER TABLE `venueamenity`
  ADD PRIMARY KEY (`VenueAmenityKey`),
  ADD KEY `AmenityKey` (`AmenityKey`),
  ADD KEY `VenueKey` (`VenueKey`);

--
-- Indexes for table `venuetype`
--
ALTER TABLE `venuetype`
  ADD PRIMARY KEY (`VenueTypeKey`),
  ADD KEY `VenueTypeKey_index` (`VenueTypeKey`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `amenity`
--
ALTER TABLE `amenity`
  MODIFY `AmenityKey` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `CompanyID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `companycontact`
--
ALTER TABLE `companycontact`
  MODIFY `CompanyContactID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `contact`
--
ALTER TABLE `contact`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `gigs`
--
ALTER TABLE `gigs`
  MODIFY `GigID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `markers`
--
ALTER TABLE `markers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `profile`
--
ALTER TABLE `profile`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `test_customers`
--
ALTER TABLE `test_customers`
  MODIFY `CustomerID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `venue`
--
ALTER TABLE `venue`
  MODIFY `VenueKey` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `venueamenity`
--
ALTER TABLE `venueamenity`
  MODIFY `VenueAmenityKey` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `venuetype`
--
ALTER TABLE `venuetype`
  MODIFY `VenueTypeKey` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `companycontact`
--
ALTER TABLE `companycontact`
  ADD CONSTRAINT `CompanyContact_ibfk_1` FOREIGN KEY (`CompanyID`) REFERENCES `company` (`CompanyID`) ON DELETE CASCADE;

--
-- Constraints for table `gigs`
--
ALTER TABLE `gigs`
  ADD CONSTRAINT `Gigs_ibfk_1` FOREIGN KEY (`CompanyID`) REFERENCES `company` (`CompanyID`) ON DELETE CASCADE;

--
-- Constraints for table `markers`
--
ALTER TABLE `markers`
  ADD CONSTRAINT `Markers_ibfk_3` FOREIGN KEY (`GigID`) REFERENCES `gigs` (`GigID`) ON UPDATE CASCADE;

--
-- Constraints for table `venue`
--
ALTER TABLE `venue`
  ADD CONSTRAINT `Venue_ibfk_1` FOREIGN KEY (`VenueTypeKey`) REFERENCES `venuetype` (`VenueTypeKey`) ON DELETE CASCADE;

--
-- Constraints for table `venueamenity`
--
ALTER TABLE `venueamenity`
  ADD CONSTRAINT `VenueAmenity_ibfk_1` FOREIGN KEY (`AmenityKey`) REFERENCES `amenity` (`AmenityKey`),
  ADD CONSTRAINT `VenueAmenity_ibfk_2` FOREIGN KEY (`VenueKey`) REFERENCES `venue` (`VenueKey`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
