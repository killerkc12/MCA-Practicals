using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class A5Q2_RadioButtionList_DataSet : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        SqlConnection conn = new SqlConnection(@"Data Source=LAPTOP-LK1O9VTE;Initial Catalog=masterA5;Integrated Security=True");
        SqlCommand cmd = new SqlCommand("select ename from emp",conn);

        SqlDataAdapter sda = new SqlDataAdapter(cmd);
        DataSet ds = new DataSet();
        sda.Fill(ds);

        RadioButtonList1.DataSource = ds.Tables[0];
        RadioButtonList1.DataTextField = "ename";
        RadioButtonList1.DataValueField = "ename";
        RadioButtonList1.DataBind();
    }
}