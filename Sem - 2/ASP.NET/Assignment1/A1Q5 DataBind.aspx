<%@ Page Language="C#" AutoEventWireup="true" CodeFile="A1Q5 DataBind.aspx.cs" Inherits="Q5_DataBind" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form runat=server> 
        <asp:RadioButtonList ID="RadioButtonList1" runat="server">
            <asp:ListItem>Rose</asp:ListItem>
            <asp:ListItem>Lotus</asp:ListItem>
            <asp:ListItem>Lily</asp:ListItem>
            <asp:ListItem>Mogra</asp:ListItem>
        </asp:RadioButtonList>
    <br><br>         
    <asp:button Text=Submit  runat=server OnClick="Unnamed1_Click"/> 
    <br><br> 
    <asp:label ID="Label1" runat=server/> 
    </form>
</body>
</html>
