package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use proper
 * encapsulation and the other best practices as explained by your instructor.
 *
 * @author Jim Lombardo, WCTC Instructor
 * @version 1.01
 */
public abstract class Employee {

    public abstract void completeHiringProcess();

    public abstract String getFirstName();

    public abstract void setFirstName(String firstName);

    public abstract String getLastName();

    public abstract void setLastName(String lastName);

    public abstract String getSsn();

    public abstract void setSsn(String ssn);

    public abstract Date getBirthDate();
    
    public abstract void setBirthDate(Date birthDate);
    
    public abstract boolean isMetWithHr();
            
    public abstract void setMetWithHr(boolean metWithHr);
            
    public abstract boolean isMetDeptStaff();
    
    public abstract void setMetDeptStaff(boolean metDeptStaff);

    public abstract boolean isReviewedDeptPolicies();

    public abstract void setReviewedDeptPolicies(boolean reviewedDeptPolicies);

    public abstract boolean isMovedIn();

    public abstract void setMovedIn(boolean movedIn);

    public abstract String getCubeId();

    public abstract void setCubeId(String cubeId);
    
}
