using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class Question_Practical_46 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        SqlConnection conn = new SqlConnection(@"Data Source=LAPTOP-LK1O9VTE;Initial Catalog=Demo;Integrated Security=True");
        SqlCommand cmd = new SqlCommand();
        cmd.Connection = conn;
        cmd.CommandType = CommandType.Text;
        cmd.CommandText = "select * from Student where class=@class";
        cmd.Parameters.AddWithValue("class", "SYMCA");

        try
        {
            conn.Open();
            SqlDataReader sdr = cmd.ExecuteReader();
            GridView1.DataSource = sdr;
            GridView1.DataBind();
            conn.Close();
        }
        catch (Exception)
        {
            Label1.Text = "Error";
        }
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        SqlConnection conn = new SqlConnection(@"Data Source=LAPTOP-LK1O9VTE;Initial Catalog=Demo;Integrated Security=True");
        SqlCommand cmd = new SqlCommand();
        cmd.Connection = conn;
        cmd.CommandType = CommandType.Text;
        cmd.CommandText = "delete from Student where rollno=@rollno";
        cmd.Parameters.AddWithValue("rollno", TextBox1.Text);

        try
        {
            conn.Open();
            cmd.ExecuteNonQuery();
            conn.Close();
            Label1.Text = "Record deleted!";
        }
        catch (Exception)
        {
            Label1.Text = "Error";
        }
    }
}