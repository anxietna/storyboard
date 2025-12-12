package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewAppointments_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String userName = (String) session.getAttribute("userName");
    if (userName == null) userName = "Alice Smith";

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>My Appointments</title>\n");
      out.write("    <style>\n");
      out.write("        /* [Insert consistent CSS styling from dashboardStudent.jsp here] */\n");
      out.write("        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #e9eef2; margin: 0; padding: 0; display: flex; min-height: 100vh; }\n");
      out.write("        .sidebar { width: 250px; background-color: #003366; color: white; padding: 20px; box-shadow: 2px 0 5px rgba(0, 0, 0, 0.2); }\n");
      out.write("        .main-content { flex-grow: 1; padding: 40px; }\n");
      out.write("        .page-header { color: #003366; margin-bottom: 25px; }\n");
      out.write("        .table-container { background: white; padding: 20px; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.05); }\n");
      out.write("        table { width: 100%; border-collapse: collapse; }\n");
      out.write("        th, td { padding: 12px 15px; text-align: left; border-bottom: 1px solid #ddd; }\n");
      out.write("        th { background-color: #f0f0f0; color: #333; }\n");
      out.write("        .status-scheduled { color: #0056b3; font-weight: bold; }\n");
      out.write("        .status-completed { color: #28a745; }\n");
      out.write("        .status-cancelled { color: #dc3545; }\n");
      out.write("        .action-link { color: #0056b3; text-decoration: none; margin-right: 10px; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("        <h2>Counseling System</h2>\n");
      out.write("        <a href=\"dashboardStudent.jsp\">🏠 Dashboard</a>\n");
      out.write("        <a href=\"scheduleAppointment.jsp\">➕ Schedule Appointment</a>\n");
      out.write("        <a href=\"#\" class=\"active\">📋 My Appointments</a>\n");
      out.write("        <a href=\"Logout\">🚪 Logout</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-content\">\n");
      out.write("        <h1 class=\"page-header\">My Counseling Appointments</h1>\n");
      out.write("        \n");
      out.write("        <div class=\"table-container\">\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Appointment ID</th>\n");
      out.write("                        <th>Counselor</th>\n");
      out.write("                        <th>Date</th>\n");
      out.write("                        <th>Time</th>\n");
      out.write("                        <th>Status</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>A1005</td>\n");
      out.write("                        <td>Dr. Chen</td>\n");
      out.write("                        <td>2026-01-10</td>\n");
      out.write("                        <td>09:00 AM</td>\n");
      out.write("                        <td><span class=\"status-scheduled\">Scheduled</span></td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"AppointmentServlet?action=update&id=A1005\" class=\"action-link\">Update/Reschedule</a>\n");
      out.write("                            <a href=\"AppointmentServlet?action=delete&id=A1005\" class=\"action-link\">Cancel</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>A1004</td>\n");
      out.write("                        <td>Ms. Davis</td>\n");
      out.write("                        <td>2025-11-20</td>\n");
      out.write("                        <td>02:00 PM</td>\n");
      out.write("                        <td><span class=\"status-completed\">Completed</span></td>\n");
      out.write("                        <td>-</td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            <p style=\"margin-top: 20px;\">* To schedule a new appointment, click the \"Schedule Appointment\" link in the sidebar.</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
