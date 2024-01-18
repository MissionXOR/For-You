<?php
require_once('dbcon.php');
if (isset($_POST['sub']))
{
    $fname=$_POST['fname'];
    $lname=$_POST['lname'];
    $pnumber=$_POST['pnumber'];
    $pass=$_POST['pass'];

    $sql="insert into signup(firstname,lastname,phone,password) values('$fname','$lname','$pnumber','$pass')";
    if(mysqli_query($db,$sql))
    {
        echo "successfull";
        
    }else{
        echo"something wrong";
    }
    header("location: http://localhost/anindita/login.php");
 
    
}
mysqli_close($db);

?>

    

