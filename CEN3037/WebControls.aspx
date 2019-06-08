<%@ Page Language="C#" AutoEventWireup="true" CodeFile="WebControls.aspx.cs" Inherits="WebControls" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Web Controls Demonstration</title>
    <style type="text/css">
        .auto-style1 {
            width: 100%;
        }
        .auto-style2 {
            width: 240px;
        }
        .pageStyle {
            background-color: #99FF66;
            font-size: large;
            font-family: Bahnschrift;
        }
    </style>
    <link href="StyleSheet.css" rel="stylesheet" type="text/css" />
</head>
<body class="newStyle6">
    <form id="form1" runat="server" class="newStyle1">
        <div>
            <h3>Registration Form</h3>
            <p>
                Please fill in all fields and click the Register button</p>
            <p>
                <asp:Image ID="userInformationImage" runat="server" ImageUrl="~/images/user.png" />
            </p>
            <table class="auto-style1">
                <tr>
                    <td class="auto-style2">
                        <asp:Image ID="firstNameImage" runat="server" ImageUrl="~/images/fname.png" />
                        <asp:TextBox ID="firstNameTextBox" runat="server"></asp:TextBox>
                    </td>
                    <td>
                        <asp:Image ID="lastNameImage" runat="server" ImageUrl="~/images/lname.png" />
                        <asp:TextBox ID="lastNameTextBox" runat="server"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style2">
                        <asp:Image ID="emailImage" runat="server" ImageUrl="~/images/email.png" />
                        <asp:TextBox ID="emailTextbox" runat="server"></asp:TextBox>
                    </td>
                    <td>
                        <asp:Image ID="phoneImage" runat="server" ImageUrl="~/images/phone.png" />
                        <asp:TextBox ID="phoneTextBox" runat="server"></asp:TextBox>
                    </td>
                </tr>
            </table>
        </div>
        <p>
            <asp:Image ID="publicationsImage0" runat="server" ImageUrl="~/images/publications.png" />
            <br />
            Which book would you like information about?</p>
        <p>
&nbsp;<asp:DropDownList ID="booksDropDownList" runat="server">
                <asp:ListItem>Visual Basic 2010 How to Program</asp:ListItem>
                <asp:ListItem>Visual C# 2010 How to Program</asp:ListItem>
                <asp:ListItem>Java How to Program</asp:ListItem>
                <asp:ListItem>C++ How to Program</asp:ListItem>
            </asp:DropDownList>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </p>
        <p>
&nbsp;<asp:HyperLink ID="booksHyperLink" runat="server" NavigateUrl="http://www.deitel.com" Target="_blank">Click here to view more about our books</asp:HyperLink>
&nbsp;&nbsp;&nbsp;&nbsp;
        </p>
        <p>
            <asp:Image ID="osImage" runat="server" ImageUrl="~/images/os.png" />
&nbsp;</p>
        <p>
            <asp:RadioButtonList ID="osRadioButtonList" runat="server">
                <asp:ListItem>Windows 7</asp:ListItem>
                <asp:ListItem>Windows Vista</asp:ListItem>
                <asp:ListItem>Windows XP</asp:ListItem>
                <asp:ListItem>Mac OS X</asp:ListItem>
                <asp:ListItem>Linux</asp:ListItem>
                <asp:ListItem>Other</asp:ListItem>
            </asp:RadioButtonList>
        </p>
        <p>
&nbsp;<asp:Button ID="registerButton" runat="server" Text="Register" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </p>
        <p>
            <asp:HyperLink ID="HyperLink1" runat="server" NavigateUrl="index.HTML">Home</asp:HyperLink>
        </p>
    </form>
</body>
</html>
