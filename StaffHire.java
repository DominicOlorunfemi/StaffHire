public class StaffHire
{
    private int vacancyNumber;
    private String designation;
    private String jobType;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    
    /**
     *  Constructor for the objects of the class StaffHire
     */
    public StaffHire(
        int newVacancyNumber,
        String newDesignation,
        String newJobType,
        String newStaffName,
        String newJoiningDate,
        String newQualification,
        String newAppointedBy,
        boolean newJoined
    )
    {
        // Initialise the instance variables
        vacancyNumber = newVacancyNumber;
        designation = newDesignation;
        jobType = newJobType;
        staffName = newStaffName;
        joiningDate = newJoiningDate;
        qualification = newQualification;
        appointedBy = newAppointedBy;
        joined = newJoined;
    }
    
    public void SetVacancyNumber(){
        
    }
    
    public int GetVacancyNumber (){
        return vacancyNumber;
    }
    
    public void SetDesignation(){
        
    }
    
    public String GetDesignation(){
        return designation;
    }
    
    public void SetJobType(){
        
    }
    
    public String GetJobType(){
        return jobType;
    }
    
    public void SetStaffName(){
        
    }
    
    public String GetStaffName(){
        return staffName;
    }
    
    public void SetJoiningDate(){
        
    }
    
    public String GetJoiningDate(){
        return joiningDate;
    }
    
    public void SetQualification(){
        
    }
    
    public String GetQualification(){
        return qualification;
    }
    
    public void SetAppointedBy(){
       
    }
    
    public String GetAppointedBy(){
       return appointedBy;
    }
    
    public void SetJoined(){
       
    }
    
    public boolean GetJoined(){
       return joined;
  
    }
    
}