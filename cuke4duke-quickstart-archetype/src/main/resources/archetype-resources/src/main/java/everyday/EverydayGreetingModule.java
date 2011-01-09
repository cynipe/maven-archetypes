#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.everyday;

import ${package}.GreetingService;

import com.google.inject.AbstractModule;

public class EverydayGreetingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(GreetingService.class).to(EverydayGreatingService.class);
    }

}
