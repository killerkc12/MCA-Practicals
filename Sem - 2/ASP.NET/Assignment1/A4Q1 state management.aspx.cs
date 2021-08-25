using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class A4Q1_state_management : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        HttpCookie cookies = new HttpCookie("cookies");
        cookies["name"] = TextBox1.Text;
        Response.Cookies.Add(cookies);
        Response.Redirect("~/Q4Q1_State_Cookie.aspx");
    }
}