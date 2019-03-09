package com.arvind.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    DatabaseReference reference;
    QuestionBank QB[];
    int counter=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //QB=new QuestionBank();
        reference=FirebaseDatabase.getInstance().getReference("Week2");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                QB=new QuestionBank[(int)dataSnapshot.getChildrenCount()];
                for (DataSnapshot DS : dataSnapshot.getChildren()){
                    {
                        String ans=DS.child("Answer").getValue().toString();
                        String opt1=DS.child("Option1").getValue().toString();
                        String opt2=DS.child("Option2").getValue().toString();
                        String opt3=DS.child("Option3").getValue().toString();
                        String opt4=DS.child("Option4").getValue().toString();
                        String qtext=DS.child("Qtext").getValue().toString();
                        QB[counter++]=new QuestionBank(ans,opt1,opt2,opt3,opt4,qtext);
                        Log.v("Question",QB[counter-1].getAnswer());;
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
