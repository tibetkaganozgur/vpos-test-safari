/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-02-25 14:42:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VPOS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\" >\r\n");
      out.write(" <html>\r\n");
      out.write("     <head>\r\n");
      out.write("         <title>PayFor - 3D Host</title>\r\n");
      out.write("         <meta http-equiv=\"Content-Language\" content=\"tr\">\r\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-9\">\r\n");
      out.write("         <link href=\"Site.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("     </head>\r\n");
      out.write("     <body>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("     \r\n");
      out.write("\r\n");
      out.write("\r\n");
	
String MbrId="11";                                                        //Kurum Kodu
String MerchantID="9092476";                                              //Language_MerchantID
String MerchantPass="CE8Xm8cp";                                          //Language_MerchantPass
String UserCode="paycorehasan";                                                  //Kullanici Kodu
String UserPass="aq4Cv";                                                  //Kullanici Sifre
String SecureType="3DHost";                                                    //Language_SecureType
String TxnType="Auth";                                                         //Islem Tipi
String InstallmentCount="0";                                                   //Taksit Sayisi
String Currency="949";                                                  //Para Birimi
String OkUrl="https://payfortestfibabanka.cordisnetwork.com//PayforScriptGenerator//PayforScripts//11//9092476//jsp//Payfor3DHostPayment.jsp";                                                        //Language_OkUrl
String FailUrl="https://payfortestfibabanka.cordisnetwork.com//PayforScriptGenerator//PayforScripts//11//9092476//jsp//Payfor3DHostPayment.jsp";                                                    //Language_FailUrl
String OrderId="";                                                    //Siparis Numarasi
String OrgOrderId="";                                              //Orijinal Islem Siparis Numarasi
String PurchAmount="1";                                                        //Tutar
String Lang="TR";                                                          //Language_Lang

			   String rnd = new java.util.Date().toString(); 
            String hash = MbrId + OrderId + PurchAmount + OkUrl + FailUrl + TxnType + InstallmentCount + rnd + MerchantPass;
            java.security.MessageDigest sha = java.security.MessageDigest.getInstance("SHA-1");
            hash = (new sun.misc.BASE64Encoder()).encode(sha.digest(hash.getBytes()));

      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\t\r\n");
      out.write("<form method=\"post\" action=\"https://payfortestfibabanka.cordisnetwork.com/Mpi/3DHost.aspx\">\r\n");
      out.write("\t\t\t<table class=\"tableClass\">\r\n");
      out.write("            \t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan='2'>\r\n");
      out.write("\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\tPayFor - 3D Host\r\n");
      out.write("\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("             \t<td align='center' colspan='2'>\r\n");
      out.write("             \t\t<input type='submit' value='Gonder' class='buttonClass' />\r\n");
      out.write("             \t</td>\r\n");
      out.write("             </tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write(" \r\n");
      out.write("             <input type=\"hidden\" name=\"MbrId\" value=\"");
      out.print(MbrId);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"MerchantID\" value=\"");
      out.print(MerchantID);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"UserCode\" value=\"");
      out.print(UserCode);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"UserPass\" value=\"");
      out.print(UserPass);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"SecureType\" value=\"");
      out.print(SecureType);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"TxnType\" value=\"");
      out.print(TxnType);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"InstallmentCount\" value=\"");
      out.print(InstallmentCount);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"Currency\" value=\"");
      out.print(Currency);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"OkUrl\" value=\"");
      out.print(OkUrl);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"FailUrl\" value=\"");
      out.print(FailUrl);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"OrderId\" value=\"");
      out.print(OrderId);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"OrgOrderId\" value=\"");
      out.print(OrgOrderId);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"PurchAmount\" value=\"");
      out.print(PurchAmount);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"Lang\" value=\"");
      out.print(Lang);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"Rnd\" value=\"");
      out.print(rnd);
      out.write("\">\r\n");
      out.write("             <input type=\"hidden\" name=\"Hash\" value=\"");
      out.print(hash);
      out.write("\">\r\n");
      out.write(" \r\n");
      out.write("        </form>\r\n");
      out.write("    </center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
