using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class IE2_User_Control : System.Web.UI.UserControl
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        if(TextBox1.Text == "Radiant" && TextBox2.Text == "asp.net")
        {
            HttpCookie cookie = new HttpCookie("login");
            cookie["username"] = TextBox1.Text;
            Response.Cookies.Add(cookie);
            Response.Redirect("IE2_Welcome.aspx");
        }
        else
        {
            Label3.Text = "Username or Password is Invalid.";
            Label3.ForeColor = System.Drawing.Color.Red;
            Label3.Visible = true;
        }
    }
}