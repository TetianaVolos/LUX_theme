package AdminTest;

import AdminPages.CustomerGrid;
import AdminPages.DashboardPage;
import Base.BaseTestAdmin;
import org.testng.annotations.Test;

public class CustomerDeleteTest extends BaseTestAdmin {


    @Test(priority = 1, description = "filtering in customer grid")
    public void deletingCustomers(){
        //DashboardPage dashboardPage = adminLoginPage.clickLoginButton();
       CustomerGrid customerGrid = dashboardPage.menuNavigation();
       customerGrid.Waiting();
       customerGrid.ClearFilters();
       customerGrid.Waiting();
       customerGrid.FilterByEmail("auto.test@luxinten.com");
       customerGrid.ApplyFilters();
       customerGrid.Waiting();
       customerGrid.SelectingCustomer();
       customerGrid.DeletingCustomer();

    }

}
