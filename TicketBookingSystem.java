import java.util.Date;
public class TicketBookingSystem {
    // Customer attributes
    private String custId; private String customerName; private String address;private int phoneNo;private int age; private int agentId;
    private String agentName; private String source;private String destination;private Date dateOfJourney;private String time; private String busNo;
    private String seatNo;private float refundAmount; private String refundCustomerId;
    public void addCustomer(String custId, String customerName, String address, int phoneNo, int age) {
        this.custId = custId;
        this.customerName = customerName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
    }
    public void addAgent(int agentId, String agentName) {
        this.agentId = agentId;
        this.agentName = agentName;
    }
    public void createTicket(String source, String destination, Date dateOfJourney, String time, String busNo, String seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }
    public void initiateRefund(float refundAmount, String refundCustomerId) {
        this.refundAmount = refundAmount;
        this.refundCustomerId = refundCustomerId;
    }
    public void searchTicket() {
        System.out.println("Searching for ticket...");
        // Add code to search ticket
    }
    public void bookTicket() {
        System.out.println("Booking ticket...");
    }
    public void cancelTicket() {
        System.out.println("Cancelling ticket...");
    }
    public void makePayment() {
        System.out.println("Making payment...");
    }
    public void fillDetails() {
        System.out.println("Filling ticket details...");
    }
    public void refundAmount() {
        System.out.println("Refunding amount: " + refundAmount + " to customer ID: " + refundCustomerId);
    }
    public void displayTicketInfo() {
        System.out.println("Ticket Information:");
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Date of Journey: " + dateOfJourney);
        System.out.println("Time: " + time);
        System.out.println("Bus Number: " + busNo);
        System.out.println("Seat Number: " + seatNo);
    }
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();
        system.addCustomer("C123", "John", "NY", 123456789, 30);
        system.addAgent(1, "Agent A");
        system.createTicket("New York", "Los Angeles", new Date(), "10:00 AM", "B123", "12A");
        system.displayTicketInfo();
        system.bookTicket();
        system.makePayment();
        system.cancelTicket();
        system.initiateRefund(50.0f, "C123");
        system.refundAmount();}}
