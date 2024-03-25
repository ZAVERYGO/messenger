package com.kozich.messenger.controller.listener;

import com.kozich.messenger.service.api.StatService;
import com.kozich.messenger.service.factory.ServiceFactorySingleton;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class ActiveUserListener implements HttpSessionListener {

    private final StatService statService = ServiceFactorySingleton.getStatService();

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        statService.incrementActiveUser();
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        statService.decrementActiveUser();
    }
}
