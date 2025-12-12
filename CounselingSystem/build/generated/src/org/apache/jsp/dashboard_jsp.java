package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

    // --- Model/Controller Simulation for Storyboard ---
    // Fetch user details from the session (simulating successful login)
    // NOTE: In a real system, the Servlet sets these attributes.
    String userRole = (String) session.getAttribute("userRole"); 
    String userName = (String) session.getAttribute("userName");
    
    // Default values if session attributes aren't set (for testing)
    if (userRole == null) {
        userRole = "Student"; // Default to Student
    }
    if (userName == null) {
        userName = "Dr. Jane Doe"; // Default name for the welcome message
        if (userRole.equals("Student")) {
            userName = "Alice Smith (S1001)";
        }
    }
    String greeting = "Welcome back, " + userName + "!";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>");
      out.print( userRole );
      out.write(" Dashboard | Counseling Appointment System</title>\n");
      out.write("    <style>\n");
      out.write("        /* Formal Color Palette: Deep Blue (#003366) and Medium Blue (#0056b3) */\n");
      out.write("        body {\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            background-color: #e9eef2; /* Lighter background for the main area */\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex; /* Enables sidebar layout */\n");
      out.write("            min-height: 100vh;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* --- 1. Sidebar (Navigation) --- */\n");
      out.write("        .sidebar {\n");
      out.write("            width: 250px;\n");
      out.write("            background-color: #003366; /* Deep Blue, primary color */\n");
      out.write("            color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            box-shadow: 2px 0 5px rgba(0, 0, 0, 0.2);\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("        }\n");
      out.write("        .sidebar h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 0;\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("            font-size: 1.4em;\n");
      out.write("            border-bottom: 1px solid rgba(255, 255, 255, 0.1);\n");
      out.write("            padding-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        .sidebar a {\n");
      out.write("            color: #d1e2f3;\n");
      out.write("            text-decoration: none;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            transition: all 0.2s;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("        .sidebar a:hover, .sidebar .active {\n");
      out.write("            background-color: #0056b3; /* Medium Blue on hover/active */\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .sidebar .user-info {\n");
      out.write("            margin-top: auto; /* Pushes the user info and logout to the bottom */\n");
      out.write("            padding-top: 20px;\n");
      out.write("            border-top: 1px solid rgba(255, 255, 255, 0.1);\n");
      out.write("            font-size: 0.9em;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* --- 2. Main Content Area --- */\n");
      out.write("        .main-content {\n");
      out.write("            flex-grow: 1;\n");
      out.write("            padding: 40px;\n");
      out.write("        }\n");
      out.write("        .welcome-section {\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.05);\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("            border-left: 5px solid #0056b3;\n");
      out.write("        }\n");
      out.write("        .welcome-section h1 {\n");
      out.write("            color: #003366;\n");
      out.write("            margin-top: 0;\n");
      out.write("            font-size: 2em;\n");
      out.write("        }\n");
      out.write("        .summary-grid {\n");
      out.write("            display: grid;\n");
      out.write("            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));\n");
      out.write("            gap: 20px;\n");
      out.write("        }\n");
      out.write("        .stat-card {\n");
      out.write("            background: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        .stat-card .value {\n");
      out.write("            font-size: 2.5em;\n");
      out.write("            color: #0056b3;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("        }\n");
      out.write("        .stat-card .label {\n");
      out.write("            color: #555;\n");
      out.write("            font-size: 0.9em;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("        <h2>Counseling System</h2>\n");
      out.write("\n");
      out.write("        ");
 if (userRole.equals("Student")) { 
      out.write("\n");
      out.write("            <a href=\"#\" class=\"active\">🏠 Dashboard</a>\n");
      out.write("            <a href=\"AppointmentServlet?action=create\">➕ Schedule Appointment</a>\n");
      out.write("            <a href=\"AppointmentServlet?action=read\">📋 My Appointments</a>\n");
      out.write("            <a href=\"CounselorServlet?action=read\">👤 Counselor Directory</a>\n");
      out.write("            \n");
      out.write("        ");
 } else if (userRole.equals("Counselor")) { 
      out.write("\n");
      out.write("            <a href=\"#\" class=\"active\">🏠 Dashboard</a>\n");
      out.write("            <a href=\"ScheduleServlet?action=today\">📅 Today's Schedule</a>\n");
      out.write("            <a href=\"ScheduleServlet?action=all\">📋 All Appointments</a>\n");
      out.write("            <a href=\"CounselorServlet?action=updateAvailability\">⏱️ Update Availability</a>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"user-info\">\n");
      out.write("            <p>Role: **");
      out.print( userRole );
      out.write("**</p>\n");
      out.write("            <p>Name: **");
      out.print( userName );
      out.write("**</p>\n");
      out.write("            <a href=\"Logout\" style=\"background-color: #cc0000; margin-top: 10px;\">🚪 Logout</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-content\">\n");
      out.write("        \n");
      out.write("        <div class=\"welcome-section\">\n");
      out.write("            <h1>");
      out.print( greeting );
      out.write("</h1>\n");
      out.write("            <p>You are logged in as a **");
      out.print( userRole );
      out.write("**. Here is a summary of your activity.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <h2>Quick Summary</h2>\n");
      out.write("        <div class=\"summary-grid\">\n");
      out.write("            \n");
      out.write("            ");
 if (userRole.equals("Student")) { 
      out.write("\n");
      out.write("                <div class=\"stat-card\">\n");
      out.write("                    <div class=\"value\">1</div>\n");
      out.write("                    <div class=\"label\">Upcoming Appointment(s)</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"stat-card\">\n");
      out.write("                    <div class=\"value\">5</div>\n");
      out.write("                    <div class=\"label\">Completed Sessions</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"stat-card\">\n");
      out.write("                    <div class=\"value\">2</div>\n");
      out.write("                    <div class=\"label\">Available Counselors</div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            ");
 } else if (userRole.equals("Counselor")) { 
      out.write("\n");
      out.write("                <div class=\"stat-card\">\n");
      out.write("                    <div class=\"value\">4</div>\n");
      out.write("                    <div class=\"label\">Appointments Today</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"stat-card\">\n");
      out.write("                    <div class=\"value\">22</div>\n");
      out.write("                    <div class=\"label\">Sessions This Month</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"stat-card\">\n");
      out.write("                    <div class=\"value\">16</div>\n");
      out.write("                    <div class=\"label\">Unread Student Messages</div>\n");
      out.write("                </div>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <h2 style=\"margin-top: 40px;\">Detailed Activity</h2>\n");
      out.write("        <div class=\"welcome-section\">\n");
      out.write("            <p>**(This section is reserved for the detailed **Dashboard** requirement: Charts, Tables, or a list of Recent/Upcoming appointments.)**</p>\n");
      out.write("            <p>For example, a student might see a large table of their next three appointments, and a counselor might see a calendar view of their week.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
