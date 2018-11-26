<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<%=request.getContextPath() %>/plugins/angularjs/angular.min.js"></script>
</head>
<body ng-app="myApp" ng-controller="myController">
	<p>我的第一个表达式: {{ 5 + 5 }}</p>
	<hr>
	<div ng-app>
	  <p>名字 : <input type="text" ng-model="name"></p>
	  <p>我是： {{name}}</p>
	  <p>名字 : <input type="text" ng-model="name"></p>
	</div>
	<hr style="color: blue;">
	x:<input ng-model="x">
	y:<input ng-model="y">
	加法的运算结果：{{add()}}
</body>
<script type="text/javascript">
	var app = angular.module("myApp",[]);
	app.controller("myController",function($scope){
		$scope.add = function(){
			return parseInt($scope.x)+parseInt($scope.y);
		}
	});
</script>
</html>