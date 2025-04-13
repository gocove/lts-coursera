public interface Approvable {
    boolean approve(String approveName);
    boolean deny(String approveName, String reason);
}
