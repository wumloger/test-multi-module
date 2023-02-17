<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>

        img{
            height:30px;
            width:80px;
            padding: 0;
         }
         .align{
             text-align: center;
             background-color: white;
            width: fit-content;
             position: absolute;
             top: 400px;
             left: 40%;
        }

    </style>
</head>
<body>
<div class="align">
    <h1>输入正确的验证码获取json</h1>
    <form action="myServlet" method="get">
    验证码：<input type="text" name="code"><img src="check-code"/><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>