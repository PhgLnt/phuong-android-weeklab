package com.example.phuongapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class person_list_adapter {
    public person_list_adapter(List<person_adapter> personList) {
        this.personList = personList;
    }

    List<person_adapter> personList;

    public List<person_adapter> getPersonList() {
        return personList;
    }

    public void setPersonList(List<person_adapter> personList) {
        this.personList = personList;
    }

    public person_list_adapter()
    {
        String[] startName = {"Phuong", "Blu", "Rouie"};
        String[] startfrom = {"Long An", "Sai Gon", "Ha Noi"};
        this.personList = new ArrayList<>();
        Random r = new Random();
        for(int i=0; i<startName.length; i++)
        {
            person_adapter p = new person_adapter(startName[i], startfrom[i], r.nextInt(9));
            personList.add(p);
        }
    }


}
