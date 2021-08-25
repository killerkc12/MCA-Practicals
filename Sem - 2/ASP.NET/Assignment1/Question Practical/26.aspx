<%@ Page Language="C#" AutoEventWireup="true" CodeFile="26.aspx.cs" Inherits="Question_Practical_26" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Enter 1st Number: "></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
    
    </div>
        <asp:Label ID="Label2" runat="server" Text="Enter 2nd Number: "></asp:Label>
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        <br />
        <asp:RadioButton ID="RadioButton1" runat="server" GroupName="cal" Text="Add" />
        <asp:RadioButton ID="RadioButton2" runat="server" GroupName="cal" Text="Sub" />
        <asp:RadioButton ID="RadioButton3" runat="server" GroupName="cal" Text="Mul" />
        <asp:RadioButton ID="RadioButton4" runat="server" GroupName="cal" Text="Div" />
        <asp:RadioButton ID="RadioButton5" runat="server" GroupName="cal" Text="Mod" />
        <asp:RadioButton ID="RadioButton6" runat="server" GroupName="cal" Text="Sq rt" />
        <asp:RadioButton ID="RadioButton7" runat="server" GroupName="cal" Text="Pow" />
        <p>
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Cal" />
        </p>
        <asp:Label ID="Label3" runat="server" Text="Label" Visible="False"></asp:Label>
    </form>
</body>
</html>
