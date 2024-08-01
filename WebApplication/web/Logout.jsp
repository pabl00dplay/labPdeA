<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%
    session = request.getSession();
    session.invalidate();
    response.sendRedirect("Login.jsp"); // Redirige al usuario a la página de inicio de sesión
%>