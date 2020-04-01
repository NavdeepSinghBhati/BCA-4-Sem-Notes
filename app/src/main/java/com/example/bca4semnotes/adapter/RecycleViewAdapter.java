package com.example.bca4semnotes.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bca4semnotes.COA_activities.Unit1_COA;
import com.example.bca4semnotes.COA_activities.unit2_coa;
import com.example.bca4semnotes.COA_activities.unit3_coa;
import com.example.bca4semnotes.COA_activities.unit4_coa;
import com.example.bca4semnotes.COA_activities.unit5_coa;
import com.example.bca4semnotes.OS_activities.os_unit_1;
import com.example.bca4semnotes.OS_activities.os_unit_2;
import com.example.bca4semnotes.OS_activities.os_unit_3;
import com.example.bca4semnotes.OS_activities.os_unit_4;
import com.example.bca4semnotes.OS_activities.os_unit_5;
import com.example.bca4semnotes.R;
import com.example.bca4semnotes.conam_activities.conam_Unit_1;
import com.example.bca4semnotes.conam_activities.conam_Unit_2;
import com.example.bca4semnotes.conam_activities.conam_Unit_3;
import com.example.bca4semnotes.conam_activities.conam_Unit_4;
import com.example.bca4semnotes.conam_activities.conam_Unit_5;
import com.example.bca4semnotes.graphics_activities.graphics_unit_1;
import com.example.bca4semnotes.graphics_activities.graphics_unit_2;
import com.example.bca4semnotes.graphics_activities.graphics_unit_3;
import com.example.bca4semnotes.graphics_activities.graphics_unit_4;
import com.example.bca4semnotes.graphics_activities.graphics_unit_5;
import com.example.bca4semnotes.vb_activities.vbnet_Unit_1;
import com.example.bca4semnotes.vb_activities.vbnet_Unit_2;
import com.example.bca4semnotes.vb_activities.vbnet_Unit_3;
import com.example.bca4semnotes.vb_activities.vbnet_Unit_4;
import com.example.bca4semnotes.vb_activities.vbnet_Unit_5;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private Context context;
    private ArrayList<suitCaseAdapter> unitList;

    public RecycleViewAdapter(Context context, ArrayList<suitCaseAdapter> unitList) {
        this.context = context;
        this.unitList = unitList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.unit_name,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        suitCaseAdapter caseAdapter= unitList.get(position);
        holder.unitname.setText(caseAdapter.getName());
     //   holder.imageView_unit.setImageResource(caseAdapter.getImage());
    }


    @Override
    public int getItemCount() {
        return 6;
    }

    public class  ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        TextView unitname;
        //ImageView imageView_unit;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            unitname=itemView.findViewById(R.id.textviewRecyle);
           // imageView_unit=itemView.findViewById(R.id.imageRecyleview);
        }

        @Override
        public void onClick(View v) {

            int positon =getAdapterPosition();//this get the position on where the user click either 0,1,2,3,4
            suitCaseAdapter caseAdapter=unitList.get(positon);
            String name = caseAdapter.getName();//get  info of the unit name which one user selected
            caseAdapter.getImage();//get position info about the pic


            if(positon==0){
                if (name=="COA Unit 1"){
                    Intent intent= new Intent(context, Unit1_COA.class);
                    context.startActivity(intent);
                }//intent passiong for conom
                else if (name=="Graphics Unit 1"){
                    Intent intent= new Intent(context, graphics_unit_1.class);
                    context.startActivity(intent);
                }
                else if (name=="OS Unit 1"){
                    Intent intent= new Intent(context, os_unit_1.class);
                    context.startActivity(intent);
                }
                else if (name=="CONAM Unit 1"){
                    Intent intent= new Intent(context, conam_Unit_1.class);
                    context.startActivity(intent);
                }
                else if (name=="VB.Net Unit 1"){
                    Intent intent= new Intent(context, vbnet_Unit_1.class);
                    context.startActivity(intent);
                }

            }

            else if (positon==1) {
                if(name=="COA Unit 2"){
                    Intent intent= new Intent(context, unit2_coa.class);
                    context.startActivity(intent);
                }
                else if (name=="Graphics Unit 2"){
                    Intent intent= new Intent(context, graphics_unit_2.class);
                    context.startActivity(intent);
                }
                else if (name=="OS Unit 2"){
                    Intent intent= new Intent(context, os_unit_2.class);
                    context.startActivity(intent);
                }
                else if (name=="CONAM Unit 2"){
                    Intent intent= new Intent(context, conam_Unit_2.class);
                    context.startActivity(intent);
                }
                else if (name=="VB.Net Unit 2"){
                    Intent intent= new Intent(context, vbnet_Unit_2.class);
                    context.startActivity(intent);
                }


            }

            else if (positon==2) {
                if(name=="COA Unit 3"){
                    Intent intent= new Intent(context, unit3_coa.class);
                    context.startActivity(intent);
                }
                else if (name=="Graphics Unit 3"){
                    Intent intent= new Intent(context, graphics_unit_3.class);
                    context.startActivity(intent);
                }
                else if (name=="OS Unit 3"){
                    Intent intent= new Intent(context, os_unit_3.class);
                    context.startActivity(intent);
                }
                else if (name=="CONAM Unit 3"){
                    Intent intent= new Intent(context, conam_Unit_3.class);
                    context.startActivity(intent);
                }
                else if (name=="VB.Net Unit 3"){
                    Intent intent= new Intent(context, vbnet_Unit_3.class);
                    context.startActivity(intent);
                }


            }

            else if (positon==3) {
                if(name=="COA Unit 4"){
                    Intent intent= new Intent(context, unit4_coa.class);
                    context.startActivity(intent);
                }
                else if (name=="Graphics Unit 4"){
                    Intent intent= new Intent(context, graphics_unit_4.class);
                    context.startActivity(intent);
                }
                else if (name=="OS Unit 4"){
                    Intent intent= new Intent(context, os_unit_4.class);
                    context.startActivity(intent);
                }
                else if (name=="CONAM Unit 4"){
                    Intent intent= new Intent(context, conam_Unit_4.class);
                    context.startActivity(intent);
                }
                else if (name=="VB.Net Unit 4"){
                    Intent intent= new Intent(context, vbnet_Unit_4.class);
                    context.startActivity(intent);
                }



            }

            else if (positon==4) {
                if(name=="COA Unit 5"){
                    Intent intent= new Intent(context, unit5_coa.class);
                    context.startActivity(intent);
                }
                else if (name=="Graphics Unit 5"){
                    Intent intent= new Intent(context, graphics_unit_5.class);
                    context.startActivity(intent);
                }
                else if (name=="OS Unit 5"){
                    Intent intent= new Intent(context, os_unit_5.class);
                    context.startActivity(intent);
                }
                else if (name=="CONAM Unit 5"){
                    Intent intent= new Intent(context, conam_Unit_5.class);
                    context.startActivity(intent);
                }
                else if (name=="VB.Net Unit 5"){
                    Intent intent= new Intent(context, vbnet_Unit_5.class);
                    context.startActivity(intent);
                }


            }


            else if (positon==5) {
                if(name=="COA Syllabus"){
                    Intent intent= new Intent(context, unit5_coa.class);
                    context.startActivity(intent);
                }
                else if (name=="GRAPHICS Syllabus"){
                    Intent intent= new Intent(context, graphics_unit_5.class);
                    context.startActivity(intent);
                }
                else if (name=="OS Syllabus"){
                    Intent intent= new Intent(context, os_unit_5.class);
                    context.startActivity(intent);
                }
                else if (name=="CONAM Syllabus"){
                    Intent intent= new Intent(context, conam_Unit_5.class);
                    context.startActivity(intent);
                }
                else if (name=="VB Syllabus"){
                    Intent intent= new Intent(context, vbnet_Unit_5.class);
                    context.startActivity(intent);
                }


            }

        }//on click end
    }
}