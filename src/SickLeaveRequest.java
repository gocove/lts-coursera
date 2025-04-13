public class SickLeaveRequest extends LeaveRequest {
    private boolean medicalCertificateProvided;

    public SickLeaveRequest(int requestId, Employee employee,
            String startDate, String endDate,
            boolean medicalCertificateProvided) {
        super(requestId, employee, startDate, endDate, "Sick Leave");
        this.medicalCertificateProvided = medicalCertificateProvided;
    }
    public boolean isMedicalCertificateProvided() {
        return medicalCertificateProvided;
    }
    @Override
    public boolean processRequest() {
        if (!medicalCertificateProvided && getDuration() > 2) {
            System.out.println(
                    "Sick leave longer than 2 days requires a medical certificate");
            return false;
        }
        System.out.println("Processing sick leave request...");
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
