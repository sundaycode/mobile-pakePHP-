<?php
header('Content-Type: application/json; charset=ISO-8859-1');
include_once '../config/koneksi.php';
$result = mysql_query("SELECT * FROM selecttb");
$rows = array();
while ($r = mysql_fetch_assoc($result)) {
    $rows[] = $r;
}
exit(json_encode($rows));
?>