using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Question_Practical_22 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Timer1_Tick(object sender, EventArgs e)
    {
        TextBox1.Text = DateTime.Now.ToLongTimeString();
        int hours = int.Parse(DateTime.Now.Hour.ToString());
        if(hours >= 5 && hours < 12)
        {
            Label1.Text = "Good Morning!";
        }
        if(hours >= 12 && hours < 17)
        {
            Label1.Text = "Good Afternoon!";
        }
        if(hours >= 17 && hours < 24)
        {
            Label1.Text = "Good Evening!";
        }
        if(hours >=24 && hours < 5)
        {
            Label1.Text = "Good Night!";
        }
    }
}