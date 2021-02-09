<%@ page import="com.emlak.model.Mulk" %>
<%@ page import="org.springframework.context.support.AbstractApplicationContext" %>
<%@ page import="org.springframework.context.annotation.AnnotationConfigApplicationContext" %>
<%@ page import="com.emlak.services.MulkService" %>
<%@ page import="com.emlak.model.Mulk" %>
<%@ page import="org.springframework.web.servlet.ModelAndView" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    Mulk mulk = (Mulk) request.getSession().getAttribute("user");

    if (mulk == null)
        response.sendRedirect("/admin_login");
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mulk Ekle / Güncelle</title>
    <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
    <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
    <script>
        function kontrol(){
            if (document.form.ad.value == ""){
                alert ( "Mulk Giriniz" );
                return false;
            }

            <c:forEach items="${mulkList}" var="mulk" >
            if ((document.form.id.value == "${mulk.id}")){
                alert("Bu mulk sistemde Kayıtlıdır !\r\n" + "${mulk.id}");
                return false;
            }
            </c:forEach>
            <%--            <c:forEach items="${mulkList}" var="dukkan" >--%>
            <%--            if ((document.form.mulk.value != "${dukkan.mulk.id}")){--%>
            <%--                alert("Yanlış Kullanıcı Girdiniz !")--%>
            <%--                return false;--%>
            <%--            }--%>
            <%--            </c:forEach>--%>
            return true;
        }
    </script>
</head>
<body>
<div class="container">
    <spring:url value="/mulk/addMulk" var="addURL" />

    <h2>Mulk Ekle / Güncelle</h2>

    <%--@elvariable id="mulkForm" type="aj"--%>
    <form:form name="form" modelAttribute="mulkForm" method="post" action="${addURL}" cssClass="form" onsubmit="return kontrol();" >

        <form:hidden path="id"/>

    <div class="form-group">
        <label>Mulk id</label>
        <form:input path="
        id" cssClass="form-control"  maxlength="20"/>
    </div>

    <div class="form-group">

        <label>Kullanıcı Adı</label>

        <form:select path = "mulk" id = "mulk" cssClass="form-control">

            <form:option disabled="true" value = "" label = "Kullanıcı Seçiniz" />
            <form:options items = "${userList}" itemLabel="username"/>

        </form:select>

        <div class="form-group">

            <button type="submit" class="btn btn-success">Mulk Ekle / Güncelle</button>
            </form:form>
        </div>
</body>
</html>