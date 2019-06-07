<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Getting Started: Handing Form Submission</title>
</head>
<body>
    <div>
        <h1>Form</h1>
        <form:form method="POST"
               action="${pageContext.request.contextPath}/reqmainpage" modelAttribute="keyModel">
            <table>
                <tr>
                    <td>keyId</td>
                    <td><form:input path="keyId"/></td>
                </tr>
                <tr>
                    <td>jobId</td>
                    <td><form:input path="jobId"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>
