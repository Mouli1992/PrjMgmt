// Generated by view binder compiler. Do not edit!
package com.example.projectmanagement.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectmanagement.R;
import de.codecrafters.tableview.TableView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProjectDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAddTasks;

  @NonNull
  public final Button btnSubmitProject;

  @NonNull
  public final DatePicker dteProjectDeadline;

  @NonNull
  public final EditText edtCreatedBy;

  @NonNull
  public final EditText edtProjectName;

  @NonNull
  public final Guideline guideline11;

  @NonNull
  public final Guideline guideline12;

  @NonNull
  public final Guideline guideline13;

  @NonNull
  public final Guideline guideline14;

  @NonNull
  public final Guideline guideline17;

  @NonNull
  public final Guideline guideline18;

  @NonNull
  public final Guideline guideline19;

  @NonNull
  public final Guideline guideline21;

  @NonNull
  public final TableView rvTasks;

  @NonNull
  public final TextView txtAssignedBy;

  @NonNull
  public final TextView txtDeadline;

  @NonNull
  public final TextView txtNoTasks;

  @NonNull
  public final TextView txtProjectName;

  private ActivityProjectDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnAddTasks, @NonNull Button btnSubmitProject,
      @NonNull DatePicker dteProjectDeadline, @NonNull EditText edtCreatedBy,
      @NonNull EditText edtProjectName, @NonNull Guideline guideline11,
      @NonNull Guideline guideline12, @NonNull Guideline guideline13,
      @NonNull Guideline guideline14, @NonNull Guideline guideline17,
      @NonNull Guideline guideline18, @NonNull Guideline guideline19,
      @NonNull Guideline guideline21, @NonNull TableView rvTasks, @NonNull TextView txtAssignedBy,
      @NonNull TextView txtDeadline, @NonNull TextView txtNoTasks,
      @NonNull TextView txtProjectName) {
    this.rootView = rootView;
    this.btnAddTasks = btnAddTasks;
    this.btnSubmitProject = btnSubmitProject;
    this.dteProjectDeadline = dteProjectDeadline;
    this.edtCreatedBy = edtCreatedBy;
    this.edtProjectName = edtProjectName;
    this.guideline11 = guideline11;
    this.guideline12 = guideline12;
    this.guideline13 = guideline13;
    this.guideline14 = guideline14;
    this.guideline17 = guideline17;
    this.guideline18 = guideline18;
    this.guideline19 = guideline19;
    this.guideline21 = guideline21;
    this.rvTasks = rvTasks;
    this.txtAssignedBy = txtAssignedBy;
    this.txtDeadline = txtDeadline;
    this.txtNoTasks = txtNoTasks;
    this.txtProjectName = txtProjectName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProjectDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProjectDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_project_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProjectDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAddTasks;
      Button btnAddTasks = ViewBindings.findChildViewById(rootView, id);
      if (btnAddTasks == null) {
        break missingId;
      }

      id = R.id.btnSubmitProject;
      Button btnSubmitProject = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmitProject == null) {
        break missingId;
      }

      id = R.id.dteProjectDeadline;
      DatePicker dteProjectDeadline = ViewBindings.findChildViewById(rootView, id);
      if (dteProjectDeadline == null) {
        break missingId;
      }

      id = R.id.edtCreatedBy;
      EditText edtCreatedBy = ViewBindings.findChildViewById(rootView, id);
      if (edtCreatedBy == null) {
        break missingId;
      }

      id = R.id.edtProjectName;
      EditText edtProjectName = ViewBindings.findChildViewById(rootView, id);
      if (edtProjectName == null) {
        break missingId;
      }

      id = R.id.guideline11;
      Guideline guideline11 = ViewBindings.findChildViewById(rootView, id);
      if (guideline11 == null) {
        break missingId;
      }

      id = R.id.guideline12;
      Guideline guideline12 = ViewBindings.findChildViewById(rootView, id);
      if (guideline12 == null) {
        break missingId;
      }

      id = R.id.guideline13;
      Guideline guideline13 = ViewBindings.findChildViewById(rootView, id);
      if (guideline13 == null) {
        break missingId;
      }

      id = R.id.guideline14;
      Guideline guideline14 = ViewBindings.findChildViewById(rootView, id);
      if (guideline14 == null) {
        break missingId;
      }

      id = R.id.guideline17;
      Guideline guideline17 = ViewBindings.findChildViewById(rootView, id);
      if (guideline17 == null) {
        break missingId;
      }

      id = R.id.guideline18;
      Guideline guideline18 = ViewBindings.findChildViewById(rootView, id);
      if (guideline18 == null) {
        break missingId;
      }

      id = R.id.guideline19;
      Guideline guideline19 = ViewBindings.findChildViewById(rootView, id);
      if (guideline19 == null) {
        break missingId;
      }

      id = R.id.guideline21;
      Guideline guideline21 = ViewBindings.findChildViewById(rootView, id);
      if (guideline21 == null) {
        break missingId;
      }

      id = R.id.rvTasks;
      TableView rvTasks = ViewBindings.findChildViewById(rootView, id);
      if (rvTasks == null) {
        break missingId;
      }

      id = R.id.txtAssignedBy;
      TextView txtAssignedBy = ViewBindings.findChildViewById(rootView, id);
      if (txtAssignedBy == null) {
        break missingId;
      }

      id = R.id.txtDeadline;
      TextView txtDeadline = ViewBindings.findChildViewById(rootView, id);
      if (txtDeadline == null) {
        break missingId;
      }

      id = R.id.txtNoTasks;
      TextView txtNoTasks = ViewBindings.findChildViewById(rootView, id);
      if (txtNoTasks == null) {
        break missingId;
      }

      id = R.id.txtProjectName;
      TextView txtProjectName = ViewBindings.findChildViewById(rootView, id);
      if (txtProjectName == null) {
        break missingId;
      }

      return new ActivityProjectDetailsBinding((ConstraintLayout) rootView, btnAddTasks,
          btnSubmitProject, dteProjectDeadline, edtCreatedBy, edtProjectName, guideline11,
          guideline12, guideline13, guideline14, guideline17, guideline18, guideline19, guideline21,
          rvTasks, txtAssignedBy, txtDeadline, txtNoTasks, txtProjectName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
