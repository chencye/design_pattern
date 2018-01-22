package com.github.chencye.design.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Observable;

/**
 * @author chencye
 */
@Component
public class CacheRefresh extends Observable implements Refreshable {

    @Autowired
    LoginAction loginAction;

    @PostConstruct
    public void init() {
        this.addObserver(loginAction);
    }


    @Override
    public void refresh() {
        this.setChanged();
        this.notifyObservers();
    }

    @Scheduled(cron = "*/2 * * * * *")
    public void task() {
        refresh();
    }

}
