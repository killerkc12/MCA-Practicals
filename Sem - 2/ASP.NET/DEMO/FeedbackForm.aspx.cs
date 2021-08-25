using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class FeedbackForm : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void TextBox2_TextChanged(object sender, EventArgs e)
    {

    }

    protected void RadioButton2_CheckedChanged(object sender, EventArgs e)
    {

    }

    protected void RadioButton3_CheckedChanged(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        String str = "";
        Boolean check = true;
        if (RadioButton1.Checked)
            str = "Mister";
        else
        if (RadioButton2.Checked)
            str = "Miss";
        else
            check = false;
        Label6.Visible = true;
        Label6.ForeColor = System.Drawing.Color.Red;
        if (check)
            Label6.Text = "Thanks " + str + " "+ TextBox1.Text + " for your feedback.";
        else
            Label6.Text = "Gender Field is Mandatory!";
    }
}