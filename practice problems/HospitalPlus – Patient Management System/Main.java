public class Main {
    public static void main(String[] args) {
        
        Patient p1 = new Patient("P101", "Rahul Sharma", 30, "Flu");

       
        Doctor d1 = new Doctor("D201", "Dr. Mehta", "General Medicine");

       
        Appointment ap1 = new Appointment(p1, d1, "2025-09-22");

      
        PatientReport report = new PatientReport(p1);
        report.generateReport();

        System.out.println("Appointment Details:");
        System.out.println("Patient: " + ap1.getPatient().getName());
        System.out.println("Doctor: " + ap1.getDoctor().getName());
        System.out.println("Date: " + ap1.getDate());
    }
}
