package com.sl.controller;

import com.sl.entity.User;
import com.sl.service.UserService;
import helpersbaseservlet.BaseServlet;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author shulu
 */
@WebServlet("/UserServlet")
public class UserServlet extends BaseServlet {
    @Autowired
    private UserService userService;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = userService.getUser();
        System.out.println(users);
    }
}
