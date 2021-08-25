using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Question_Practical_29 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        int m1 = int.Parse(TextBox2.Text);
        int m2 = int.Parse(TextBox3.Text);
        int m3 = int.Parse(TextBox4.Text);
        int m4 = int.Parse(TextBox5.Text);
        int m5 = int.Parse(TextBox6.Text);
        int m6 = int.Parse(TextBox7.Text);
        int total = m1 + m2 + m3 + m4 + m5 + m6;
        float percentage = total / 6;
        string grade = "";
        if(percentage < 40)
        {
            grade = "fail";
        }
        if(percentage >= 40 && percentage < 50)
        {
            grade = "pass class";
        }
        if(percentage >= 50 && percentage < 60)
        {
            grade = "second class";
        }
        if(percentage >= 60 && percentage < 70)
        {
            grade = "first class";
        }
        if(percentage >=70 && percentage < 100)
        {
            grade = "distinction";
        }
        TextBox8.Text = total.ToString();
        TextBox9.Text = percentage.ToString();
        TextBox10.Text = grade;
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        TextBox1.Text = "";
        TextBox2.Text = "";
        TextBox3.Text = "";
        TextBox4.Text = "";
        TextBox5.Text = "";
        TextBox6.Text = "";
        TextBox7.Text = "";
        TextBox8.Text = "";
        TextBox9.Text = "";
        TextBox10.Text = "";
    }
}