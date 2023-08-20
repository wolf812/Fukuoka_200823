package Bai_1;

import java.util.List;
import java.util.Scanner;

public interface IEmployee<T> {
    void inputData(Scanner sc, List<T> list);
    void displayData();
}

