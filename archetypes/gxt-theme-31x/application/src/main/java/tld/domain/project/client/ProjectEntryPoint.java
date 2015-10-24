package tld.domain.project.client;

import tld.domain.project.client.customappearance.Css3ButtonCellAppearanceGreen;
import tld.domain.project.client.customappearance.Css3ButtonCellAppearanceRed;
import tld.domain.project.client.customappearance.SlicedButtonCellAppearanceGreen;
import tld.domain.project.client.customappearance.SlicedButtonCellAppearanceRed;
import tld.domain.project.client.customappearance.ThemePropertyUtils;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.RootPanel;
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
    
    // Custom appearance examples
    RootPanel.get().add(getRedButton());
    RootPanel.get().add(getGreenButton());
  }
  
  private TextButton getRedButton() {
    ButtonCellAppearance<String> appearanceRed = null;
    if (ThemePropertyUtils.themeSettings().isCss3Enabled()) {
      appearanceRed = GWT.create(Css3ButtonCellAppearanceRed.class); 
    } else {
      appearanceRed = GWT.create(SlicedButtonCellAppearanceRed.class);
    }
    TextButtonCell cellRed = new TextButtonCell(appearanceRed);
    TextButton buttonRed = new TextButton(cellRed, "Red Button");
    
    return buttonRed;
  }
  
  private TextButton getGreenButton() {
    ButtonCellAppearance<String> appearanceGreen = null;
    if (ThemePropertyUtils.themeSettings().isCss3Enabled()) {
      appearanceGreen = GWT.create(Css3ButtonCellAppearanceGreen.class);
    } else {
      appearanceGreen = GWT.create(SlicedButtonCellAppearanceGreen.class);
    }

    TextButtonCell cellGreen = new TextButtonCell(appearanceGreen);
    TextButton buttonGreen = new TextButton(cellGreen, "Green Button");
    
    return buttonGreen;
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
