public class VacationLeaveRequest extends LeaveRequest {
    public VacationLeaveRequest(int requestId, Employee employee,
            String startDate, String endDate) {
        super(requestId, employee, startDate, endDate, "vacation leave");
    }
    @Override
    public boolean processRequest() {
        return true;
    }
    @Override
    public boolean approve(String approverName) {
        if (processRequest()) {
            System.out.println("Request has been approved by " + approverName);
            return true;
       } else {
           System.out.println("Request has been denied by " + approverName);
           return false;
       }
    }
    @Override 
    public boolean deny(String approverName, String reason) {
        return !processRequest();
    }
    @Override
    public int calculateLeaveDays() {
        return 0;
    }
}
