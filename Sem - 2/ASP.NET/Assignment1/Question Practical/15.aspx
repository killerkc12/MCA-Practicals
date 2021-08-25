<%@ Page Language="C#" AutoEventWireup="true" CodeFile="15.aspx.cs" Inherits="Question_Practical_15" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style>
        #Label1{
            text-align: right;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="SPEEDING CALCULATOR"></asp:Label>
    
    </div>
        <p>
            Enter the Required the information and click calculate!</p>
        <p>
            <asp:Label ID="Label2" runat="server" Text="Driver's Name: "></asp:Label>
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        </p>
        <asp:Label ID="Label3" runat="server" Text="Distance (km) :"></asp:Label>
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        <p>
            <asp:Label ID="Label4" runat="server" Text="Time (h) : "></asp:Label>
            <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
        </p>
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Calculate" />
        <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Reset" />
        <p>
            <asp:TextBox ID="TextBox4" runat="server" Visible="False" Width="367px"></asp:TextBox>
        </p>
        <asp:TextBox ID="TextBox5" runat="server" Visible="False" Width="360px"></asp:TextBox>
    </form>
</body>
</html>
