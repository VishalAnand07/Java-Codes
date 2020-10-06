package com.company.Lecture19;

import java.util.ArrayList;
import java.util.Arrays;

public class SortClient {
    public static void main(String[] args) {
        Human mohit =new Human("mohit",22);
        Human sumit=new Human("sumit",25);
        Human vedansh=new Human("vedansh",20);
        Human ravi=new Human("ravi",10);
        Human [] humans={mohit,sumit,vedansh,ravi};
        Arrays.sort(humans);
        mohit.toString();
        System.out.println(Arrays.toString(humans));
    }
}
