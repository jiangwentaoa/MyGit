<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/com.jaxu.servlet" method="post">
        <table style="border-collapse: collapse" bordercolor="#ffe4c4" align="center" border="1.0rem" cellspacing="0" cellpadding="0" width="1000px">
            <tr>
                <td align="center" width="300px" height="50px" bgcolor="#deb887" class="color">
                    说明
                </td>
                <td align="center" width="300px" height="50px" bgcolor="#deb887" class="color">
                    输入框
                </td>
            </tr>
            <tr>
                <td align="center" width="300px" height="100px">
                    用户名
                </td>
                <td align="center" width="300px" height="100px">
                    <input type="text" style="height: 50px; width: 300px;" name="userName" placeholder="请输入您的用户名" required/>
                </td>
            </tr>
            <tr>
                <td align="center" width="300px" height="100px">
                    密码
                </td>
                <td align="center" width="300px" height="100px">
                    <input type="password" style="height: 50px; width: 300px;" name="password" placeholder="请输入您的密码" required/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center" width="300px" height="100px">
                    <input type="submit" style="height: 50px; width: 300px;" name="submit" value="登录"/>
                    <input type="reset" style="height: 50px; width: 300px;" name="reset" value="重置"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>