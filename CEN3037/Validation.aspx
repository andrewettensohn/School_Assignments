<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Validation.aspx.cs" Inherits="Validation" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Demonstrating Validation Controls</title>
    <style type="text/css">
        .auto-style1 {
            width: 100%;
        }
        .auto-style2 {
            height: 45px;
        }
        .newStyle1 {
            background-color: #800080;
        }
        .newStyle2 {
            background-color: #000000;
            color: #FFFFFF;
        }
        .auto-style3 {
            height: 45px;
            width: 54px;
        }
        .auto-style4 {
            width: 54px;
        }
    </style>
</head>
<body class="newStyle2">
    <form id="form1" runat="server">
        <div>
            <h3>Please fill out all fields in the following form:</h3>
            <table class="auto-style1">
                <tr>
                    <td class="auto-style3">Name:</td>
                    <td class="auto-style2">
                        <asp:TextBox ID="nameTextBox" runat="server"></asp:TextBox>
                        <br />
                        <asp:RequiredFieldValidator ID="nameRequiredFieldValidator" runat="server" ControlToValidate="nameTextBox" Display="Dynamic" ErrorMessage="Please Enter Your Name" ForeColor="Red"></asp:RequiredFieldValidator>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style4">Email:</td>
                    <td><a>
                        <asp:TextBox ID="emailTextBox" runat="server"></asp:TextBox>
                        e.g.,email@domain.com</a><br />
                        <asp:RequiredFieldValidator ID="emailRequiredFieldValidator" runat="server" ControlToValidate="emailTextBox" Display="Dynamic" ErrorMessage="Please Enter Your Email Address" ForeColor="Red"></asp:RequiredFieldValidator>
                        <asp:RegularExpressionValidator ID="emailRegularExpressionValidator" runat="server" ControlToValidate="emailTextBox" Display="Dynamic" ErrorMessage="Please Enter the Email Address In a Valid Format" ForeColor="Red" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"></asp:RegularExpressionValidator>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style4">Phone:</td>
                    <td>
                        <asp:TextBox ID="phoneTextBox" runat="server"></asp:TextBox>
                        e.g.,(555) 555-1234<br />
                        <asp:RequiredFieldValidator ID="phoneRequiredFieldValidator" runat="server" ControlToValidate="phoneTextBox" Display="Dynamic" ErrorMessage="Please Enter Your Phone Number" ForeColor="Red"></asp:RequiredFieldValidator>
                        <asp:RegularExpressionValidator ID="phoneRegularExpressionValidator" runat="server" ControlToValidate="phoneTextBox" Display="Dynamic" ErrorMessage="Please enter a phone number in a valid format" ForeColor="Red" ValidationExpression="((\(\d{3}\) ?)|(\d{3}-))?\d{3}-\d{4}"></asp:RegularExpressionValidator>
                    </td>
                </tr>
            </table>
        </div>
        <p>
            <asp:Button ID="submitButton" runat="server" Text="Submit" />
        </p>
        <p>
            <asp:Label ID="outputLabel" runat="server" Visible="False"></asp:Label>
        </p>
        <p>
            <asp:CheckBox ID="returnUser" runat="server" BackColor="Black" Text="Return User" />
        </p>
        <p>
            <asp:HyperLink ID="HyperLink1" runat="server" NavigateUrl="index.HTML">Home</asp:HyperLink>
        </p>
    </form>
</body>
</html>
