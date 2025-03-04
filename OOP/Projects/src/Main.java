package src;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        IDandPasswords idAndPass = new IDandPasswords();
        LoginPage lPage = new LoginPage(idAndPass.getLoginInfo());
    }
}
