public class STUDENT {
    public static void main(String args[]) {
        StudentInfo student1 = new StudentInfo();
        
        String[] Stud_Class_Codes_1 = new String[]{"CIT 207: 6EOXUWVYX7","CCS 246 INTRO TO AI: RHYTO1B61I","HUM 110 ART APPRECIATION: OAGM0305OR",
        "SS112 ETHICS: WUIW7UVE8C","CCS223 DISCRETE MATH :P4PV2Q7SOT"};
        
        student1 = new StudentInfo("72183","Pio","Burgos", 2001, "2021", "BSCS2B", Stud_Class_Codes_1);
        

        student1.setfullName("Pio", "Burgos");
        
        
        student1.setAge(2001);
        student1.printInfo();

        StudentInfo student2 = new StudentInfo();
        student2.printInfo();
        
        StudentInfo student3 = new StudentInfo();
        String[] Stud_Class_Codes_3 = new String[]{"CC201","CC202","CCS221","CCS222"};
        student3 = new StudentInfo("830877", "2021", "BSCS1A", Stud_Class_Codes_3);// No names or Birth year
        // I used the setters and getters for the full name and age/birthyear
        
        student3.setfullName("Ken", "Delfin");
        student3.setAge(2001);
        student3.printInfo();

    }

}

class StudentInfo{
    String studNum;
    String fName;
    String lName;
    int birthYear;
    String classYear;
    String section;
    String[] classCodes;

    
    public String getfullName(){
        return this.fName + " " + this.lName;
    }
   
    public int getAge(){
        return this.birthYear;
    }

    public void setfullName(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
        System.out.println("\nName has been updated.");
    }
    
    public void setAge(int birthYear){
        this.birthYear = birthYear;
    }
    


//========================================================================================================
// method
    public void fullName(){
        System.out.println("Full Name: " + getfullName());
    }

    public void studAge(){
        System.out.print("Age: " );
        System.out.println(2021 - getAge());
    }

    public void printClassCodes(String[] classCodes){
        System.out.println("Class Codes: ");
        for(int i=0; i < classCodes.length; i++){
            System.out.println(classCodes[i]);
        }
    }
    public void printInfo(){
        System.out.println("\nStudent Number: " + this.studNum);
        fullName();
        System.out.println("Year of Birth: " + this.birthYear);
        studAge();
        System.out.println("Class Year: " + this.classYear);
        System.out.println("Class Section: " + this.section);
        printClassCodes(classCodes);
       
    }
//========================================================================================================
// constructors

    public StudentInfo(){        
        this.studNum = "4700712";
        this.fName = "John";
        this.lName = "Doe";
        this.birthYear = 1999;
        this.classYear = "2021";
        this.section = "BSIT 3A";
        this.classCodes = new String[]{"English: BKKT6B8TI4", "Science : BV8ZFD0NAF","Math: CC4ZGFZD01",
        "History: YH12XI2ZJ2", "Robotics: I8FH7W0TN0"}; // dummy entries
        
        
    }


    public StudentInfo(String studNum, String classYear, String section, String[] classCodes){       
        this.studNum = studNum;
        this.classYear = classYear;
        this.section = section;
        this.classCodes = classCodes;
       
    }
    
    public StudentInfo(String studNum, String fName, String lName, int birthYear, String classYear, String section, String[] classCodes){    
        this.studNum = studNum;
        this.fName = fName;
        this.lName = lName;
        this.birthYear = birthYear;
        this.classYear = classYear;
        this.section = section;
        this.classCodes = classCodes;
       
    }


}

