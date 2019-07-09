package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<Employee> alEmployee;
    ArrayAdapter<Employee> aaEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.lvEmployee);

        //arraylist
        alEmployee = new ArrayList<>();
        Employee a = new Employee("John","Software Technical Leader",3400.00);
        Employee b = new Employee("May","Programmer",2200.00);

        alEmployee.add(a);
        alEmployee.add(b);

        //arrayadapter
        EmployeeAdapter adapter = new EmployeeAdapter(MainActivity.this,R.layout.row,alEmployee);
        lvEmployee.setAdapter(adapter);

    }
}
