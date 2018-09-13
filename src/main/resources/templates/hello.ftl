<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello,Freemarker</title>
    <style type="text/css">
        p{
            font-size: 30px;
            color: red;
        }
    </style>
</head>
<body>
<h1>类型获取</h1>
<p>数值:${num1}</p>
<p>字符串:${str1}</p>
<p>布尔:${res}</p>
<p>小数:${num2}</p>
<p>运算:${num1+num2}</p>
<p>取整:${num2?int}</p>
<#if num2==num1>
比较：相同
</#if>
<#if  (2>1 && 3<4)>
   <p>逻辑运算符</p>
</#if>
<p>比较:${res1?string("true","false")}</p>

<h1>内置函数</h1>
<p>大小写:${str2?upper_case}</p>
<p>HTML:${str3?html}</p>
<p>去除前后空白:${str4?trim}</p>
<p>长度:${str5?length}</p>
<h1>验证</h1>

<#if num5??==false>
<p>num5为null </p>
</#if>

<p>默认值:${num5!100}</p>

</body>
</html>