package tld.domain.project.client;

import tld.domain.project.client.base.button.Css3ButtonCellAppearance;
import tld.domain.project.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources;
import tld.domain.project.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle;
import tld.domain.project.client.customappearances.ButtonResources.Css3ButtonResourcesGreen;
import tld.domain.project.client.customappearances.ButtonResources.Css3ButtonResourcesRed;
import tld.domain.project.client.resources.Resources;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
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

    // Less Brittle
    RootPanel.get().add(getButtonWithStyle2());

    // Less Brittle
    RootPanel.get().add(getButtonWithStyle3());
  }

  private TextButton getRedButton() {
    Css3ButtonResources resources = GWT.create(Css3ButtonResourcesRed.class);
    Css3ButtonCellAppearance<String> appearance = new Css3ButtonCellAppearance<String>(resources);

    TextButtonCell cell = new TextButtonCell(appearance);
    TextButton button = new TextButton(cell, "Red Button");

    return button;
  }

  private TextButton getGreenButton() {
    Css3ButtonResources resources = GWT.create(Css3ButtonResourcesGreen.class);
    Css3ButtonCellAppearance<String> appearance = new Css3ButtonCellAppearance<String>(resources);

    TextButtonCell cell = new TextButtonCell(appearance);
    TextButton button = new TextButton(cell, "Green Button");

    return button;
  }

  /**
   * This is brittle, because a cell DOM change on sdk upgrade may break it.
   */
  private Widget getButtonWithStyle() {
    TextButton button = new TextButton("Orange Button");
    button.addStyleName("customColor1");

    Css3ButtonStyle styles = getStyles((Css3ButtonCellAppearance<String>) button.getCell().getAppearance());

    StyleInjector.inject(".customColor1 ." + styles.button()
        + " { background: none !important; background-color: orange !important;  };", true);

    return button;
  }

  public native Css3ButtonStyle getStyles(Css3ButtonCellAppearance<String> appearance) /*-{
		return appearance.@tld.domain.project.client.base.button.Css3ButtonCellAppearance::style;
  }-*/;

  /**
   * This is less brittle, because a cell DOM change on sdk upgrade may break
   * it.
   */
  private Widget getButtonWithStyle2() {
    StyleInjector.inject(".customColor2 > div { background: none !important; background-color: purple !important;  };",
        true);

    TextButton button = new TextButton("Purple Button");
    button.addStyleName("customColor2");

    return button;
  }

  /**
   * This is less brittle, because a cell DOM change on sdk upgrade may break
   * it.
   */
  private Widget getButtonWithStyle3() {
    // only do this on first load
    Resources.INSTANCE.style().ensureInjected();
    
    TextButton button = new TextButton("Pink Button");
    button.addStyleName(Resources.INSTANCE.style().buttonColorDeepPink());

    return button;
  }

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
