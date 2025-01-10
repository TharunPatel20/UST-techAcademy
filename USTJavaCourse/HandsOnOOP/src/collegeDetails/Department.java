package collegeDetails;

public class Department {
    private String departmentCode;
    private String departmentName;
    private String buildingLocated;
    private int foundedYear;

    public Department(String departmentCode, String departmentName, String buildingLocated, int foundedYear) {
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.buildingLocated = buildingLocated;
        this.foundedYear = foundedYear;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getBuildingLocated() {
        return buildingLocated;
    }

    public int getFoundedYear() {
        return foundedYear;
    }
}
