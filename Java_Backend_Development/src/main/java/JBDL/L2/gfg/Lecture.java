package JBDL.L2.gfg;

import java.util.Date;

public class Lecture {

    public static Integer numOfObjects = 0;

    private String title;

    private String mentor;

    public StatusEnum status;


    private Date creationDate;



    public String getTitle() {
        return title;
    }

    public Lecture() {
        numOfObjects++;
        creationDate = new Date();
    }

//    public Lecture(String title, String mentor, String status) {
//        this.title = title;
//        this.mentor = mentor;
//        this.status = status;
//        creationDate = new Date();
//        numOfObjects++;
//    }


    public Lecture(String title, String mentor, StatusEnum status, Date creationDate) {
        this.title = title;
        this.mentor = mentor;
        this.status = status;
        this.creationDate = creationDate;
        numOfObjects++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public static Integer getNumOfObjects() {
        return numOfObjects;
    }

    public static void setNumOfObjects(Integer numOfObjects) {
        Lecture.numOfObjects = numOfObjects;
    }

    public Date getCreationDate() {
        return new Date(creationDate.getTime());
    }


    @Override
    public String toString() {
        return "Lecture{" +
                "title='" + title + '\'' +
                ", mentor='" + mentor + '\'' +
                ", status='" + status + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }


    String lectureDetails(){
        return title+" "+mentor;
    }


    protected String lectureDetailsProtected(){
        return title+" "+mentor;
    }


}
