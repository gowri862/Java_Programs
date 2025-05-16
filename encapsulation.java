public class EncapsulationExample {

    // Inner class with encapsulated fields
    static class Student {
        private String name;
        private int age;

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for age
        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Age must be a positive number.");
            }
        }

        // Getter for age
        public int getAge() {
            return age;
        }
    }

    // Main method
    public static void main(String[] args) {
        Student student = new Student();
        
        // Set values using setters
        student.setName("Alice");
        student.setAge(19);

        // Get and display values using getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
