using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class A3Q2_list_of_colors : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        string color = ListBox1.SelectedItem.Text;
        string par = "background-color:" + color.ToString();
        form1.Attributes.Add("style", par);
    }
}