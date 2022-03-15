 class Student {
    private String firstName; // mandatory
    private String lastName; // mandatory
    private String age; // optional
    private String gender; // optional
    private boolean isGraduate; // optional
    private String city; // optional
    
    
    private Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.isGraduate = builder.isGraduate;
        this.city = builder.city;
        
    }
    @Override
    public String toString() {
        return " firstName=" + firstName + "\n lastName=" + lastName + "\n age=" + age + "\n gender=" + gender
                + "\n isGraduate=" + isGraduate  + "\n city=" + city;
    }
  static class StudentBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String gender;
        private boolean isGraduate;
        private String city;
       
        public StudentBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public StudentBuilder addAge(String age) {
            this.age = age;
            return this;
        }
        public StudentBuilder addGender(String gender) {
            this.gender = gender;
            return this;
        }
        public StudentBuilder addisGraduate(boolean isGraduate) {
            this.isGraduate = isGraduate;
            return this;
        }
        
        public StudentBuilder addCity(String city) {
            this.city = city;
            return this;
	}
	public Student build() {
            return new Student(this);
        }

   }
}

public class Builder {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Harshini", "Kanamathareddy") // mandatory parameters
                .addAge("20") // optional
                .addGender("Female") // optional
		.build();
        System.out.println(student);
    }
}