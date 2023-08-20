package Bai_1;

import java.util.List;
import java.util.Scanner;

public class Employee implements IEmployee<Employee> {
    //  thông tin nhân viên
    private int id;

    private String fullName;

    private String birthDay;

    private String phone;

    private String email;

    private int loaiNhanVien;//employeeType

    public Employee() {
    }

    public Employee(int id, String fullName, String birthDay, String phone, String email, int loaiNhanVien) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.loaiNhanVien = loaiNhanVien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(int loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    /**
     * Nhập thông tin cơ bản cho nhân viên
     *
     * @param sc
     * @param listEmployee
     */
    @Override
    public void inputData(Scanner sc, List<Employee> listEmployee) {
        System.out.println("Hãy nhập thông tin của Nhân viên: ");

        //Mã nhân viên
        boolean checkIdExit = true;
        do {
            try {
                System.out.println("Nhập ID Nhân viên: ");
                int employeeId = Integer.parseInt(sc.nextLine());
                boolean checkId = false;
                for (Employee employee :
                        listEmployee) {
                    if (employee.id == employeeId) {
                        checkId = true;
                        break;
                    }
                }
                if (checkId) {
                    System.err.println("Mã nhân viên bị trùng lặp, vui lòng nhập lại.");
                } else {
                    checkIdExit = false;
                    this.id = employeeId;
                }
            } catch (NumberFormatException ex) {
                System.err.println("Mã nhân viên phải là số nguyên, vui lòng nhập lại.");
            }
        } while (checkIdExit);

        //Nhập tên
        System.out.println("Nhập tên nhân viên: ");
        this.fullName = sc.nextLine();

        //ngày sinh
        boolean checkDateExit = true;
        do {
            String datePattern = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$\n";
            System.out.println("Ngày sinh: ");
            String birthDay = sc.nextLine();
            boolean isDate = false;
            isDate = birthDay.matches(datePattern);
            if (isDate) {
                checkDateExit = false;
                this.birthDay = birthDay;
                break;
            } else {
                System.err.println("Ngày tháng năm sinh phải theo kiểu định dạng dd/mm/yyyy, vui lòng nhập lại.");
            }
        } while (checkDateExit);


        //số điện thoại
        boolean checkPhoneExit = true;
        do {
            try {
                System.out.println("Số điện thoại: ");

            } catch (NumberFormatException ex) {
                System.err.println("Số điện thoại là 1 dãy số, vui lòng nhập lại.");
            }
        } while (checkPhoneExit);


    }


    @Override
    public void displayData() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean checkDateExit = true;
        do {
            String datePattern = "^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$";
            System.out.println("Ngày sinh: ");
            String birthDay = sc.nextLine();
            boolean isDate = false;
            isDate = birthDay.matches(datePattern);
            if (isDate) {
                checkDateExit = false;
//                this.birthDay = birthDay;
                System.out.println("Nhập đúng");
            } else {
//                System.err.println("Ngày tháng năm sinh phải theo kiểu định dạng dd/mm/yyyy, vui lòng nhập lại.");
                try {
                   throw new Exception("Ngày tháng năm sinh phải theo kiểu định dạng dd/mm/yyyy, vui lòng nhập lại.");

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } while (checkDateExit);
    }
}

