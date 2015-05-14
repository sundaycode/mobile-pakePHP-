<?php
header('Content-Type: application/json; charset=ISO-8859-1');
include_once '../config/koneksi.php';
$method=$_SERVER['REQUEST_METHOD'];
switch($method){
case 'GET':
$sql="SELECT * from mahasiswa ";
$rst=mysql_query($sql,$koneksi);
$mhss=array();
while($row=mysql_fetch_array($rst)) {
$mhss[]=$row;
}
exit(json_encode($mhss));
break;
case 'POST':
$nim=$_POST['NIM'];
$nama=$_POST['nama'];
$noHP=$_POST['noHP'];
$JenisKelamin=$_POST['jk'];
$sql="insert into mahasiswa(nim, nama, hp, jenis_kelamin) values(
'$nim','$nama','$noHP','JenisKelamin')";
$rst=mysql_query($sql,$koneksi) or die(mysql_error($koneksi));
exit("Insert berhasil");
break;
}
?>