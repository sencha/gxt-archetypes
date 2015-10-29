 package tld.domain.project.client.application.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SimpleHtmlSanitizer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

import tld.domain.project.client.application.Presenter;

public class LoginView extends Composite {

  private static Binder uiBinder = GWT.create(Binder.class);

  interface Binder extends UiBinder<Widget, LoginView> {}
  
  @UiField
  HTML name;

  private Presenter presenter;

  public LoginView() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void setPresenter(Presenter presenter) {
    this.presenter = presenter;
  }
  
  public void start() {
    
  }

}
