﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Q5_DataBind : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }


    protected void Unnamed1_Click(object sender, EventArgs e)
    {
        Label1.Text = RadioButtonList1.SelectedItem.Text;
    }
}