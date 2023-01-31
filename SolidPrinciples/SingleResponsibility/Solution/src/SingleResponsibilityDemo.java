public class SingleResponsibilityDemo {
    public static void main(String[] args) {
        MailboxSettingsService mailService = new MailboxSettingsService();
        User user = new User();
        user.setRole(Role.ADMIN);
        mailService.changeSecondaryEmail(user, "ccmrhe@gmail.com");
        user.sendMoney(new User(), 1200);

        SecurityService securityService = new SecurityService();
        if(securityService.hasAccess(user)) user.sendMoney(new User(), 1000);
    }
}
