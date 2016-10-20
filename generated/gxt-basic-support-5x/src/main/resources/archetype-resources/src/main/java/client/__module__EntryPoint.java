#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import com.sencha.gxt.corvina.component.Button;
import com.sencha.gxt.corvina.component.Label;
import com.sencha.gxt.corvina.container.responsive.VerticalContainer;
import com.sencha.gxt.corvina.core.Application;
import com.sencha.gxt.corvina.core.Scene;
import com.sencha.gxt.corvina.core.Stage;
import com.sencha.gxt.corvina.core.Window;
import com.sencha.gxt.corvina.core.event.ActionEvent;
import com.sencha.gxt.corvina.core.util.Size;
import com.sencha.gxt.corvina.theming.ThemeBundle;
import com.sencha.gxt.corvina.theming.themes.MaterialDesignLite;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ${module}EntryPoint extends Application {

  @Override
  protected ThemeBundle createDefaultTheme() {
    //Core.create();
    //Minimal.create();
    //MaterialDesignLite.create();
    //Triton.create();
    return MaterialDesignLite.create();
  }

  @Override
  public void start(Stage stage) {
    Button button = new Button("I'm a Button");
    button.addEventHandler(ActionEvent.ACTION, actionEvent -> onAction(actionEvent));
    
    VerticalContainer verticalContainer = new VerticalContainer(); 
    verticalContainer.add(button);
    
    Scene scene = new Scene(verticalContainer, Size.FULL_VIEWPORT);

    stage.setScene(scene);
    stage.show();
  }

  private void onAction(ActionEvent actionEvent) {
    Label label = new Label("Label");
    
    VerticalContainer verticalContainer = new VerticalContainer();
    verticalContainer.getAppearance().getElement().getStyle().setPadding("10px");
    verticalContainer.add(label);

    Window window = new Window();
    window.setHeading("Window Test");
    window.setModal(true);
    window.setBlinkModal(true);
    window.setRoot(verticalContainer);
    window.show();
  }

}
