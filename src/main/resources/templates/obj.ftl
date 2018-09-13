<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FreeMarker 继续使用</title>
    <style type="text/css">
        span{
            color: green;
        }
    </style>
</head>
<body>
<div style="border: 1px solid red">
    <h1>名字:<span>${stu.name}</span></h1>
    <h1>性别:<span>${stu.sex}</span></h1>
    <h1>学号:<span>${stu.no}</span></h1>
    <h1>生日:<span>${stu.birthday?datetime}</span></h1>

</div>
<h1>${stulist[0].name}</h1>
<h1>
    Map遍历
</h1>
<#list mcmap?keys as k>
    ${k_index}:${k}:${mcmap[k]}
</#list>
<div>
    <table>
        <thead>
        <tr>
            <th>索引</th>
            <th>序号</th>
            <th>名字</th>
            <th>性别</th>
            <th>生日</th>
        </tr>
        </thead>
        <tbody>
        <#list stulist as s>
         <#if s_index%2==0>
                    <tr style="color: red">
         </#if>
        <#if s_index%2==1>
            <tr style="color: green">
        </#if>
                <td align="center">${s_index}</td>
                <td align="center">${s.no}</td>
                <td align="center">${s.name}</td>
                <td align="center">${s.sex}</td>
                <td align="center">${s.birthday?datetime}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>


</body>
</html>