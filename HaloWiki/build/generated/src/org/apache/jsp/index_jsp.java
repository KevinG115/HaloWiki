package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <script language=\"JavaScript\" type=\"text/javascript\">userName = prompt(\"Please enter your name\");</script>-->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Halo wiki</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#595454\">\n");
      out.write("    \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"index\">\n");
      out.write("        \n");
      out.write("            <center><img src=\"pics/header.jpg\"/></center>\n");
      out.write("              <p align =\"center\">\n");
      out.write("                                        <a href =\"http://localhost:8080/HaloWiki/weapons\"><img src=\"pics/WeaponIcon.jpeg\"/></a>    \n");
      out.write("                                        <a href =\"http://localhost:8080/HaloWiki/maps\"><img src=\"pics/MapIcon.jpeg\"/></a>\n");
      out.write("\t\t\t\t\t<a href =\"http://localhost:8080/HaloWiki/vehicles\"><img src=\"pics/vehiclesIcon.jpg\"/></a>\n");
      out.write("\t\t\t\t\t<a href =\"http://localhost:8080/HaloWiki/enemies\"><img src=\"pics/EnemiesIcon.jpg\"/></a>\n");
      out.write("\t\t\t\t\t<a href =\"http://localhost:8080/HaloWiki/Index\"><img src=\"pics/HomeIcon.jpg\"/></a>\n");
      out.write("                </p>\n");
      out.write("           \n");
      out.write("                <center><script language=\"JavaScript\" type=\"text/javascript\">\n");
      out.write("           document.write(\"<b>welcome to the Halo 4 wiki \" +userName + \"</b>\");\n");
      out.write("        </script></center>\n");
      out.write("                \n");
      out.write("                <p>      \n");
      out.write("          <part1>Four years after the events of Halo 3, a mysterious energy passes \n");
      out.write("\t\t\tthrough the back section of the Forward Unto Dawn. Cortana activates\n");
      out.write("\t\t\tthe Master Chief's cryopod as an unknown assailant boards the ship.\n");
      out.write("\t\t\tAfter progressing through part of the ship the assailant turns out \n");
      out.write("\t\t\tto be the Covenant, to which Cortana expresses concern as she believed \n");
      out.write("\t\t\tthat humanity had a cease fire with the Sangheili. As the Master Chief \n");
      out.write("\t\t\tfights his way through the Covenant boarders, it is revealed that it isn't\n");
      out.write("\t\t\tone rogue covenant ship on a salvage operation, but an entire fleet orbiting \n");
      out.write("\t\t\ta Forerunner world. Cortana notices the nearest cruiser has it's shields down \n");
      out.write("\t\t\tand suggests firing a tactical nuke at it. Immediately after the cruiser is destroyed,\n");
      out.write("\t\t\ta passage into the planet opens and activates a gravity well that begins to pull every ship in.\n");
      out.write("\t\t\tThe already weakened Forward Unto Dawn starts to disintegrate as it passed into the planet.\n");
      out.write("\t\t\tWhile making their way to the escape pods, Cortana starts acting erratically.\n");
      out.write("\t\t\tHowever upon reaching the pods, a covenant cruiser collides with the Dawn, tearing through the escape pods.\n");
      out.write("\t\t\tThe hull breach sucks the Spartan outside just as the wreckage passes through.</part1>\n");
      out.write("        </p> \n");
      out.write("\t<p> \t\n");
      out.write("\t\t<part2>The Master Chief awakens to find himself inside the planet. Cortana reveals her behavioral\n");
      out.write("\t\t\tproblem is due to her going into the first stages of Rampancy. \n");
      out.write("\t\t\tThe Master Chief suggests trying to find a ship back to Earth to see if Dr Halsey, \n");
      out.write("\t\t\tCortana's creator, can fix her condition. Eventually they fight their way through Covenant\n");
      out.write("\t\t\tforces to a localized Cartographer. Cortana says that the only thing she can get on where\n");
      out.write("\t\t\tthey are is a shield world called Requiem. She also receives a signal from an unknown source\n");
      out.write("\t\t\tthat is definitely \"not Covenant\" in origin, and suggests looking for the signal.\n");
      out.write("\t\t\tThey find that he mysterious signal is being bounced off of a tower near the planet's core,\n");
      out.write("\t\t\tCortana opens a portal as close as possible to the core just as a \n");
      out.write("\t\t\tlarge number of a new type of foe appears.</part2>\n");
      out.write("        </p> \n");
      out.write("\t<p> \t\n");
      out.write("        <part3>After being teleported closer to the signal it is revealed the signal \n");
      out.write("\t\t\tis from the UNSC Infinity asking for help. A satellite near the center of the \n");
      out.write("\t\t\tplanet is blocking the signal, where two jamming towers are boosting the signal \n");
      out.write("\t\t\tblocking device's power. Cortana suggests that the taking these jamming towers down \n");
      out.write("\t\t\tto receive the whole signal. After defeating several groups of the unknown enemy, the \n");
      out.write("\t\t\tonly intelligence Cortana is able to get on them is the word \"Promethean\", and that\n");
      out.write("\t\t\tthey appear to be more advanced combat AIs than Sentinels. After taking down the first \n");
      out.write("\t\t\ttower it is revealed the Covenant is very interested in finding something inside the core.\n");
      out.write("\t\t\tAfter the second tower is downed the full signal of the Infinity is received. \n");
      out.write("\t\t\tAfter discovering the ship is going to enter the planet, Cortana attempts to warn them away \n");
      out.write("\t\t\tbut is still unable to get through. Fighting their way to the center of the Satellite the pair\n");
      out.write("\t\t\tdiscover a spherical object - the source of the signal. After attempting to stop the signal \n");
      out.write("\t\t\tthe sphere comes close to the chief's location where part of the sphere comes out of the bottom.\n");
      out.write("\t\t\tA sole figure is seen on a pedestal. The unknown figure reveals himself to be The Didact,\n");
      out.write("\t\t\tand handily defeats the Master Chief before declaring that his people, The Forerunners themselves, \n");
      out.write("\t\t\tare returning to the Galaxy after thousands of years, and he remarks on how Humanity must still be weak,\n");
      out.write("\t\t\tas the Covenant do not answer to Humanity.</part3>\n");
      out.write("        </p> \n");
      out.write("\t\t<p> \n");
      out.write("\t\t<part4>John manages to escape the Didact and makes his way the Infinity, which had entered the planet. \n");
      out.write("\t\t\tThe Didact also heads for the Infinity. After fighting off many Prometheans and Covenant,\n");
      out.write("\t\t\twho have joined forces, he finds Commander Thomas Lasky, Spartan Commander Palmer and a scattered groups of Marines.\n");
      out.write("\t\t\tChief clears an LZ for a Pelican to pick them up, and is transported to the Infinity,\n");
      out.write("\t\t\twhere he fights off waves of Covenant. Then, he is introduced to Captain Andrew del Rio and Commander Palmer.\n");
      out.write("\t\t\tPalmer, Lasky, and the Chief are sent on a mission to allow the Infinity to escape Requiem, and are given a Mammoth.\n");
      out.write("\t\t\tAfter destroying many Covenant vehicles, including a Lich, the mission brings John inside what is assumed to be a trap. \n");
      out.write("\t\t\tIt turns out not to be when John and Cortana are separately taken by the Librarian, who explains that the Prometheans \n");
      out.write("\t\t\twere once Humans, and how the Didact is looking to escape Requiem and find the Composer, which he plans to turn on humanity.\n");
      out.write("\t\t\tShe helps to accelerate Chief's 'evolution' so that he could survive the Composer. Once John and Cortana are reunited,\n");
      out.write("\t\t\tthey proceed outside of the Forerunner structures, where they attempt (and fail) to destroy the Didact. \n");
      out.write("\t\t\tThey are returned to the Infinity, where Del Rio gives the command to leave Requiem; \n");
      out.write("\t\t\tstating that they should return to Earth and inform FLEETCOM about what had occurred.\n");
      out.write("\t\t\tCortana and John attempt to convince him otherwise, but the Captain orders that Cortana be decommissioned due to rampancy.\n");
      out.write("\t\t\tUpon Chief's refusal to hand her over, he orders both Palmer and Lasky to arrest him, \n");
      out.write("\t\t\tbut neither of them move. With Lasky's assistance,\n");
      out.write("\t\t\tJohn escapes the Infinity before it leaves and attempts to destroy the Didact once and for all.\n");
      out.write("\t\t\tHowever, he is unsuccessful, and hides inside a Lich to follow the Didact into slipspace.</part4>\n");
      out.write("               </p> \n");
      out.write("                <p>  \n");
      out.write("        <part5>He, along with the Didact and a Covenant fleet, arrive at Halo Installation 03,\n");
      out.write("\t\t\twhere the Covenant under the Didact's control immediately attack the UNSC science \n");
      out.write("\t\t\tfacility orbiting the Halo, that housed the Composer. After fighting his way inside, \n");
      out.write("\t\t\tJohn argues with some professors there and grabs a HAVOK bomb to attempt to destroy the Composer.\n");
      out.write("\t\t\tUnfortunately, he is too late, and the Composer is fired and kills all on the base aside from him.\n");
      out.write("\t\t\tHe takes a Broadsword to follow the Didact to Earth, where he is assisted by the Infinity,\n");
      out.write("\t\t\twhich is now controlled by Commander Lasky, in getting inside. There, the Didact fires the Composer,\n");
      out.write("\t\t\tand extermination of Humanity begins in New Phoenix. In order to bring down the Didact's shields,\n");
      out.write("\t\t\tCortana clones her rampant personalities to overload the system. John places her chip in a holopedestal,\n");
      out.write("\t\t\tbut it is destroyed, and she is brought into the Composer's system. She manages to weakly\n");
      out.write("\t\t\tcommunicate with the Chief before assisting him in killing the Didact and destroying the Composer.\n");
      out.write("\t\t\tShe uses the last of her energy to form herself into a visible form and touches John for the first and last time.\n");
      out.write("\t\t\tShe dies right before the Composer collapses around them. John is found amongst the space debris by a Pelican.\n");
      out.write("\t\t\tTalking with the Chief, Commander Lasky echoes a statement Cortana once made to John regarding the humanity of soldiers.\n");
      out.write("\t\t\tJohn is seen on Infinity's Spartan deck, being stripped of his armor.</part5>\n");
      out.write("    </Index>\n");
      out.write("    </p>\n");
      out.write("        </form>\n");
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
