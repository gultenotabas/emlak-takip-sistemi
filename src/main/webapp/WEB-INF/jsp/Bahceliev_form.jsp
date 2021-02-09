<%@ page import="com.emlak.model.Mulk" %>
<%@ page import="org.springframework.context.support.AbstractApplicationContext" %>
<%@ page import="org.springframework.context.annotation.AnnotationConfigApplicationContext" %>
<%@ page import="com.emlak.services.BahcelievService" %>
<%@ page import="com.emlak.model.Bahceliev" %>
<%@ page import="org.springframework.web.servlet.ModelAndView" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    Mulk mulk = (Mulk) request.getSession().getAttribute("user");
    Bahceliev bahceliev = (Bahceliev) request.getSession().getAttribute("bahceliev");
    if (bahceliev == null)
        response.sendRedirect("/admin_login");
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Bahceliev Ekle / Güncelle</title>
    <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
    <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
    <script>
        function kontrol(){
            if (document.form.ad.value == ""){
                alert ( "bahceliev Giriniz" );
                return false;
            }

            <c:forEach items="${bahcelievList}" var="bahceliev" >
            if ((document.form.id.value == "${bahceliev.id}")){
                alert("Bu ev sistemde Kayıtlıdır !\r\n" + "${bahceliev.id}");
                return false;
            }
            </c:forEach>
            <%--            <c:forEach items="${bahcelievList}" var="bahceliev" >--%>
            <%--            if ((document.form.mulk.value != "${bahceliev.mulk.id}")){--%>
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
    <spring:url value="/bahceliev/addBahceliev" var="addURL" />

    <h2>Bahceliev Ekle / Güncelle</h2>

    <%--@elvariable id="bahcelievForm" type="aj"--%>
    <form:form name="form" modelAttribute="bahcelievForm" method="post" action="${addURL}" cssClass="form" onsubmit="return kontrol();" >

        <form:hidden path="id"/>

    <div class="form-group">
        <label>Bahceliev id</label>
        <form:input path="idbahceliev" cssClass="form-control" id="id" maxlength="20"/>
    </div>

    <div class="form-group">

        <label>Kullanıcı Adı</label>

        <form:select path = "mulk" id = "mulk" cssClass="form-control">

            <form:option disabled="true" value = "" label = "Kullanıcı Seçiniz" />
            <form:options items = "${userList}" itemLabel="username"/>

        </form:select>

        <div class="form-group">

            <button type="submit" class="btn btn-success">Bahceliev Ekle / Güncelle</button>
            </form:form>
        </div>
</body>
</html>