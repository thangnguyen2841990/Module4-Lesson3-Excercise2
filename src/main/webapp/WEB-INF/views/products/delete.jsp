<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>
        .create {
            margin-bottom: 30px;
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
<form method="post">
    <fieldset >
        <legend><h1>DELETE PRODUCT</h1></legend>
        <div class="mb-3">
            <label  class="form-label"><h5>Id</h5></label>
            <input type="text" name="id" class="form-control" disabled value="${product.id}" >
        </div>
        <div class="mb-3">
            <label  class="form-label"><h5>Name</h5></label>
            <input type="text" name="name"  class="form-control" disabled value="${product.name}"  >
        </div>
        <div class="mb-3">
            <label  class="form-label"><h5>Price</h5></label>
            <input type="text" name="price" class="form-control"disabled value="${product.price}">
        </div>
        <div class="mb-3">
            <label  class="form-label"><h5>Quantity</h5></label>
            <input type="text" name="quantity" class="form-control" disabled value="${product.quantity}">
        </div>
        <div class="mb-3">
            <label  class="form-label"><h5>Description</h5></label>
            <input type="text" name="description" class="form-control" disabled value="${product.description}">
        </div>
        <button type="submit" class="btn btn-primary">Delete Product</button>
    </fieldset>
</form>
</body>
</html>

