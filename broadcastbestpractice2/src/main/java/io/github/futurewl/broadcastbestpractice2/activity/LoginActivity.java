package io.github.futurewl.broadcastbestpractice2.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import io.github.futurewl.broadcastbestpractice2.R;
import io.github.futurewl.broadcastbestpractice2.activity.base.BaseActivity;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity {


    private SharedPreferences preferences;

    private SharedPreferences.Editor editor;

    private EditText accountEdit;

    private EditText passwordEdit;

    private Button login;

    private CheckBox rememberPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        accountEdit = findViewById(R.id.account);
        passwordEdit = findViewById(R.id.password);
        rememberPassword = findViewById(R.id.remember_pass);
        login = findViewById(R.id.login);
        boolean isRemember = preferences.getBoolean("remember_password", false);
        if (isRemember) {
            String account = preferences.getString("account", "");
            String password = preferences.getString("password", "");
            accountEdit.setText(account);
            passwordEdit.setText(password);
            rememberPassword.setChecked(true);
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = accountEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                if (account.equals("admin") && password.equals("123456")) {
                    editor = preferences.edit();
                    if (rememberPassword.isChecked()) {
                        editor.putBoolean("remember_password", true);
                        editor.putString("account", account);
                        editor.putString("password", password);
                    } else {
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "account or password is invalid", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}

