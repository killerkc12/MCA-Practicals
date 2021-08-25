<%@ Page Language="C#" AutoEventWireup="true" CodeFile="IE2_Main.aspx.cs" Inherits="IE2_Main" %>

<!DOCTYPE html>
<%@ Register Src="~/IE2_User_Control.ascx" TagPrefix="uc" TagName="Login"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc:Login runat="server" />
    </div>
    </form>
</body>
</html>
