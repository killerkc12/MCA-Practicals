using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Q4Q1_State_Cookie : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        HttpCookie cookies = Request.Cookies["cookies"];
        if (cookies != null)
        {
            Label1.Text = "Welcome, " + cookies["name"];
        }
        else
        {
            Label1.Text = "Cookies not stored.";
        }
    }
}