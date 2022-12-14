package com.tinne.finalproject4;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.tinne.finalproject4.databinding.ActivityHomeInputBinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class HomeInputActivity extends AppCompatActivity {
    MaterialDatePicker materialDatePicker;
    Calendar newCalendar;
    String date = "";
    String from;
    String to;
    String passenger;
    String tCalendar;
    SimpleDateFormat dateFormatter;
    private ActivityHomeInputBinding binding;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeInputBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        from = binding.EdFrom.getText().toString().trim();
        to = binding.EdTo.getText().toString().trim();
        passenger = binding.EdPassenger.toString().trim();
        tCalendar = binding.EdDate.toString().trim();

//        selectDate();

        binding.EdDate.setOnClickListener(v -> {
            showDateDialog();
        });

        binding.btnFindNow.setOnClickListener(v -> {

        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        newCalendar = Calendar.getInstance();
    }

    private void showDateDialog() {

        /**
         * Calendar untuk mendapatkan tanggal sekarang
         */
        Calendar newCalendars = Calendar.getInstance();

        /**
         * Initiate DatePicker dialog
         */
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                /**
                 * Method ini dipanggil saat kita selesai memilih tanggal di DatePicker
                 */

                /**
                 * Set Calendar untuk menampung tanggal yang dipilih
                 */
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                /**
                 * Update TextView dengan tanggal yang kita pilih
                 */
                binding.EdDate.setText(dateFormatter.format(newDate.getTime()));
//                tCalendar = "Tanggal dipilih : " + dateFormatter.format(newDate.getTime());

            }

        }, newCalendars.get(Calendar.YEAR), newCalendars.get(Calendar.MONTH), newCalendars.get(Calendar.DAY_OF_MONTH));

        /**
         * Tampilkan DatePicker dialog
         */
        datePickerDialog.show();
    }


//    private void selectDate() {
//        MaterialDatePicker.Builder materialDateBuilder = MaterialDatePicker.Builder.datePicker();
//        materialDateBuilder.setTitleText("Select a Date");
//        materialDatePicker = materialDateBuilder.build();
//
//        binding.EdDate.setOnClickListener(v -> materialDatePicker.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER"));
//
//        materialDatePicker.addOnPositiveButtonClickListener(selection -> {
//            Calendar utc = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
//            utc.setTimeInMillis((Long) selection);
//            @SuppressLint("SimpleDateFormat") SimpleDateFormat format = new SimpleDateFormat("MMM d, yyyy");
//            date = format.format(utc.getTime());
//            tCalendar = date;
//        });
//    }
}