<?php
header('Content-Type: application/json; charset=ISO-8859-1');
include_once '../config/koneksi.php';


$nama=$_REQUEST['nama'];
$subnama=$_REQUEST['subnama'];
$gambar=$_REQUEST['gambar'];
$result = mysql_query("INSERT INTO `cruddb`.`selecttb` (`nama`, `subnama`, `gambar`, `kdselect`) VALUES ('$nama', '$subnama', '$gambar', NULL);");

echo "success";


?>