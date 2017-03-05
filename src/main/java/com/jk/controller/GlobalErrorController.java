package com.jk.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 统一错误处理 404 500
 * Created by JK on 2017/2/13.
 */
@Controller
public class GlobalErrorController implements ErrorController {

    private static final String ERROR_PATH = "/error";

    @RequestMapping(value=ERROR_PATH)
    public String handleError(){
        return "admin/404";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}