package pages;

import pages.web.*;

public class Page {

    // Web
    private final PageMainWeb pageMainWeb = new PageMainWeb(this);
    protected PageMainWeb getPageMainWeb() {return pageMainWeb;}

    private final PageSignUpWeb pageSignUpWeb = new PageSignUpWeb(this);
    protected PageSignUpWeb getPageSignUpWeb() {return pageSignUpWeb;}

    private final SearchCompanyWeb searchCompanyWeb = new SearchCompanyWeb(this);
    protected SearchCompanyWeb getSearchCompanyWeb() {return searchCompanyWeb;}

    private final PageDashboardWeb pageDashboardWeb = new PageDashboardWeb(this);
    protected PageDashboardWeb getPageDashboardWeb() {return pageDashboardWeb;}

    private final NotificationWeb notificationWeb = new NotificationWeb(this);
    protected NotificationWeb getNotificationWeb() {return notificationWeb;}

    private final JobApplicationWeb jobApplicationWeb = new JobApplicationWeb(this);
    protected JobApplicationWeb getJobApplicationWeb() {return jobApplicationWeb;}

    private final JobSearchWeb jobSearchWeb = new JobSearchWeb(this);
    protected JobSearchWeb getJobSearchWeb() {return jobSearchWeb;}

    private final ConnectionsWeb connectionsWeb = new ConnectionsWeb(this);
    protected ConnectionsWeb getConnectionsWeb() {return connectionsWeb;}

    private final IR35Web ir35WebWeb = new IR35Web(this);
    protected IR35Web getIr35WebWeb() {return ir35WebWeb;}

    private final PagePartner pagePartner = new PagePartner(this);
    protected PagePartner getPagePartner() {return pagePartner;}

    private final MyDocumentWeb myDocumentWeb = new MyDocumentWeb(this);
    protected MyDocumentWeb getMyDocumentWeb() {return myDocumentWeb;}

    private final JobPlacementWeb jobPlacementWeb = new JobPlacementWeb(this);
    protected JobPlacementWeb getJobPlacementWeb() {return jobPlacementWeb;}
}
