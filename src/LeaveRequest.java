public abstract class LeaveRequest implements Approvable {
    protected int requestId;
    protected Employee employee;
    protected String startDate;
    protected String endDate;
    protected String status;  // "Pending", "Approved", "Denied"
    protected String reason;

    public LeaveRequest(int requestId, Employee employee, 
            String startDate, String endDate, String reason) {
        this.requestId = requestId;
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "Pending";
        this.reason = reason;
    }
    public abstract int calculateLeaveDays();

    public boolean processRequest() {
        System.out.println("Process generic leave request...");
        return true;
    }
    public int getDuration() {
        return 0;
    }
}
