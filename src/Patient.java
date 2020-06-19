import java.util.LinkedList;
import java.util.Queue;

public class Patient extends User {
    private MedicalData medicalData;
    private Queue<Appointment> appointments;

    /**
     * Creates a person with given information.
     * @param personalData personal data of user
     * @param loginName    login name of user
     * @param password     password of user
     * @param hospital     the hospital to which the user belongs
     */
    public Patient(PersonalData personalData, String loginName, String password, Hospital hospital) {
        super(personalData, loginName, password, hospital);
        medicalData = new MedicalData();
        appointments = new LinkedList<>();
    }
    /**
     * Creates a person with given information.
     * @param personalData  personal data of user
     * @param loginName     login name of user
     * @param password      password of user
     * @param hospital      the hospital to which the user belongs
     * @param test          test name of user
     * @param bloodType     blood type name of user
     * @param note          note of user
     * @param operation     operation name of user
     * @param prescription  prescription object of user
     */
    public Patient(PersonalData personalData, String loginName, String password, Hospital hospital,String test,
                   String bloodType, String note, String operation, Prescription prescription){
        super(personalData, loginName, password, hospital);
        medicalData = new MedicalData(test,bloodType,note,operation,prescription);
        appointments = new LinkedList<>();
    }

    /**
     * Setter method for appointments
     * @param appointments add new appointments object
     */
    public void setAppointments(Queue<Appointment> appointments) {
        this.appointments = appointments;
    }

    /**
     * Getter method for appointments
     * @return appointments objects
     */
    public Queue<Appointment> getAppointments() {
        return appointments;
    }
    /**
     * Setter method for medical data
     * @param medicalData add new medical data object
     */
    public void setMedicalData(MedicalData medicalData) {
        this.medicalData = medicalData;
    }
    /**
     * Getter method for medical data
     * @return medical data objects
     */
    public MedicalData getMedicalData() {
        return medicalData;
    }
}
