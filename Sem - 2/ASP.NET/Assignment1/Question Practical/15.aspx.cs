using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Question_Practical_15 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        string name = TextBox1.Text;
        float d = float.Parse(TextBox2.Text);
        float t = float.Parse(TextBox3.Text);
        float speed = d / t;
        TextBox4.Text = "Dear "+name+" your speed is "+speed;
        string state = "";
        if(speed > 40 && speed < 60)
        {
            state = "Slow";
        }
        if(speed > 61 && speed < 90)
        {
            state = "Moderate";
        }
        if(speed > 91)
        {
            state = "Speed";
        }
        TextBox5.Text = state;
        TextBox4.Visible = true;
        TextBox5.Visible = true;
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        TextBox1.Text = "";
        TextBox2.Text = "";
        TextBox3.Text = "";
        TextBox4.Text = "";
        TextBox5.Text = "";
        TextBox4.Visible = false;
        TextBox5.Visible = false;
    }
}