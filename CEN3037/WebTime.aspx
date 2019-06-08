<%@ Page Language="C#" AutoEventWireup="true" CodeFile="WebTime.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>A Simple Web Form Example</title>
    <style type="text/css">
        .timeStyle {
            color: #FFFF00;
            font-size: xx-large;
            background-color: #000000;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2>Current time on the web server:</h2>
            <p>
                <asp:Label ID="timeLabel" runat="server" CssClass="timeStyle"></asp:Label>
            </p>
            <p>
                <asp:Image ID="Image1" runat="server" Height="114px" ImageUrl="~/images/serverClock.jpg" Width="158px" />
            </p>
            <p>
                <asp:HyperLink ID="HyperLink1" runat="server" NavigateUrl="index.html">Home</asp:HyperLink>
            </p>
        </div>
    </form>
</body>
</html>
