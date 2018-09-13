package com.feri.temstudy.controller;

import com.feri.temstudy.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 *@Author feri
 *@Date Created in 2018/9/13 10:03
 */
@Controller
public class FtlController {

    @RequestMapping("/ftlbase.do")
    public String base(Map<String,Object> map){
        map.put("num1",1001);
        map.put("num2",1001.234);
        map.put("str1","Hello，早上是不能睡觉的");
        map.put("res","true");
        map.put("str2","abcderfSdef");
        map.put("str3","<h1>我是马鑫</h1>");
        map.put("str4","           abc    ");
        map.put("str5","www");
        map.put("res1",true);
        return "hello";
    }

    @RequestMapping("/ftlobject.do")
    public String object(Map<String,Object> map){
        map.put("stu",new Student(10001,"马鑫",new Date(),"男人"));
        List<Student> students=new ArrayList<>();
        for(int i=1;i<100;i++){
            students.add(new Student(1000+i,"睡神"+i,new Date(),"男"));
        }
        map.put("stulist",students);
       // Map<String,String> map1=new HashMap<>();
        Map<String,String> map1=new LinkedHashMap<>();
        map1.put("第一名","徐凯");
        map1.put("第二名","占江");
        map1.put("第三名","校是");
        map.put("mcmap",map1);
        return "obj";
    }

}
