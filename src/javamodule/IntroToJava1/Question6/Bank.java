package javamodule.IntroToJava1.Question6;

// QUESTION 6

public class Bank {
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public Bank(String name, String headOfficeAddress, String chairmanName, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        setName(name);
        setHeadOfficeAddress(headOfficeAddress);
        setChairmanName(chairmanName);
        setBranchCount(branchCount);
        setFdInterestRate(fdInterestRate);
        setPersonalLoanInterestRate(personalLoanInterestRate);
        setHomeLoanInterestRate(homeLoanInterestRate);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Bank name cannot be empty or null");
        }
        this.name = name;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        if (headOfficeAddress == null || headOfficeAddress.isBlank()) {
            throw new IllegalArgumentException("Head Office address cannot be empty or null");
        }
        this.headOfficeAddress = headOfficeAddress;
    }

    public void setChairmanName(String chairmanName) {
        if (chairmanName == null || chairmanName.isBlank()) {
            throw new IllegalArgumentException("Chairman name cannot be empty or null");
        }
        this.chairmanName = chairmanName;
    }

    public void setBranchCount(int branchCount) {
        if (branchCount <= 0) {
            throw new IllegalArgumentException("Branch count cannot be zero or negative");
        }
        this.branchCount = branchCount;
    }

    public void setFdInterestRate(double fdInterestRate) {
        if (fdInterestRate <= 0) {
            throw new IllegalArgumentException("Fixed deposit interest rate cannot be zero or negative");
        }
        this.fdInterestRate = fdInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        if (personalLoanInterestRate <= 0) {
            throw new IllegalArgumentException("Personal loan interest rate cannot be zero or negative");
        }
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        if (homeLoanInterestRate <= 0) {
            throw new IllegalArgumentException("Home loan interest rate cannot be zero or negative");
        }
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    public String getName() {
        return name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "Bank name: " + name + "\n" +
                "Head office address: " + headOfficeAddress + "\n" +
                "Chairman name: " + chairmanName + "\n" +
                "Branch count: " + branchCount + "\n" +
                "FD interest rate: " + fdInterestRate + "\n" +
                "Personal loan interest rate: " + personalLoanInterestRate + "\n" +
                "Home loan interest rate: " + homeLoanInterestRate;
    }

}
