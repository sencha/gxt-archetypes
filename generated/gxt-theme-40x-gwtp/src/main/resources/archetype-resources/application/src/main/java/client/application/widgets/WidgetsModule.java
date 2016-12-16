#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.widgets;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import ${package}.client.application.widgets.windowwidget.WindowWidgetModule;

public class WidgetsModule extends AbstractPresenterModule {

  @Override
  protected void configure() {
    install(new WindowWidgetModule());
  }

}
