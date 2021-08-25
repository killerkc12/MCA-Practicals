using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Question_Practical_31 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        Application["Name"] = TextBox1.Text;
        Application["Email"] = TextBox2.Text;
        Response.Redirect("~/Question Practical/31_1.aspx");
    }
}