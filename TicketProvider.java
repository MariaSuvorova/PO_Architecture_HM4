public class TicketProvider {

    public boolean getTicket(int idTicket){
        return Ticket.isValid();
    }

    public boolean updateTicket(int idTicket, boolean isValid){
        boolean updateStatus = false;
        Ticket.setValid(isValid);
        updateStatus = true;
        return updateStatus;
    }
}
