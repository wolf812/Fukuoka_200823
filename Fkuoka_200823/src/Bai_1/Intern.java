package Bai_1;

import java.util.List;
import java.util.Scanner;

public class Intern implements IEmployee{
    //Nhân viên thực tập

    private String majors; //chuyên ngành đang học
    private  String universityName; // trường đang học

    public Intern() {
    }

    public Intern(String majors, String universityName) {
        this.majors = majors;
        this.universityName = universityName;
    }

    @Override
    public void inputData(Scanner sc, List list) {

    }

    @Override
    public void displayData() {

    }
}
