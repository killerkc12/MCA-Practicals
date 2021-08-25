<%@ Page Language="C#" AutoEventWireup="true" CodeFile="52.aspx.cs" Inherits="Question_Practical_52" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" DataKeyNames="Person" DataSourceID="SqlDataSource1">
            <Columns>
                <asp:CommandField ShowDeleteButton="True" ShowEditButton="True" />
                <asp:BoundField DataField="Person" HeaderText="Person" ReadOnly="True" SortExpression="Person" />
                <asp:BoundField DataField="Address" HeaderText="Address" SortExpression="Address" />
                <asp:BoundField DataField="Phone" HeaderText="Phone" SortExpression="Phone" />
                <asp:BoundField DataField="Email" HeaderText="Email" SortExpression="Email" />
                <asp:BoundField DataField="Gender" HeaderText="Gender" SortExpression="Gender" />
            </Columns>
        </asp:GridView>
    
    </div>
        <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:DemoConnectionString %>" DeleteCommand="DELETE FROM [Person] WHERE [Person] = @Person" InsertCommand="INSERT INTO [Person] ([Person], [Address], [Phone], [Email], [Gender]) VALUES (@Person, @Address, @Phone, @Email, @Gender)" SelectCommand="SELECT * FROM [Person]" UpdateCommand="UPDATE [Person] SET [Address] = @Address, [Phone] = @Phone, [Email] = @Email, [Gender] = @Gender WHERE [Person] = @Person">
            <DeleteParameters>
                <asp:Parameter Name="Person" Type="String" />
            </DeleteParameters>
            <InsertParameters>
                <asp:Parameter Name="Person" Type="String" />
                <asp:Parameter Name="Address" Type="String" />
                <asp:Parameter Name="Phone" Type="Int32" />
                <asp:Parameter Name="Email" Type="String" />
                <asp:Parameter Name="Gender" Type="String" />
            </InsertParameters>
            <UpdateParameters>
                <asp:Parameter Name="Address" Type="String" />
                <asp:Parameter Name="Phone" Type="Int32" />
                <asp:Parameter Name="Email" Type="String" />
                <asp:Parameter Name="Gender" Type="String" />
                <asp:Parameter Name="Person" Type="String" />
            </UpdateParameters>
        </asp:SqlDataSource>
    </form>
</body>
</html>
