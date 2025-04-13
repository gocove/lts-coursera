import java.util.ArrayList;
import java.time.LocalDate;

public abstract class LeaveRequest implements Approvable {
    protected int requestId;
    protected Employee employee;
    protected String startDate;
    protected String endDate;
    protected String status;  // "Pending", "Approved", "Denied"
    protected String reason;
    private ArrayList<StatusChange> statusHistory = new ArrayList<>();

    public class StatusChange {
        private String oldStatus;
        private String newStatus;
        private String changeDate;
        private String changedBy;
        public StatusChange(String oldStatus, String newStatus, 
                String changeDate, String changedBy) {
            this.oldStatus = oldStatus;
            this.newStatus = newStatus;
            this.changeDate = changeDate;
            this.changedBy = changedBy;
        }
    }

    public void changeStatus(String newStatus, String changedBy) {
        String oldStatus = this.status;
        this.status = newStatus;

        // Create a new status change record
        StatusChange change = new StatusChange(oldStatus, newStatus, 
                LocalDate.now().toString(), changedBy);
        statusHistory.add(change);
    }

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
