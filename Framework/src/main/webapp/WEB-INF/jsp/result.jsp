<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Getting Started: Handing Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <h1>Result</h1>
    <table>
        <tr>
            <td>KeyId :</td>
            <td>${keyId}</td>
        </tr>
        <tr>
            <td>JobId :</td>
            <td>${jobId}</td>
        </tr>
    </table>
    <a href="/reqmainpage">Submit another message</a>
</body>
</html>