package com.example.eliteeventplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class Booking extends AppCompatActivity {
   EditText txt_name, txt_event, txt_phone, txt_location,txt_date;
   Button btn_book;
    FirebaseFirestore db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = findViewById(R.id.bgHeader);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_booking);
        db = FirebaseFirestore.getInstance();
        Window w = getWindow();
        setTitle("Booking");
        txt_name = (EditText)findViewById(R.id.fullname);
        txt_event = (EditText)findViewById(R.id.eventname);
        txt_phone = (EditText)findViewById(R.id.phone);
        txt_location = (EditText)findViewById(R.id.location);
        txt_date = (EditText)findViewById(R.id.date);
        btn_book = (Button)findViewById(R.id.btnb);
        btn_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = txt_name.getText().toString();
                String Event = txt_event.getText().toString();
                String Phone = txt_phone.getText().toString();
                String Location = txt_location.getText().toString();
                String date = txt_date.getText().toString();
                BookingData bookingData = new BookingData();
                bookingData.setName(Name);
                bookingData.setEvent(Event);
                bookingData.setPhone(Phone);
                bookingData.setLocation(Location);
                bookingData.setDate(date);
                Toast.makeText(Booking.this, "Booking Successful", Toast.LENGTH_SHORT).show();
                db.collection("Booking").add(bookingData).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(Booking.this, "Booking Successful", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Booking.this,MainActivity.class));
                    }
                });
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent;
        intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
        startActivity(intent);
    }

}