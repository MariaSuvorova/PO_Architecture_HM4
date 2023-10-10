
public class CashProvider {
    private long cardNumber;
    private boolean isAuthorization;

    public boolean authorization(int idCustomer){
        if(isAuthorization==false){
            try{
            System.out.println("Enter Login/pass");
            } catch (Exception e) {
                System.out.println("Try again");
            }
        }
        return true;
    }

    public boolean buy(int idTicket){
        if(Customer.buyTicket(idTicket)==true){
            System.out.println("you buy ticket:");
            return true;
        }
        return false;
    }
}
        
