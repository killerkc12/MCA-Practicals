using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class A3Q1__adds_or_subtracts : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        int num1 = System.Convert.ToInt32(TextBox1.Text);
        int num2 = System.Convert.ToInt32(TextBox2.Text);
        int add = num1 + num2;
        int sub = num1 - num2;
        Label3.Visible = true;
        if (RadioButton1.Checked)
        {
            Label3.Text = "Addition is : " + add.ToString();
        }
        if (RadioButton2.Checked)
        {
            Label3.Text = "Subtraction is : " + sub.ToString();
        }

    }
}