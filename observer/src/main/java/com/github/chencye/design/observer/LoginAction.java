package com.github.chencye.design.observer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Observable;
import java.util.Observer;

/**
 * @author chencye
 */
@RestController
public class LoginAction implements Observer {

    private boolean loginable;

    @GetMapping("login")
    public void login(String user, String pwd) {
        if (!loginable) {
            System.out.println("unable to login.");
            return;
        }
        System.out.println("login success.");
    }

    @Override
    public void update(Observable o, Object arg) {
        reloadConfig();
    }

    private void reloadConfig() {
        this.loginable = !this.loginable;
        System.out.println("loginable=" + loginable);
    }
}
