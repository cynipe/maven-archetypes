#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.newyear;

import ${package}.GreetingService;
import ${package}.PersonKind;

public class NewYearGreatingService implements GreetingService {

    @Override
    public String greetingFor(PersonKind kind) {
        switch (kind) {
            case FRIEND:
                return "あけおめー！";
            case ACQUAINTANCE:
                return "明けましておめでとうございます。";
            case STRANGER:
                return "え、誰？";
            default:
                throw new AssertionError();
        }
    }

}
