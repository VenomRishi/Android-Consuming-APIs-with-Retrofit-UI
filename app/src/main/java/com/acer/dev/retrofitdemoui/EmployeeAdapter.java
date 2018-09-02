package com.acer.dev.retrofitdemoui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {

    private Employee[] employees;

    public EmployeeAdapter(Employee[] employees) {
        this.employees = employees;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_employee, parent, false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        Employee employee = employees[position];
        Picasso.get().load(employee.profile_pic).into(holder.profileImageView);
        holder.empAgeTextView.setText(String.valueOf(employee.age));
        holder.nameTextView.setText(String.valueOf(employee.name));

        StringBuilder stringBuilder = new StringBuilder();
        for(Company company:employee.companies){
            stringBuilder.append(company.name).append(" ");
        }
        holder.companiesTextView.setText(stringBuilder.toString());
    }

    @Override
    public int getItemCount() {
        return employees.length;
    }

    public class EmployeeViewHolder extends RecyclerView.ViewHolder {
        public ImageView profileImageView;
        public TextView empAgeTextView;
        public TextView nameTextView;
        public TextView companiesTextView;

        public EmployeeViewHolder(View view) {
            super(view);
            profileImageView = view.findViewById(R.id.profileImageView);
            empAgeTextView = view.findViewById(R.id.ageTextView);
            nameTextView = view.findViewById(R.id.nameTextView);
            companiesTextView = view.findViewById(R.id.companiesTextView);

        }
    }
}
