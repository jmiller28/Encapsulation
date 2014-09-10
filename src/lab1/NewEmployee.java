package lab1;

import java.util.Date;

/**
 *
 * @author jmiller
 */
public class NewEmployee implements Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        //validation goes here
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        //validation goes here
        this.lastName = lastName;
    }

    @Override
    public String getSsn() {
        return ssn;
    }

    @Override
    public void setSsn(String ssn) {
        //validation goes here
        this.ssn = ssn;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public void setBirthDate(Date birthDate) {
        //validation goes here
        this.birthDate = birthDate;
    }

    @Override
    public boolean isMetWithHr() {
        return metWithHr;
    }

    @Override
    public void setMetWithHr(boolean metWithHr) {
        //validation goes here
        this.metWithHr = metWithHr;
    }

    @Override
    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    @Override
    public void setMetDeptStaff(boolean metDeptStaff) {
        //validation goes here
        this.metDeptStaff = metDeptStaff;
    }

    @Override
    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    @Override
    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        //validation goes here
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    @Override
    public boolean isMovedIn() {
        return movedIn;
    }

    @Override
    public void setMovedIn(boolean movedIn) {
        //validation goes here
        this.movedIn = movedIn;
    }

    @Override
    public String getCubeId() {
        return cubeId;
    }

    @Override
    public void setCubeId(String cubeId) {
        //validation goes here
        this.cubeId = cubeId;
    }

    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if (metWithHr) {
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if (metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        if (metWithHr && metDeptStaff && reviewedDeptPolicies) {
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getStatus() {
        if (metWithHr && metDeptStaff
                && reviewedDeptPolicies && movedIn) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }

    public void completeHiringProcess() {
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
    }

}
