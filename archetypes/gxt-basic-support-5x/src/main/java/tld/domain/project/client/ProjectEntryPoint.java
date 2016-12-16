package tld.domain.project.client;

import com.sencha.gxt.corvina.component.Button;
import com.sencha.gxt.corvina.component.Snackbar;
import com.sencha.gxt.corvina.container.responsive.VerticalContainer;
import com.sencha.gxt.corvina.core.Application;
import com.sencha.gxt.corvina.core.Scene;
import com.sencha.gxt.corvina.core.Stage;
import com.sencha.gxt.corvina.core.event.ActionEvent;
import com.sencha.gxt.corvina.core.theme.MaterialDesignThemeFactory;
import com.sencha.gxt.corvina.core.theme.Theme;
import com.sencha.gxt.corvina.core.util.Size;

public class ProjectEntryPoint extends Application {

  @Override
  protected Theme createDefaultTheme() {
    // CoreThemeFactory.get();
    // MinimalThemeFactory.get();
    // MaterialDesignThemeFactory.get();
    // TritonThemeFactory.get();
    return MaterialDesignThemeFactory.get();
  }

  @Override
  public void start(Stage stage) {
    Button button = new Button("I'm a Button");
    button.addEventHandler(ActionEvent.ACTION,
        actionEvent -> Snackbar.make("You clicked the button!", Snackbar.LENGTH_SHORT).show());

    VerticalContainer verticalContainer = new VerticalContainer();
    verticalContainer.getChildren().add(button);

    Scene scene = new Scene(verticalContainer, Size.FULL_VIEWPORT);

    stage.setScene(scene);
    stage.show();
  }

}
