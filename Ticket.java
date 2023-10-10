
public class Ticket {
    public int idTicket;
    public int place;
    public int price;
    public String date;
    public static boolean isValid;

    public Ticket(int idTicket, int place, int price, String date) {
        this.idTicket = idTicket;
        this.place = place;
        this.price = price;
        this.date = date;
        Ticket.isValid = true;
    }
    public int getIdTicket() {
        return idTicket;
    }
    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }
    public int getPlace() {
        return place;
    }
    public void setPlace(int place) {
        this.place = place;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public static boolean isValid() {
        return isValid;
    }
    public static void setValid(boolean isValid) {
        Ticket.isValid = isValid;
    }

}