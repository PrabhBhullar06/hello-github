package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("         <LINK REL=\"stylesheet\" HREF=\"chd.css\" TYPE=\"text/css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>5 star hotels</title>\n");
      out.write("        <script>\n");
      out.write("        function fn1()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"foodmenu\").style.display=\"block\";\n");
      out.write("            }\n");
      out.write("            function fn2()\n");
      out.write("            {\n");
      out.write("                 document.getElementById(\"foodmenu\").style.display=\"none\";\n");
      out.write("             \n");
      out.write("            }\n");
      out.write("             function fn3()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"logindiv\").style.display=\"block\";\n");
      out.write("                document.getElementById(\"main\").style.opacity=\"0.5\";\n");
      out.write("            }\n");
      out.write("            function fn4()\n");
      out.write("            {\n");
      out.write("              document.getElementById(\"logindiv\").style.display=\"none\";\n");
      out.write("              document.getElementById(\"main\").style.opacity=\"1\";\n");
      out.write("            }\n");
      out.write("             function fn5()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"logindiv\").style.display=\"none\";\n");
      out.write("                document.getElementById(\"logindiv1\").style.display=\"block\";\n");
      out.write("              document.getElementById(\"main\").style.opacity=\"0.5\";\n");
      out.write(" \n");
      out.write("            }\n");
      out.write("            function fn6()\n");
      out.write("            {\n");
      out.write("                 document.getElementById(\"logindiv1\").style.display=\"none\";\n");
      out.write("              document.getElementById(\"main\").style.opacity=\"1\";\n");
      out.write("            }\n");
      out.write("              function fn7()\n");
      out.write("            {\n");
      out.write("                 document.getElementById(\"logindiv1\").style.display=\"none\";\n");
      out.write("                document.getElementById(\"logindiv\").style.display=\"block\";\n");
      out.write("              document.getElementById(\"main\").style.opacity=\"0.5\";\n");
      out.write("            }\n");
      out.write("             function fn8()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"lb\").style.background=\"white\";\n");
      out.write("                document.getElementById(\"lb\").style.color=\"black\";\n");
      out.write("            }\n");
      out.write("             function fn9()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"lb\").style.background=\"black\";\n");
      out.write("             document.getElementById(\"lb\").style.color=\"white\";\n");
      out.write("            }\n");
      out.write("              function fn10()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"lb1\").style.background=\"white\";\n");
      out.write("                document.getElementById(\"lb1\").style.color=\"black\";\n");
      out.write("            }\n");
      out.write("            function fn11()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"lb1\").style.background=\"black\";\n");
      out.write("             document.getElementById(\"lb1\").style.color=\"white\";\n");
      out.write("             }\n");
      out.write("             function fn12()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"lb3\").style.background=\"white\";\n");
      out.write("                document.getElementById(\"lb3\").style.color=\"black\";\n");
      out.write("            }\n");
      out.write("            function fn13()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"lb3\").style.background=\"black\";\n");
      out.write("             document.getElementById(\"lb3\").style.color=\"white\";\n");
      out.write("             }\n");
      out.write("          function fn14()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"lb4\").style.background=\"white\";\n");
      out.write("                document.getElementById(\"lb4\").style.color=\"black\";\n");
      out.write("            }\n");
      out.write("            function fn15()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"lb4\").style.background=\"black\";\n");
      out.write("             document.getElementById(\"lb4\").style.color=\"white\";\n");
      out.write("             }\n");
      out.write("               function fn16()\n");
      out.write("         {\n");
      out.write("               document.getElementById(\"logindiv\").style.display=\"none\";\n");
      out.write("                document.getElementById(\"logindiv2\").style.display=\"block\";\n");
      out.write("              document.getElementById(\"main\").style.opacity=\"0.5\";\n");
      out.write("         }\n");
      out.write("          function fn17()\n");
      out.write("         {\n");
      out.write("             document.getElementById(\"logindiv2\").style.display=\"none\";\n");
      out.write("             document.getElementById(\"main\").style.opacity=\"1\";\n");
      out.write("         }\n");
      out.write("          function fn18()\n");
      out.write("         {\n");
      out.write("              document.getElementById(\"logindiv2\").style.display=\"none\";\n");
      out.write("                document.getElementById(\"logindiv\").style.display=\"block\";\n");
      out.write("              document.getElementById(\"main\").style.opacity=\"0.5\";\n");
      out.write("         }\n");
      out.write("         function fn19()\n");
      out.write("         {\n");
      out.write("              document.getElementById(\"lb5\").style.background=\"white\";\n");
      out.write("                document.getElementById(\"lb5\").style.color=\"black\";\n");
      out.write("         }\n");
      out.write("         function fn20()\n");
      out.write("         {\n");
      out.write("              document.getElementById(\"lb5\").style.background=\"black\";\n");
      out.write("             document.getElementById(\"lb5\").style.color=\"white\";\n");
      out.write("         }\n");
      out.write("         function fn21()\n");
      out.write("         {\n");
      out.write("           document.getElementById(\"lb6\").style.background=\"white\";\n");
      out.write("                document.getElementById(\"lb6\").style.color=\"black\";\n");
      out.write("         }\n");
      out.write("         function fn22()\n");
      out.write("         {\n");
      out.write("              document.getElementById(\"lb6\").style.background=\"black\";\n");
      out.write("             document.getElementById(\"lb6\").style.color=\"white\";\n");
      out.write("         }  \n");
      out.write("          function fn23()\n");
      out.write("         {\n");
      out.write("             document.getElementById(\"regsucc\").style.display=\"block\";\n");
      out.write("             document.getElementById(\"main\").style.opacity=\"0.5\";\n");
      out.write("         }\n");
      out.write("          function fn24()\n");
      out.write("         {\n");
      out.write("            document.getElementById(\"regsucc\").style.display=\"none\";\n");
      out.write("             document.getElementById(\"main\").style.opacity=\"1\"; \n");
      out.write("         }\n");
      out.write("         function fn25()\n");
      out.write("         {\n");
      out.write("             document.getElementById(\"hotelmenu\").style.display=\"block\";\n");
      out.write("         }\n");
      out.write("          function fn26()\n");
      out.write("         {\n");
      out.write("             document.getElementById(\"hotelmenu\").style.display=\"none\";\n");
      out.write("         }\n");
      out.write("         function fn27()\n");
      out.write("         {\n");
      out.write("             \n");
      out.write("         }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main\" style=\"min-height: 500px;\">\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"login\"  >\n");
      out.write("                <input type=\"button\" value=\" &nbsp; LOGIN &nbsp; \" style=\"background-color: green; color: white;\n");
      out.write("                       border-radius: 5px;border-color: green;\" onclick=\"fn3()\">\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("\n");
      out.write("        <div id=\"div\">\n");
      out.write("           \n");
      out.write("           <div id=\"logoo\">\n");
      out.write("               <div id=\"logo\"><br>\n");
      out.write("                <img src=\"logo.jpg\" height=\"120\" width=\"140\">\n");
      out.write("            </div>\n");
      out.write("               <div id=\"chd\">\n");
      out.write("                ");
      out.write("<img src=\"topcontact.jpg\" height=\"160\" width=\"780\">\n");
      out.write("            </div>\n");
      out.write("            <div id=\"chdt\">\n");
      out.write("                Chandigarh\n");
      out.write("            </div>\n");
      out.write("           <div id=\"city\">\n");
      out.write("                the City Beautiful\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("           </div>\n");
      out.write("            <div id=\"e\"></div>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                \n");
      out.write("                <div id=\"home\" class=\"two\"><a href=\"FrontPage.jsp\" onmouseover=\"fn2(),fn26()\">HOME</a></div>\n");
      out.write("                <div id=\"history\" class=\"two\"><a href=\"history.jsp\" onmouseover=\"fn2(),fn26()\">HISTORY</a></div>\n");
      out.write("                <div id=\"hotel\" class=\"two\"><a href=\"hotels.jsp\" onmouseover=\"fn2(),fn25()\">HOTELS</a></div>\n");
      out.write("                <div id=\"food\" class=\"two\"><a href=\"food.jsp\" onmouseover=\"fn1(),fn26()\">FOOD</a></div>\n");
      out.write("              <div id=\"tourist\" class=\"two\">\n");
      out.write("                    <form action=\"TouristPlacess.jsp\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                        <input type=\"submit\" id=\"night\" value=\" TOURIST PLACES \"\n");
      out.write("                               style=\"background-color: black;color: white;font-size: 15px;\n");
      out.write("                               font-family: sans-serif;border-color: black;border-radius: 5px;\" onmouseover=\"fn2(),fn26()\">\n");
      out.write("                    </form>\n");
      out.write("                    </div>\n");
      out.write("                <div id=\"club\" class=\"two\">\n");
      out.write("                    <form action=\"club.jsp\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                        <input type=\"submit\" id=\"night\" value=\" NIGHTLIFE \"\n");
      out.write("                               style=\"background-color: black;color: white;font-size: 15px;\n");
      out.write("                               font-family: sans-serif;border-color: black;border-radius: 5px;\" onmouseover=\"fn2(),fn26()\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"menuimg\">\n");
      out.write("            <div id=\"menuu\">\n");
      out.write("                <br><br>\n");
      out.write("                <a  class=\"five\" href=\"history.jsp\"  style=\"color: red\">City Beautiful</a><hr><br>\n");
      out.write("                <a href=\"Architect.jsp\" class=\"five\">The Architect</a><hr><br>\n");
      out.write("                \n");
      out.write("                <a href=\"history2.jsp\" class=\"five\">History</a><hr><br>\n");
      out.write("                <a href=\"events.jsp\" class=\"five\">Annual Events Calendar</a><hr><br>\n");
      out.write("                <a href=\"map.jsp\" class=\"five\">Map</a><hr>\n");
      out.write("           </div>\n");
      out.write("            <div id=\"empty3\"></div>\n");
      out.write("            <div id=\"cityimg\">\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img src=\"city.jpg\" height=\"200\" width=\"580\">\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"empt\">\n");
      out.write("                <div id=\"empty4\"></div>\n");
      out.write("            <div id=\"cityt\">\n");
      out.write("                \n");
      out.write("            Chandigarh is the best-planned city in India, with architecture\n");
      out.write(" which is world-renowned,and a quality \n");
      out.write("of life , which is unparalleled. As the capital of \n");
      out.write("the states of Punjab and Haryana,and the Union Te-\n");
      out.write("rritory of Chandigarh it is a prestigious city.The\n");
      out.write("face of modern India Chandigarh, is the manifesta-\n");
      out.write("tion of a dream that Pt. Jawahar Lal Nehru envisa-\n");
      out.write("ged and Le Corbusier executed.<br><br>\n");
      out.write("\n");
      out.write("Serenity and a city are two diametrically opposite\n");
      out.write("concepts , which however , get belied in the 'City \n");
      out.write("Beautiful'. Chandigarh is a rare epitome of moder-\n");
      out.write("nization  co-existing with nature's  preservation. \n");
      out.write("It is here that the trees and plants are as much a\n");
      out.write("part of  the construction plans  as  the buildings \n");
      out.write("and the roads.India’s first planned city,is a rich,\n");
      out.write("prosperous,spic and span,green city rightly called\n");
      out.write("“ THE CITY BEAUTIFUL ”.\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            </div><br><hr>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("     <div id=\"logindiv\">\n");
      out.write("                 <div id=\"loginto\"><br><div id=\"lt\">&nbsp;&nbsp;&nbsp;LOG IN TO CHANDIGARH\n");
      out.write("                 \n");
      out.write("                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div><div id=\"x\" onclick=\"fn4()\"> <b>X</b> &nbsp;</div> </div>\n");
      out.write("                 <br>\n");
      out.write("                 <div id=\"fcbk\">&nbsp;&nbsp;<a href=\"fcbk.jsp\"><img src=\"fcbkk.JPG\"></a></div>\n");
      out.write("                 <div id=\"fcbkt1\"><br>\n");
      out.write("                     Recommended. And will never Post\n");
      out.write("                 </div>\n");
      out.write("                 <div id=\"fcbkt2\">anything</div>\n");
      out.write("                 <div id=\"fcbkt3\">without your permission.</div><br><br>\n");
      out.write("                 <div id=\"google\">&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"google.jsp\"><img src=\"google.JPG\"></a></div>\n");
      out.write("                 <br><br>\n");
      out.write("                 <div id=\"gt\">Or use your email address</div>\n");
      out.write("                 <div id=\"sl\"><br>\n");
      out.write("                     <div id=\"bl1\">&nbsp;&nbsp;&nbsp;</div><div id=\"l\" onclick=\"fn5()\"><input type=\"button\" id=\"lb\" onclick=\"fn5()\" onmouseover=\"fn8()\" onmouseout=\"fn9()\"value=\"&nbsp;&nbsp; &nbsp; LOGIN&nbsp; &nbsp; &nbsp; \" style=\"height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;\"></div>\n");
      out.write("                     <div id=\"bl\">&nbsp;&nbsp;&nbsp;&nbsp;</div><div id=\"si\" > <input type=\"button\" id=\"lb1\" onclick=\"fn16()\" onmouseover=\"fn10()\" onmouseout=\"fn11()\"value=\"&nbsp; &nbsp; &nbsp;SIGN UP &nbsp; &nbsp; \"style=\"height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;\"></div>\n");
      out.write("                 </div>\n");
      out.write("        </div>\n");
      out.write("            <div id=\"logindiv1\">\n");
      out.write("                \n");
      out.write("                     <div id=\"loginto\"><br><div id=\"lt\">&nbsp;&nbsp;&nbsp;LOG IN TO CHANDIGARH\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div><div id=\"x\" onclick=\"fn6()\"><b>X</b> &nbsp;</div> </div>\n");
      out.write("                 <br><br>\n");
      out.write("                 \n");
      out.write("          &nbsp; &nbsp; &nbsp; EMAIL / USERNAME<br>\n");
      out.write("      &nbsp; &nbsp; <form action=\"loginaction\" method=\"post\">\n");
      out.write("          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"a\" style=\"width: 280px; height: 20px\"><br><br><br>\n");
      out.write("           &nbsp; &nbsp; &nbsp; PASSWORD<br><br>\n");
      out.write("         &nbsp; &nbsp; &nbsp;<input type=\"password\" name=\"b\" style=\"width: 280px; height: 20px\"><br><br><br><br>\n");
      out.write("        &nbsp;&nbsp;&nbsp;<input type=\"button\" id=\"lb3\" onclick=\"fn7()\" onmouseover=\"fn12()\" onmouseout=\"fn13()\"value=\" >> BACK &nbsp;\" style=\"height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;\">  \n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("         <input type=\"submit\" id=\"lb4\" onmouseover=\"fn14()\" onmouseout=\"fn15()\" value=\"&nbsp; &nbsp;LOGIN &nbsp; \" style=\"height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;\">\n");
      out.write("                    </form>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"logindiv2\">\n");
      out.write("               \n");
      out.write("                <div id=\"loginto\"><br><div id=\"lt\">&nbsp;&nbsp;&nbsp;REGISTER &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; \n");
      out.write("  &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n");
      out.write("  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>\n");
      out.write("                    <div id=\"x\" onclick=\"fn17()\"> <b>X</b> &nbsp;</div> </div>\n");
      out.write("                 <br>\n");
      out.write("                 <div id=\"username\">\n");
      out.write("                     &nbsp; &nbsp; &nbsp; FULL NAME<br><br>\n");
      out.write("                     <form action=\"signupaction\" method=\"post\">\n");
      out.write("                     &nbsp; &nbsp; <input type=\"text\" name=\"f\" style=\"width: 280px; height: 20px\"><br><br>\n");
      out.write("                      &nbsp; &nbsp; &nbsp; USERNAME<br><br>\n");
      out.write("                     &nbsp; &nbsp; <input type=\"text\" name=\"u\" style=\"width: 280px; height: 20px\"><br><br>\n");
      out.write("                    &nbsp; &nbsp; &nbsp; PASSWORD<br><br>\n");
      out.write("                 &nbsp; &nbsp; &nbsp;<input type=\"password\" name=\"p\" style=\"width: 280px; height: 20px\"><br><br><br>\n");
      out.write("                 &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                 <input type=\"button\" id=\"lb5\" onclick=\"fn18()\" onmouseover=\"fn19()\" onmouseout=\"fn20()\"value=\" >> BACK &nbsp;\" style=\"height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;\"> \n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("               <input type=\"submit\" id=\"lb6\"onmouseover=\"fn21()\" onmouseout=\"fn22()\" value=\"&nbsp; &nbsp;SIGN UP &nbsp; \" style=\"height: 30px; background-color: black; color:white;border-radius: 5px; font-size: 20px;border-color: black;\">\n");
      out.write("               </form>\n");
      out.write("            </div>\n");
      out.write("                  </div>\n");
      out.write("                     <div id=\"foodmenu\" id=\"six\" onmouseover=\"fn1()\" onmouseout=\"fn2()\">\n");
      out.write("                <div id=\"loc\" style=\"float: left\">\n");
      out.write("                <br>&nbsp;&nbsp;<u>POPULAR LOCATIONS</u><br><br>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"sector9.jsp\">Sector-9 Chandigarh</a><br>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"sector17.jsp\">Sector-17 Chandigarh</a><br>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"sector26.jsp\">Sector-26 Chandigarh</a><br>\n");
      out.write("               \n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"sector34.jsp\">Sector-34 Chandigarh</a><br>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"sector8.jsp\">Sector-8 Chandigarh</a><br>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"industrialarea.jsp\">Industrial Area Chandigarh</a><br>\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"sector10.jsp\">Sector-10 Chandigarh</a><br>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                <div id=\"pic1\" style=\"float: left;border-radius: 50px;\">\n");
      out.write("                    <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <img src=\"tao7.jpg\" style=\"width: 200px;height:150px;border-radius: 80px;\" >\n");
      out.write("                </div>\n");
      out.write("                <div id=\"cus\" style=\"float: left;\">\n");
      out.write("                 <br>&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>POPULAR CUISINES</u><br><br> \n");
      out.write("                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"breakfast.jsp\">Breakfast</a><br>\n");
      out.write("                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"dhaba.jsp\">Dhabas</a><br>\n");
      out.write("                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"sweettooth.jsp\">Sweet Tooth</a><br>\n");
      out.write("                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"uppercrust.jsp\">Uppercrust</a><br>\n");
      out.write("                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"outdoor.jsp\">Outdoor Seating</a><br>\n");
      out.write("                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"club.jsp\">Clubs & Bars</a><br>\n");
      out.write("                 &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"six\" href=\"kid.jsp\">Kid Friendly</a><br>\n");
      out.write("                 \n");
      out.write("                </div>\n");
      out.write("                <div id=\"pic2\" style=\"float:left;\">\n");
      out.write("                    <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <img src=\"DISH.jpg\" style=\"width: 200px;height:150px;border-radius: 80px;\" >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"hotelmenu\" onmouseover=\"fn25()\" onmouseout=\"fn26()\"\n");
      out.write("                 style=\" text-align: center;display: none;position: absolute;top:240px;left: 440px; height:100px;\n");
      out.write("                 width: 100px;color: white;background-color: black;border-radius: 10px;\">\n");
      out.write("                <br><a id=\"tttt\" href=\"5star.jsp\">5 star</a><br>\n");
      out.write("                <a id=\"tttt\" href=\"4star.jsp\">4 star</a><br>\n");
      out.write("            <a id=\"tttt\"   href=\"3star\">3 star</a></div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("            <div id=\"Food\">\n");
      out.write("                <fieldset >\n");
      out.write("                <form>\n");
      out.write("                    <pre>     \n");
      out.write("          Hotel Category :    <input type=\"text\"  name= \"Hotel_Category\"> <br> \n");
      out.write("          Hotel Name :        <input type=\"text\" name=\"Hotel_Name\"><br>\n");
      out.write("          Hotel Address :     <input type=\"text\" name=\"Hotel_Address\"><br>\n");
      out.write("          Hotel Description : <input type=\"text\" name=\"Hotel_Description\"><br>\n");
      out.write("          Image :             <input type=\"file\" name=\"Image\"><br>\n");
      out.write("                              <input  type = \"submit\" value = \"SUBMIT\"> \n");
      out.write("                    </pre>\n");
      out.write("                </form>\n");
      out.write("            </fieldset>\n");
      out.write("            </div>      \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
