<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>
        .create {
            margin-bottom: 50px;
        }
        a{
            text-decoration:none;
        }
    </style>


</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<h1 style="margin-bottom: 50px">PRODUCT MANAGEMENT</h1>
<div class="create">
    <a href="/products/create">
        <button class="btn btn-primary">Create new product</button>
    </a>
</div>
<form action="/products">
    <div class="find">
        <lable>Tìm kiếm sản phẩm</lable>
        <input type="text" name="name">
        <input class="btn btn-primary" type="submit" value="Search">
    </div>
</form>
<div class="content">
    <table class="table table-striped">
            <tr>
                <th>STT</th>
                <th>ID</th>
                <th>NAME</th>
                <th>PRICE</th>
                <th>QUANTITY</th>
                <th>DESCRIPTION</th>
                <th>ACTION</th>
            </tr>
        <c:forEach items="${requestScope['products']}" var="product" varStatus="loop">
            <tr>
                <td>${loop.count}</td>
                <td>${product.id}</td>
                <td><a href="/products/view/${product.id}">${product.name}</a></td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
                <td>${product.description}</td>
                <td>
                    <a href="/products/edit/${product.id}">
                        <button class="btn btn-primary">Edit</button></a>
                    <a href="/products/delete/${product.id}">
                        <button class="btn btn-danger">DELETE</button></a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>
</html>
