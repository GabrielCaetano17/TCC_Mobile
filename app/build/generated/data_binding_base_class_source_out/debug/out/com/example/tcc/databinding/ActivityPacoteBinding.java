// Generated by view binder compiler. Do not edit!
package com.example.tcc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tcc.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPacoteBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final AppCompatButton assine;

  @NonNull
  public final TextView descriO;

  @NonNull
  public final RatingBar estrelinha;

  @NonNull
  public final ImageView img;

  @NonNull
  public final View menu;

  @NonNull
  public final TextView pacote;

  @NonNull
  public final ImageView perfil;

  @NonNull
  public final TextView preco;

  @NonNull
  public final ImageView slupemento;

  private ActivityPacoteBinding(@NonNull NestedScrollView rootView, @NonNull AppCompatButton assine,
      @NonNull TextView descriO, @NonNull RatingBar estrelinha, @NonNull ImageView img,
      @NonNull View menu, @NonNull TextView pacote, @NonNull ImageView perfil,
      @NonNull TextView preco, @NonNull ImageView slupemento) {
    this.rootView = rootView;
    this.assine = assine;
    this.descriO = descriO;
    this.estrelinha = estrelinha;
    this.img = img;
    this.menu = menu;
    this.pacote = pacote;
    this.perfil = perfil;
    this.preco = preco;
    this.slupemento = slupemento;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPacoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPacoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pacote, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPacoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.assine;
      AppCompatButton assine = ViewBindings.findChildViewById(rootView, id);
      if (assine == null) {
        break missingId;
      }

      id = R.id.descrição;
      TextView descriO = ViewBindings.findChildViewById(rootView, id);
      if (descriO == null) {
        break missingId;
      }

      id = R.id.estrelinha;
      RatingBar estrelinha = ViewBindings.findChildViewById(rootView, id);
      if (estrelinha == null) {
        break missingId;
      }

      id = R.id.img;
      ImageView img = ViewBindings.findChildViewById(rootView, id);
      if (img == null) {
        break missingId;
      }

      id = R.id.menu;
      View menu = ViewBindings.findChildViewById(rootView, id);
      if (menu == null) {
        break missingId;
      }

      id = R.id.pacote;
      TextView pacote = ViewBindings.findChildViewById(rootView, id);
      if (pacote == null) {
        break missingId;
      }

      id = R.id.perfil;
      ImageView perfil = ViewBindings.findChildViewById(rootView, id);
      if (perfil == null) {
        break missingId;
      }

      id = R.id.preco;
      TextView preco = ViewBindings.findChildViewById(rootView, id);
      if (preco == null) {
        break missingId;
      }

      id = R.id.slupemento;
      ImageView slupemento = ViewBindings.findChildViewById(rootView, id);
      if (slupemento == null) {
        break missingId;
      }

      return new ActivityPacoteBinding((NestedScrollView) rootView, assine, descriO, estrelinha,
          img, menu, pacote, perfil, preco, slupemento);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}