using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Question_Practical_31_1 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Label1.Text = Application["Name"].ToString();
        Label2.Text = Application["Email"].ToString();
        Label3.Text = "Online Users are : " + Application["UsersCount"].ToString();
    }
        
}