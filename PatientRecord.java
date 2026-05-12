
package patientrecord;


public class PatientRecord {
    
     String patientName;
    
     int age;
    
     String disease;
    
      String doctorname;
     
      String roomType;
     
      double billamount;

    PatientRecord(PatientRecordBuilder p)
    {
        
        this.patientName=p.patientName;
        
        this.age=p.age;
        
        this.disease=p.disease;
        
        this.doctorname=p.doctorName;
        
        this.roomType=p.roomtype;
        
        this.billamount=p.billamount;
        
        
        
        
    }
    
    @Override
    public String toString()
    {
        
        return "Patient:" + patientName + "\nAge :" + age + "\nDisease :" + disease+ "\nDoctorName :" + doctorname + "\nRommType"+ roomType+"\nBillAmount"+ billamount;
        
        
        
    }
    
    
     
     
     
    
    
    
    
    
}
