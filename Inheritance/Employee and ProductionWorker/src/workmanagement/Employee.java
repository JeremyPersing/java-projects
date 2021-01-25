package workmanagement;

public class Employee {
    protected String name;
    protected String number;
    protected String hireDate;

    public Employee(String name, String num, String hireDate) throws InvalidEmployeeNumber{
        this.name = name;
        this.number = num;
        this.hireDate = hireDate;
        char [] workerNumber = num.toCharArray();
        if (workerNumber.length != 5) {
            throw new InvalidEmployeeNumber();
        }
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(String.valueOf(workerNumber[i])) < 0 || Integer.parseInt(String.valueOf(workerNumber[i])) > 9) {
                throw new InvalidEmployeeNumber();
            }
        }
        if (workerNumber[3] != '-') {
            throw new InvalidEmployeeNumber();
        }
        if (workerNumber[4] < 'A' || workerNumber[4] > 'M') {
            throw new InvalidEmployeeNumber();
        }
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getHireDate() {
        return hireDate;
    }


}
