
package patientrecord;


public class PatientRecordBuilder {
    
    String patientName;
    
    int age;
    
    String disease;
    
    String doctorName;
    
    String roomtype;
    
    double billamount;

    PatientRecordBuilder() {
        
    }
    
    
    public PatientRecordBuilder setPatientName(String name)
    {
        
        this.patientName=name;
        
        return this;
        
        
    }
    
    public PatientRecordBuilder setage(int age)
    {
        
        this.age=age;
        
        return this;
        
        
    }
   
    
    public PatientRecordBuilder setDisease(String disease)
    {
        
        this.disease=disease;
        
        return this;
    }
    
    
    public PatientRecordBuilder setDoctorName(String doctorname)
            
    {
        
        this.doctorName=doctorname;
        
        return this;
    }
    
    
    public PatientRecordBuilder setroomtype(String roomtype)
    {
        this.roomtype=roomtype;
        
        return this;
    }
    
    
    public PatientRecordBuilder setBillamount(double billamount)
    {
        
        this.billamount=billamount;
        
        return this;
    
        
        
    }
    
    
    public PatientRecord build()
    {
        
        return new PatientRecord(this);
    }
    
    

    
}
