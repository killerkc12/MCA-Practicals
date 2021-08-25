<%@ Page Language="C#" AutoEventWireup="true" CodeFile="A1Q2 MouseOver.aspx.cs" Inherits="Q2_MouseOver" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .button{
            background-color:green;
        }
        .button:hover{
            background-color:yellow;
            cursor:pointer;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Button CssClass="button" ID="Button1" runat="server" ForeColor="Black" Text="Button" />
    
    </div>
    </form>
</body>
</html>
