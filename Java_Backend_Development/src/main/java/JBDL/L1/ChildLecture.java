package JBDL.L1;

public class ChildLecture extends Lecture {
    public String details(){
        return super.lectureDetailsProtected();
    }
}
