package com.github.binarywang.demo.wx.miniapp.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import com.github.binarywang.demo.wx.miniapp.config.WxMaConfiguration;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
public class IndexController {
    @GetMapping(produces = "text/plain;charset=utf-8")
    public String index() {
        return "hello easter-sun";
    }
}
