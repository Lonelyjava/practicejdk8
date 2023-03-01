package practicejdk8.com.string;

import java.util.Arrays;

public class Emp {

//    private String name;
//    private String gender;
//    private String dept;
//    private int salary;
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getDept() {
//        return dept;
//    }
//
//    public void setDept(String dept) {
//        this.dept = dept;
//    }

    public static void main(String[] args) {
        String ss="aaaaaabbnnddkkqaaaaaaaaaaaa";
        char c[]=ss.toCharArray();
        int i,k=0;

        for(i=0;i<ss.length();i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (c[i] == c[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                c[k++] = c[i];
            }
        }
        for(i=0;i<k;i++)
            System.out.print(c[i]);
    }



}
