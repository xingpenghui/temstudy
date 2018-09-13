package com.feri.temstudy.controller;

import com.feri.temstudy.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/9/13 11:22
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/thydata.do")
    public String thdata(Model model){
        model.addAttribute("msg","中午好！");
        model.addAttribute("msg2","下午好");
        model.addAttribute("num",10000);
        model.addAttribute("num1",88);
        model.addAttribute("dt",new Date());

        List<Student> list=new ArrayList<>();
        for(int  i=1;i<10;i++){
            list.add(new Student(i,"xx同学"+i,new Date(),(i%2==0?"男":"女")));
        }
        model.addAttribute("stulist",list);
        return "thystudy1";
    }

}
