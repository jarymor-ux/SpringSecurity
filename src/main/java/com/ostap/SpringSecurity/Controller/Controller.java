package com.ostap.SpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "view_for_all_emps";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHr(){
        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManagers(){
        return "view_for_managers";
    }
}
