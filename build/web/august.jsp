<%-- 
    Document   : august
    Created on : 3 Nov, 2014, 1:08:00 AM
    Author     : SAURABH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <LINK REL="stylesheet" HREF="history.css" TYPE="text/css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Annual Event Calendar</title>
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
            <div id="login"  >
                <input type="button" value=" &nbsp; LOGIN &nbsp; " style="background-color: green; color: white;
                       border-radius: 5px;border-color: green;" onclick="fn3()">
            </div>
        </div>        

        <div id="div">
           
           <div id="logoo">
               <div id="logo"><br>
                <img src="logo.jpg" height="120" width="140">
            </div>
               <div id="chd">
                <%--Chandigarh--%><img src="topcontact.jpg" height="160" width="780">
            </div>
            <div id="chdt">
                Chandigarh
            </div>
           <div id="city">
                the City Beautiful
            </div>
             
              
           </div>
            <div id="e"></div>
            <div id="menu">
                
                <div id="home" class="two"><a href="FrontPage.jsp" onmouseover="fn2(),fn26()">HOME</a></div>
                <div id="history" class="two"><a href="history.jsp" onmouseover="fn2(),fn26()">HISTORY</a></div>
                <div id="hotel" class="two"><a href="hotels.jsp" onmouseover="fn2(),fn25()">HOTELS</a></div>
                <div id="food" class="two"><a href="food.jsp" onmouseover="fn1(),fn26()">FOOD</a></div>
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
                               font-family: sans-serif;border-color: black;border-radius: 5px;" onmouseover="fn2(),fn26()">
                    </form>
                </div>
            </div>
            <div id="menuimg">
            <div id="menuu">
                <br><br>
                <a  class="five" href="history.jsp">City Beautiful</a><hr><br>
                <a href="Architect.jsp" class="five">The Architect</a><hr><br>
               
                <a href="history2.jsp" class="five">History</a><hr><br>
                <a href="events.jsp" class="five"  style="color: red">Annual Events Calendar</a><hr><br>
                <a href="map.jsp" class="five">Map</a><hr>
           </div>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <div id="img"><br><br>
                    &nbsp;&nbsp;&nbsp;<img src="aug.JPG">
            </div>
                    <div id="buttonss"  >
                    <br><br><br>
                   
                    <div id="space2" style="float: left;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                    <div id="back1" style="background-color: green; color: white;border-radius: 5px;height: 60px;
                         width: 150px;font-size: 20px;font-family: sans-serif;float: left;"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="july.jsp">>> BACK</a></div>
                        <div id="space" style="float: left;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>  
                        <div id="back2" style="background-color: green; color: white;border-radius: 5px;height: 60px;
                             width: 150px;font-size: 20px;font-family: sans-serif; float: left;"><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="sept.jsp">NEXT <<</a></div>
                  
                         
                </div>
            </div>
            <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
            <br><hr>
        </div>
        </div>
                <div id="logindiv">
                 <div id="loginto"><br><div id="lt">&nbsp;&nbsp;&nbsp;LOG IN TO CHANDIGARH
                 
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div><div id="x" onclick="fn4()"> <b>X</b> &nbsp;</div> </div>
                 <br>
                 <div id="fcbk">&nbsp;&nbsp;<a href="fcbk.jsp"><img src="fcbkk.JPG"></a></div>
                 <div id="fcbkt1"><br>
                     Recommended. And will never Post
                 </div>
                 <div id="fcbkt2">anything</div>
                 <div id="fcbkt3">without your permission.</div><br><br>
                 <div id="google">&nbsp;&nbsp;&nbsp;&nbsp;<a href="google.jsp"><img src="google.JPG"></a></div>
                 <br><br>
                 <div id="gt">Or use your email address</div>
                 <div id="sl"><br>
                     <div id="bl1">&nbsp;&nbsp;&nbsp;</div><div id="l" onclick="fn5()"><input type="button" id="lb" onclick="fn5()" onmouseover="fn8()" onmouseout="fn9()"value="&nbsp;&nbsp; &nbsp; LOGIN&nbsp; &nbsp; &nbsp; " style="height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;"></div>
                     <div id="bl">&nbsp;&nbsp;&nbsp;&nbsp;</div><div id="si" > <input type="button" id="lb1" onclick="fn16()" onmouseover="fn10()" onmouseout="fn11()"value="&nbsp; &nbsp; &nbsp;SIGN UP &nbsp; &nbsp; "style="height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;"></div>
                 </div>
        </div>
            <div id="logindiv1">
                
                     <div id="loginto"><br><div id="lt">&nbsp;&nbsp;&nbsp;LOG IN TO CHANDIGARH
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div><div id="x" onclick="fn6()"><b>X</b> &nbsp;</div> </div>
                 <br><br>
                 
          &nbsp; &nbsp; &nbsp; EMAIL / USERNAME<br>
      &nbsp; &nbsp; <form action="loginaction" method="post">
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="a" style="width: 280px; height: 20px"><br><br><br>
           &nbsp; &nbsp; &nbsp; PASSWORD<br><br>
         &nbsp; &nbsp; &nbsp;<input type="password" name="b" style="width: 280px; height: 20px"><br><br><br><br>
        &nbsp;&nbsp;&nbsp;<input type="button" id="lb3" onclick="fn7()" onmouseover="fn12()" onmouseout="fn13()"value=" >> BACK &nbsp;" style="height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;">  
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <input type="submit" id="lb4" onmouseover="fn14()" onmouseout="fn15()" value="&nbsp; &nbsp;LOGIN &nbsp; " style="height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;">
                    </form>
            </div>
            <div id="logindiv2">
               
                <div id="loginto"><br><div id="lt">&nbsp;&nbsp;&nbsp;REGISTER &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; 
  &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                    <div id="x" onclick="fn17()"> <b>X</b> &nbsp;</div> </div>
                 <br>
                 <div id="username">
                     &nbsp; &nbsp; &nbsp; FULL NAME<br><br>
                     <form action="signupaction" method="post">
                     &nbsp; &nbsp; <input type="text" name="f" style="width: 280px; height: 20px"><br><br>
                      &nbsp; &nbsp; &nbsp; USERNAME<br><br>
                     &nbsp; &nbsp; <input type="text" name="u" style="width: 280px; height: 20px"><br><br>
                    &nbsp; &nbsp; &nbsp; PASSWORD<br><br>
                 &nbsp; &nbsp; &nbsp;<input type="password" name="p" style="width: 280px; height: 20px"><br><br><br>
                 &nbsp;&nbsp;&nbsp;&nbsp;
                 <input type="button" id="lb5" onclick="fn18()" onmouseover="fn19()" onmouseout="fn20()"value=" >> BACK &nbsp;" style="height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;"> 
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
               <input type="submit" id="lb6"onmouseover="fn21()" onmouseout="fn22()" value="&nbsp; &nbsp;SIGN UP &nbsp; " style="height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;">
               </form>
            </div>
                  </div>
                     <div id="foodmenu" id="six" onmouseover="fn1()" onmouseout="fn2()">
                <div id="loc" style="float: left">
                <br>&nbsp;&nbsp;<u>POPULAR LOCATIONS</u><br><br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="sector9.jsp">Sector-9 Chandigarh</a><br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="sector17.jsp">Sector-17 Chandigarh</a><br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="sector26.jsp">Sector-26 Chandigarh</a><br>
               
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="sector34.jsp">Sector-34 Chandigarh</a><br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="sector8.jsp">Sector-8 Chandigarh</a><br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="industrialarea.jsp">Industrial Area Chandigarh</a><br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="sector10.jsp">Sector-10 Chandigarh</a><br>
                
            </div>
                <div id="pic1" style="float: left;border-radius: 50px;">
                    <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <img src="tao7.jpg" style="width: 200px;height:150px;border-radius: 80px;" >
                </div>
                <div id="cus" style="float: left;">
                 <br>&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>POPULAR CUISINES</u><br><br> 
                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="breakfast.jsp">Breakfast</a><br>
                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="dhaba.jsp">Dhabas</a><br>
                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="sweettooth.jsp">Sweet Tooth</a><br>
                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="uppercrust.jsp">Uppercrust</a><br>
                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="outdoor.jsp">Outdoor Seating</a><br>
                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="club.jsp">Clubs & Bars</a><br>
                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id="six" href="kid.jsp">Kid Friendly</a><br>
                 
                </div>
                <div id="pic2" style="float:left;">
                    <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <img src="DISH.jpg" style="width: 200px;height:150px;border-radius: 80px;" >
                </div>
            </div>
       <div id="hotelmenu" onmouseover="fn25()" onmouseout="fn26()"
                 style=" text-align: center;display: none;position: absolute;top:240px;left: 440px; height:100px;
                 width: 100px;color: white;background-color: black;border-radius: 10px;">
                <br><a id="tttt" href="5star.jsp">5 star</a><br>
                <a id="tttt" href="4star.jsp">4 star</a><br>
            <a id="tttt"   href="3star.jsp">3 star</a></div>
    </body>
</html>
