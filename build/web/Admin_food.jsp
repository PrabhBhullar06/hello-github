<%-- 
    Document   : Form2
    Created on : 14 Nov, 2014, 1:16:48 PM
    Author     : Sony
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
         <LINK REL="stylesheet" HREF="chd.css" TYPE="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form2</title>
        <script>
        function fn1()
            {
                document.getElementById("foodmenu").style.display="block";
            }
            function fn2()
            {
                 document.getElementById("foodmenu").style.display="none";
             
            }
             function fn3()
            {
                document.getElementById("logindiv").style.display="block";
                document.getElementById("main").style.opacity="0.5";
            }
            function fn4()
            {
              document.getElementById("logindiv").style.display="none";
              document.getElementById("main").style.opacity="1";
            }
             function fn5()
            {
                document.getElementById("logindiv").style.display="none";
                document.getElementById("logindiv1").style.display="block";
              document.getElementById("main").style.opacity="0.5";
 
            }
            function fn6()
            {
                 document.getElementById("logindiv1").style.display="none";
              document.getElementById("main").style.opacity="1";
            }
              function fn7()
            {
                 document.getElementById("logindiv1").style.display="none";
                document.getElementById("logindiv").style.display="block";
              document.getElementById("main").style.opacity="0.5";
            }
             function fn8()
            {
                document.getElementById("lb").style.background="white";
                document.getElementById("lb").style.color="black";
            }
             function fn9()
            {
                document.getElementById("lb").style.background="black";
             document.getElementById("lb").style.color="white";
            }
              function fn10()
            {
                document.getElementById("lb1").style.background="white";
                document.getElementById("lb1").style.color="black";
            }
            function fn11()
            {
                document.getElementById("lb1").style.background="black";
             document.getElementById("lb1").style.color="white";
             }
             function fn12()
            {
                document.getElementById("lb3").style.background="white";
                document.getElementById("lb3").style.color="black";
            }
            function fn13()
            {
                document.getElementById("lb3").style.background="black";
             document.getElementById("lb3").style.color="white";
             }
          function fn14()
            {
                document.getElementById("lb4").style.background="white";
                document.getElementById("lb4").style.color="black";
            }
            function fn15()
            {
                document.getElementById("lb4").style.background="black";
             document.getElementById("lb4").style.color="white";
             }
               function fn16()
         {
               document.getElementById("logindiv").style.display="none";
                document.getElementById("logindiv2").style.display="block";
              document.getElementById("main").style.opacity="0.5";
         }
          function fn17()
         {
             document.getElementById("logindiv2").style.display="none";
             document.getElementById("main").style.opacity="1";
         }
          function fn18()
         {
              document.getElementById("logindiv2").style.display="none";
                document.getElementById("logindiv").style.display="block";
              document.getElementById("main").style.opacity="0.5";
         }
         function fn19()
         {
              document.getElementById("lb5").style.background="white";
                document.getElementById("lb5").style.color="black";
         }
         function fn20()
         {
              document.getElementById("lb5").style.background="black";
             document.getElementById("lb5").style.color="white";
         }
         function fn21()
         {
           document.getElementById("lb6").style.background="white";
                document.getElementById("lb6").style.color="black";
         }
         function fn22()
         {
              document.getElementById("lb6").style.background="black";
             document.getElementById("lb6").style.color="white";
         }  
          function fn23()
         {
             document.getElementById("regsucc").style.display="block";
             document.getElementById("main").style.opacity="0.5";
         }
          function fn24()
         {
            document.getElementById("regsucc").style.display="none";
             document.getElementById("main").style.opacity="1"; 
         }
         function fn25()
         {
             document.getElementById("hotelmenu").style.display="block";
         }
          function fn26()
         {
             document.getElementById("hotelmenu").style.display="none";
         }
         function fn27()
         {
             
         }
            </script>
    </head>
    <body>
        
        <div id="main">
            <div id="header">
            
            
        </div>        

        <div id="div">
           
           <div id="logoo">
               <div id="logo"><br>
                <img src="logo.jpg" height="120" width="140">
            </div>
               <div id="chd">
                   <%--Chandigarh--%><img src="topcontact.jpg" height="160" width="780">
            </div>
            <div id="chdt"><br>
                5 Star Hotels
            </div>
          
             
              
           </div>
            <div id="e"></div>
            <div id="menu">
                
                <div id="home" class="two"><a href="FrontPage.jsp" onmouseover="fn2(),fn26()">HOME</a></div>
                <div id="history" class="two"><a href="history.jsp" onmouseover="fn2(),fn26()">HISTORY</a></div>
                <div id="hotel" class="two"><a href="hotels.jsp" onmouseover="fn2(),fn25()">HOTELS</a></div>
                <div id="food" class="two"  ><a href="food.jsp" onmouseover="fn1(),fn26()">FOOD</a></div>
                <div id="tourist" class="two">
                    <form action="TouristPlacess.jsp" method="post" enctype="multipart/form-data">
                        <input type="submit" id="night" value=" TOURIST PLACES "
                               style="background-color: black;color: white;font-size: 15px;
                               font-family: sans-serif;border-color: black;border-radius: 5px;" onmouseover="fn2(),fn26()">
                    </form>
                    </div>
                <div id="club" class="two">
                    <form action="club.jsp" method="post" enctype="multipart/form-data">
                        <input type="submit" id="night" value=" NIGHTLIFE "
                               style="background-color: black;color: white;font-size: 15px;
                               font-family: sans-serif;border-color: black;border-radius: 5px;" onmouseover="fn2()">
                    </form>
                </div>
            </div>
            <BR>
            <BR>
            <div id="Hotel category">
                <fieldset >
                <form>
                    <pre>     
          Food Category :    <input type="text"  name= "Food_Category"> <br> 
          Food Name :        <input type="text" name="Food_Name"><br>
          Food Place:     <input type="text" name="Food_Place"><br>
          Food Description : <input type="text"name="Food_Description"><br>
          Image :             <input type="file" name="Image"><br>
                              <input  type = "submit" value = "SUBMIT"> 
                    </pre>
                </form>
            </fieldset>
            </div>
            </body>
</html>
            