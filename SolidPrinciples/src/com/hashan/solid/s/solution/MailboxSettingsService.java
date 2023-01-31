package com.hashan.solid.s.solution;

import com.hashan.solid.s.problem.User;

public class MailboxSettingsService {
    SecurityService securityService;
    {
        securityService = new SecurityService();
    }

    public void changeSecondaryEmail(User user, String newSecondaryEmail){
        if(securityService.hasAccess(user)) user.setSecondaryEmail(newSecondaryEmail);
    }
}
