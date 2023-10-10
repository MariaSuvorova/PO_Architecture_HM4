import java.util.List;

public class Customer {
    public int idCustomer;
    public List<Ticket> tickets;
    public CashProvider cash;

    public static boolean buyTicket(int idTicket){
        boolean orderStatus = false;
        
        return orderStatus;
    }

    public boolean cancelTicket(int idTicket){
        boolean cancelStatus = false;
        
        return cancelStatus;
    }

    public boolean searchTicket(String date, int place){
        boolean searchStatus = false;
        return searchStatus;
    }
    
}
