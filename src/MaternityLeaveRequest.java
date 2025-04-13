public class MaternityLeaveRequest extends LeaveRequest {
    public MaternityLeaveRequest(int requestId, Employee employee,
            String startDate, String endDate) {
        super(requestId, employee, startDate, endDate, "maternity leave");
    }
}
