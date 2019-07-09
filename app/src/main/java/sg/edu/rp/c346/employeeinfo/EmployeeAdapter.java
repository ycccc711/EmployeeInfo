package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EmployeeAdapter extends ArrayAdapter {
    Context mcontext;
    int layout_id;
    ArrayList<Employee> alEmployee;

    public EmployeeAdapter(Context context,int resource,ArrayList<Employee>object){
        super(context,resource,object);

        mcontext = context;
        layout_id = resource;
        alEmployee = object;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvRole = rowView.findViewById(R.id.textViewRole);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        // Obtain the Android Version information based on the position
        Employee currentVersion = alEmployee.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentVersion.getName());
        tvRole.setText(currentVersion.getRole());
        tvSalary.setText(currentVersion.getSalary()+"");

        return rowView;
    }
}
