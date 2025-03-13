import java.util.*;

class Patient {
    String name;
    int severity;
    
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

class Hospital {
    private Queue<Patient> opdQueue;
    private Map<String, Boolean> bedAvailability;
    private final int totalBeds;
    
    public Hospital(int beds) {
        this.opdQueue = new PriorityQueue<>(Comparator.comparingInt(p -> p.severity));
        this.bedAvailability = new HashMap<>();
        this.totalBeds = beds;
        for (int i = 1; i <= beds; i++) {
            bedAvailability.put("Bed" + i, true);
        }
    }
    
    public void addPatientToQueue(String name, int severity) {
        opdQueue.offer(new Patient(name, severity));
        System.out.println(name + " added to OPD queue with severity " + severity);
    }
    
    public void admitPatient() {
        if (opdQueue.isEmpty()) {
            System.out.println("No patients in queue.");
            return;
        }
        for (Map.Entry<String, Boolean> bed : bedAvailability.entrySet()) {
            if (bed.getValue()) {
                Patient p = opdQueue.poll();
                bedAvailability.put(bed.getKey(), false);
                System.out.println(p.name + " admitted to " + bed.getKey());
                return;
            }
        }
        System.out.println("No beds available for admission.");
    }
    
    public void dischargePatient(String bedId) {
        if (bedAvailability.containsKey(bedId) && !bedAvailability.get(bedId)) {
            bedAvailability.put(bedId, true);
            System.out.println(bedId + " is now available.");
        } else {
            System.out.println("Invalid bed ID or bed already available.");
        }
    }
    
    public void displayBedStatus() {
        System.out.println("Current Bed Availability:");
        for (Map.Entry<String, Boolean> bed : bedAvailability.entrySet()) {
            System.out.println(bed.getKey() + " - " + (bed.getValue() ? "Available" : "Occupied"));
        }
    }
}

public class HospitalQueueSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(5);
        hospital.addPatientToQueue("Alice", 2);
        hospital.addPatientToQueue("Bob", 5);
        hospital.addPatientToQueue("Charlie", 1);
        
        hospital.admitPatient();
        hospital.admitPatient();
        
        hospital.displayBedStatus();
        
        hospital.dischargePatient("Bed1");
        hospital.displayBedStatus();
    }
}
