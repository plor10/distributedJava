<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="us.plor.model.Item" %>
<%--
  Created by IntelliJ IDEA.
  User: Plor
  Date: 10/4/2018
  Time: 12:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" >
    <meta name="viewport" content="width=device-width, initial-scale=1" >
    <link href="https://use.fontawesome.com/releases/v5.0.8/css/all.css" rel="stylesheet" >
    <link rel="stylesheet" href="./css/ecommerce.css">
    <script src="includes/searchBar.js"%></script>

    <title>TMela Dinosaur Shop</title>

</head>
<body>
<div>
    <ul class="tabNavigation1">
        <li><a href=""></i>&nbsp; MY ACCOUNT</a></li>
    </ul>
</div>
<div>
    <ul class="tabNavigation">
        <li><a href=""></i>&nbsp; FAQ</a></li>
        <li><a href=""></i>&nbsp; CUSTOMER SERVICE</a></li>
    </ul>
</div>
<div>
    <ul class="tabNavigation3">
        <li><form id="searchBar" action="catalog.jsp" target="_blank" type="GET">
            <a type="submit">Search</a>
        </form></li>
    </ul>
</div>
<div class="container">
    <header>
        <div class="primary_header">
            <br>
        </div>
        <!-- TABS -->
        <ul class="tabNavigation2">
            <li><a href="signin.jsp"><i class="fas fa-sign-in-alt" aria-hidden="true"></i>&nbsp;Sign-In</a></li>
            <li><a href="cart.go"><i class="fas fa-shopping-cart" aria-hidden="true"></i>&nbsp;Shopping Cart</a></li>
            <li><a href="cat.go"><i class="fas fa-globe" aria-hidden="true"></i>&nbsp; Products</a></li>
            <li><a href="index.jsp"><i class="fa fa-home" aria-hidden="true"></i>&nbsp; Home</a></li>
        </ul>
    </header>

    <h2>Responsive Column Cards</h2>
    <p>Resize the browser window to see the effect.</p>

    <div id="wrap">
        <div id="columns" class="columns_4">
            <form action="cartplace.go">
                <%
                    List recs = (List) request.getAttribute("catalog");
                    Iterator it = recs.iterator();
                    while (it.hasNext()) {
                        // Notice we're outputting some HTML. Is that a good idea?
                        // Also, notice we do not cast the object returned by the
                        // iterator to a String. Why?
                        Item item = (Item) it.next();
                        out.print(
                        "<figure>" +
                            "<img src='" + item.getImage() + "' height=''>" + "<br>" +
                            item.getName() + "</td>" + "<br>" +
                            "$" + item.getPrice() + "<br>" +
                            "Add to Cart<input type='checkbox' name='cartItem' value=" + item.getProductNumer()+ ">" +
                        "</figure>");
                    }
                %>
                <input type="submit" value="Purchase">
            </form>
        </div>
    </div>
</div>
</body>
</html>

