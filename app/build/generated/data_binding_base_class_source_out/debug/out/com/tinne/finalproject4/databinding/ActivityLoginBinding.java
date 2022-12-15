// Generated by view binder compiler. Do not edit!
package com.tinne.finalproject4.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tinne.finalproject4.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final Button btnSignUp;

  @NonNull
  public final EditText edEmail;

  @NonNull
  public final EditText edPassword;

  @NonNull
  public final ImageView imOr;

  @NonNull
  public final ImageView loBookNow;

  @NonNull
  public final TextView tvEmail;

  private ActivityLoginBinding(@NonNull ScrollView rootView, @NonNull Button btnLogin,
      @NonNull Button btnSignUp, @NonNull EditText edEmail, @NonNull EditText edPassword,
      @NonNull ImageView imOr, @NonNull ImageView loBookNow, @NonNull TextView tvEmail) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.btnSignUp = btnSignUp;
    this.edEmail = edEmail;
    this.edPassword = edPassword;
    this.imOr = imOr;
    this.loBookNow = loBookNow;
    this.tvEmail = tvEmail;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLogin;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.btnSignUp;
      Button btnSignUp = ViewBindings.findChildViewById(rootView, id);
      if (btnSignUp == null) {
        break missingId;
      }

      id = R.id.edEmail;
      EditText edEmail = ViewBindings.findChildViewById(rootView, id);
      if (edEmail == null) {
        break missingId;
      }

      id = R.id.edPassword;
      EditText edPassword = ViewBindings.findChildViewById(rootView, id);
      if (edPassword == null) {
        break missingId;
      }

      id = R.id.imOr;
      ImageView imOr = ViewBindings.findChildViewById(rootView, id);
      if (imOr == null) {
        break missingId;
      }

      id = R.id.loBookNow;
      ImageView loBookNow = ViewBindings.findChildViewById(rootView, id);
      if (loBookNow == null) {
        break missingId;
      }

      id = R.id.tvEmail;
      TextView tvEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvEmail == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ScrollView) rootView, btnLogin, btnSignUp, edEmail,
          edPassword, imOr, loBookNow, tvEmail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
