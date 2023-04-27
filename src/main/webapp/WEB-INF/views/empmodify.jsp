<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>사원 수정</title>
</head>
<body>
    <h1>사원 수정</h1>
    <form name="empfrm" id="empfrm" method="post">
<%--        <div>사원번호 : <input type="text" value="${emp.empid}" readonly name="empid"></div>--%>
        <div>이름 : <input type="text" value="${emp.fname}" readonly name="fname"></div>
        <div>성 : <input type="text" value="${emp.lname}" readonly name="lname"></div>
        <div>이메일 : <input type="text" value="${emp.email}" readonly name="email"></div>
        <div>전화번호 : <input type="text" value="${emp.phone}" readonly name="phone"></div>
        <div>입사일 : <input type="text" value="${emp.hdate}" readonly name="hdate"></div>
        <div><b>직책</b> : <input type="text" value="${emp.jobid}" name="jobid"></div>
        <div>급여 : <input type="text" value="${emp.sal}" readonly name="sal"></div>
        <div>수당 : <input type="text" value="${emp.comm}" readonly name="comm"></div>
        <div><b>상사번호</b> : <input type="text" value="${emp.mgrid}" name="mgrid"></div>
        <div><b>부서번호</b> : <input type="text" value="${emp.deptid}" name="deptid"></div>
        <input type="hidden" name="empid" value="${emp.empid}">
        <div><button type="submit">수정완료</button></div>
    </form>





</body>
</html>
