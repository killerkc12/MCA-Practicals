<%@ Page Language="C#" AutoEventWireup="true" CodeFile="A2Q4 DateTime.aspx.cs" Inherits="A2Q4_DateTime" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Current Date and Time : "></asp:Label>
        <asp:Label ID="Label2" runat="server" Text="Label"></asp:Label>
    
    </div>
        <p>
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Refresh" />
        </p>
    </form>
</body>
</html>
