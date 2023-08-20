package Bai_1;

import java.util.List;
import java.util.Scanner;

public class Fresher implements IEmployee{
    //Nhân viên mới ra trường\

    private String graduationDate; // thời gian tốt nghiệp
    private String graduationRank; // loại tốt nghiệp
    private String education; // tốt nghiệp trường

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }


    @Override
    public void inputData(Scanner sc, List list) {

    }

    @Override
    public void displayData() {

    }
}
