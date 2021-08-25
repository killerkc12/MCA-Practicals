<%@ Page Language="C#" AutoEventWireup="true" CodeFile="A3Q2 list of colors.aspx.cs" Inherits="A3Q2_list_of_colors" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style>
        *{
            margin:0;
        }
        #form1{
            padding:50px;
            height:100vh;
        }
    </style>
</head>
<body id="body">
    <form id="form1" runat="server">
        <asp:Label ID="Label1" runat="server" Text="Select the color: "></asp:Label>
        <asp:ListBox ID="ListBox1" runat="server">
            <asp:ListItem>pink</asp:ListItem>
            <asp:ListItem>black</asp:ListItem>
            <asp:ListItem>green</asp:ListItem>
            <asp:ListItem>orange</asp:ListItem>
            <asp:ListItem>blue</asp:ListItem>
            <asp:ListItem>red</asp:ListItem>
        </asp:ListBox>
        <br />
    <div>
    
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Check the background" />
    
    </div>
    </form>
</body>
</html>
