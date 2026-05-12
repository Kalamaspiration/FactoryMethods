
package patientrecord;
/**
 *
 * @author GK
 */
public class PatientRecordSystem {

    
    public static void main(String[] args) {
        
        
        PatientRecord p = new PatientRecordBuilder()
                
                .setPatientName("KRISHNA")
                .setage(26)
                .setDisease("Caridiac Arrest")
                
                .setDoctorName("Gokulakrishnan")
                
                .setroomtype("Private Special Care Room")
                
                .setBillamount(100000l)
                .build();
        
        System.out.println(p);
        
                        
        
    }
    
}
