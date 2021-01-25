package exception.project;


public class Employee {
    private String name; 
    private String number;
    private String date;
    
    public Employee(String nombre, String numero, String dateHired) throws InvalidEmployeeNumber{
        name = nombre;
        setNumber(numero);
        date = dateHired;
    }
    
    public Employee() {
        name = "";
        number = "";
        date = "";
    }
    
    
    public String setName(String str) {
        name = str;
        return name;
    }
    
    
    public void setNumber(String num) throws InvalidEmployeeNumber{
        if (validNumber(num)) {
        number = num;
        }
        else {
            throw new InvalidEmployeeNumber();
        }
    }
    
    public String dateHired (String time) {
        date = time;
        return date;
    }
    
    public boolean validNumber(String input) {
        boolean formattedCorrect = true;
        if (input.length() != 5) {
            formattedCorrect = false;
        }
        else {
            if ((!Character.isDigit(input.charAt(0))) || 
                (!Character.isDigit(input.charAt(1)))||
                (!Character.isDigit(input.charAt(2))) || 
                (input.charAt(3)) != '-' || 
                (Character.toUpperCase(input.charAt(4))) < 'A' ||
                (Character.toUpperCase(input.charAt(4))) > 'M') {
            formattedCorrect = false;
            }
        }
                     
        return formattedCorrect;
    }
    
    public String toString() {
        String str = "Name: " + name + "\n" + "Employee number: ";
        if (number == "") {
            str += "Invalid Employee Number";
        }
        else {
            str += number;
        }
        str += "\n" + "Hired: " + date;
        
        return str;
    }
}
