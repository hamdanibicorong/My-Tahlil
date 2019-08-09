package com.hamdani.myuixdlayout;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.hamdani.myuixdlayout.db.AgendaDbHelper;

import java.util.ArrayList;

public class Catatan_Agenda extends AppCompatActivity {
    private AgendaDbHelper mHelper;
    private ListView mTaskListView;
    private ArrayAdapter<String> mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan__agenda);

        mHelper = new AgendaDbHelper(this);
        mTaskListView = (ListView) findViewById(R.id.list_todo);
        updateUI();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_catatan, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add_task:
                final EditText todoEditText = new EditText(this);
                AlertDialog dialog = new AlertDialog.Builder(this)
                        .setTitle("Tambah agenda baru")
                        .setMessage("Kegiatan apa yang ingin anda lakukan selanjutnya?")
                        .setView(todoEditText)
                        .setPositiveButton("Tambahkan", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String todo = String.valueOf(todoEditText.getText());

                                mHelper.tambahData(todo);
                                updateUI();
                            }
                        })
                        .setNegativeButton("Batal", null)
                        .create();
                dialog.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void deleteTask(View view) {
        View parent = (View) view.getParent();
        TextView taskTextView = (TextView) parent.findViewById(R.id.task_title);
        String todo = String.valueOf(taskTextView.getText());
        mHelper.hapusData(todo);
        updateUI();
    }

    private void updateUI() {
        ArrayList<String> taskList = mHelper.ambilSemuaData();
        if (mAdapter == null) {
            mAdapter = new ArrayAdapter<>(this,
                    R.layout.item_todo,
                    R.id.task_title,
                    taskList);
            mTaskListView.setAdapter(mAdapter);
        } else {
            mAdapter.clear();
            mAdapter.addAll(taskList);
            mAdapter.notifyDataSetChanged();
        }
    }
}