public class LeaveRequest {
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
}
