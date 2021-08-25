using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page
{

    protected void Button1_Click1(object sender, EventArgs e)
    {
        Label8.Text = TextBox1.Text;
        Label9.Text = TextBox2.Text;
        Label8.ForeColor = System.Drawing.Color.Blue;
        Label9.ForeColor = System.Drawing.Color.Blue;
        Label8.Visible = true;
        Label9.Visible = true;
    }
}