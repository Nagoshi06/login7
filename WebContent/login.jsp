<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 動作のある形です。動作があった場合LoginAciton内の反応を返します。 -->
<form action="LoginAction">
<!-- 入力フォームテキストnameタイプ変数(文字)username
     入力フォームパスワードnameタイプ変数(文字)password
     入力フォーム提出・差し出すvalueタイプ変数(値)送信(submitは値を表示するのみ？) -->
<input type="text" name="username">
<input type="password" name="password">
<input type="submit" value="送信">
</form>
</body>
</html>