using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class A5Q1_Create_Table : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

        SqlConnection conn = new SqlConnection(@"Data Source=LAPTOP-LK1O9VTE;Initial Catalog=masterA5;Integrated Security=True");
        SqlCommand cmd = new SqlCommand();

        cmd.Connection = conn;
        cmd.CommandType = CommandType.Text;
        cmd.CommandText = @"CREATE TALBE dbo.emp 
                           (
                             eno int NOT NULL,
                             ename varchar(20),
                             salary FLOAT,
                             PRIMARY KEY(eno)
                            );
                            ";
        try
        {
            conn.Open();
            cmd.ExecuteNonQuery();
            conn.Close();
            Label1.Text = "Table Created";
            Label1.Visible = true;
            Label1.ForeColor = System.Drawing.Color.Blue;
        }
        catch (Exception)
        {
            Label1.Text = "Table is already created";
            Label1.Visible = true;
            Label1.ForeColor = System.Drawing.Color.Blue;
        }
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        SqlConnection conn = new SqlConnection(@"Data Source=LAPTOP-LK1O9VTE;Initial Catalog=masterA5;Integrated Security=True");
        SqlCommand cmd = new SqlCommand();

        cmd.Connection = conn;
        cmd.CommandType = CommandType.Text;
        cmd.CommandText = @"INSERT INTO dbo.emp VALUES(@eno,@ename,@salary);";
        cmd.Parameters.AddWithValue("eno", TextBox1.Text);
        cmd.Parameters.AddWithValue("ename", TextBox2.Text);
        cmd.Parameters.AddWithValue("salary", TextBox3.Text);
        try
        {
            conn.Open();
            cmd.ExecuteNonQuery();
            conn.Close();
            Label5.Text = "Record Inserted";
            Label5.Visible = true;
            Label5.ForeColor = System.Drawing.Color.Blue;
        }
        catch (Exception)
        {
            Label5.Text = "Something went wrong";
            Label5.Visible = true;
            Label5.ForeColor = System.Drawing.Color.Blue;
        }
    }
}