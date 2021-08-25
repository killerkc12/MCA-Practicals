<%@ Page Language="C#" AutoEventWireup="true" CodeFile="A3Q1  adds or subtracts.aspx.cs" Inherits="A3Q1__adds_or_subtracts" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Enter First Number: "></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
    
    </div>
        <p>
            <asp:Label ID="Label2" runat="server" Text="Enter First Number: "></asp:Label>
            <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        </p>
        <asp:RadioButton ID="RadioButton1" runat="server" GroupName="operators" Text="Addition" />
        <br />
        <asp:RadioButton ID="RadioButton2" runat="server" GroupName="operators" Text="Subtraction" />
        <p>
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Calculate" />
        </p>
        <asp:Label ID="Label3" runat="server" Text="Label" Visible="False"></asp:Label>
    </form>
</body>
</html>
