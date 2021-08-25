using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class A5Q1_checkboxList_dataset : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        SqlConnection conn = new SqlConnection(@"Data Source=LAPTOP-LK1O9VTE;Initial Catalog=masterA5;Integrated Security=True");
        SqlCommand cmd = new SqlCommand("select ename from emp",conn);

        SqlDataAdapter sda = new SqlDataAdapter(cmd);
        DataSet ds = new DataSet();
        sda.Fill(ds,"emp");

        CheckBoxList1.DataTextField = "ename";
        CheckBoxList1.DataValueField = "ename";
        CheckBoxList1.DataSource = ds.Tables["emp"];
        CheckBoxList1.DataBind();


    }
}