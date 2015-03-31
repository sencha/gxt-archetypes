package tld.domain.project.client;

import tld.domain.project.client.base.button.Css3ButtonCellAppearance;
import tld.domain.project.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources;
import tld.domain.project.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle;
import tld.domain.project.client.customappearances.ButtonResources.Css3ButtonResourcesGreen;
import tld.domain.project.client.customappearances.ButtonResources.Css3ButtonResourcesRed;
import tld.domain.project.client.customappearances.ButtonResources.SlicedButtonResourcesGreen;
import tld.domain.project.client.customappearances.ButtonResources.SlicedButtonResourcesRed;
import tld.domain.project.client.customappearances.ThemePropertyUtils;
import tld.domain.project.client.sliced.button.SlicedButtonCellAppearance;
import tld.domain.project.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.ButtonCell.ButtonCellAppearance;
import com.sencha.gxt.cell.core.client.TextButtonCell;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ProjectEntryPoint implements EntryPoint {

  @Override
  public void onModuleLoad() {
    RootPanel.get().add(getVersionButton());

    // Custom appearances
    RootPanel.get().add(getRedButton());
    RootPanel.get().add(getGreenButton());

    // Brittle
    RootPanel.get().add(getButtonWithStyle());
  }

  private TextButton getRedButton() {
    ButtonCellAppearance<String> appearance = null;
    if (ThemePropertyUtils.themeSettings().isCss3Enabled()) {
      Css3ButtonResources resources = GWT.create(Css3ButtonResourcesRed.class);
      appearance = new Css3ButtonCellAppearance<String>(resources);
    } else {
      SlicedButtonCellResources resources = GWT.create(SlicedButtonResourcesRed.class);
      appearance = new SlicedButtonCellAppearance<String>(resources);
    }
    TextButtonCell cell = new TextButtonCell(appearance);
    TextButton button = new TextButton(cell, "Red Button");

    return button;
  }

  private TextButton getGreenButton() {
    ButtonCellAppearance<String> appearance = null;
    if (ThemePropertyUtils.themeSettings().isCss3Enabled()) {
      Css3ButtonResources resources = GWT.create(Css3ButtonResourcesGreen.class);
      appearance = new Css3ButtonCellAppearance<String>(resources);
    } else {
      SlicedButtonCellResources resources = GWT.create(SlicedButtonResourcesGreen.class);
      appearance = new SlicedButtonCellAppearance<String>(resources);
    }
    TextButtonCell cell = new TextButtonCell(appearance);
    TextButton button = new TextButton(cell, "Green Button");

    return button;
  }

  /**
   * This is brittle. Not suggested.
   */
  private Widget getButtonWithStyle() {
    TextButton button = new TextButton("Button with Color");
    button.addStyleName("customColor");

    Css3ButtonStyle styles = getStyles((Css3ButtonCellAppearance<String>) button.getCell().getAppearance());

    StyleInjector.inject(".customColor ." + styles.button()
        + " { background: none !important; background-color: orange !important;  };", true);

    return button;
  }

  public native Css3ButtonStyle getStyles(Css3ButtonCellAppearance<String> appearance) /*-{
		return appearance.@tld.domain.project.client.base.button.Css3ButtonCellAppearance::style;
  }-*/;

  private TextButton getVersionButton() {
    String version = GXT.getVersion().getRelease();
    TextButton textButton = new TextButton("Verify GXT Works: Version=" + version);
    textButton.addSelectHandler(new SelectHandler() {
      @Override
      public void onSelect(SelectEvent event) {
        MessageBox messageBox = new MessageBox("GXT Works.");
        messageBox.show();
      }
    });
    return textButton;
  }

}
