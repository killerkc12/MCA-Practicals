<%@ Page Language="C#" AutoEventWireup="true" CodeFile="31.aspx.cs" Inherits="Question_Practical_31" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        Enter Name :
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        Enter Email :<asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
    
    </div>
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Submit" />
    </form>
</body>
</html>
