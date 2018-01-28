package tuto.adrien.projetandroid.BC;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import tuto.adrien.projetandroid.R;

public class bc extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef;

    Button fragment1, fragment2, fragment3;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bc);

        fragment1 = (Button) findViewById(R.id.fragment1);
        fragment2 = (Button) findViewById(R.id.fragment2);
        fragment3 = (Button) findViewById(R.id.fragment3);
        tv1 = findViewById(R.id.textViewBc);

        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FirstFragment());
            }
        });

        fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SecondFragment());
            }
        });

        fragment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new ThirdFragment());
            }
        });

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("BC");

        //Génère un message via la BDD Firebase
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                TextView textView = (TextView) findViewById(R.id.textViewBc);
                textView.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void loadFragment(Fragment fragment) {
    // create a FragmentManager
        FragmentManager fm = getFragmentManager();
    // create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
    // replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        tv1.setText("");
        fragmentTransaction.commit(); // save the changes
    }

    @SuppressLint("ValidFragment")
    public class FirstFragment extends Fragment {
        View view;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.fragment_lore, container, false);
            return view;
        }
    }

    @SuppressLint("ValidFragment")
    public class SecondFragment extends Fragment {
        View view;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            view = inflater.inflate(R.layout.fragment_perso, container, false);
            return view;
        }
    }

    @SuppressLint("ValidFragment")
    private class ThirdFragment extends Fragment {
        View view;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.fragment_lieux, container, false);
            return view;
        }
    }
}
