package tld.domain.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.CssFloatLayoutContainer;
import com.sencha.gxt.widget.core.client.container.CssFloatLayoutContainer.CssFloatData;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.StringComboBox;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ProjectEntryPoint implements EntryPoint {

  @Override
  public void onModuleLoad() {
    StringComboBox combo = new StringComboBox();
    combo.setTriggerAction(TriggerAction.ALL);
    combo.add("Yes");
    combo.add("No");
    combo.add("Both");
    
    FieldLabel choose = new FieldLabel(combo, "Select");
    
    CssFloatLayoutContainer verticallayout = new CssFloatLayoutContainer();
    verticallayout.add(choose, new CssFloatData(1));

    ContentPanel contentPanel = new ContentPanel();
    contentPanel.setPixelSize(300, 400);
    contentPanel.add(verticallayout, new MarginData(20));

    RootPanel.get().add(contentPanel);
  }
}
