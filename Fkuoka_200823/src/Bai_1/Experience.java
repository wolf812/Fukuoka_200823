package Bai_1;

import java.util.List;
import java.util.Scanner;

public class Experience implements IEmployee{
    //Nhân viên kinh nghiệm - Experience
    private int expInYear;  //số năm kinh nghiệm
    private String proSkill; // kỹ năng

    public Experience() {
    }

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }


    @Override
    public void inputData(Scanner sc, List list) {

    }

    @Override
    public void displayData() {

    }
}
