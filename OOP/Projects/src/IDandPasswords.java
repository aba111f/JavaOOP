package src;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> idAndPass = new HashMap<String, String>();

    IDandPasswords(){
        idAndPass.put("aba", "123");
        idAndPass.put("BroCode", "123");
        idAndPass.put("BroCode1", "1234");
    }

    protected HashMap<String, String> getLoginInfo(){
        
        return idAndPass;
    }
    
}
