package tld.domain.project.client.application.home;

import javax.inject.Inject;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.TextField;

public class HomeView extends ViewWithUiHandlers<HomeUiHandlers> implements HomePresenter.MyView {

  interface Binder extends UiBinder<Widget, HomeView> {
  }

  @UiField
  TextField name;

  @Inject
  public HomeView(Binder uiBinder) {
    initWidget(uiBinder.createAndBindUi(this));
  }

  @UiHandler("buttonOpenWindow")
  public void onOpenWindow(SelectEvent event) {
    GWT.log("buttonOpenWindow selected");

    // Have the presenter take over
    String name = this.name.getCurrentValue();
    if (name == null || name.isEmpty()) {
      name = "Nothing Entered into the TextField";
    }
    getUiHandlers().onOpenWindow(name);
  }

  @UiHandler("buttonOpenGrid")
  public void onOpenGrid(SelectEvent event) {
    getUiHandlers().onOpenGrid();
  }

}
