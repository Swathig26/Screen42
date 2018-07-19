package com.swathi.screen4;

        import android.app.Activity;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Spinner;


public class Screen4 extends Activity implements AdapterView.OnItemSelectedListener {
            String school;
            private Spinner spinner1, spinner2, spinner3;
            private static final String[] location = {"LOCATION", "Hoskerehalli", "Seethacircle", "Channasandra"};
            private static final String[] syllabus = {"SYLLABUS", "state", "cbse", "icse"};
            private static final String[] category = {"CATEGORY", "Primary", "Secondary", "Higher Secondary"};

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.screen4);

                spinner1 = (Spinner) findViewById(R.id.spinner1);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(Screen4.this,
                        android.R.layout.simple_spinner_item, location);

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(adapter);
                spinner1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)Screen4.this);

                spinner2 = (Spinner) findViewById(R.id.spinner2);
                ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(Screen4.this,
                        android.R.layout.simple_spinner_item, syllabus);

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner2.setAdapter(adapter1);
                spinner2.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)Screen4.this);

                spinner3 = (Spinner) findViewById(R.id.spinner3);
                ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(Screen4.this,
                        android.R.layout.simple_spinner_item, category);

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner3.setAdapter(adapter3);
                spinner3.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) Screen4.this);

                SharedPreferences prefs = getSharedPreferences("school", MODE_PRIVATE);
                String restoredText = prefs.getString("text", null);
                if(restoredText!= null)
                {
                    String location = prefs.getString("Schoolname", "location");
                    int location1=prefs.getInt("id",1);
                    String syllabus  = prefs.getString("name", "syllabus");
                    int syllabus1=prefs.getInt("id",2);//"No name defined" is the default value.
                    String category = prefs.getString("name", "category");
                    int category1=prefs.getInt("id",3);
                }

                SharedPreferences prefs1 = getSharedPreferences("vacancy", MODE_PRIVATE);
                String restoredText2 = prefs1.getString("text", null);
                if (restoredText2 != null)
                {
                    String location = prefs1.getString("name", "location");
                    int location1=prefs1.getInt("id",1);
                }
                SharedPreferences prefs2 = getSharedPreferences("institute", MODE_PRIVATE);
                String restoredText3 = prefs1.getString("text", null);
                if (restoredText3 != null)
                {
                    String location = prefs2.getString("name", "location");
                    int location1=prefs2.getInt("id",1);
                }
            }

            public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
}

