<!DOCTYPE html>
<html lang="zh-CN">
<%@ page language="java"  pageEncoding="UTF-8"%>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap Login Form Template</title>

    <!-- CSS -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/form-elements.css">
    <link rel="stylesheet" href="assets/css/style.css">

    <!-- Javascript -->
    <script src="assets/js/jquery-1.11.1.min.js" type="text/javascript"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="assets/js/jquery.backstretch.min.js" type="text/javascript"></script>
    <script src="assets/js/scripts.js" type="text/javascript"></script>

</head>

<body>
<!-- Top content -->
<div class="top-content">
    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <h1><strong>欢迎您</strong></h1>
                    <div class="description">
                        <p>
                            这是我们新开发的系统. 您可以很方便的以<strong>低廉</strong>的价格租到您<strong>满意</strong>的车辆
                        </p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">
                    <div class="form-top">
                        <div class="form-top-left">
                            <h3>登录以开始</h3>
                            <p>输入以登录，若用户不存在，将自动为您创建！</p>
                        </div>
                        <div class="form-top-right">
                            <i class="fa fa-key"></i>
                        </div>
                    </div>
                    <div class="form-bottom">
                        <form role="form" action="haha" method="post" class="login-form">
                            <div class="form-group">
                                <label class="sr-only" for="form-username">Username</label>
                                <input type="text" name="userName" placeholder="在此键入您的用户名..." class="form-username form-control" id="form-username">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-password">Password</label>
                                <input type="password" name="userPwd" placeholder="在此键入您的密码..." class="form-password form-control" id="form-password">
                            </div>
                            <button type="submit" class="btn" >登录！</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 social-login">
                    <h3>你还可以这样登录～</h3>
                    <div class="social-login-buttons">
                        <a class="btn" href="#">
                            <img src="assets/img/images/QQ.png" class="img-circle">
                        </a>
                        <a class="btn" href="#">
                            <img src="assets/img/images/weixin.png" class="img-circle">
                        </a>
                        <a class="btn" href="#">
                            <img src="assets/img/images/weibo.png" class="img-circle">
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
<%--<form action="haha" method="post">
    用户名：<input name="userName"/>
    密码：<input name="password"/>
    <input type="submit" value="注册">
</form>
<form action="/showUser" method="post">
    用户名：<input name="userName"/>
    密码：<input name="password"/>
    <input type="submit" value="注册">
</form>--%>
</body>

</html>
