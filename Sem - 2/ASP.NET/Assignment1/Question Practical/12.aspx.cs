using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Question_Practical_12 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        TextBox1.Text = DateTime.Now.ToLongTimeString();
    }

    protected void Timer1_Tick(object sender, EventArgs e)
    {
        TextBox1.Text = DateTime.Now.ToLongTimeString();
    }
}