#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.window;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class WindowModule extends AbstractPresenterModule {

  @Override
  protected void configure() {
    bindPresenter(WindowPresenter.class, WindowPresenter.MyView.class, WindowView.class, WindowPresenter.MyProxy.class);
  }

}
