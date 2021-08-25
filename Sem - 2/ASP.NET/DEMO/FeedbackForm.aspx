<%@ Page Language="C#" AutoEventWireup="true" CodeFile="FeedbackForm.aspx.cs" Inherits="FeedbackForm" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        Student Name :
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
    
    </div>
        <p>
            Sex :
            <asp:RadioButton ID="RadioButton1" runat="server" GroupName="sex" Text="Male" />
        </p>
        <p style="margin-left: 40px">
            <asp:RadioButton ID="RadioButton2" runat="server" GroupName="sex" OnCheckedChanged="RadioButton2_CheckedChanged" Text="Female" />
        </p>
        <p>
            Select Course : <asp:DropDownList ID="DropDownList1" runat="server">
                <asp:ListItem>DotNet</asp:ListItem>
                <asp:ListItem>Java</asp:ListItem>
                <asp:ListItem>Python</asp:ListItem>
                <asp:ListItem>C language</asp:ListItem>
            </asp:DropDownList>
        </p>
        <p>
            Technical Coverage :
        </p>
        <p>
            <asp:RadioButton ID="RadioButton3" runat="server" GroupName="tech" OnCheckedChanged="RadioButton3_CheckedChanged" Text="Excellent" />
        </p>
        <p>
            <asp:RadioButton ID="RadioButton4" runat="server" GroupName="tech" Text="Good" />
        </p>
        <p>
            <asp:RadioButton ID="RadioButton5" runat="server" GroupName="tech" Text="Average" />
        </p>
        <p>
            <asp:RadioButton ID="RadioButton6" runat="server" GroupName="tech" Text="Poor" />
        </p>
        <p>
            Suggestions :
        </p>
        <p>
            <asp:TextBox ID="TextBox2" runat="server" OnTextChanged="TextBox2_TextChanged" Rows="2" TextMode="MultiLine"></asp:TextBox>
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Submit Form" />
        </p>
        <p>
            <asp:Label ID="Label6" runat="server" Text="Result" Visible="False"></asp:Label>
        </p>
    </form>
</body>
</html>
