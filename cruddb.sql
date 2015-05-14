-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 14 Mei 2015 pada 12.32
-- Versi Server: 5.5.27
-- Versi PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `cruddb`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `selecttb`
--

CREATE TABLE IF NOT EXISTS `selecttb` (
  `nama` varchar(222) NOT NULL,
  `subnama` varchar(222) NOT NULL,
  `gambar` varchar(222) NOT NULL,
  `kdselect` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`kdselect`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=31 ;

--
-- Dumping data untuk tabel `selecttb`
--

INSERT INTO `selecttb` (`nama`, `subnama`, `gambar`, `kdselect`) VALUES
('a', 'aa', 'aaa', 1),
('b', 'bb', 'bbb', 2),
('ee', 'ee', 'ee', 29),
('ee2', 'ee2', 'ee2', 30);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
