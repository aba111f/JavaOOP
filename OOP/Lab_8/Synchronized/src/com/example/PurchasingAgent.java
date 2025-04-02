package Synchronized.src.com.example;

public class PurchasingAgent {
    
    public PurchasingAgent(){
        System.out.println("Creating a purchasing agent");
    }

    public void purchase(){
        Store store = Store.getInstance();
        Thread t = Thread.currentThread();
        System.out.println("Thread:" + t.getName() + ", " + t.getId());
        synchronized(store){
            if (store.getShirtCount() >= 1 && store.authorizeCreditCard("1234", 15.00)) {
                
                Shirt shirt = store.takeShirt();
                System.out.println(shirt + " successfully purchased");
                
            }
            else{
                System.out.println("No more shirts!");
            }
        }
    }
}