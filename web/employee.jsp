<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Employees</title>
</head>
<body>
<b>Example of Iterator Tag</b><br/>
<s:iterator value="employees">
    <s:property value="name"/> ,
    <s:property value="department"/><br/>
</s:iterator>
<br/><br/>
<b>Employees sorted by Department</b><br/>

<s:bean name="com.tutorialspoint.struts2.DepartmentComparator"
        var="deptComparator" />

<s:sort comparator="deptComparator" source="employees">
    <s:iterator>
        <s:property value="name"/> ,
        <s:property value="department"/><br/>
    </s:iterator>
</s:sort>
<br/><br/>
<b>SubSet Tag - Employees working in Recruitment department </b><br/>
<s:subset decider="recruitmentDecider" source="employees">
    <s:iterator>
        <s:property value="name"/> ,
        <s:property value="department"/><br/>
    </s:iterator>
</s:subset>
<br/><br/>
<b>SubSet Tag - Employees 2 and 3 </b><br/>
<s:subset start="1" count="2" source="employees">
    <s:iterator>
        <s:property value="name"/> ,
        <s:property value="department"/><br/>
    </s:iterator>
</s:subset>

<b>Employees and Contractors Merged together</b>
<br />
<s:append var="allemployees">
    <s:param value="employees" />
    <s:param value="contractors" />
</s:append >
<s:iterator value="allemployees">
    <s:property value="name"/>,
    <s:property value="department"/><br/>
</s:iterator>

<h2>Example of Generator Tag</h2>
<h3>The colours of rainbow:</h3>

<s:generator val="%{'Violet,Indigo,Blue,Green,Yellow,Orange,Red '}" count="7" separator=",">
    <s:iterator>
        <s:property /><br/>
    </s:iterator>
</s:generator>

</body>
</html>