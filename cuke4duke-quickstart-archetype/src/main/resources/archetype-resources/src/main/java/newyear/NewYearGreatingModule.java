#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.newyear;


import ${package}.GreetingService;

import com.google.inject.AbstractModule;

public class NewYearGreatingModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(GreetingService.class).to(NewYearGreatingService.class);
    }

}
