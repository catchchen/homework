package com.neusoft.homework.controller;

import com.neusoft.homework.bean.Reader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author MarcoReus
 * @create 2022-06-06 22:25
 */
@Controller
public class IndexController {
    /**
     * 去学生登录页面
     * @return
     */
    @PostMapping(value = "/student/login")
    public String loginPage(Reader reader, HttpSession session, Model model){
        if(StringUtils.hasLength(reader.getReader_name())&&StringUtils.hasLength(reader.getReader_pwd())){
            //把登陆成功的用户保存起来
            session.setAttribute("loginUser",reader);
            //登录成功重定向到main.html;  重定向防止表单重复提交
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误");
            //回到登录页面
            return "login";
        }
    }
}
