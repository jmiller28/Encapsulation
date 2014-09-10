package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use proper
 * encapsulation and the other best practices as explained by your instructor.
 *
 * @author Jim Lombardo, WCTC Instructor
 * @version 1.01
 */
public interface Employee {

    public void completeHiringProcess();

    public String getFirstName();

    public void setFirstName(String firstName);

    public String getLastName();

    public void setLastName(String lastName);

    public String getSsn();

    public void setSsn(String ssn);

    public Date getBirthDate();

    public void setBirthDate(Date birthDate);

    public boolean isMetWithHr();

    public void setMetWithHr(boolean metWithHr);

    public boolean isMetDeptStaff();

    public void setMetDeptStaff(boolean metDeptStaff);

    public boolean isReviewedDeptPolicies();

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies);

    public boolean isMovedIn();

    public void setMovedIn(boolean movedIn);

    public String getCubeId();

    public void setCubeId(String cubeId);

}
