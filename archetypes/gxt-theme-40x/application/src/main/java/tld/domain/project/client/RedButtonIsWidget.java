package tld.domain.project.client;

import tld.domain.project.client.appearances.ButtonResources.Css3ButtonResourcesRed;
import tld.domain.project.client.base.button.Css3ButtonCellAppearance;
import tld.domain.project.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.TextButtonCell;
import com.sencha.gxt.widget.core.client.button.TextButton;

public class RedButtonIsWidget implements IsWidget {

  private TextButton button;

  @Override
  public Widget asWidget() {
    if (button == null) {
      Css3ButtonResources resources = GWT.create(Css3ButtonResourcesRed.class);
      Css3ButtonCellAppearance<String> appearance = new Css3ButtonCellAppearance<String>(resources);

      TextButtonCell cell = new TextButtonCell(appearance);
      button = new TextButton(cell, "Red Button");
    }

    return button;
  }

}
