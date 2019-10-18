package com.leiyan.controller;

import com.leiyan.bean.Man;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("aa")
@SessionAttributes("ss")
public class HelloMvc {
    @RequestMapping("show02")
    public String show(Man man,Model m){
        m.addAttribute("aa",man);
        return "show02";
    }

    @RequestMapping("jsp01")
    public String jsp01(){
        System.out.println("进入nihao");
        return "nihao";
    }

    @RequestMapping("add")
    public void addMan(Man man){
        System.out.println("进去add()");
        System.out.println(man);
    }

    @RequestMapping("m1")
    public ModelAndView m1(){
        ModelAndView mv = new ModelAndView();
        ArrayList<String> al = new ArrayList<>();
        al.add("mybits");
        al.add("spring");
        al.add("maven");
        al.add("mvc");
        mv.addObject("list",al);
        mv.setViewName("show01");
        System.out.println("你好啊");
        return mv;
    }

    @RequestMapping("m2")
    public String m2(Model m){

        ArrayList<String> al=new ArrayList<>();
        al.add("mybits");
        al.add("spring");
        al.add("maven");
        al.add("？");
        m.addAttribute("list",al);

        return "show01";

    }

    @ModelAttribute
    public void niu(){
        System.out.println("每个方法执行前执行我");
    }

    public void show(){
        System.out.println("这是第一个show");  
    }
}
