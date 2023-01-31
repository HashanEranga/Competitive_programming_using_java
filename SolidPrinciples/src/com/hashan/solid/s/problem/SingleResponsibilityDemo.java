package com.hashan.solid.s.problem;

public class SingleResponsibilityDemo {
    public static void main(String[] args) {
        MailboxSettingsService settingsService = new MailboxSettingsService();
        User user = new User();
        user.setRole(Role.ADMIN);

        settingsService.changeSecondaryEmail(user, "newSecondaryEmail");
        if(settingsService.hasAccess(user)){
            user.sendMoney(new User(), 1000);
        }

    }
}
