#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

import ${package}.client.application.ApplicationModule;
import ${package}.client.application.grid.GridModule;
import ${package}.client.application.home.HomeModule;
import ${package}.client.application.window.WindowModule;
import ${package}.client.place.NameTokens;
import ${package}.client.resources.ResourceLoader;

public class ClientModule extends AbstractPresenterModule {
  @Override
  protected void configure() {
    install(new DefaultModule.Builder().defaultPlace(NameTokens.Home).errorPlace(NameTokens.Home)
        .unauthorizedPlace(NameTokens.Home).build());

    install(new ApplicationModule());
    install(new HomeModule());
    install(new WindowModule());
    install(new GridModule());

    bind(ResourceLoader.class).asEagerSingleton();
  }
}
