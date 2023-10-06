package ref;

public class RefExperiment {
    public static void main(String[] args) {
        RefExperiment experiment = new RefExperiment();
        Student student = new Student (2, "poornima");
        experiment.change1(student);
        System.out.println("inside main");
        System.out.println(student.getName());
        int i=10;
        experiment.change2(i);
        System.out.println("inside i=10"+i);
    }
        void change1(Student studentRefCopy ){
            System.out.println("inside chnage1");
            studentRefCopy =new Student(1, "kushal");
            //studentRefCopy.setName("Santosh");
            System.out.println("inside change 1");
            System.out.println(studentRefCopy.getName());
        }
    void change2(int i){
        i=11;
        System.out.println("inside change2 "+i);
    }
    //reference passed by copy
    //in java change1
    //change2-
}
