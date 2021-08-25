<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Q3 Store.aspx.cs" Inherits="Q3_Store" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        List of Items :
        <asp:ListBox ID="ListBox1" runat="server" OnSelectedIndexChanged="ListBox1_SelectedIndexChanged">
            <asp:ListItem>Keyboard</asp:ListItem>
            <asp:ListItem>Mouse</asp:ListItem>
            <asp:ListItem>Mobile</asp:ListItem>
        </asp:ListBox>
        <br />
        <br />
        Image of Current Item : <asp:Image ID="Image1" runat="server" Width="112px" />
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" Text="Get the Price" />
        <br />
        <br />
        <asp:Label ID="Label1" runat="server" Text="Cost of Current Item: "></asp:Label>
        <br />
        <br />
        <br />
        <br />
    
    </div>
        <p>
            &nbsp;</p>
    </form>
</body>
</html>
