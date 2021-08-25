using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Question_Practical_26 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        int n1 = int.Parse(TextBox1.Text);
        int n2 = int.Parse(TextBox2.Text);
        if (RadioButton1.Checked)
        {
            Label3.Text = "Addition is " + (n1 + n2); 
        }
        else if (RadioButton2.Checked)
        {
            Label3.Text = "Substraction is " + (n1 - n2);
        }
        else if (RadioButton3.Checked)
        {
            Label3.Text = "Multiplication is " + (n1 * n2); 
        }
        else if (RadioButton4.Checked)
        {
            Label3.Text = "Division is " + (n1 / n2);
        }
        else if (RadioButton5.Checked)
        {
            Label3.Text = "Mod is " + (n1 % n1);
        }
        else if (RadioButton6.Checked)
        {
            Label3.Text = "Square root of "+ n1 +" and "+ n2 +" is " + Math.Sqrt(n1) +" and  " + Math.Sqrt(n2) ;
        }
        else if (RadioButton7.Checked)
        {
            Label3.Text = "power of " + n1 + " raised to " + n2 + " is " + Math.Pow(n1, n2);
        }
        Label3.Visible = true;
    }
}