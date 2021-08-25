using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class Question_Practical_45 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        SqlConnection conn = new SqlConnection(@"Data Source=LAPTOP-LK1O9VTE;Initial Catalog=Demo;Integrated Security=True");
        SqlCommand cmd = new SqlCommand();
        cmd.Connection = conn;
        cmd.CommandType = CommandType.Text;
        cmd.CommandText = @"INSERT INTO dbo.Person1 VALUES(@name, @address, @phone, @email, @gender)";
        cmd.Parameters.AddWithValue("name", TextBox1.Text);
        cmd.Parameters.AddWithValue("address", TextBox2.Text);
        cmd.Parameters.AddWithValue("phone", TextBox3.Text);
        cmd.Parameters.AddWithValue("email", TextBox4.Text);
        cmd.Parameters.AddWithValue("gender", DropDownList1.SelectedValue);

        try
        {
            conn.Open();
            cmd.ExecuteNonQuery();
            conn.Close();

            Label6.Text = "Registered Successfully!";
            Label6.Visible = true;
            Label6.ForeColor = System.Drawing.Color.Green;
        }
        catch (Exception)
        {
            Label6.Text = "Something is wrong!";
            Label6.Visible = true;
            Label6.ForeColor = System.Drawing.Color.Red;
        }
    }
}