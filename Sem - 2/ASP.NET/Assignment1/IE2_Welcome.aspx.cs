using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class IE2_Welcome : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        HttpCookie cookie = Request.Cookies["login"];
        string username = cookie["username"];
        Label1.Text = "Welcome " + username + ", You're Authorized. ";
        Label1.Font.Size = 25;
        Label1.ForeColor = System.Drawing.Color.Green;
    }
}