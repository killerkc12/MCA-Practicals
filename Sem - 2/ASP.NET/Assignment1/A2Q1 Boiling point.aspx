<%@ Page Language="C#" AutoEventWireup="true" CodeFile="A2Q1 Boiling point.aspx.cs" Inherits="A2Q1_Boiling_point" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Enter the Boiling point of water : "></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <asp:CompareValidator ID="CompareValidator1" runat="server" ControlToValidate="TextBox1" Display="Dynamic" ErrorMessage="Invalid boiling point of water!" Type="Integer" ValueToCompare="100" ForeColor="Red"></asp:CompareValidator>
    
    </div>
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Check" />
    </form>
</body>
</html>
