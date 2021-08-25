<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <br /><br />

        <asp:Label ID="Label1" runat="server" Text="Student Name : " Font-Bold="True"></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />

        <asp:Label ID="Label7" runat="server" Text="Student City : " Font-Bold="True"></asp:Label>
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click1" Text="Submit" />
        <br /><br />

        Name :

        <asp:Label ID="Label8" runat="server" Visible="False"></asp:Label>
        <br />
        City :

        <asp:Label ID="Label9" runat="server" Visible="False"></asp:Label>
    </div>
    </form>
</body>
</html>
