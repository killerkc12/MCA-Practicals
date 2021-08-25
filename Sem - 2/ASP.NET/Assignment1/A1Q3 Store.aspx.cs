using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Q3_Store : System.Web.UI.Page
{
    String keyboardImage = "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/MQ052?wid=4000&hei=1800&fmt=jpeg&qlt=95&.v=1495129815011";
    String mouseImage = "https://5.imimg.com/data5/TestImages/FN/HJ/ZW/SELLER-3116103/apple-magic-mouse-2-silver-mla02zm-a-500x500.jpg";
    String mobileImage = "https://english.cdn.zeenews.com/sites/default/files/styles/zm_700x400/public/2020/09/26/888540-apple-iphone.jpg";
    int keyboardCost = 10000;
    int mouseCost = 9000;
    int mobileCost = 120000;
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void ListBox1_SelectedIndexChanged(object sender, EventArgs e)
    {
        string selectItem = ListBox1.SelectedItem.Text;
        if (selectItem == "Keyboard")
            Image1.ImageUrl = keyboardImage;
        else if (selectItem == "Mouse")
            Image1.ImageUrl = mouseImage;
        else if (selectItem == "Mobile")
            Image1.ImageUrl = mobileImage;
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        string selectItem = ListBox1.SelectedItem.Text;
        string cost = "";
        if (selectItem == "Keyboard")
            cost = keyboardCost.ToString();
        else if (selectItem == "Mouse")
            cost = mouseCost.ToString();
        else if (selectItem == "Mobile")
            cost = mobileCost.ToString();
        Label1.Visible = true;
        Label1.Text = "Cost of " + selectItem + " is " + cost + " Rupees.";
    }
}