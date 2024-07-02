package Lab8;
public class StudentInfo
{
        private String Name;
        private double GPA;

        public StudentInfo(String Name, double GPA) {
            this.Name = Name;
            this.GPA = GPA;
        }

        public String getName() { return Name;}

        public void setName(String Name) { this.Name = Name;}

        public double getGPA() { return GPA;}

        public void setGPA(double GPA) { this.GPA = GPA;}

        public String toString() {
            return "Student Name=" + Name + ", GPA=" + GPA;
        }
}
